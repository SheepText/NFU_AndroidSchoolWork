package com.NFU.CSIE40543210;

import android.graphics.Bitmap;
import android.graphics.Canvas;

public class Character{
    //protected ImageView image;
    protected int Max_Health;
    protected int Health_Point;
    protected int Attack_Damage;
    protected int Attack_Speed;
    protected int Attack_Range;
    protected int Move_Speed;
    protected int Skill;
    protected float Position_X;
    protected float Position_Y;
    protected int Size_width;
    protected int Size_height;
    protected static int[] CharacterJumpID,CharacterWalkID,CharacterDeadID,CharacterHitID,CharacterSlidingID,CharacterHurtID;
    protected static int[] Character2JumpID,Character2WalkID,Character2DeadID,Character2HitID,Character2SlidingID,Character2HurtID;
    protected static int[] Character3JumpID,Character3WalkID,Character3DeadID,Character3HitID,Character3SlidingID,Character3HurtID,Character3SkillId;
    protected static Bitmap[] CharacterJumpBit,CharacterWalkBit,CharacterDeadBit,CharacterHitBit,CharacterSlidingBit,CharacterHurtBit;
    protected static Bitmap[] Character2JumpBit,Character2WalkBit,Character2DeadBit,Character2HitBit,Character2SlidingBit,Character2HurtBit;
    protected static Bitmap[] Character3JumpBit,Character3WalkBit,Character3DeadBit,Character3HitBit,Character3SlidingBit,Character3HurtBit,Character3SkillBit;
    protected int SkillId;
    protected Bitmap SkillBit;
    protected int status,statusId;//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead //8 Skill

    public static Bitmap getCharacterWalkBit(int n) {
        return CharacterWalkBit[n];
    }
    public static Bitmap getCharacter2WalkBit(int n) {
        return Character2WalkBit[n];
    }
    public static Bitmap getCharacter3WalkBit(int n) {
        return Character3WalkBit[n];
    }

    public void setSkillBit(Bitmap skillBit) {
        SkillBit = skillBit;
    }
    public void setSkillBit3(int i,Bitmap skillBit) {
        Character3SkillBit[i]=skillBit;
    }
    public int getSkillId3(int i) {
        return Character3SkillId[i];
    }
    public Bitmap getSkillBit() {
        return SkillBit;
    }
    public Bitmap getSkillBit3(int i) {
        return Character3SkillBit[42-i];
    }
    public int getSkillId() {
        return SkillId;
    }

    public int getCharacterJumpIDlength(){
        return CharacterJumpID.length;
    }
    public int getCharacterWalkIDlength(){
        return CharacterWalkID.length;
    }
    public int getCharacterDeadIDlength(){
        return CharacterDeadID.length;
    }
    public int getCharacterHitIDlength(){
        return CharacterHitID.length;
    }
    public int getCharacterSlidingIDlength(){
        return CharacterSlidingID.length;
    }
    public int getCharacterHurtIDlength(){
        return CharacterHurtID.length;
    }
    public int getCharacter2JumpIDlength(){
        return Character2JumpID.length;
    } //------------戰士
    public int getCharacter2WalkIDlength(){
        return Character2WalkID.length;
    }
    public int getCharacter2DeadIDlength(){
        return Character2DeadID.length;
    }
    public int getCharacter2HitIDlength(){
        return Character2HitID.length;
    }
    public int getCharacter2SlidingIDlength(){
        return Character2SlidingID.length;
    }
    public int getCharacter2HurtIDlength(){
        return Character2HurtID.length;
    }
    public int getCharacter3JumpIDlength(){
        return Character3JumpID.length;
    } //------------國動
    public int getCharacter3WalkIDlength(){
        return Character3WalkID.length;
    }
    public int getCharacter3DeadIDlength(){
        return Character3DeadID.length;
    }
    public int getCharacter3HitIDlength(){
        return Character3HitID.length;
    }
    public int getCharacter3SlidingIDlength(){
        return Character3SlidingID.length;
    }
    public int getCharacter3HurtIDlength(){
        return Character3HurtID.length;
    }

