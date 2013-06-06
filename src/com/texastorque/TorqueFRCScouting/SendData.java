package com.texastorque.TorqueFRCScouting;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

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

        user_entered_message = getIntent().getStringExtra("com.texastorque.TorqueFRCScouting.user_entered_message");

        networkConnection();
        setContentView(textView);
    }

    private void networkConnection() {
        textView = new TextView(this);

        textView.setTextSize(40);

        if(user_entered_message!=null){
            textView.setText(user_entered_message);
        }
        else{
            textView.setText("cannot find text");
        }

    }
}