package com.NFU.CSIE40543210;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.Button;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Button nextPageBtn = (Button)findViewById(R.id.playbutton);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            System.out.println("testoutput: OnClickListener");
                try {
                    Intent intent = new Intent();
                    intent.setClass(MainPage.this  , SelectActivity.class);
                    startActivity(intent);
                } catch (Exception e) {
                    System.out.println("testoutput: OnClickListener e enter");
                    e.printStackTrace();
                }
            }
        });
    }

    public void Reset(View view){
        SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
        pref.edit()
                .putInt("GameFlag", 1)
                .putInt("Class1HP", 20).putInt("Class2HP", 10).putInt("Class3HP", 100)
                .putInt("Class1Range", 2).putInt("Class2Range", 5).putInt("Class3Range", 10)
                .putInt("Class1Speed", 5).putInt("Class2Speed", 20).putInt("Class3Speed", 10)
                .putInt("Class1Damage", 5).putInt("Class2Damage", 15).putInt("Class3Damage", 10)
                .putInt("Class1SkillTimes",2).putInt("Class2SkillTimes",2).putInt("Class3SkillTimes",50)
                .putInt("Class1Exp",10).putInt("Class2Exp",10).putInt("Class3Exp",10)
                .apply();

                new AlertDialog.Builder(MainPage.this)
                        .setTitle("已成功重置所有角色數值")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {

                            }
                        }).show();
            }


}
