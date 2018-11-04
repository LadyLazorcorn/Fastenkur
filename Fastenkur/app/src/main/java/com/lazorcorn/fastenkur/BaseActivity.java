package com.lazorcorn.fastenkur;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity{

    private ProgressDialog mProgressDialog;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getContentView());
        onViewReady(savedInstanceState, getIntent());
    }

    protected void onViewReady(Bundle savedInstanceState, Intent intent) {
        //to e used by child activities
    }

    protected void showDialog(String message){
        if (mProgressDialog == null) {
            mProgressDialog = new ProgressDialog(this);
            mProgressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
            mProgressDialog.setCancelable(true);
        }
        mProgressDialog.setMessage(message);
        mProgressDialog.show();
    }

    protected void hideDialoge(){
        if (mProgressDialog != null && mProgressDialog.isShowing()) {

        }
        mProgressDialog.dismiss();
    }

    protected abstract int getContentView();
}