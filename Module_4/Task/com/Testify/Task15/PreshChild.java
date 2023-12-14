package com.Testify.Task15;

public class PreshChild extends PreshParent {
    public static void main(String[] args) {
        PreshChild childAction = new PreshChild();
        PreshParent parentAction = new PreshParent();
        parentAction.swim();
        parentAction.jump();
        parentAction.run();
        childAction.train();
        childAction.travel();

    }

    public void train (){
        System.out.println("Joy likes to train basketballers.");
    }

    public void travel (){
        System.out.println("Ajala the traveller is here.");
    }
}
