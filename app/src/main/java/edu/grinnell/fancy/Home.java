package edu.grinnell.fancy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Home extends AppCompatActivity {
    public static final String EXTRA_NAME = "extra_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        String name = getIntent().getStringExtra(EXTRA_NAME);
        TextView txt = (TextView) findViewById(R.id.greetingText);
        txt.setText("Hi " + name);
    }
}