    public void setCharacter1ImageId() {
        this.status=1;this.statusId=0;this.Position_X=0;this.Position_Y=0;
        SkillId=R.drawable.fireskill;

        /*--------------------法師--------------------*/
        CharacterWalkID=new int[24];
        CharacterWalkID[0] = R.drawable.class2walk00;CharacterWalkID[1] = R.drawable.class2walk01;CharacterWalkID[2] = R.drawable.class2walk02;CharacterWalkID[3] = R.drawable.class2walk03;CharacterWalkID[4] = R.drawable.class2walk04;
        CharacterWalkID[5] = R.drawable.class2walk05;CharacterWalkID[6] = R.drawable.class2walk06;CharacterWalkID[7] = R.drawable.class2walk07;CharacterWalkID[8] = R.drawable.class2walk08;CharacterWalkID[9] = R.drawable.class2walk09;
        CharacterWalkID[10] = R.drawable.class2walk10;CharacterWalkID[11] = R.drawable.class2walk11;CharacterWalkID[12] = R.drawable.class2walk12;CharacterWalkID[13] = R.drawable.class2walk13;CharacterWalkID[14] = R.drawable.class2walk14;
        CharacterWalkID[15] = R.drawable.class2walk15;CharacterWalkID[16] = R.drawable.class2walk16;CharacterWalkID[17] = R.drawable.class2walk17;CharacterWalkID[18] = R.drawable.class2walk18;CharacterWalkID[19] = R.drawable.class2walk19;
        CharacterWalkID[20] = R.drawable.class2walk20;CharacterWalkID[21] = R.drawable.class2walk21;CharacterWalkID[22] = R.drawable.class2walk22;CharacterWalkID[23] = R.drawable.class2walk23;
        CharacterJumpID=new int[12];
        CharacterJumpID[0]=R.drawable.class2jump00;CharacterJumpID[1]=R.drawable.class2jump01;CharacterJumpID[2]=R.drawable.class2jump02;CharacterJumpID[3]=R.drawable.class2jump03;CharacterJumpID[4]=R.drawable.class2jump04;
        CharacterJumpID[5]=R.drawable.class2jump05;CharacterJumpID[6]=R.drawable.class2jump06;CharacterJumpID[7]=R.drawable.class2jump07;CharacterJumpID[8]=R.drawable.class2jump08;CharacterJumpID[9]=R.drawable.class2jump09;
        CharacterJumpID[10]=R.drawable.class2jump10;CharacterJumpID[11]=R.drawable.class2jump11;
        CharacterSlidingID=new int[6];
        CharacterSlidingID[0]=R.drawable.class2sliding00;CharacterSlidingID[1]=R.drawable.class2sliding01;CharacterSlidingID[2]=R.drawable.class2sliding02;
        CharacterSlidingID[3]=R.drawable.class2sliding03;CharacterSlidingID[4]=R.drawable.class2sliding04;CharacterSlidingID[5]=R.drawable.class2sliding05;
        CharacterHitID=new int[12];
        CharacterHitID[0] = R.drawable.class2hit00;CharacterHitID[1] = R.drawable.class2hit01;CharacterHitID[2] = R.drawable.class2hit02;CharacterHitID[3] = R.drawable.class2hit03;CharacterHitID[4] = R.drawable.class2hit04;
        CharacterHitID[5] = R.drawable.class2hit05;CharacterHitID[6] = R.drawable.class2hit06;CharacterHitID[7] = R.drawable.class2hit07;CharacterHitID[8] = R.drawable.class2hit08;CharacterHitID[9] = R.drawable.class2hit09;
        CharacterHitID[10] = R.drawable.class2hit10;CharacterHitID[11] = R.drawable.class2hit11;
        CharacterDeadID=new int[15];
        CharacterDeadID[0] = R.drawable.class2die00;CharacterDeadID[1] = R.drawable.class2die01;CharacterDeadID[2] = R.drawable.class2die02;CharacterDeadID[3] = R.drawable.class2die03;CharacterDeadID[4] = R.drawable.class2die04;
        CharacterDeadID[5] = R.drawable.class2die05;CharacterDeadID[6] = R.drawable.class2die06;CharacterDeadID[7] = R.drawable.class2die07;CharacterDeadID[8] = R.drawable.class2die08;CharacterDeadID[9] = R.drawable.class2die09;
        CharacterDeadID[10] = R.drawable.class2die10;CharacterDeadID[11] = R.drawable.class2die11;CharacterDeadID[12] = R.drawable.class2die12;CharacterDeadID[13] = R.drawable.class2die13;CharacterDeadID[14] = R.drawable.class2die14;


        /*--------------------戰士--------------------*/
        Character2WalkID=new int[24];
        Character2WalkID[0] = R.drawable.class1walk00;Character2WalkID[1] = R.drawable.class1walk01;Character2WalkID[2] = R.drawable.class1walk02;Character2WalkID[3] = R.drawable.class1walk03;Character2WalkID[4] = R.drawable.class1walk04;
        Character2WalkID[5] = R.drawable.class1walk05;Character2WalkID[6] = R.drawable.class1walk06;Character2WalkID[7] = R.drawable.class1walk07;Character2WalkID[8] = R.drawable.class1walk08;Character2WalkID[9] = R.drawable.class1walk09;
        Character2WalkID[10] = R.drawable.class1walk10;Character2WalkID[11] = R.drawable.class1walk11;Character2WalkID[12] = R.drawable.class1walk12;Character2WalkID[13] = R.drawable.class1walk13;Character2WalkID[14] = R.drawable.class1walk14;
        Character2WalkID[15] = R.drawable.class1walk15;Character2WalkID[16] = R.drawable.class1walk16;Character2WalkID[17] = R.drawable.class1walk17;Character2WalkID[18] = R.drawable.class1walk18;Character2WalkID[19] = R.drawable.class1walk19;
        Character2WalkID[20] = R.drawable.class1walk20;Character2WalkID[21] = R.drawable.class1walk21;Character2WalkID[22] = R.drawable.class1walk22;Character2WalkID[23] = R.drawable.class1walk23;
        Character2JumpID=new int[12];
        Character2JumpID[0]=R.drawable.class1jump00;Character2JumpID[1]=R.drawable.class1jump01;Character2JumpID[2]=R.drawable.class1jump02;Character2JumpID[3]=R.drawable.class1jump03;Character2JumpID[4]=R.drawable.class1jump04;
        Character2JumpID[5]=R.drawable.class1jump05;Character2JumpID[6]=R.drawable.class1jump06;Character2JumpID[7]=R.drawable.class1jump07;Character2JumpID[8]=R.drawable.class1jump08;Character2JumpID[9]=R.drawable.class1jump09;
        Character2JumpID[10]=R.drawable.class1jump10;Character2JumpID[11]=R.drawable.class1jump11;
        Character2SlidingID=new int[6];
        Character2SlidingID[0]=R.drawable.class1sliding00;Character2SlidingID[1]=R.drawable.class1sliding01;Character2SlidingID[2]=R.drawable.class1sliding02;
        Character2SlidingID[3]=R.drawable.class1sliding03;Character2SlidingID[4]=R.drawable.class1sliding04;Character2SlidingID[5]=R.drawable.class1sliding05;
        Character2HitID=new int[12];
        Character2HitID[0] = R.drawable.class1hit00;Character2HitID[1] = R.drawable.class1hit01;Character2HitID[2] = R.drawable.class1hit02;Character2HitID[3] = R.drawable.class1hit03;Character2HitID[4] = R.drawable.class1hit04;
        Character2HitID[5] = R.drawable.class1hit05;Character2HitID[6] = R.drawable.class1hit06;Character2HitID[7] = R.drawable.class1hit07;Character2HitID[8] = R.drawable.class1hit08;Character2HitID[9] = R.drawable.class1hit09;
        Character2HitID[10] = R.drawable.class1hit10;Character2HitID[11] = R.drawable.class1hit11;
        Character2DeadID=new int[15];
        Character2DeadID[0] = R.drawable.class1die00;Character2DeadID[1] = R.drawable.class1die01;Character2DeadID[2] = R.drawable.class1die02;Character2DeadID[3] = R.drawable.class1die03;Character2DeadID[4] = R.drawable.class1die04;
        Character2DeadID[5] = R.drawable.class1die05;Character2DeadID[6] = R.drawable.class1die06;Character2DeadID[7] = R.drawable.class1die07;Character2DeadID[8] = R.drawable.class1die08;Character2DeadID[9] = R.drawable.class1die09;
        Character2DeadID[10] = R.drawable.class1die10;Character2DeadID[11] = R.drawable.class1die11;Character2DeadID[12] = R.drawable.class1die12;Character2DeadID[13] = R.drawable.class1die13;Character2DeadID[14] = R.drawable.class1die14;
        /*--------------------123--------------------*/

    } //法師
    public void setCharacter2ImageId() {
        this.status=1;this.statusId=0;this.Position_X=0;this.Position_Y=0;
        SkillId=R.drawable.swordskill;
        /*--------------------戰士--------------------*/
        Character2WalkID=new int[24];
        Character2WalkID[0] = R.drawable.class1walk00;Character2WalkID[1] = R.drawable.class1walk01;Character2WalkID[2] = R.drawable.class1walk02;Character2WalkID[3] = R.drawable.class1walk03;Character2WalkID[4] = R.drawable.class1walk04;
        Character2WalkID[5] = R.drawable.class1walk05;Character2WalkID[6] = R.drawable.class1walk06;Character2WalkID[7] = R.drawable.class1walk07;Character2WalkID[8] = R.drawable.class1walk08;Character2WalkID[9] = R.drawable.class1walk09;
        Character2WalkID[10] = R.drawable.class1walk10;Character2WalkID[11] = R.drawable.class1walk11;Character2WalkID[12] = R.drawable.class1walk12;Character2WalkID[13] = R.drawable.class1walk13;Character2WalkID[14] = R.drawable.class1walk14;
        Character2WalkID[15] = R.drawable.class1walk15;Character2WalkID[16] = R.drawable.class1walk16;Character2WalkID[17] = R.drawable.class1walk17;Character2WalkID[18] = R.drawable.class1walk18;Character2WalkID[19] = R.drawable.class1walk19;
        Character2WalkID[20] = R.drawable.class1walk20;Character2WalkID[21] = R.drawable.class1walk21;Character2WalkID[22] = R.drawable.class1walk22;Character2WalkID[23] = R.drawable.class1walk23;
        Character2JumpID=new int[12];
        Character2JumpID[0]=R.drawable.class1jump00;Character2JumpID[1]=R.drawable.class1jump01;Character2JumpID[2]=R.drawable.class1jump02;Character2JumpID[3]=R.drawable.class1jump03;Character2JumpID[4]=R.drawable.class1jump04;
        Character2JumpID[5]=R.drawable.class1jump05;Character2JumpID[6]=R.drawable.class1jump06;Character2JumpID[7]=R.drawable.class1jump07;Character2JumpID[8]=R.drawable.class1jump08;Character2JumpID[9]=R.drawable.class1jump09;
        Character2JumpID[10]=R.drawable.class1jump10;Character2JumpID[11]=R.drawable.class1jump11;
        Character2SlidingID=new int[6];
        Character2SlidingID[0]=R.drawable.class1sliding00;Character2SlidingID[1]=R.drawable.class1sliding01;Character2SlidingID[2]=R.drawable.class1sliding02;
        Character2SlidingID[3]=R.drawable.class1sliding03;Character2SlidingID[4]=R.drawable.class1sliding04;Character2SlidingID[5]=R.drawable.class1sliding05;
        Character2HitID=new int[12];
        Character2HitID[0] = R.drawable.class1hit00;Character2HitID[1] = R.drawable.class1hit01;Character2HitID[2] = R.drawable.class1hit02;Character2HitID[3] = R.drawable.class1hit03;Character2HitID[4] = R.drawable.class1hit04;
        Character2HitID[5] = R.drawable.class1hit05;Character2HitID[6] = R.drawable.class1hit06;Character2HitID[7] = R.drawable.class1hit07;Character2HitID[8] = R.drawable.class1hit08;Character2HitID[9] = R.drawable.class1hit09;
        Character2HitID[10] = R.drawable.class1hit10;Character2HitID[11] = R.drawable.class1hit11;
        Character2DeadID=new int[15];
        Character2DeadID[0] = R.drawable.class1die00;Character2DeadID[1] = R.drawable.class1die01;Character2DeadID[2] = R.drawable.class1die02;Character2DeadID[3] = R.drawable.class1die03;Character2DeadID[4] = R.drawable.class1die04;
        Character2DeadID[5] = R.drawable.class1die05;Character2DeadID[6] = R.drawable.class1die06;Character2DeadID[7] = R.drawable.class1die07;Character2DeadID[8] = R.drawable.class1die08;Character2DeadID[9] = R.drawable.class1die09;
        Character2DeadID[10] = R.drawable.class1die10;Character2DeadID[11] = R.drawable.class1die11;Character2DeadID[12] = R.drawable.class1die12;Character2DeadID[13] = R.drawable.class1die13;Character2DeadID[14] = R.drawable.class1die14;
    } //戰士
    public void setCharacter3ImageId() {
        this.status=1;this.statusId=0;this.Position_X=0;this.Position_Y=0;
        SkillId=R.drawable.fireskill;
        Character3WalkID=new int[1];
        Character3WalkID[0] = R.drawable.class3walk00;
        Character3JumpID=new int[1];
        Character3JumpID[0]=R.drawable.class3walk00;
        Character3SlidingID=new int[1];
        Character3SlidingID[0]=R.drawable.class3walk00;
        Character3HitID=new int[1];
        Character3HitID[0] = R.drawable.class3walk00;
        Character3DeadID=new int[1];
        Character3DeadID[0] = R.drawable.class3walk00;
        Character3SkillId=new int[43];
        Character3SkillId[0] = R.drawable.toneskill0;Character3SkillId[1] = R.drawable.toneskill1;Character3SkillId[2] = R.drawable.toneskill2;Character3SkillId[3] = R.drawable.toneskill3;Character3SkillId[4] = R.drawable.toneskill4;
        Character3SkillId[5] = R.drawable.toneskill5;Character3SkillId[6] = R.drawable.toneskill6;Character3SkillId[7] = R.drawable.toneskill7;Character3SkillId[8] = R.drawable.toneskill8;Character3SkillId[9] = R.drawable.toneskill9;
        Character3SkillId[10] = R.drawable.toneskill10;Character3SkillId[11] = R.drawable.toneskill11;Character3SkillId[12] = R.drawable.toneskill12;Character3SkillId[13] = R.drawable.toneskill13;Character3SkillId[14] = R.drawable.toneskill14;
        Character3SkillId[15] = R.drawable.toneskill15;Character3SkillId[16] = R.drawable.toneskill16;Character3SkillId[17] = R.drawable.toneskill17;Character3SkillId[18] = R.drawable.toneskill18;Character3SkillId[19] = R.drawable.toneskill19;
        Character3SkillId[20] = R.drawable.toneskill20;Character3SkillId[21] = R.drawable.toneskill21;Character3SkillId[22] = R.drawable.toneskill22;Character3SkillId[23] = R.drawable.toneskill23;Character3SkillId[24] = R.drawable.toneskill24;
        Character3SkillId[25] = R.drawable.toneskill25;Character3SkillId[26] = R.drawable.toneskill26;Character3SkillId[27] = R.drawable.toneskill27;Character3SkillId[28] = R.drawable.toneskill28;Character3SkillId[29] = R.drawable.toneskill29;
        Character3SkillId[30] = R.drawable.toneskill30;Character3SkillId[31] = R.drawable.toneskill31;Character3SkillId[32] = R.drawable.toneskill32;Character3SkillId[33] = R.drawable.toneskill33;Character3SkillId[34] = R.drawable.toneskill34;
        Character3SkillId[35] = R.drawable.toneskill35;Character3SkillId[36] = R.drawable.toneskill36;Character3SkillId[37] = R.drawable.toneskill37;Character3SkillId[38] = R.drawable.toneskill38;Character3SkillId[39] = R.drawable.toneskill39;
        Character3SkillId[40] = R.drawable.toneskill40;Character3SkillId[41] = R.drawable.toneskill41;Character3SkillId[42] = R.drawable.toneskill42;
    } //國動

