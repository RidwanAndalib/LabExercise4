package com.example.labexercise4;

public abstract class Shape {
    protected int x, y;

    public Shape(int x, int y){
        this.x=x;
        this.y=y;
    }

    public Shape(){
        x=0;
        y=0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
