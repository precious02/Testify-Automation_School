package com.Testify.Task12.Task12B;

import com.Testify.Task12.Task12A.preshA;

public class preshB {

    public static void main(String[] args) {
        preshA precious = new preshA();
        precious.project();
        preshB precious2 = new preshB();
        precious2.project2();
    }
    private void project2(){
        System.out.println("Just accessible for this class");
    }
}
