package com.example.samson.immvrse;

import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;

import com.example.samson.immvrse.databinding.ActivityVideoViewerBinding;
import com.google.vr.sdk.widgets.video.VrVideoView;

import java.io.IOException;

@RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
public class VideoLoaderTask extends AsyncTask<Void, Void, Boolean> {

    private ActivityVideoViewerBinding binding;

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
