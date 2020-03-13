package com.example.demomvp.ui.auth.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.demomvp.R;

public class LoginActivity extends AppCompatActivity implements LoginContract.View, View.OnClickListener{

    private EditText mTextUsername;
    private EditText mTextPassword;
    private Button mButtonSignIn;
    private TextView mButtonSignUp;
    private LoginPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        registerListener();
        initPresenter();
    }

    private void initPresenter() {
        presenter = new LoginPresenter();
        presenter.setView(this);
    }

    private void initView() {
        mTextUsername = findViewById(R.id.text_username);
        mTextPassword = findViewById(R.id.text_password);
        mButtonSignIn = findViewById(R.id.button_sign_in);
        mButtonSignUp = findViewById(R.id.button_sign_up);
    }
    private void registerListener() {
        mButtonSignIn.setOnClickListener(this);
        mButtonSignUp.setOnClickListener(this);
    }

    @Override
    public void loginSuccess() {
        Toast.makeText(this, "Login success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void loginError(String error) {
        Toast.makeText(this, error, Toast.LENGTH_SHORT).show();
    }

    @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_sign_in:
                    login();
                    break;
                case R.id.button_sign_up:
                    Toast.makeText(this, "sign up", Toast.LENGTH_SHORT).show();
                    break;
                default:
                    break;
            }
        }

    private void login() {
        String username = mTextUsername.getText().toString();
        String password = mTextPassword.getText().toString();
        if (username.isEmpty() || password.isEmpty()) {
            Toast.makeText(this,
                    "Username or Password is Empty!", Toast.LENGTH_SHORT).show();
            return;
        }
        presenter.handleLogin(username,password);
    }
}
