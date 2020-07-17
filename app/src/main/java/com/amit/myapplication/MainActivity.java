package com.amit.myapplication;

import android.os.Bundle;
import android.support.wearable.activity.WearableActivity;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity extends WearableActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView);

        //videoView.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.demo_video);
        videoView.setVideoPath("https://file-examples-com.github.io/uploads/2020/03/file_example_WEBM_480_900KB.webm");

        MediaController mediaController = new MediaController(this);

        mediaController.setAnchorView(videoView);

        videoView.setMediaController(mediaController);

        videoView.start();

        // Enables Always-on
        setAmbientEnabled();
    }
}
