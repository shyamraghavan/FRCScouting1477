package com.texastorque.TorqueFRCScouting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.net.HttpURLConnection;

/**
 * Created with IntelliJ IDEA.
 * User: Shyam Raghavan
 * Date: 6/4/13
 * Time: 4:51 PM
 */
public class SendData extends Activity {

    String user_entered_message;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new BackgroundActivity().setup(savedInstanceState);

        Intent createIntent = getIntent();
        user_entered_message = createIntent.getStringExtra("com.texastorque.TorqueFRCScouting.user_entered_message");

        HttpURLConnection
    }
}