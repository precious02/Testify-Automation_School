package com.Testify.Task16B;

public class PreciousChild extends PreciousParent{
    public static void main(String[] args) {
        PreciousChild Anita = new PreciousChild();
        Anita.danceBallet("Ballet");
        Anita.goHiking("Hiking boot");

    }


    public void danceBallet(String type){
        System.out.println("Anita is an amazing ballet dancer.");
    }

    public void goHiking(String type){
        System.out.println("Anita goes hiking on Sunday mornings.");
    }

}
