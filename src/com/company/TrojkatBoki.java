package com.company;

public class TrojkatBoki {
    private float bokA;
    private float bokB;
    private float bokC;

    public TrojkatBoki(float bokA, float bokB, float bokC) {
        setBokA(bokA);
        setBokB(bokB);
        setBokC(bokC);
    }

    public float getBokA() {
        return bokA;
    }

    public void setBokA(float bokA) {
        if(bokA >= 0) this.bokA = bokA;
        else this.bokA = -bokA;
    }

    public float getBokB() {
        return bokB;
    }

    public void setBokB(float bokB) {
        if(bokB >= 0) this.bokB = bokB;
        else this.bokB = -bokB;
    }

    public float getBokC() {
        return bokC;
    }

    public void setBokC(float bokC) {
        if(bokC >= 0) this.bokC = bokC;
        else this.bokC = -bokC;
    }

    public float obliczObwod(){
        return this.bokA + this.bokB + this.bokC;
    }

    public float obliczPole(){
        float p = obliczObwod() / 2;
        return (float) Math.sqrt(p * (p - this.bokA) * (p - this.bokB) * (p - this.bokC));
    }
}
