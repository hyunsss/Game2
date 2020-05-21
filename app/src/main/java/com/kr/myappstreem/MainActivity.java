package com.kr.myappstreem;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button button1; Button button2; Button button3; ImageView background;
    int Gold = 0;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

      //  Background();
        SettingButton();
        Menu1();


    }
/*
    public void Background() {
        background = (ImageView)findViewById(R.id.background);
        background.onTouchEvent(new ImageView.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Gold++;
            }
        });
    }
*/

    public void SettingButton() {
        ImageButton setting = (ImageButton)findViewById(R.id.setting);
        setting.setOnClickListener(new Button.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SettingView.class);
                startActivity(intent);
            }
        });
    }

    public void Menu1() {
        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent menu1 = new Intent(MainActivity.this, Menu1.class);
                startActivity(menu1);
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setMessage("종료하시겠습니까?");
        builder.setPositiveButton("예", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                saved();
                finish();
            }
        });

        builder.setNegativeButton("아니오", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                //아무것도 안함
            }
        });
        builder.setTitle("게임 종료");
        builder.show();

    }
    

    public void saved() {

    }
}
