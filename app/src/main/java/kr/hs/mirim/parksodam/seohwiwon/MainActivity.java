package kr.hs.mirim.parksodam.seohwiwon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public final  static String TAG = "서휘원";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"onCreate 메소드 호출~");
        setContentView(R.layout.activity_main);
        Log.d(TAG,"activity_main 레이아웃 세팅~");
    }

    void onClick(View view) {

        Log.d(TAG,"onCreate 메소드 호출~");
        Log.d(TAG,"클릭된 뷰 id : "+view.getId());
        switch (view.getId()) {

            case R.id.button1:
                Log.d(TAG,"버튼 1 클릭");
                Toast.makeText(this, "아 집가고 싶어", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button2:
                Log.d(TAG,"버튼 2 클릭");
                Toast.makeText(this, "하 망했다", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button3:
                Log.d(TAG,"버튼 3 클릭");
                Toast.makeText(this, "졸려", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button4:
                Log.d(TAG,"버튼 4 클릭");
                Toast.makeText(this, "나 자바 좀 알려줘라", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button5:
                Log.d(TAG,"버튼 5 클릭");
                Toast.makeText(this, "하잇", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            default:
                Log.d(TAG,"모르는 녀석 클릭");
                Toast.makeText(this, "뭐라 하는지 모르겠어요!", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
        }
        Log.d(TAG,"onClick 메서드가 종료되었습니다");
    }
}
