package com.android.mypeople;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class JoinUsActivity extends AppCompatActivity {

    final static String TAG = "JoinUsActivty";
    EditText et_id;
    Button btn_continue;
    TextView tv_idcheck;
    Intent intent;
    String macIP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joinus);

        intent = getIntent();
        macIP = intent.getStringExtra("macIP");
        Log.v(TAG, "macIP : " + macIP);

        et_id = findViewById(R.id.join_et_id);


        btn_continue = findViewById(R.id.join_btn_continue);

        tv_idcheck = findViewById(R.id.join_tv_idcheck);



        // 이메일 입력 및 계속하기 버튼. DB저장 X
        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                // 입력받은 이메일(ID)를 추가정보 입력페이지로 넘김.
                String et_idsend = et_id.getText().toString();
                Log.v(TAG, "et_idsend : " + et_idsend);




                intent = new Intent(JoinUsActivity.this, JoinUsAddActivity.class);
                // 입력받은 이메일 넘김.
                intent.putExtra("et_idsend", et_idsend);
                intent.putExtra("macIP", macIP);  // IP주소를 보내줌.
                Log.v(TAG, "macIP123 : " + macIP);
                startActivity(intent);
            }
        });
    }
}