package com.Testify.Task17A;

public abstract class CompanyLoginPage{
    private String username;
    private String password;


    public CompanyLoginPage(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public void enterUsername() {
        System.out.println("Entering username: " + username);
    }

    public void enterPassword() {
        System.out.println("Entering password: " + password);
    }

    public void clickForgotPassword() {
        System.out.println("Forgot Password link");
    }

    public void clickSignIn() {
        System.out.println("Sign In button");
    }

    // Abstract methods for optional element
    public abstract void clickRememberMe();

    public abstract void clickContinueToHomePage();

    public abstract void clickOAuthButton();
}
