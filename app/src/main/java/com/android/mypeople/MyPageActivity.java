package com.android.mypeople;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MyPageActivity extends AppCompatActivity {
    //탈퇴합니다 메세지 받을 부분
    final String userDeleteMessage = "";

    Button mypage_pwbtn, mypage_updatebtn, mypage_canclebtn;
    EditText mypage_tel, mypage_name;
    TextView mypage_id, mypage_userdelete;

    LinearLayout ll_hide;
    InputMethodManager inputMethodManager ;

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
                MyPage_CustomDialog myPage_customDialog = new MyPage_CustomDialog(MyPageActivity.this);
                myPage_customDialog.callFunction(userDeleteMessage);

            }
        });

        //키보드 화면 터치시 숨기기위해 선언.
        ll_hide = findViewById(R.id.detail_ll_hide);
        inputMethodManager = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);  //OS에서 지원해주는 메소드이다.

        //키보드 화면 터치시 숨김.
        ll_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputMethodManager.hideSoftInputFromWindow(ll_hide.getWindowToken(),0);
            }
        });

        //비밀번호 수정 버튼
        mypage_pwbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MyPage_Password.class);
                startActivity(intent);
            }
        });

        //취소버튼
        mypage_canclebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        //수정버튼
        mypage_updatebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
