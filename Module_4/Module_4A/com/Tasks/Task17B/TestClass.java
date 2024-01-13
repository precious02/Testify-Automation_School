package com.Testify.Task17B;

public class TestClass implements UnitTest{

    @Override
    public void usernameTest(String username) {
        System.out.println("Enter valid username");
    }

    @Override
    public void passwordTest(String password) {
        System.out.println("Enter valid password");
    }

    @Override
    public void loginSuccessful(String username, String password) {
        System.out.println("Login is Successful");
    }
}
