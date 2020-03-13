package com.example.demomvp.ui.auth.Login;

public class LoginPresenter implements LoginContract.Presenter{

    private LoginContract.View view;

    public void setView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void handleLogin(String username, String password) {
        if (username.equals("abc") && password.equals("123")) {
            view.loginSuccess();
        }
        view.loginError("wrong...");
    }
}
