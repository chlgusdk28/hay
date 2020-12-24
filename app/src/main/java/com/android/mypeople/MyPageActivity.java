package com.android.mypeople;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyPageActivity extends AppCompatActivity {

    Button mypage_pwbtn, mypage_updatebtn, mypage_canclebtn;
    EditText mypage_tel, mypage_name;
    TextView mypage_id, mypage_userdelete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);
        //마이페이지 버튼
        mypage_pwbtn = findViewById(R.id.mypage_pwbtn);
        mypage_updatebtn = findViewById(R.id.mypage_updatebtn);
        mypage_canclebtn = findViewById(R.id.mypage_canclebtn);

        //마이페이지 에디트텍스트
        mypage_tel = findViewById(R.id.mypage_tel);
        mypage_name = findViewById(R.id.mypage_name);

        //마이페이지 텍스트뷰
        mypage_id = findViewById(R.id.mypage_id);
        mypage_userdelete = findViewById(R.id.mypage_userdelete);



        mypage_userdelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MyPageActivity.this);
                builder.setTitle("탈퇴하기").setMessage("탈퇴하시려면 해당 문자를 동일하게 입력해주세요.");
                builder.setMessage("탈퇴하겠습니다.");
            }
        });




    }
}