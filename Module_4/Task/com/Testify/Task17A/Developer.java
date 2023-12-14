package com.Testify.Task17A;

public class Developer extends CompanyLoginPage{
    public Developer(String username, String password) {
        super(username, password);
    }

    @Override
    public void clickRememberMe() {
        System.out.println("Click Remember me check box");

    }

    @Override
    public void clickContinueToHomePage() {
        System.out.println("click on continue to home page");

    }

    @Override
    public void clickOAuthButton() {
        System.out.println("click on the OAuth button");

    }
}
