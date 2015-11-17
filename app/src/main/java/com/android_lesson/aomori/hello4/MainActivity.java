package com.android_lesson.aomori.hello4;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.d("TAG", "onCreateが実行されました");

        setContentView(R.layout.activity_main);

        mPlayer = MediaPlayer.create(getApplicationContext(), R.raw.amclassical_jesu_joy_of_mans_desiring);

        Button btn = (Button)findViewById(R.id.button);
        btn.setText("再生");
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button b = (Button) v;

                if (mPlayer.isPlaying() == true) {
                    mPlayer.pause();

                    b.setText("再生");
                } else {
                    mPlayer.start();

                    b.setText("一時停止");
                }
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        Log.d("TAG", "onDestroyが実行されました");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("TAG", "onPauseが実行されました");
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        Log.d("TAG", "onRestartが実行されました");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("TAG", "onResumeが実行されました");
    }

    @Override
    protected void onStop() {
        super.onStop();

        Log.d("TAG", "onStopが実行されました");

        mPlayer.pause();
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("TAG", "onStartが実行されました");
    }
}
