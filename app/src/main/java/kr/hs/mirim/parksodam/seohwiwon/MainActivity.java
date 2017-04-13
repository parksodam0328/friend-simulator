package kr.hs.mirim.parksodam.seohwiwon;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "서휘원:Main";
    private ImageView mImageViewFriendVisual;
    private MediaPlayer mMediaPlayer;
    private Vibrator mVib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        mImageViewFriendVisual = (ImageView) findViewById(R.id.friend_visual);
        Log.d(TAG, "activity_main 레이아웃 세팅~");
        mMediaPlayer = mMediaPlayer.create(this, R.raw.a01);
        mMediaPlayer.setLooping(false);
        mMediaPlayer.start();
        mVib = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        mVib.vibrate(2000);
    }

    protected void onDestroy() {
        super.onDestroy();
        mMediaPlayer.pause();
        mMediaPlayer.stop();
    }

    void onClick(View view) {

        Log.d(TAG, "onCreate 메소드 호출~");
        Log.d(TAG, "클릭된 뷰 id : " + view.getId());
        mVib.vibrate(1000);
        if (mMediaPlayer.isPlaying()) {
            mMediaPlayer.pause();
        }
        switch (view.getId()) {
            case R.id.button1:
                Log.d(TAG, "버튼 1 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.hwiwon1);
                mMediaPlayer = mMediaPlayer.create(this, R.raw.a01);
                mMediaPlayer.start();
                Toast.makeText(this, "아 집가고 싶어", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button2:
                Log.d(TAG, "버튼 2 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.hwiwon2);
                mMediaPlayer = mMediaPlayer.create(this, R.raw.a02);
                mMediaPlayer.start();
                Toast.makeText(this, "하 망했다", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button3:
                Log.d(TAG, "버튼 3 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.hwiwon3);
                mMediaPlayer = mMediaPlayer.create(this, R.raw.a03);
                mMediaPlayer.start();
                Toast.makeText(this, "졸려", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button4:
                Log.d(TAG, "버튼 4 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.hwiwon4);
                mMediaPlayer = mMediaPlayer.create(this, R.raw.a04);
                mMediaPlayer.start();
                Toast.makeText(this, "나 자바 좀 알려줘라", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button5:
                Log.d(TAG, "버튼 5 클릭");
                mImageViewFriendVisual.setImageResource(R.drawable.hwiwon5);
                mMediaPlayer = mMediaPlayer.create(this, R.raw.a05);
                mMediaPlayer.start();
                Toast.makeText(this, "하잇", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            default:
                Log.d(TAG, "모르는 녀석 클릭");
                mMediaPlayer = mMediaPlayer.create(this, R.raw.a04);
                mMediaPlayer.start();
                Toast.makeText(this, "뭐라 하는지 모르겠어요!", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
        }
        Log.d(TAG, "onClick 메서드가 종료되었습니다");
    }
}
