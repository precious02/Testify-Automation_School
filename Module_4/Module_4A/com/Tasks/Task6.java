package com.Testify;

public class Task6 {
    public static void main(String[] args) {

        String Word = "DEMOCRACY";

        StringBuilder wordReverse = new StringBuilder();

        wordReverse.append(Word);

        wordReverse.reverse();

        System.out.println(wordReverse);

        System.out.println(wordReverse.substring(4,8));
    }
}
