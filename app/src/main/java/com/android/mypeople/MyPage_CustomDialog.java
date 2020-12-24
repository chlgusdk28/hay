package com.android.mypeople;

import android.app.Dialog;
import android.content.Context;
import android.view.Window;

public class MyPage_CustomDialog {


    private final Context context;


    public MyPage_CustomDialog(Context context) {
        this.context = context;
    }

    public void callFunction(final String userDeleteMessage) {
        final Dialog dialog = new Dialog(context);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

    }
}
