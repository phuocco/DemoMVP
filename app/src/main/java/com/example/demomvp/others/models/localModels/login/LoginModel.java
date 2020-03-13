package com.example.demomvp.others.models.localModels.login;

import com.example.demomvp.others.models.localModels.login.repo.LoginRepository;
import com.example.demomvp.ui.loginScreen.LoginActivityMVP;

public class LoginModel implements LoginActivityMVP.Model {
    private LoginRepository repository;

    public LoginModel(LoginRepository repository) {
        this.repository = repository;
    }

    @Override
    public void createUser(String name, String lastName) {
        repository.saveUser(new User(name, lastName));
    }

    @Override
    public User getUser() {
        return repository.getUser();
    }
}
