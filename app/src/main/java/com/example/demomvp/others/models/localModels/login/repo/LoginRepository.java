package com.example.demomvp.others.models.localModels.login.repo;

import com.example.demomvp.others.models.localModels.login.User;

public interface LoginRepository {
    User getUser();

    void saveUser(User user);
}
