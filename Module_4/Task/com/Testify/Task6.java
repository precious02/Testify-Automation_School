package com.Testify;

public class Task6 {
    public static void main(String[] args) {

        String Word = "DEMOCRACY";
        String newWord = Word.substring(1,5);

        StringBuilder stringVariable = new StringBuilder();

        stringVariable.append(newWord);

        stringVariable.reverse();

        System.out.println(stringVariable);
    }
}
