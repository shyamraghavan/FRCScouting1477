package com.texastorque.TorqueFRCScouting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created with IntelliJ IDEA.
 * User: Shyam Raghavan
 * Date: 6/3/13
 * Time: 1:28 PM
 */

public class BackgroundActivity extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.background_activity);
    }

    public void buttonClick(View view){
        Intent sendDataIntent = new Intent(this,SendData.class);

        EditText user_entered_message = (EditText) findViewById(R.id.text_entry_box);

        sendDataIntent.putExtra("com.texastorque.TorqueFRCScouting.user_entered_message",user_entered_message.getText());

        startActivity(sendDataIntent);
    }

    public void setup(Bundle savedInstanceState){
        super.setTitle(R.string.app_name);
    }
}