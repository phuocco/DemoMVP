package com.example.demomvp.ui.auth.Login;

public interface LoginContract {
    interface View {
        void loginSuccess();
        void loginError(String error);
    }
    interface Presenter {
        void handleLogin(String username, String password);
    }
}
