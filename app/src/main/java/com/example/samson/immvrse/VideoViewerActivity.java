package com.example.samson.immvrse;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.SeekBar;

import com.example.samson.immvrse.databinding.ActivityVideoViewerBinding;
import com.google.vr.sdk.widgets.video.VrVideoEventListener;
import com.google.vr.sdk.widgets.video.VrVideoView;

import java.io.IOException;

public class VideoViewerActivity extends Activity implements SeekBar.OnSeekBarChangeListener {

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
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

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
            super.onClick();
        }

        @Override
        public void onNewFrame() {
            super.onNewFrame();
        }

        @Override
        public void onCompletion() {
            super.onCompletion();
        }
    }

     protected class VideoLoaderTask extends AsyncTask<Void, Void, Boolean> {

        @Override
        protected Boolean doInBackground(Void... voids) {
            try {
                VrVideoView.Options options = new VrVideoView.Options();
                options.inputType = VrVideoView.Options.TYPE_MONO;
                binding.videoView.loadVideoFromAsset("london_bridge.mp4", options);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return true;
        }
    }

}
