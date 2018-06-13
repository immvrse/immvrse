package com.example.samson.immvrse;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.SeekBar;

import com.example.samson.immvrse.databinding.ActivityVideoViewerBinding;
import com.google.vr.sdk.widgets.common.VrWidgetView;
import com.google.vr.sdk.widgets.video.VrVideoEventListener;
import com.google.vr.sdk.widgets.video.VrVideoView;

import java.io.IOException;

public class VideoViewerActivity extends Activity implements SeekBar.OnSeekBarChangeListener {

    private static final String STATE_PROGRESS = "state_progress";
    private static final String STATE_DURATION = "state_duration";
    private ActivityVideoViewerBinding binding;
    private boolean isPaused;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_video_viewer);
        binding.getRoot();
        initViews();
        VideoLoaderTask videoLoaderTask = new VideoLoaderTask();
        videoLoaderTask.execute();
    }

    private void initViews() {
        binding.videoView.setEventListener(new ActivityEventListener());
        binding.seekBar.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean progressChanged) {
        if (progressChanged) {
            binding.videoView.seekTo(progress);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putLong(STATE_PROGRESS, binding.videoView.getCurrentPosition());
        outState.putLong(STATE_DURATION, binding.videoView.getDuration());

        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        long progress = savedInstanceState.getLong(STATE_PROGRESS);

        binding.videoView.seekTo(progress);
        binding.seekBar.setMax((int) savedInstanceState.getLong(STATE_DURATION));
        binding.seekBar.setProgress((int) progress);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {}

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {}

    @Override
    protected void onPause() {
        super.onPause();
        binding.videoView.pauseRendering();
        isPaused = true;
    }

    @Override
    protected void onResume() {
        super.onResume();
        binding.videoView.resumeRendering();
        isPaused = false;
    }

    @Override
    protected void onDestroy() {
        binding.videoView.shutdown();
        super.onDestroy();
    }

    public void playPause() {
        if (isPaused) {
            binding.videoView.playVideo();
        } else {
            binding.videoView.pauseVideo();
        }
    }

    private class ActivityEventListener extends VrVideoEventListener {
        @Override
        public void onLoadSuccess() {
            super.onLoadSuccess();
        }

        @Override
        public void onLoadError(String errorMessage) {
            super.onLoadError(errorMessage);
        }

        @Override
        public void onClick() {
            playPause();
        }

        @Override
        public void onNewFrame() {
            super.onNewFrame();
            binding.seekBar.setProgress((int) binding.videoView.getCurrentPosition());
        }

        @Override
        public void onCompletion() {
            binding.videoView.seekTo(0);
        }
    }

    class VideoLoaderTask extends AsyncTask<Void, Void, Boolean> {

        @Override
        protected Boolean doInBackground(Void... voids) {
            try {
                VrVideoView.Options options = new VrVideoView.Options();
                options.inputType = VrVideoView.Options.TYPE_STEREO_OVER_UNDER;
                binding.videoView.loadVideoFromAsset("congo.mp4", options);
                runOnUiThread(new Runnable() {

                    @Override
                    public void run() {
                        binding.videoView.setDisplayMode(VrWidgetView.DisplayMode.FULLSCREEN_STEREO);
                    }
                });

            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
    }
}