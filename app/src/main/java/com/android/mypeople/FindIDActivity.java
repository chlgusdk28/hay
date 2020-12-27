package com.android.mypeople;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.PhoneNumberFormattingTextWatcher;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.TextView;

public class FindIDActivity extends AppCompatActivity {

   EditText findid_et_tel;
   TextView findid_tv_telcheck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_id);
        findid_et_tel = findViewById(R.id.findid_et_tel);
        findid_tv_telcheck = findViewById(R.id.findid_tv_telcheck);


        findid_et_tel.addTextChangedListener(new PhoneNumberFormattingTextWatcher());

        findid_et_tel.setFilters(new InputFilter[] {new InputFilter.LengthFilter(13)});



    }
}