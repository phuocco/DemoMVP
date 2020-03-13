package com.example.demomvp.others.models.localModels.login.repo;

import com.example.demomvp.others.models.localModels.login.User;

public class UserRepository implements LoginRepository{
    private User user;

    @Override
    public User getUser() {
        if(user == null){
            User user = new User("First", "Last");
            user.setId(0);
            return user;
        } else {
            return user;
        }
    }

    @Override
    public void saveUser(User user) {
        if (user == null) {
            user = getUser();
        }
        this.user = user;
    }
}
