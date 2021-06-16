package com;

public class Fan {
    final int slow=1;
    final int medium=2;
    final int fast=3;
    private int speed=slow;
    private boolean on=false;
    private int radius=5;
    private String color="blue";

    public Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public Fan() {
    }

    public int getSlow() {
        return slow;
    }

    public int getMedium() {
        return medium;
    }

    public int getFast() {
        return fast;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "slow=" + slow +
                ", medium=" + medium +
                ", fast=" + fast +
                ", speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Fan fan=new Fan();
        fan=new Fan(3,true,10,"red");
        System.out.println(fan);
    }
}