    public void setPlayerBitmap(){
        CharacterWalkBit=new Bitmap[24];
        CharacterJumpBit=new Bitmap[12];
        CharacterSlidingBit=new Bitmap[6];
        CharacterHitBit=new Bitmap[12];
        CharacterDeadBit=new Bitmap[15];
    }
    public void setPlayer2Bitmap(){
        Character2WalkBit=new Bitmap[24];
        Character2JumpBit=new Bitmap[12];
        Character2SlidingBit=new Bitmap[6];
        Character2HitBit=new Bitmap[12];
        Character2DeadBit=new Bitmap[15];
    }
    public void setPlayer3Bitmap(){
        Character3SkillBit=new Bitmap[43];
        Character3WalkBit=new Bitmap[1];
        Character3JumpBit=new Bitmap[1];
        Character3SlidingBit=new Bitmap[1];
        Character3HitBit=new Bitmap[1];
        Character3DeadBit=new Bitmap[1];
    }
    public void setPlayer3SkillBitmap(int n,Bitmap bitmap){
        Character3SkillBit[n]=bitmap;
    }

    public void setCharacterWalkBit(Bitmap bitmap,int n){
        //System.out.println("testoutput n="+n);
        CharacterWalkBit[n]=bitmap;
    }
    public void setCharacterJumpBit(Bitmap bitmap,int n){
        CharacterJumpBit[n]=bitmap;
    }
    public void setCharacterSlidingBit(Bitmap bitmap,int n){
        CharacterSlidingBit[n]=bitmap;
    }
    public void setCharacterHitBit(Bitmap bitmap,int n){
        CharacterHitBit[n]=bitmap;
    }
    public void setCharacterDeadBit(Bitmap bitmap,int n){
        CharacterDeadBit[n]=bitmap;
    }
    public void setCharacter2WalkBit(Bitmap bitmap,int n){
        //System.out.println("testoutput n="+n);
        Character2WalkBit[n]=bitmap;
    }           //------------戰士
    public void setCharacter2JumpBit(Bitmap bitmap,int n){
        Character2JumpBit[n]=bitmap;
    }
    public void setCharacter2SlidingBit(Bitmap bitmap,int n){
        Character2SlidingBit[n]=bitmap;
    }
    public void setCharacter2HitBit(Bitmap bitmap,int n){
        Character2HitBit[n]=bitmap;
    }
    public void setCharacter2DeadBit(Bitmap bitmap,int n) {
        Character2DeadBit[n] = bitmap;
    }
    public void setCharacter3WalkBit(Bitmap bitmap,int n){
        Character3WalkBit[n]=bitmap;
    }           //------------國動
    public void setCharacter3JumpBit(Bitmap bitmap,int n){
        Character3JumpBit[n]=bitmap;
    }
    public void setCharacter3SlidingBit(Bitmap bitmap,int n){
        Character3SlidingBit[n]=bitmap;
    }
    public void setCharacter3HitBit(Bitmap bitmap,int n){
        Character3HitBit[n]=bitmap;
    }
    public void setCharacter3DeadBit(Bitmap bitmap,int n) {
        Character3DeadBit[n] = bitmap;
    }


