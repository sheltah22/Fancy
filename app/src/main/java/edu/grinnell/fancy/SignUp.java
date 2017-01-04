package edu.grinnell.fancy;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {
    Context mContext;
    Button signUpNow;
    EditText usernameField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        usernameField = (EditText) findViewById(R.id.usernameField);
        signUpNow = (Button) findViewById(R.id.signUpNowButton);
        signUpNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signUpToHome = new Intent(SignUp.this, Home.class);
                signUpToHome.putExtra(Home.EXTRA_NAME, usernameField.getText().toString());
                startActivity(signUpToHome);
            }
        });
    }
}
