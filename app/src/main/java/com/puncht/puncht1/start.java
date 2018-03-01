package com.puncht.puncht1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class start extends AppCompatActivity {

    private EditText Name;
    private EditText Password;
    private Button Login;
    private int counter= 6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Name = (EditText)findViewById(R.id.usernameTf);
        Password = (EditText)findViewById(R.id.passwordTf);
        Login = (Button)findViewById(R.id.loginBtn);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(Name.getText().toString(),Password.getText().toString());
            }
        });

    }

    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent intent = new Intent(start.this, home.class);
            startActivity(intent);
        }else{
            counter--;

            if(counter == 0){
                Login.setEnabled(false);

            }
        }
    }

}