    public Bitmap getCharacterBitmap() {
        statusId++;
        //System.out.println("testoutput: status= "+status+" , statusId= "+statusId);
        //System.out.println("testoutput: getCharacterImageId() status= "+status+" , statusId= "+statusId);
        switch (status) {//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead 7disappear
            case 1:
                if(statusId==CharacterWalkBit.length){// Run
                    statusId=0;
                    //System.out.println("testoutput: PlayerWalkID.length= "+PlayerWalkID.length);
                    return CharacterWalkBit[CharacterWalkBit.length-1];
                }
                return CharacterWalkBit[statusId-1];
            case 2:
                if(statusId==CharacterJumpBit.length){// Jump start
                    statusId=7;
                    return CharacterJumpBit[6];
                }
                return CharacterJumpBit[statusId-1];
            case 3:
                if(statusId==CharacterJumpBit.length){// Jump Ing Fall
                    statusId=7;
                    return CharacterJumpBit[6];
                }
                return CharacterJumpBit[statusId-1];
            case 4:
                if(statusId==CharacterSlidingBit.length){// Sliding
                    statusId=0;
                    return CharacterSlidingBit[CharacterSlidingBit.length-1];
                }
                return CharacterSlidingBit[statusId-1];
            case 5:
                if(statusId==CharacterHitBit.length){// Hit
                    statusId=0;
                    return CharacterHitBit[CharacterHitBit.length-1];
                }
                return CharacterHitBit[statusId-1];
            case 6:
                if(statusId==CharacterDeadBit.length){//Dead
                    this.status=10;//this.statusId=0;
                    System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
                    return CharacterDeadBit[CharacterDeadBit.length-1];
                }
                else if(statusId>=CharacterDeadBit.length)
                    //return -1;
                return CharacterDeadBit[statusId-1];

            case 8:
                if(statusId==CharacterHitBit.length){// Hit
                    statusId=0;status=1;
                    return CharacterHitBit[CharacterHitBit.length-1];
                }
                return CharacterHitBit[statusId-1];
            case 7:
                //System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
                return CharacterDeadBit[CharacterDeadBit.length-1];
        }
        return CharacterDeadBit[CharacterDeadBit.length-1];
    }
    public Bitmap getCharacter2Bitmap() {
        statusId++;
        //System.out.println("testoutput: status= "+status+" , statusId= "+statusId);
        //System.out.println("testoutput: getCharacterImageId() status= "+status+" , statusId= "+statusId);
        switch (status) {//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead 7disappear
            case 1:
                if(statusId==Character2WalkBit.length){// Run
                    statusId=0;
                    //System.out.println("testoutput: PlayerWalkID.length= "+PlayerWalkID.length);
                    return Character2WalkBit[Character2WalkBit.length-1];
                }
                return Character2WalkBit[statusId-1];
            case 2:
                if(statusId==Character2JumpBit.length){// Jump start
                    statusId=7;
                    return Character2JumpBit[6];
                }
                return Character2JumpBit[statusId-1];
            case 3:
                if(statusId==Character2JumpBit.length){// Jump Ing Fall
                    statusId=7;
                    return Character2JumpBit[6];
                }
                return Character2JumpBit[statusId-1];
            case 4:
                if(statusId==Character2SlidingBit.length){// Sliding
                    statusId=0;
                    return Character2SlidingBit[Character2SlidingBit.length-1];
                }
                return Character2SlidingBit[statusId-1];
            case 5:
                if(statusId==Character2HitBit.length){// Hit
                    statusId=0;
                    return Character2HitBit[Character2HitBit.length-1];
                }
                return Character2HitBit[statusId-1];
            case 6:
                if(statusId==Character2DeadBit.length){//Dead
                    this.status=10;//this.statusId=0;
                    System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
                    return Character2DeadBit[Character2DeadBit.length-1];
                }
                else if(statusId>=Character2DeadBit.length)
                    //return -1;
                    return Character2DeadBit[statusId-1];

            case 8:
                if(statusId==Character2HitBit.length){// Hit
                    statusId=0;status=1;
                    return Character2HitBit[Character2HitBit.length-1];
                }
                return Character2HitBit[statusId-1];
            case 7:
                //System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
                return Character2DeadBit[Character2DeadBit.length-1];
        }
        return Character2DeadBit[Character2DeadBit.length-1];
    }
    public Bitmap getCharacter3Bitmap() {
        statusId++;
        //System.out.println("testoutput: status= "+status+" , statusId= "+statusId);
        //System.out.println("testoutput: getCharacterImageId() status= "+status+" , statusId= "+statusId);
        switch (status) {//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead 7disappear
            case 1:
                if(statusId==Character3WalkBit.length){// Run
                    statusId=0;
                    //System.out.println("testoutput: PlayerWalkID.length= "+PlayerWalkID.length);
                    return Character3WalkBit[Character3WalkBit.length-1];
                }
                return Character3WalkBit[statusId-1];
            case 2:
                if(statusId==Character3JumpBit.length){// Jump start
                    statusId=7;
                    return Character3JumpBit[0];
                }
                return Character3JumpBit[statusId-1];
            case 3:
                if(statusId==Character3JumpBit.length){// Jump Ing Fall
                    statusId=7;
                    return Character3JumpBit[0];
                }
                return Character3JumpBit[statusId-1];
            case 4:
                if(statusId==Character3JumpBit.length){// Sliding
                    statusId=0;
                    return Character3JumpBit[Character3JumpBit.length-1];
                }
                return Character3JumpBit[statusId-1];
            case 5:
                if(statusId==Character3HitBit.length){// Hit
                    statusId=0;
                    return Character3HitBit[Character3HitBit.length-1];
                }
                return Character3HitBit[statusId-1];
            case 6:
                if(statusId==Character3DeadBit.length){//Dead
                    this.status=10;//this.statusId=0;
                    System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
                    return Character3DeadBit[Character3DeadBit.length-1];
                }
                else if(statusId>=Character3DeadBit.length)
                    //return -1;
                    return Character3DeadBit[statusId-1];

            case 8:
                if(statusId==Character3HitBit.length){// Hit
                    statusId=0;status=1;
                    return Character3HitBit[Character3HitBit.length-1];
                }
                return Character3HitBit[statusId-1];
            case 7:
                //System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
                return Character3DeadBit[Character3DeadBit.length-1];
        }
        return Character3DeadBit[Character3DeadBit.length-1];
    }

