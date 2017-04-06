package kr.hs.mirim.parksodam.seohwiwon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onClick(View view) {
        switch (view.getId()) {
            case R.id.button1:
                Toast.makeText(this, "아 집가고 싶어", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button2:
                Toast.makeText(this, "하 망했다", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button3:
                Toast.makeText(this, "졸려", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button4:
                Toast.makeText(this, "나 자바 좀 알려줘라", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            case R.id.button5:
                Toast.makeText(this, "하잇", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
            default:
                Toast.makeText(this, "으에에에ㅔㄱ!!!", Toast.LENGTH_SHORT).show();
                break; //.show()를 해야 Toast가 실행된다.
        }
    }
}
