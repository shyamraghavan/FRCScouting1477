package com.texastorque.TorqueFRCScouting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

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

    public SendData() throws URISyntaxException,FileNotFoundException {
        System.setErr(new PrintStream(new FileOutputStream(new File(new URI("192.168.1.253:156/com/texastorque/TorqueFRCScouting/output.txt")))));
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        new BackgroundActivity().setup(savedInstanceState);

        Intent createIntent = getIntent();
        user_entered_message = createIntent.getStringExtra("com.texastorque.TorqueFRCScouting.user_entered_message");

        networkConnection();

        System.err.println("This is a test of err output stream");
    }

    private void networkConnection() {

        try{
            URL connectionURL = new URL("udp","192.168.1.253",156,"com/texastorque/TorqueFRCScouting/data.txt");
        }
        catch(Exception exc){
            System.err.println(exc);
        }

    }
}