    public int getCharacterImageId() {
        statusId++;
        //System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
        //System.out.println("testoutput: getCharacterImageId() status= "+status+" , statusId= "+statusId);
        switch (status) {//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead 7disappear
            case 1:
                if(statusId==CharacterWalkID.length){// Run
                    statusId=0;
                    //System.out.println("testoutput: PlayerWalkID.length= "+PlayerWalkID.length);
                    return CharacterWalkID[CharacterWalkID.length-1];
                }
                return CharacterWalkID[statusId-1];
            case 2:
                if(statusId==CharacterJumpID.length){// Jump start
                    statusId=7;
                    return CharacterJumpID[6];
                }
                return CharacterJumpID[statusId-1];
            case 3:
                if(statusId==CharacterJumpID.length){// Jump Ing Fall
                    statusId=7;
                    return CharacterJumpID[6];
                }
                return CharacterJumpID[statusId-1];
            case 4:
                if(statusId==CharacterSlidingID.length){// Sliding
                    statusId=0;
                    return CharacterSlidingID[CharacterSlidingID.length-1];
                }
                return CharacterSlidingID[statusId-1];
            case 5:
                if(statusId==CharacterHitID.length){// Hit
                    statusId=0;
                    return CharacterHitID[CharacterHitID.length-1];
                }
                return CharacterHitID[statusId-1];
            case 6:
                if(statusId==CharacterDeadID.length){//Dead
                    this.status=7;//this.statusId=0;
                    System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
                    return CharacterDeadID[CharacterDeadID.length-1];
                }
                else if(statusId>=CharacterDeadID.length)
                    return -1;
                return CharacterDeadID[statusId-1];
            case 8:
                if(statusId==CharacterHitID.length){// Hit
                    statusId=0;status=1;
                    return CharacterHitID[CharacterHitID.length-1];
                }
                return CharacterHitID[statusId-1];
            case 7:
                //System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
                return -1;
        }
        return 0;
    }
    public int getCharacter2ImageId() {
        statusId++;
        //System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
        //System.out.println("testoutput: getCharacterImageId() status= "+status+" , statusId= "+statusId);
        switch (status) {//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead 7disappear
            case 1:
                if(statusId==Character2WalkID.length){// Run
                    statusId=0;
                    //System.out.println("testoutput: PlayerWalkID.length= "+PlayerWalkID.length);
                    return Character2WalkID[Character2WalkID.length-1];
                }
                return Character2WalkID[statusId-1];
            case 2:
                if(statusId==Character2JumpID.length){// Jump start
                    statusId=7;
                    return Character2JumpID[6];
                }
                return Character2JumpID[statusId-1];
            case 3:
                if(statusId==Character2JumpID.length){// Jump Ing Fall
                    statusId=7;
                    return Character2JumpID[6];
                }
                return Character2JumpID[statusId-1];
            case 4:
                if(statusId==Character2SlidingID.length){// Sliding
                    statusId=0;
                    return Character2SlidingID[Character2SlidingID.length-1];
                }
                return Character2SlidingID[statusId-1];
            case 5:
                if(statusId==Character2HitID.length){// Hit
                    statusId=0;
                    return Character2HitID[Character2HitID.length-1];
                }
                return Character2HitID[statusId-1];
            case 6:
                if(statusId==Character2DeadID.length){//Dead
                    this.status=7;//this.statusId=0;
                    System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+Character2DeadID.length);
                    return Character2DeadID[Character2DeadID.length-1];
                }
                else if(statusId>=Character2DeadID.length)
                    return -1;
                return Character2DeadID[statusId-1];
            case 8:
                if(statusId==Character2HitID.length){// Hit
                    statusId=0;status=1;
                    return Character2HitID[Character2HitID.length-1];
                }
                return Character2HitID[statusId-1];
            case 7:
                //System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
                return -1;
        }
        return 0;
    }
    public int getCharacter3ImageId() {
        statusId++;
        //System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
        //System.out.println("testoutput: getCharacterImageId() status= "+status+" , statusId= "+statusId);
        switch (status) {//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead 7disappear
            case 1:
                if(statusId==Character3WalkID.length){// Run
                    statusId=0;
                    //System.out.println("testoutput: PlayerWalkID.length= "+PlayerWalkID.length);
                    return Character3WalkID[Character3WalkID.length-1];
                }
                return Character3WalkID[statusId-1];
            case 2:
                if(statusId==Character3JumpID.length){// Jump start
                    statusId=7;
                    return Character3JumpID[0];
                }
                return Character3JumpID[statusId-1];
            case 3:
                if(statusId==Character3JumpID.length){// Jump Ing Fall
                    statusId=7;
                    return Character3JumpID[0];
                }
                return Character3JumpID[statusId-1];
            case 4:
                if(statusId==Character3SlidingID.length){// Sliding
                    statusId=0;
                    return Character3SlidingID[Character3SlidingID.length-1];
                }
                return Character3SlidingID[statusId-1];
            case 5:
                if(statusId==Character3HitID.length){// Hit
                    statusId=0;
                    return Character3HitID[Character3HitID.length-1];
                }
                return Character3HitID[statusId-1];
            case 6:
                if(statusId==Character3DeadID.length){//Dead
                    this.status=7;//this.statusId=0;
                    System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+Character3DeadID.length);
                    return Character3DeadID[Character3DeadID.length-1];
                }
                else if(statusId>=Character3DeadID.length)
                    return -1;
                return Character3DeadID[statusId-1];
            case 8:
                if(statusId==Character3HitID.length){// Hit
                    statusId=0;status=1;
                    return Character3HitID[Character3HitID.length-1];
                }
                return Character3HitID[statusId-1];
            case 7:
                //System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
                return -1;
        }
        return 0;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
    public int getStatusId() {
        return statusId;
    }
    public void Attack(){
        this.status=5;this.statusId=0;
    }
    public void Dead(){
        this.status=6;this.statusId=0;
    }
    public void Jump(){
        this.status=2;this.statusId=0;
    }
    public void Skill(){
        if(this.Skill!=0){
            this.status=8;this.statusId=0;
            this.Skill--;
        }
    }
    public void Skill3(){
        if(this.Skill!=0){
            this.Skill--;
            System.out.println("testoutput: Player onTouch Skill= "+this.Skill);
        }
    }
    public void Run(){
        this.status=1;this.statusId=0;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    /*public void setImage(ImageView image) {
        this.image = image;
        this.Position_X=image.getX();
        this.Position_Y=image.getY();
        this.Size_width=image.getWidth();
        this.Size_height=image.getHeight();
        this.status=1;
        this.statusId=0;
    }*/
    public void setMax_Health(int max_Health) {
        System.out.println("ChooesClass2=50");
        Max_Health = max_Health;Health_Point=max_Health;
    }
    public void setHealth_Point(int health_Point) {
        Health_Point = health_Point;
    }
    public void setAttack_Damage(int attack_Damage) {
        Attack_Damage = attack_Damage;
    }
    public void setAttack_Range(int attack_Range){Attack_Range=attack_Range;}
    public void setAttack_Speed(int attack_Speed) {
        Attack_Speed = attack_Speed;
    }
    public void setMove_Speed(int move_Speed) {
        Move_Speed = move_Speed;
    }
    public void setSkill(int skill) {
        Skill = skill;
    }
    public void setPosition_X(float position_X) {
        Position_X = position_X;//image.setX(position_X);
    }
    public void setPosition_Y(float position_Y) {
        Position_Y = position_Y;//image.setY(position_Y);
    }
    public void setSize_height(int size_height) {
        Size_height = size_height;
    }
    public void setSize_width(int size_width) {
        Size_width = size_width;
    }

    /*public ImageView getImage() {
        return image;
    }*/
    public int getMax_Health() {
        return Max_Health;
    }
    public int getHealth_Point() {
        return Health_Point;
    }
    public int getAttack_Damage() {
        return Attack_Damage;
    }
    public int getAttack_Speed() {
        return Attack_Speed;
    }
    public int getAttack_Range() {
        return Attack_Range;
    }
    public int getMove_Speed() {
        return Move_Speed;
    }
    public int getSkill() {
        return Skill;
    }
    public float getPosition_X() {
        return Position_X;
    }
    public float getPosition_Y() {
        return Position_Y;
    }
    public int getSize_height() {
        return Size_height;
    }
    public int getSize_width() {
        return Size_width;
    }
}
