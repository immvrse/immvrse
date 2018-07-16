package com.example.samson.immvrse

import android.app.Activity
import android.os.AsyncTask
import android.os.Bundle
import android.widget.SeekBar
import com.google.vr.sdk.widgets.common.VrWidgetView
import com.google.vr.sdk.widgets.video.VrVideoEventListener
import com.google.vr.sdk.widgets.video.VrVideoView
import kotlinx.android.synthetic.main.activity_video_viewer.*
import java.io.IOException

class VideoViewerActivity : Activity(), SeekBar.OnSeekBarChangeListener {
    private var isPaused: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video_viewer)
        initViews()
        val videoLoaderTask = VideoLoaderTask()
        videoLoaderTask.execute()
    }

    private fun initViews() {
        video_view.setEventListener(ActivityEventListener())
        seek_bar.setOnSeekBarChangeListener(this)
    }

    override fun onProgressChanged(seekBar: SeekBar, progress: Int, progressChanged: Boolean) {
        if (progressChanged) {
            video_view.seekTo(progress.toLong())
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        outState.putLong(STATE_PROGRESS, video_view.currentPosition)
        outState.putLong(STATE_DURATION, video_view.duration)

        super.onSaveInstanceState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        val progress = savedInstanceState.getLong(STATE_PROGRESS)

        video_view.seekTo(progress)
        seek_bar.max = savedInstanceState.getLong(STATE_DURATION).toInt()
        seek_bar.progress = progress.toInt()
    }

    override fun onStartTrackingTouch(seekBar: SeekBar) {}

    override fun onStopTrackingTouch(seekBar: SeekBar) {}

    override fun onPause() {
        super.onPause()
        video_view.pauseRendering()
        isPaused = true
    }

    override fun onResume() {
        super.onResume()
        video_view.resumeRendering()
        isPaused = false
    }

    override fun onDestroy() {
        video_view.shutdown()
        super.onDestroy()
    }

    fun playPause() {
        if (isPaused) {
            video_view.playVideo()
        } else {
            video_view.pauseVideo()
        }
    }

    private inner class ActivityEventListener : VrVideoEventListener() {

        override fun onClick() {
            playPause()
        }

        override fun onNewFrame() {
            super.onNewFrame()
            seek_bar.progress = video_view.currentPosition.toInt()
        }

        override fun onCompletion() {
            video_view.seekTo(0)
        }
    }

    internal inner class VideoLoaderTask : AsyncTask<Void, Void, Boolean>() {

        override fun doInBackground(vararg voids: Void): Boolean? {
            try {
                val options = VrVideoView.Options()
                options.inputType = VrVideoView.Options.TYPE_STEREO_OVER_UNDER
                video_view.loadVideoFromAsset("congo.mp4", options)
                runOnUiThread { video_view.displayMode = VrWidgetView.DisplayMode.FULLSCREEN_STEREO }

            } catch (e: IOException) {
                e.printStackTrace()
            }

            return true
        }
    }

    companion object {

        private val STATE_PROGRESS = "state_progress"
        private val STATE_DURATION = "state_duration"
    }
}