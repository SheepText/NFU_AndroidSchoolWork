package com.NFU.CSIE40543210;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectActivity extends AppCompatActivity {

    MainActivity SetPlayerData;
    Character SetPlayerData1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);


        Button nextPageBtn = (Button)findViewById(R.id.okbutton);
        nextPageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("testoutput: OnClickListener");
                try {
                    Intent intent = new Intent();
                    intent.setClass(SelectActivity.this  , MainActivity.class);
                    startActivity(intent);
                } catch (Exception e) {
                    System.out.println("testoutput: OnClickListener e enter");
                    e.printStackTrace();
                }
            }
        });
    }


    public void ChooesLevel1(View view){
        Button level1 = (Button)findViewById(R.id.level1btn);
        Button level1s = (Button)findViewById(R.id.level1select);

        Button levelBoss = (Button)findViewById(R.id.levelbossbtn);
        Button levelBosss = (Button)findViewById(R.id.levelbossselect);

        level1.setVisibility(View.INVISIBLE);
        level1s.setVisibility(View.VISIBLE);
        levelBoss.setVisibility(View.VISIBLE);levelBosss.setVisibility(View.INVISIBLE);
        MainActivity.setPlayerdata.chooesLevel=1;
    }
    public void ChooesLevelBoss(View view){
        Button levelBoss = (Button)findViewById(R.id.levelbossbtn);
        Button levelBosss = (Button)findViewById(R.id.levelbossselect);

        Button level1 = (Button)findViewById(R.id.level1btn);
        Button level1s = (Button)findViewById(R.id.level1select);
        levelBoss.setVisibility(View.INVISIBLE);level1.setVisibility(View.VISIBLE);
        levelBosss.setVisibility(View.VISIBLE);level1s.setVisibility(View.INVISIBLE);
        MainActivity.setPlayerdata.chooesLevel=2;
    }





    public void ChooesClass1(View view){  //戰士
        final Button classbtn1 = (Button)findViewById(R.id.skillbutton_1); final Button classbtn2 = (Button)findViewById(R.id.skillbutton_2);final Button classbtn3 = (Button)findViewById(R.id.skillbutton_3);
        final Button Startbtn= (Button)findViewById(R.id.okbutton);
        final Button Select1btn= (Button)findViewById(R.id.class1select); final Button Select2btn= (Button)findViewById(R.id.class2select);final Button Select3btn= (Button)findViewById(R.id.class3select);
        classbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ChooesClass1");
                try {
                    classbtn1.setVisibility(View.INVISIBLE); classbtn2.setVisibility(View.VISIBLE); classbtn3.setVisibility(View.VISIBLE);
                    Startbtn.setVisibility(View.VISIBLE);
                    Select1btn.setVisibility(View.VISIBLE); Select2btn.setVisibility(View.INVISIBLE); Select3btn.setVisibility(View.INVISIBLE);
                    MainActivity.setPlayerdata.classchooes=1;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void ChooesClass2(View view){ //法師
        final Button classbtn1 = (Button)findViewById(R.id.skillbutton_1); final Button classbtn2 = (Button)findViewById(R.id.skillbutton_2);final Button classbtn3 = (Button)findViewById(R.id.skillbutton_3);
        final Button Startbtn= (Button)findViewById(R.id.okbutton);
        final Button Select1btn= (Button)findViewById(R.id.class1select); final Button Select2btn= (Button)findViewById(R.id.class2select);final Button Select3btn= (Button)findViewById(R.id.class3select);
        classbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ChooesClass2");
                try {
                    classbtn1.setVisibility(View.VISIBLE); classbtn2.setVisibility(View.INVISIBLE); classbtn3.setVisibility(View.VISIBLE);
                    Startbtn.setVisibility(View.VISIBLE);
                    Select1btn.setVisibility(View.INVISIBLE); Select2btn.setVisibility(View.VISIBLE); Select3btn.setVisibility(View.INVISIBLE);
                    MainActivity.setPlayerdata.classchooes=2;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    public void ChooesClass3(View view){ //國動
        final Button classbtn1 = (Button)findViewById(R.id.skillbutton_1); final Button classbtn2 = (Button)findViewById(R.id.skillbutton_2);final Button classbtn3 = (Button)findViewById(R.id.skillbutton_3);
        final Button Startbtn= (Button)findViewById(R.id.okbutton);
        final Button Select1btn= (Button)findViewById(R.id.class1select); final Button Select2btn= (Button)findViewById(R.id.class2select);final Button Select3btn= (Button)findViewById(R.id.class3select);
        classbtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("ChooesClass3");
                try {
                    classbtn1.setVisibility(View.VISIBLE); classbtn2.setVisibility(View.VISIBLE); classbtn3.setVisibility(View.INVISIBLE);
                    Startbtn.setVisibility(View.VISIBLE);
                    Select1btn.setVisibility(View.INVISIBLE); Select2btn.setVisibility(View.INVISIBLE); Select3btn.setVisibility(View.VISIBLE);
                    MainActivity.setPlayerdata.classchooes=3;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
