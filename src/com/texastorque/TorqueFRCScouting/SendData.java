package com.texastorque.TorqueFRCScouting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.net.*;

/**
 * Created with IntelliJ IDEA.
 * User: Shyam Raghavan
 * Date: 6/4/13
 * Time: 4:51 PM
 */
public class SendData extends Activity {

    String user_entered_message;
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent createIntent = getIntent();
        user_entered_message = createIntent.getStringExtra("com.texastorque.TorqueFRCScouting.user_entered_message");

        networkConnection();
        setContentView(textView);
    }

    private void networkConnection() {
        textView = new TextView(this);

        textView.setTextSize(60);
        textView.setText(user_entered_message);
    }
}