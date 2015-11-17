package com.android_lesson.aomori.hello4;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.amclassical_jesu_joy_of_mans_desiring);

        Button btn = (Button)findViewById(R.id.button);
        btn.setText("HELLO");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;
                b.setText("こんにちは！");

                mPlayer.start();
            }
        });
    }
}
