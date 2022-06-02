package com.NFU.CSIE40543210;

import android.graphics.Bitmap;

public class Boss{
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
    protected static Bitmap[] CharacterJumpBit,CharacterWalkBit,CharacterDeadBit,CharacterHitBit,CharacterSlidingBit,CharacterHurtBit;
    protected int status,statusId;//0stop 1run 2jump 3jumpfalldown 4sliding 5Attack 6dead

    public static Bitmap getCharacterWalkBit(int n) {
        return CharacterWalkBit[n];
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

    public void setEnemy11ImageId(){
        this.status=1;this.statusId=0;
        CharacterWalkID=new int[24];
        CharacterWalkID[0] = R.drawable.boss1walk00;CharacterWalkID[1] = R.drawable.boss1walk01;CharacterWalkID[2] = R.drawable.boss1walk02;CharacterWalkID[3] = R.drawable.boss1walk03;CharacterWalkID[4] = R.drawable.boss1walk04;
        CharacterWalkID[5] = R.drawable.boss1walk05;CharacterWalkID[6] = R.drawable.boss1walk06;CharacterWalkID[7] = R.drawable.boss1walk07;CharacterWalkID[8] = R.drawable.boss1walk08;CharacterWalkID[9] = R.drawable.boss1walk09;
        CharacterWalkID[10] = R.drawable.boss1walk10;CharacterWalkID[11] = R.drawable.boss1walk11;CharacterWalkID[12] = R.drawable.boss1walk12;CharacterWalkID[13] = R.drawable.boss1walk13;CharacterWalkID[14] = R.drawable.boss1walk14;
        CharacterWalkID[15] = R.drawable.boss1walk15;CharacterWalkID[16] = R.drawable.boss1walk16;CharacterWalkID[17] = R.drawable.boss1walk17;CharacterWalkID[18] = R.drawable.boss1walk18;CharacterWalkID[19] = R.drawable.boss1walk19;
        CharacterWalkID[20] = R.drawable.boss1walk20;CharacterWalkID[21] = R.drawable.boss1walk21;CharacterWalkID[22] = R.drawable.boss1walk22;CharacterWalkID[23] = R.drawable.boss1walk23;
        CharacterHitID=new int[12];
        CharacterHitID[0] = R.drawable.enemy1hit00;CharacterHitID[1] = R.drawable.enemy1hit01;CharacterHitID[2] = R.drawable.enemy1hit02;CharacterHitID[3] = R.drawable.enemy1hit03;CharacterHitID[4] = R.drawable.enemy1hit04;
        CharacterHitID[5] = R.drawable.enemy1hit05;CharacterHitID[6] = R.drawable.enemy1hit06;CharacterHitID[7] = R.drawable.enemy1hit07;CharacterHitID[8] = R.drawable.enemy1hit08;CharacterHitID[9] = R.drawable.enemy1hit09;
        CharacterHitID[10] = R.drawable.enemy1hit10;CharacterHitID[11] = R.drawable.enemy1hit11;
        CharacterHurtID=new int[12];
        CharacterHurtID[0] = R.drawable.enemy1hurt00;CharacterHurtID[1] = R.drawable.enemy1hurt01;CharacterHurtID[2] = R.drawable.enemy1hurt02;CharacterHurtID[3] = R.drawable.enemy1hurt03;CharacterHurtID[4] = R.drawable.enemy1hurt04;
        CharacterHurtID[5] = R.drawable.enemy1hurt05;CharacterHurtID[6] = R.drawable.enemy1hurt06;CharacterHurtID[7] = R.drawable.enemy1hurt07;CharacterHurtID[8] = R.drawable.enemy1hurt08;CharacterHurtID[9] = R.drawable.enemy1hurt09;
        CharacterHurtID[10] = R.drawable.enemy1hurt10;CharacterHurtID[11] = R.drawable.enemy1hurt11;
        CharacterDeadID=new int[15];
        CharacterDeadID[0] = R.drawable.bossdie00;CharacterDeadID[1] = R.drawable.bossdie01;CharacterDeadID[2] = R.drawable.bossdie02;CharacterDeadID[3] = R.drawable.bossdie03;CharacterDeadID[4] = R.drawable.bossdie04;
        CharacterDeadID[5] = R.drawable.bossdie05;CharacterDeadID[6] = R.drawable.bossdie06;CharacterDeadID[7] = R.drawable.bossdie07;CharacterDeadID[8] = R.drawable.bossdie08;CharacterDeadID[9] = R.drawable.bossdie09;
        CharacterDeadID[10] = R.drawable.bossdie10;CharacterDeadID[11] = R.drawable.bossdie11;CharacterDeadID[12] = R.drawable.bossdie12;CharacterDeadID[13] = R.drawable.bossdie13;CharacterDeadID[14] = R.drawable.bossdie14;
    }
    public void defineEnemyBitmap(){
        CharacterWalkBit=new Bitmap[24];
        //CharacterJumpBit=new Bitmap[12];
        //CharacterSlidingBit=new Bitmap[6];
        CharacterHitBit=new Bitmap[12];
        CharacterDeadBit=new Bitmap[15];
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

    public Bitmap getCharacterBitmap() {
        statusId++;
        //System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
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
                    this.status=7;//this.statusId=0;
                    System.out.println("testoutput: status= "+status+" , statusId= "+statusId+" , length= "+CharacterDeadID.length);
                    return CharacterDeadBit[CharacterDeadBit.length-1];
                }
                else if(statusId>=CharacterDeadBit.length)
                    //return -1;
                    return CharacterDeadBit[statusId-1];
            case 7:
                System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
                //return -1;
        }
        return CharacterDeadBit[CharacterDeadBit.length-1];
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
            case 7:
                System.out.println("testoutput: -------------------------------------status=7-------------------------------------");
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
    public void Jump(){
        this.status=2;this.statusId=0;
    }
    public void Skill(){
        this.status=5;this.statusId=0;
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
