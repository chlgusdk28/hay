package com.android.mypeople;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class JoinUsAddActivity extends AppCompatActivity {

    final static String TAG = "JoinAddActivity";
    String urlAddr = null;
    Intent intent;
    String registId,macIP;
    String uId,uPw, uName, utel, uInsertDate;
    TextView tv_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joinusadd);

        intent = getIntent();
        registId = intent.getStringExtra("et_idsend");

        Log.v(TAG, "registId : " + registId);
        macIP = intent.getStringExtra("macIP");

        Log.v(TAG, "macIP : " + macIP);
        urlAddr = "http://" + macIP + ":8080/test/studentInsert.jsp?"; // 물음표 뒤로 데이터를 붙여 날아감.

        tv_id = findViewById(R.id.joinadd_tv_id);

        tv_id.setText(registId);

    }



}