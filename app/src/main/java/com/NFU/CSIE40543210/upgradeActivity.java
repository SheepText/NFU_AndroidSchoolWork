package com.NFU.CSIE40543210;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class upgradeActivity extends AppCompatActivity {


    Character player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upgrade);

    }

    public void upattackbtn(View view){  //攻擊
        if(MainActivity.setPlayerdata.classchooes==1) {
            int Damage1 = (getSharedPreferences("PlayerData", MODE_PRIVATE).getInt("Class1Damage", 0));  //最高血量
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit().putInt("Class1Damage", Damage1+2).apply();
        }
        else if (MainActivity.setPlayerdata.classchooes==2) {
            int Damage2 = (getSharedPreferences("PlayerData", MODE_PRIVATE).getInt("Class2Damage", 0));  //最高血量
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit().putInt("Class2Damage", Damage2+2).apply();
        }
        else if (MainActivity.setPlayerdata.classchooes==3) {
            int Damage3 = (getSharedPreferences("PlayerData", MODE_PRIVATE).getInt("Class3Damage", 0));  //最高血量
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit().putInt("Class3Damage", Damage3+2).apply();
        }
        jump();
    }
    public void uphpbtn(View view){ //HP
        if(MainActivity.setPlayerdata.classchooes==1) {
            int hp1 = (getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class1HP", 0));  //最高血量
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit()
                    .putInt("Class1HP", hp1+5)
                    .apply();
        }
        else if (MainActivity.setPlayerdata.classchooes==2) {
            int hp2 = (getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class2HP", 0));  //最高血量
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit()
                    .putInt("Class2HP", hp2+5)
                    .apply();
        }
        else if (MainActivity.setPlayerdata.classchooes==3) {
            int hp3 = (getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class3Hp", 0));  //最高血量
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit()
                    .putInt("Class3Hp", hp3+5)
                    .apply();
        }
        jump();
    }
    public void upskillbtn(View view){ //技能次數
        if(MainActivity.setPlayerdata.classchooes==1) {
            int skilltimes1 = (getSharedPreferences("PlayerData", MODE_PRIVATE).getInt("Class1SkillTimes", 0));
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit()
                    .putInt("Class1SkillTimes", skilltimes1+1)
                    .apply();
        }
        else if (MainActivity.setPlayerdata.classchooes==2) {
            int skilltimes2 = (getSharedPreferences("PlayerData", MODE_PRIVATE).getInt("Class2SkillTimes", 0));
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit()
                    .putInt("Class2SkillTimes", skilltimes2+2)
                    .apply();
        }
        else if (MainActivity.setPlayerdata.classchooes==3) {
            int skilltimes3 = (getSharedPreferences("PlayerData", MODE_PRIVATE).getInt("Class3SkillTimes", 0));
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit()
                    .putInt("Class3SkillTimes", skilltimes3+1)
                    .apply();
        }
        jump();
    }
    public void jump(){
        MainActivity.setPlayerdata.upgradeflag--;
        if(MainActivity.setPlayerdata.upgradeflag==0) {
            Intent intent = new Intent();
            intent.setClass(upgradeActivity.this, MainPage.class);
            startActivity(intent);
        }
    }


}
