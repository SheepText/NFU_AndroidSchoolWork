package com.NFU.CSIE40543210;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MotionEventCompat;

import com.cunoraz.continuouscrollable.ContinuousScrollableImageView;

import java.io.InputStream;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {
    ImageView ima;
    Character player;
    Enemy[] enemy;
    Boss boss;
    Attack[] atk;
    ContinuousScrollableImageView ground;
    ContinuousScrollableImageView background;
    TextView textview,textview2;
    static long period=50;
    int GameStartFlag=0;
    int timeFlag=0,SkillFlag=0;
    Button skillbtn_1,skillbtn_2,skillbtn_3;
    ProgressBar pb_HP,pb_EXP;
    Timer timer;
    int enemyTimer=0;
    float ground_TopY;
    int AttackCount=0;
    int enemyExp=0,playerExp=10;
    int enemyTotal=10;


    static class setPlayerdata {  //設定選擇的職業
        static int classchooes=0;
        static int level=0;
        static int attacktimeflag=-1;
        static int upgradeflag=0;
        static int chooesLevel=0;
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("testoutput: MainActivity onCreate");
        /*image = findViewById(R.id.player);
        image.setImageResource(R.drawable.player_2);*/
        //player.setPosition_X(image.getX());
        //player.setImage(image);
        //System.out.println("player.getPosition_X() = " + player.getPosition_X() + "player.getSize_width() = " + player.getSize_width());
        //System.out.println("image.getX()= "+image.getX()+" image.getWidth()= "+image.getWidth());
        //image2 = findViewById(R.id.img2);
        //image2.setImageResource(R.drawable.bullet2);

    }

    private void SetPlayerBitmap(Character character) {
        character.setSkillBit( BitmapSmall( RoadImage(character.getSkillId()),2));
        character.setStatus(1);character.setStatusId(0);
        if(setPlayerdata.classchooes==2) {
            for (int i = 0; i < character.getCharacterWalkIDlength(); i++)
                character.setCharacterWalkBit(BitmapSmall(RoadImage(character.getCharacterImageId()), 0.3f), i);

            character.setStatus(2);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacterJumpIDlength(); i++)
                character.setCharacterJumpBit(BitmapSmall(RoadImage(character.getCharacterImageId()), 0.3f), i);

            character.setStatus(4);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacterSlidingIDlength(); i++)
                character.setCharacterSlidingBit(BitmapSmall(RoadImage(character.getCharacterImageId()), 0.3f), i);

            character.setStatus(5);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacterHitIDlength(); i++)
                character.setCharacterHitBit(BitmapSmall(RoadImage(character.getCharacterImageId()), 0.3f), i);

            character.setStatus(6);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacterDeadIDlength(); i++)
                character.setCharacterDeadBit(BitmapSmall(RoadImage(character.getCharacterImageId()), 0.3f), i);
        }
        if(setPlayerdata.classchooes==1) {
            for (int i = 0; i < character.getCharacter2WalkIDlength(); i++)
                character.setCharacter2WalkBit(BitmapSmall(RoadImage(character.getCharacter2ImageId()), 0.3f), i);

            character.setStatus(2);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter2JumpIDlength(); i++)
                character.setCharacter2JumpBit(BitmapSmall(RoadImage(character.getCharacter2ImageId()), 0.3f), i);

            character.setStatus(4);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter2SlidingIDlength(); i++)
                character.setCharacter2SlidingBit(BitmapSmall(RoadImage(character.getCharacter2ImageId()), 0.3f), i);

            character.setStatus(5);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter2HitIDlength(); i++)
                character.setCharacter2HitBit(BitmapSmall(RoadImage(character.getCharacter2ImageId()), 0.3f), i);

            character.setStatus(6);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter2DeadIDlength(); i++)
                character.setCharacter2DeadBit(BitmapSmall(RoadImage(character.getCharacter2ImageId()), 0.3f), i);
        }
        if(setPlayerdata.classchooes==3) {
            for (int i = 0; i < character.getCharacter3WalkIDlength(); i++)
                character.setCharacter3WalkBit(BitmapSmall(RoadImage(character.getCharacter3ImageId()), 0.8f), i);

            character.setStatus(2);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter3JumpIDlength(); i++)
                character.setCharacter3JumpBit(BitmapSmall(RoadImage(character.getCharacter3ImageId()), 0.8f), i);

            character.setStatus(4);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter3SlidingIDlength(); i++)
                character.setCharacter3SlidingBit(BitmapSmall(RoadImage(character.getCharacter3ImageId()), 0.8f), i);

            character.setStatus(5);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter3HitIDlength(); i++)
                character.setCharacter3HitBit(BitmapSmall(RoadImage(character.getCharacter3ImageId()), 0.8f), i);

            character.setStatus(6);
            character.setStatusId(0);
            for (int i = 0; i < character.getCharacter3DeadIDlength(); i++)
                character.setCharacter3DeadBit(BitmapSmall(RoadImage(character.getCharacter3ImageId()), 0.8f), i);
            for(int i=0;i<43;i++) {
                character.setSkillBit3 (i,BitmapSmall(RoadImage(character.getSkillId3(i)),4 ));
            }
        }
    }
    private void SetEnemyBitmap(Enemy enemy) {
        enemy.setStatus(1);enemy.setStatusId(0);
        for(int i=0;i<enemy.getCharacterWalkIDlength();i++)
            enemy.setCharacterWalkBit(ImageReverse( BitmapSmall( RoadImage(enemy.getCharacterImageId()),0.3f)),i);
        /*enemy.setStatus(2);enemy.setStatusId(0);
        for(int i=0;i<enemy.getCharacterJumpIDlength();i++)
            enemy.setCharacterJumpBit(RoadImage(enemy.getCharacterImageId()),i);*/
        enemy.setStatus(5);enemy.setStatusId(0);
        for(int i=0;i<enemy.getCharacterHitIDlength();i++)
            enemy.setCharacterHitBit(ImageReverse( BitmapSmall( RoadImage(enemy.getCharacterImageId()),0.3f)),i);
        enemy.setStatus(6);enemy.setStatusId(0);
        for(int i=0;i<enemy.getCharacterDeadIDlength();i++)
            enemy.setCharacterDeadBit(ImageReverse( BitmapSmall( RoadImage(enemy.getCharacterImageId()),0.3f)),i);
    }
    private void SetBossBitmap(Boss boss) {
        boss.setStatus(1);boss.setStatusId(0);
        for(int i=0;i<boss.getCharacterWalkIDlength();i++)
            boss.setCharacterWalkBit(ImageReverse( BitmapSmall( RoadImage(boss.getCharacterImageId()),1.5f)),i);
        boss.setStatus(5);boss.setStatusId(0);
        for(int i=0;i<boss.getCharacterHitIDlength();i++)
            boss.setCharacterHitBit(ImageReverse( BitmapSmall( RoadImage(boss.getCharacterImageId()),1.5f)),i);
        boss.setStatus(6);boss.setStatusId(0);
        for(int i=0;i<boss.getCharacterDeadIDlength();i++)
            boss.setCharacterDeadBit(ImageReverse( BitmapSmall( RoadImage(boss.getCharacterImageId()),1.5f)),i);
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @SuppressLint({"SetTextI18n", "ResourceType"})
    protected void onResume(){
        super.onResume();

        int a;
        a = getSharedPreferences("PlayerData", MODE_PRIVATE)
                .getInt("GameFlag", 0);
        if(a!=1) {
            SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
            pref.edit()
                    .putInt("GameFlag", 1)
                    .putInt("Class1HP", 20).putInt("Class2HP", 10).putInt("Class3HP", 100)
                    .putInt("Class1Range", 2).putInt("Class2Range", 5).putInt("Class3Range", 10)
                    .putInt("Class1Speed", 5).putInt("Class2Speed", 20).putInt("Class3Speed", 10)
                    .putInt("Class1Damage", 5).putInt("Class2Damage", 15).putInt("Class3Damage", 10)
                    .apply();
            System.out.println("testoutput: getSharedPreferences test");
        }



        System.out.println("testoutput: getSharedPreferences a="+a);
        System.out.println("testoutput: MainActivity onResume");
        textview = findViewById(R.id.textView);
        textview.setText("onResume Test");
        atk=new Attack[100];
        for(int i=0;i<30;i++)
            atk[i]=new Attack();
        player = new Character();
        if(setPlayerdata.classchooes==1) {  //戰士
            player.setCharacter2ImageId();
            player.setPlayer2Bitmap();
            SetPlayerBitmap(player);
            player.setSize_width(player.getCharacter2WalkBit(0).getWidth());
            player.setSize_height(player.getCharacter2WalkBit(0).getHeight());
        }
        if(setPlayerdata.classchooes==2) {  //法師
            player.setCharacter1ImageId();
            player.setPlayerBitmap();
            SetPlayerBitmap(player);
            player.setSize_width(player.getCharacterWalkBit(0).getWidth());
            player.setSize_height(player.getCharacterWalkBit(0).getHeight());
        }
        if(setPlayerdata.classchooes==3) {  //國動
            player.setCharacter3ImageId();
            player.setPlayer3Bitmap();
            SetPlayerBitmap(player);
            player.setSize_width(player.getCharacter3WalkBit(0).getWidth());
            player.setSize_height(player.getCharacter3WalkBit(0).getHeight());
        }

        if(setPlayerdata.chooesLevel==1) {
            enemy = new Enemy[enemyTotal];
            for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++) {
                enemy[enemyCount] = new Enemy();
                enemy[enemyCount].setStatus(1);
                enemy[enemyCount].setStatusId(0);
                enemy[enemyCount].setPosition_Y(798);
                enemy[enemyCount].setPosition_X(2000 + 1000 * enemyCount);
            }
            enemy[0].defineEnemyBitmap();
            enemy[0].setEnemy11ImageId();
            SetEnemyBitmap(enemy[0]);
            enemy[0].setSize_width(enemy[0].getCharacterWalkBit(0).getWidth());
            enemy[0].setSize_height(enemy[0].getCharacterWalkBit(0).getHeight());
        }
        if(setPlayerdata.chooesLevel==2) {
            /*---------BOSS------*/
            boss = new Boss();
            boss.setStatus(1);
            boss.setStatusId(0);
            boss.setPosition_Y(-250);
            boss.setPosition_X(900);//900
            boss.defineEnemyBitmap();
            boss.setEnemy11ImageId();
            SetBossBitmap(boss);
            boss.setStatus(1);
            boss.setStatusId(0);
            boss.setSize_width(boss.getCharacterWalkBit(0).getWidth());
            boss.setSize_height(boss.getCharacterWalkBit(0).getHeight());
        }

        if(setPlayerdata.classchooes==1) { //戰士

            //player.setMax_Health(20);  //最高血量
            //player.setHealth_Point(20); //血量
            player.setMax_Health(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class1HP", 0));  //最高血量
            player.setAttack_Range(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class1Range", 0)); //距離
            player.setAttack_Speed(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class1Speed", 0)); //速度
            player.setAttack_Damage(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class1Damage", 0)); //傷害
            player.setSkill(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class1SkillTimes", 0)); //次數
        }
        if(setPlayerdata.classchooes==2) { //法師
            player.setMax_Health(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class2HP", 0));  //最高血量
            player.setAttack_Range(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class2Range", 0)); //距離
            player.setAttack_Speed(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class2Speed", 0)); //速度
            player.setAttack_Damage(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class2Damage", 0)); //傷害
            player.setSkill(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class2SkillTimes", 0)); //次數
        }
        if(setPlayerdata.classchooes==3) { //國動
            player.setMax_Health(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class3HP", 0));  //最高血量
            player.setAttack_Range(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class3Range", 0)); //距離
            player.setAttack_Speed(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class3Speed", 0)); //速度
            player.setAttack_Damage(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class3Damage", 0)); //傷害
            player.setSkill(getSharedPreferences("PlayerData", MODE_PRIVATE)
                    .getInt("Class3SkillTimes", 0)); //次數
        }

        player.setStatus(1);
        player.setStatusId(0);

        pb_HP = findViewById(R.id.player_HP);
        pb_EXP = findViewById(R.id.expProgressBar);
        pb_HP.setMax(player.getMax_Health());
        pb_HP.setProgress(player.getHealth_Point());
        pb_EXP.setMax(playerExp);
        pb_EXP.setProgress(enemyExp);  //經驗值

        timer = new java.util.Timer(true);
        timer.schedule(task, 100,period);
        ground= findViewById(R.id.continuousScrollableImageView);
        ground.setDuration(5000);//move speed
        //player.setPosition_Y(ground.getTop()-ground.getHeight());
        //player.setPosition_X(ground.getBottom());
        //System.out.println("groundPos ground.getTop()= "+ground.getTop()+" , ground.getBottom()= "+ground.getBottom());
        //player.setPosition_Y(500);

        background= findViewById(R.id.bgimg);
        background.setDuration(7000);//move speed
        ima = findViewById(R.id.BitMapTest);
        player.setPosition_Y(798);

        ChangeImage();
    }

    protected void onRestart() {
        super.onRestart();
        System.out.println("testoutput: MainActivity onRestart");
        Intent intent = new Intent();
        intent.setClass(MainActivity.this  , MainPage.class);
        startActivity(intent);
    }
    protected void onStop() {
        super.onStop();
        System.out.println("testoutput: MainActivity onStop");
        timer.cancel();
    }
    protected void onPause() {
        super.onPause();
        System.out.println("testoutput: MainActivity onPause");
        timer.cancel();
    }

    @SuppressLint("ResourceType")
    public void ChangeImage(){
        Resources res=getResources();
        InputStream is=res.openRawResource(R.drawable.transparent_2160x1080);
        BitmapDrawable bmpDraw=new BitmapDrawable(is);
        Bitmap bmp=bmpDraw.getBitmap();
        Bitmap bmp2=bmp.copy(Bitmap.Config.ARGB_8888, true);
        Canvas canvas = new Canvas(bmp2);
        Paint paint = new Paint();

        if (setPlayerdata.classchooes == 2) {
            canvas.drawBitmap(player.getCharacterBitmap(),player.getPosition_X(),player.getPosition_Y(),paint);
        }
        if (setPlayerdata.classchooes == 1) {
            canvas.drawBitmap(player.getCharacter2Bitmap(),player.getPosition_X(),player.getPosition_Y(),paint);
        }
        if (setPlayerdata.classchooes == 3) {
            canvas.drawBitmap(player.getCharacter3Bitmap(),player.getPosition_X(),player.getPosition_Y(),paint);
        }
        if(setPlayerdata.chooesLevel==1) {
            for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++)
                if (enemy[enemyCount].getStatus() != 7) {
                    canvas.drawBitmap(enemy[enemyCount].getCharacterBitmap(), enemy[enemyCount].getPosition_X(), enemy[enemyCount].getPosition_Y(), paint);
                }
        }
        System.out.println("testoutput: Boss setPlayerdata.chooesLevel= "+setPlayerdata.chooesLevel);
        if(setPlayerdata.chooesLevel==2) {
            System.out.println("testoutput: Boss boss.getStatus()= "+boss.getStatus());
            if (boss.getStatus() != 7) {
                System.out.println("testoutput: Boss boss.getPosition_X()="+boss.getPosition_X()+" , boss.getPosition_Y()"+boss.getPosition_Y());
                //canvas.drawBitmap(boss.getCharacterBitmap(), boss.getPosition_X(), boss.getPosition_Y(), paint);
                canvas.drawBitmap(boss.getCharacterBitmap(), 900, -250, paint);
            }
        }
        if(setPlayerdata.classchooes==3){
            System.out.println("testoutput: Skill classchooes="+setPlayerdata.classchooes+" , SkillFlag="+SkillFlag );
            if(SkillFlag>=0){
                canvas.drawBitmap(player.getSkillBit3(SkillFlag),1920-player.getSkillBit().getWidth()*2/3,0,paint);
                SkillFlag--;
            }
        }
        else if(SkillFlag>0){
            canvas.drawBitmap(player.getSkillBit(),1920-player.getSkillBit().getWidth()*2/3,0,paint);
            SkillFlag--;
        }
        for(int i=0;i<30;i++) {
            if(atk[i].getStatus()==1){
                canvas.drawBitmap(atk[i].getImage(),atk[i].getPosition_X(),atk[i].getPosition_Y(),paint);
            }
        }
        //canvas.drawBitmap(resizedBitmap,0,650,paint);
        //System.out.println("testoutput: x= " + player.getPosition_X()+" , y= "+player.getPosition_Y() + " , ground Top="+ ground.getTop() + " , ground Y="+ ground.getY() + " , ground getHeight="+ ground.getHeight());
        ima.setImageBitmap(bmp2);
    }
    private Bitmap RoadImage(int ImageId){
        Resources res=getResources();
        InputStream is;
        is=res.openRawResource(ImageId);
        BitmapDrawable bmpDraw=new BitmapDrawable(is);
        return bmpDraw.getBitmap();
    }

    /*@SuppressLint("ResourceType")
    private Bitmap LoadandBig(Attack attack,float n){//讀取圖片 and 縮小圖片
        Bitmap resizedBitmap = BitmapSmall(attack.getImage(),n);//圖片
        attack.setSize_width(resizedBitmap.getWidth());
        attack.setSize_height(resizedBitmap.getHeight());
        return resizedBitmap;
    }*/

    /*@SuppressLint("ResourceType")
    private Bitmap LoadandSmall(Character character,float n){//讀取圖片 and 縮小圖片
        Resources res=getResources();
        InputStream is;
        is=res.openRawResource(character.getCharacterImageId());
        //is=res.openRawResource(R.drawable.imagetest);
        BitmapDrawable bmpDraw=new BitmapDrawable(is);
        Bitmap bmp=bmpDraw.getBitmap();
        Bitmap resizedBitmap = BitmapSmall(bmp,n);//縮小圖片
        character.setSize_width(resizedBitmap.getWidth());
        character.setSize_height(resizedBitmap.getHeight());
        return resizedBitmap;
    }*/
    private Bitmap ImageReverse(Bitmap bmp){//反轉圖片
        Matrix maMiX = new Matrix();
        float[] floats = null;
        floats = new float[] { -1f, 0f, 0f, 0f, 1f, 0f, 0f, 0f, 1f };
        maMiX.setValues(floats);
        //maMiX.postTranslate(0, 2 * bmp.getHeight());
        //maMiX.postScale(-1, 1, 100 + bmp.getWidth() / 2,100 + bmp.getHeight() / 2);
        return Bitmap.createBitmap(bmp, 0, 0, bmp.getWidth(), bmp.getHeight(), maMiX, true);
        //canvas.drawBitmap(bmp, maMiX, paint);
    }
    private static Bitmap BitmapSmall(Bitmap bitmap,float n) {// Bitmap縮小圖片
        Matrix matrix = new Matrix();
        matrix.postScale(n,n);//長寬的比例
        Bitmap bitmapTemp = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        //System.out.println("BitmapSmall output: Width= "+bitmapTemp.getWidth()+" , Height= "+bitmapTemp.getHeight());
        return bitmapTemp;
        //return Bitmap.createBitmap(bitmap,10,10,50,100);
    }



    private boolean HitCheckPtE(Character character,Enemy enemy){
        float characterTop,characterLeft,characterRight,characterBottom;
        float eneCenX,eneCenY;
        characterTop=character.getPosition_Y();characterLeft=character.getPosition_X();characterRight=character.getSize_width()+character.getPosition_X();characterBottom=character.getPosition_Y()+character.getSize_height();
        eneCenX=enemy.getPosition_X()+enemy.getSize_width()/2;eneCenY=enemy.getPosition_Y()+enemy.getSize_height()/2;
        /*System.out.println("HitCheckPtE --------------------------------------------------");
        System.out.println("HitCheckPtE LX "+ (characterLeft<=enemyCenterX) );
        System.out.println("HitCheckPtE RX "+ (characterRight>=enemyCenterX) );
        System.out.println("HitCheckPtE TY "+ (characterTop>=enemyCenterY) );
        System.out.println("HitCheckPtE BY "+ (characterBottom<=enemyCenterY) );*/
        if(characterLeft<=eneCenX && characterRight>=eneCenX && characterTop<=eneCenY && characterBottom>=eneCenY )
            return true;
        else
            return false;
    }
    private boolean HitCheckEtA(Enemy enemy,Attack attack){
        float attCenX,attCenY,attL,attR;
        float eneL,eneR,eneTop,eneBot;
        //System.out.println("HitCheckEtA attack.X= "+ attack.getPosition_X()+ ",Y= " +attack.getPosition_Y()+ ",h= "+attack.getSize_height()+ ",w= "+attack.getSize_width() );
        attL=attack.getPosition_X();attR=attack.getPosition_X()+attack.getSize_width();
        attCenX=attack.getPosition_X()+attack.getSize_width()/2;attCenY=attack.getPosition_Y()+attack.getSize_height()/2;
        eneR=enemy.getPosition_X()+enemy.getSize_width()/5;eneL=enemy.getPosition_X()+enemy.getSize_width()/5;
        eneBot=enemy.getPosition_Y()+enemy.getSize_height()*2/3;eneTop=enemy.getPosition_Y()+enemy.getSize_height()/3;
        //System.out.println("HitCheckEtA --------------------------------------------------");
        //System.out.println("HitCheckEtA RX "+ (attCenX>=eneL) +",attCenX="+attCenX+" ,eneL="+eneL);
        //System.out.println("HitCheckEtA LX "+ (attCenX<=eneR) );
        //System.out.println("HitCheckEtA YT "+ (attCenY>=eneTop) );
        //System.out.println("HitCheckEtA YB "+ (attCenY<=eneBot) );
        //if(attCenX>=eneL && attCenX<=eneR && attCenY>=eneTop && attCenY<=eneBot)
        if(attCenX>=eneL)
            return true;
        else
            return false;
    }
    private boolean HitCheckBtA(Boss boss,Attack attack){
        float attCenX,attCenY,attL,attR;
        float eneL,eneR,eneTop,eneBot;
        //System.out.println("HitCheckEtA attack.X= "+ attack.getPosition_X()+ ",Y= " +attack.getPosition_Y()+ ",h= "+attack.getSize_height()+ ",w= "+attack.getSize_width() );
        attCenX=attack.getPosition_X()+attack.getSize_width()/2;attCenY=attack.getPosition_Y()+attack.getSize_height()/2;
        eneL=boss.getPosition_X()+boss.getSize_width()/3;
        //System.out.println("HitCheckBtA --------------------------------------------------");
        //System.out.println("HitCheckEtA RX "+ (attCenX>=eneL) +",attCenX="+attCenX+" ,eneL="+eneL);
        //System.out.println("HitCheckEtA LX "+ (attCenX<=eneR) );
        //System.out.println("HitCheckEtA YT "+ (attCenY>=eneTop) );
        //System.out.println("HitCheckEtA YB "+ (attCenY<=eneBot) );
        //if(attCenX>=eneL && attCenX<=eneR && attCenY>=eneTop && attCenY<=eneBot)
        if(attCenX>=eneL)
            return true;
        else
            return false;
    }



    TimerTask task = new TimerTask() {
        @SuppressLint({"SetTextI18n", "ResourceType"})
        public void run() {
            textview = findViewById(R.id.textView);
            textview2 = findViewById(R.id.textView2);
            //System.out.println("testoutput: timer working");
            try {
                 textview.setText(player.getHealth_Point() + "/" + player.getMax_Health());
                 textview2.setText(enemyExp + "/" + playerExp);
                 pb_HP.setProgress(player.getHealth_Point());  //角色生命值
                 pb_EXP.setProgress(enemyExp);

                 if(enemyExp>=playerExp){
                     setPlayerdata.upgradeflag+=1; //升級
                     playerExp+=5;
                     enemyExp=0;
                     pb_EXP.setMax(playerExp);
                 }
            } catch (Exception e) {
                System.out.println("testoutput: task e working");
                e.printStackTrace();
            }
            if(timeFlag<5) {
                ground_TopY = ground.getY() - player.getSize_height() / 2;
                player.setPosition_Y(ground_TopY);//初始位置 不知道為啥會在中間 手動調整
                player.setPosition_X(0);
                if (setPlayerdata.chooesLevel == 1){
                    for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++)
                        enemy[enemyCount].setPosition_Y(ground_TopY);
                }
                //.setPosition_Y(ground.getTop() - ground.getHeight());
                System.out.println("testoutput ground getTop="+ ground.getTop() + " , ground getY="+ ground.getY() + " , ground getHeight()="+ ground.getHeight()+", player.getSize_height()="+player.getSize_height());
                //System.out.println("testoutput player getX="+ player.getPosition_X() + " ,getY="+ player.getPosition_Y());
                //DisplayMetrics metric = new DisplayMetrics();getWindowManager().getDefaultDisplay().getMetrics(metric);
                //System.out.println("testoutput metric getX="+ metric.widthPixels + " ,getY="+ metric.heightPixels);
                //System.out.println("testoutput ima getX="+ ima.getX() + " ,getY="+ ima.getY()+ " ,getWidth="+ ima.getWidth() + " ,getHeight="+ ima.getHeight());
                //System.out.println("testoutput ima getLeft="+ ima.getLeft() + " ,getRight="+ ima.getRight()+ " ,getTop="+ ima.getTop() + " ,getBottom="+ ima.getBottom());
            }
            timeFlag++;
            if(GameStartFlag==1){//遊戲開始
                enemyTimer++;
                //System.out.println("testoutput: Status= "+player.getStatus());
                if(player.getHealth_Point()<=0) {//玩家死去

                    if(setPlayerdata.classchooes==1) {
                        SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
                        pref.edit()
                                .putInt("Class1Exp", playerExp)
                                .apply();
                    }
                    else if(setPlayerdata.classchooes==2) {
                        SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
                        pref.edit()
                                .putInt("Class2Exp", playerExp)
                                .apply();
                    }
                    else if(setPlayerdata.classchooes==3) {
                        SharedPreferences pref = getSharedPreferences("PlayerData", MODE_PRIVATE);
                        pref.edit()
                                .putInt("Class3Exp", playerExp)
                                .apply();
                    }

                    System.out.println("testoutput: player Dead statue="+player.getStatus());
                    if(setPlayerdata.upgradeflag > 0) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, upgradeActivity.class);
                        startActivity(intent);
                    }
                    else{
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this, MainPage.class);
                        startActivity(intent);
                    }
              /*      if(player.getStatus()==7) {
                        Intent intent = new Intent();
                        intent.setClass(MainActivity.this  , MainPage.class);
                        startActivity(intent);
                    }else if(player.getStatus()!=6) {
                        player.Dead();
                    }*/

                }
                else {
                    System.out.println("testoutput: player alive statue="+player.getStatus());

                    if (player.getStatus() == 5) { //playerAttack
                        //System.out.println("testoutput: attacktimeflag="+setPlayerdata.attacktimeflag);
                        //System.out.println("testoutput: timeFlag="+timeFlag);
                        if(setPlayerdata.attacktimeflag == -1){
                            System.out.println("testoutput: attacktimeflag="+setPlayerdata.attacktimeflag);
                            setPlayerdata.attacktimeflag=timeFlag;
                            atk[AttackCount].setStatus(1);
                            atk[AttackCount].setPosition_X(player.getPosition_X() + player.getSize_width() / 3 * 2);
                            atk[AttackCount].setPosition_Y(player.getPosition_Y() + player.getSize_height() / 2);
                            AttackCount++;
                            if (AttackCount == 10) AttackCount = 0;
                        }
                        else if( (timeFlag - setPlayerdata.attacktimeflag) % player.Attack_Speed == 0 ){
                            atk[AttackCount].setStatus(1);
                            atk[AttackCount].setPosition_X(player.getPosition_X() + player.getSize_width() / 3 * 2);
                            atk[AttackCount].setPosition_Y(player.getPosition_Y() + player.getSize_height() / 2);
                            AttackCount++;
                            if (AttackCount == 10) AttackCount = 0;
                        }

                        /*if (player.getStatusId() == 5) {
                            atk[AttackCount].setStatus(1);
                            atk[AttackCount].setPosition_X(player.getPosition_X() + player.getSize_width() / 3 * 2);
                            atk[AttackCount].setPosition_Y(player.getPosition_Y() + player.getSize_height() / 2);
                            AttackCount++;
                            if (AttackCount == 10) AttackCount = 0;
                        }*/
                    } else if (player.getStatus() == 2) {//Player Jump
                        player.setPosition_Y(player.getPosition_Y() - 20);
                        //System.out.println("testoutput: Y1= "+player.getPosition_Y()+"player.getPosition_Y()<=10="+ (player.getPosition_Y()<=10) );
                        if (player.getPosition_Y() <= 100) {
                            //System.out.println("testoutput: Y2= "+player.getPosition_Y()+"player.getPosition_Y()<=10="+ (player.getPosition_Y()<=10) );
                            player.setStatus(3);
                        }
                    } else if (player.getStatus() == 3) {//fall down
                        player.setPosition_Y(player.getPosition_Y() + 20);
                        //System.out.println("testoutput: Y= "+player.getPosition_Y());
                        if (player.getPosition_Y() == ground_TopY)
                            player.setStatus(1);
                    } else if (player.getStatus() == 8) {//Skill
                        float SkillLeft, SkillRight;
                        SkillLeft = 1920 - player.getSkillBit().getWidth() * 2 / 3;
                        SkillRight = 1920f;
                        if(setPlayerdata.chooesLevel==1) {
                            for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++) {
                                System.out.println("testoutput: Skill Left= " + (1920 - player.getSkillBit().getWidth() * 2 / 3) + " ,Right= " + SkillRight + " ,enemy= " + (enemy[enemyCount].getPosition_X() + enemy[enemyCount].getSize_width()));
                                if (enemy[enemyCount].getPosition_X() + enemy[enemyCount].getSize_width() > SkillLeft && enemy[enemyCount].getPosition_X() + enemy[enemyCount].getSize_width() < SkillRight) {
                                    enemy[enemyCount].setHealth_Point(enemy[enemyCount].getHealth_Point() - player.getAttack_Damage());
                                    System.out.println("testoutput: Skill Hit enemyHP= " + enemy[enemyCount].getHealth_Point());
                                }
                            }
                        }
                        if(setPlayerdata.chooesLevel==2) {
                            if (boss.getPosition_X() + boss.getSize_width() > SkillLeft && boss.getPosition_X() + boss.getSize_width() < SkillRight) {
                                boss.setHealth_Point(boss.getHealth_Point() - player.getAttack_Damage());
                            }
                        }
                        System.out.println("testoutput: Skill");
                        /*if(setPlayerdata.classchooes==3){
                            SkillFlag = 42;player.setStatus(1);
                        }
                        else*/
                            SkillFlag = 20;

                    }
                    if(setPlayerdata.chooesLevel==1) {
                        for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++) {
                            if (enemy[enemyCount].getStatus() != 7) {
                                if (player.getPosition_X() + player.getSize_width() * player.getAttack_Range() > enemy[enemyCount].getPosition_X() && enemy[enemyCount].getPosition_X() > player.getPosition_X()) {//法師判斷是否要攻擊
                                    if (player.getStatus() == 1) {//Attack Start
                                        player.Attack();
                                        System.out.println("testoutput: Player Attack ");
                                    }
                                    break;
                                }
                            } else if (player.getStatus() == 5 && enemyCount == 4) {
                                System.out.println("testoutput: Player Attack run");
                                player.Run();
                            }
                        }
                    }
                    if(setPlayerdata.chooesLevel==2){
                        if (boss.getStatus() != 7) {
                            if (player.getPosition_X() + player.getSize_width() * player.getAttack_Range() > boss.getPosition_X() && boss.getPosition_X() > player.getPosition_X()) {//法師判斷是否要攻擊
                                if (player.getStatus() == 1) {//Attack Start
                                    player.Attack();
                                    System.out.println("testoutput: Player Attack ");
                                }
                            }
                        } else if (player.getStatus() == 5) {
                            System.out.println("testoutput: Player Attack run");
                            player.Run();
                        }
                    }
                    for (int i = 0; i < 10; i++) {//法師攻擊子彈
                        if (atk[i].getStatus() == 1) {
                            atk[i].setPosition_X(atk[i].getPosition_X() + atk[i].getAttack_Speed());
                            //System.out.println("testoutput: atk[i].X = " + atk[i].getPosition_X() + ", i = " + i);
                            if (atk[i].getPosition_X() > 1920) {
                                atk[i].setStatus(0);
                            }
                            if(setPlayerdata.chooesLevel==1) {
                                for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++)
                                    if (enemy[enemyCount].getStatus() != 7)
                                        if (HitCheckEtA(enemy[enemyCount], atk[i])) {//atttack enemy
                                            enemy[enemyCount].setHealth_Point(enemy[enemyCount].getHealth_Point() - atk[i].getAttack_Damage());
                                            atk[i].setStatus(0);
                                        }
                            }
                            if(setPlayerdata.chooesLevel==2){
                                if (boss.getStatus() != 7)
                                    if (HitCheckBtA(boss, atk[i])) {//atttack enemy
                                        System.out.println("testoutput: HitCheckBtA");
                                        boss.setHealth_Point(boss.getHealth_Point() - atk[i].getAttack_Damage());
                                        atk[i].setStatus(0);
                                    }
                            }
                        }
                    }
                    int gameoverflag = 0;
                    //123---------------------------------------------------------------------------------------------------------------------------------------
                    if(setPlayerdata.chooesLevel==1) {
                        for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++) {
                            if (enemy[enemyCount].getStatus() != 7) {//敵人
                                if (enemy[enemyCount].getHealth_Point() <= 0 && enemy[enemyCount].getStatus() < 6) {//enemy dead
                                    enemy[enemyCount].setStatus(6);
                                    enemyExp += 3;
                                } else if (enemy[enemyCount].getStatus() != 6) {
                                    enemy[enemyCount].setPosition_X(enemy[enemyCount].getPosition_X() - enemy[enemyCount].getMove_Speed());
                                    if (enemy[enemyCount].getPosition_X() + enemy[enemyCount].getSize_width() <= 0)
                                        enemy[enemyCount].setPosition_X(2000);

                                    //enemy.setPosition_X(enemy.getPosition_X()+enemy.getMove_Speed());
                                    //if (enemy[i].getPosition_X() < (player.getPosition_X() + player.getSize_width() / 2) && enemy[i].getPosition_Y() + enemy[i].getSize_height() / 2 > player.getPosition_Y() + player.getSize_height()) {//
                                    if (HitCheckPtE(player, enemy[enemyCount])) {//
                                        //System.out.println("testoutput: player.getPosition_X() = " + player.getPosition_X() + "player.getSize_width() = " + player.getSize_width());
                                        player.setHealth_Point(player.getHealth_Point() - enemy[enemyCount].getAttack_Damage());
                                        enemy[enemyCount].setPosition_X(2000);
                                    }
                                }
                            } else if (enemy[enemyCount].getStatus() == 7) {
                                enemy[enemyCount].setPosition_X(2000);
                                gameoverflag++;
                            }
                        }
                    }
                    if(setPlayerdata.chooesLevel==2) {
                        if (boss.getHealth_Point() <= 0 && boss.getStatus() < 6) {//enemy dead
                            boss.setStatus(6);
                            enemyExp = playerExp;
                        } else if (boss.getStatus() != 6) {
                            boss.setPosition_X(boss.getPosition_X() - boss.getMove_Speed());
                            if (boss.getPosition_X() + boss.getSize_width() <= 0) {
                                if (setPlayerdata.upgradeflag > 0) {
                                    Intent intent = new Intent();
                                    intent.setClass(MainActivity.this, upgradeActivity.class);
                                    startActivity(intent);
                                } else {
                                    Intent intent = new Intent();
                                    intent.setClass(MainActivity.this, MainPage.class);
                                    startActivity(intent);
                                }
                            }
                        }
                    }


                    if(gameoverflag==enemyTotal){  ///判斷有無升級或結束
                        if(setPlayerdata.upgradeflag > 0) {
                            Intent intent = new Intent();
                            intent.setClass(MainActivity.this, upgradeActivity.class);
                            startActivity(intent);
                        }
                        else{
                            Intent intent = new Intent();
                            intent.setClass(MainActivity.this, MainPage.class);
                            startActivity(intent);
                        }
                    }
                }
            }
            ChangeImage();
        }
    };

    private float DownTouchX;
    private float DownTouchY;

    public boolean onTouchEvent(MotionEvent event) {//觸控事件
        /*int indextest = event.getActionIndex();
        DownTouchX = MotionEventCompat.getX(event,indextest);
        DownTouchY = MotionEventCompat.getY(event,indextest);*/
        //System.out.println("testoutput: DOWN X= "+DownTouchX+" DOWN Y= "+DownTouchY);
        if(GameStartFlag==1){
            int action = MotionEventCompat.getActionMasked(event);
            //System.out.println("testoutput: action = "+action);
            switch (action) {
                case MotionEvent.ACTION_DOWN:
                    int index = event.getActionIndex();
                    DownTouchX = MotionEventCompat.getX(event,index);
                    DownTouchY = MotionEventCompat.getY(event,index);
                    break;
                case MotionEvent.ACTION_UP:
                    index = event.getActionIndex();
                    float UpTouchX = MotionEventCompat.getX(event,index);
                    float UpTouchY = MotionEventCompat.getY(event,index);

                    System.out.println("testoutput: UP X = "+UpTouchX+" UP Y= "+UpTouchY);
                    System.out.println("testoutput: DOWN X= "+DownTouchX+" DOWN Y= "+DownTouchY);

                    if (UpTouchX-DownTouchX>400 && UpTouchY-DownTouchY>400){
                    }
                    else if (UpTouchX-DownTouchX>200){
                        System.out.println("testoutput: Player onTouch Skill");
                        if(setPlayerdata.classchooes==3) {
                            player.Skill3();SkillFlag=42;
                        }
                        else
                            player.Skill();
                    }
                    else if (DownTouchY-UpTouchY>200){
                        player.Jump();
                    }
                    break;
            }
            return true;
        }
        return true;
    }

    public void GameStartTest(View view){
        Button gamestartbtn = findViewById(R.id.MoveTestBtn);
        Button backbtn = findViewById(R.id.backBtn);
        gamestartbtn.setVisibility(View.INVISIBLE);
        backbtn.setVisibility(View.VISIBLE);

        if(setPlayerdata.classchooes==2) {
            for (int i = 0; i < 10; i++) {
                atk[i].setImage(BitmapSmall(RoadImage(R.drawable.attack), 5));
                atk[i].setAttack(player.getAttack_Damage(), 30);
            }
        }
        if(setPlayerdata.classchooes==1) {
            for (int i = 0; i < 10; i++) {
                atk[i].setImage(BitmapSmall(RoadImage(R.drawable.attack2), 0.5f));
                atk[i].setAttack(player.getAttack_Damage(), 30);
            }
        }
        if(setPlayerdata.classchooes==3) {
            for (int i = 0; i < 10; i++) {
                atk[i].setImage(BitmapSmall(RoadImage(R.drawable.attack3), 1));
                atk[i].setAttack(player.getAttack_Damage(), 30);
            }
        }
        atk[0].setSize_height(atk[0].getImage().getHeight());
        atk[0].setSize_width(atk[0].getImage().getWidth());
        /*atk[0].setImage(RoadImage(R.drawable.attack));
        atk[1].setImage(RoadImage(R.drawable.attack));
        atk[2].setImage(RoadImage(R.drawable.attack));
        atk[3].setImage(RoadImage(R.drawable.attack));
        atk[4].setImage(RoadImage(R.drawable.attack));*/
        if(setPlayerdata.chooesLevel==1) {
            for (int enemyCount = 0; enemyCount < enemyTotal; enemyCount++) {
                enemy[enemyCount].setMove_Speed(25);
                enemy[enemyCount].setAttack_Damage(1);
                enemy[enemyCount].setMax_Health(30);
            }
        }
        if(setPlayerdata.chooesLevel==2) {
            boss.setMove_Speed(10);
            boss.setAttack_Damage(3);
            boss.setMax_Health(100);
        }
        System.out.println("groundPos ground.getTop()= "+ground.getTop()+" , ground.getBottom()= "+ground.getBottom());
        GameStartFlag=1;
        /*skillbtn_1 = findViewById(R.id.skillbutton_1);
        skillbtn_2 = findViewById(R.id.skillbutton_2);
        skillbtn_3 = findViewById(R.id.skillbutton_3);
        skillbtn_1.setVisibility(View.VISIBLE);
        skillbtn_2.setVisibility(View.VISIBLE);
        skillbtn_3.setVisibility(View.VISIBLE);*/
    }

    public void BackBtn(View view){
        if(setPlayerdata.upgradeflag > 0) {
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, upgradeActivity.class);
            startActivity(intent);
        }
        else{
            Intent intent = new Intent();
            intent.setClass(MainActivity.this, MainPage.class);
            startActivity(intent);
        }
    }
}
