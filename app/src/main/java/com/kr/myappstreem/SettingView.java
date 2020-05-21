package com.kr.myappstreem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class SettingView extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting_main);

        Intent intent = getIntent();
    }

}
