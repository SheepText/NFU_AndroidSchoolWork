package com.NFU.CSIE40543210;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.widget.Switch;

public class Attack{
    protected Bitmap image,image2;
    protected int status;//0 stop 1attack
    protected int Attack_Damage;
    protected int Attack_Speed;
    protected float Position_X;
    protected float Position_Y;
    protected static int Size_width;
    protected static int Size_height;

    public void draw(Canvas canvas)  {
        Bitmap bitmap = this.image;
        canvas.drawBitmap(bitmap,Position_X,Position_Y, null);
    }
    public Attack(){
        status=0;//Position_X=0;Position_Y=0;
    }
    public void setAttack(int n,int m){
        Attack_Damage=n;
        Attack_Speed=m;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public void setImage(Bitmap image) {
        this.image = image;
    }
    public void setImage2(Bitmap image2) {
        this.image2 = image2;
    }
    public void setAttack_Damage(int attack_Damage) {
        Attack_Damage = attack_Damage;
    }
    public void setAttack_Speed(int attack_Speed) {
        Attack_Speed = attack_Speed;
    }
    public void setPosition_X(float position_X) {
        Position_X = position_X;
    }
    public void setPosition_Y(float position_Y) {
        Position_Y = position_Y;
    }
    public void setSize_width(int size_width) {
        Size_width = size_width;
    }
    public void setSize_height(int size_height) {
        Size_height = size_height;
    }

    public int getStatus() {
        return status;
    }
    public Bitmap getImage() {
        return image;
    }
    public Bitmap getImage2() {
        return image2;
    }
    public int getAttack_Damage() {
        return Attack_Damage;
    }
    public int getAttack_Speed() {
        return Attack_Speed;
    }
    public float getPosition_X() {
        return Position_X;
    }
    public float getPosition_Y() {
        return Position_Y;
    }
    public int getSize_width() {
        return Size_width;
    }
    public int getSize_height() {
        return Size_height;
    }
}
