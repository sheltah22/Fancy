package edu.grinnell.fancy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    Context mContext;
    Button logIn;
    EditText usernameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameField = (EditText) findViewById(R.id.usernameFieldLogin);
        logIn = (Button) findViewById(R.id.logInButton2);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logInToHome = new Intent(Login.this, Home.class);
                logInToHome.putExtra(Home.EXTRA_NAME, usernameField.getText().toString());
                startActivity(logInToHome);
            }
        });
    }
}
