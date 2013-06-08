package com.texastorque.TorqueFRCScouting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: Shyam Raghavan
 * Date: 6/3/13
 * Time: 1:28 PM
 */

public class BackgroundActivity extends Activity {

    private SpinnerAdapter arrayAdapter;
    private Spinner spinner;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setup(savedInstanceState);

        try{
            spinner.setAdapter(arrayAdapter);
        }
        catch(Exception exe){
            appendLog(exe.toString());
        }

        setContentView(R.layout.background_activity);
    }

    public void buttonClick(View view){
        Intent sendDataIntent = new Intent(this,SendData.class);

        EditText user_entered_message = (EditText) findViewById(R.id.text_entry_box);

        sendDataIntent.putExtra("com.texastorque.TorqueFRCScouting.user_entered_message",user_entered_message.getText().toString());

        startActivity(sendDataIntent);
    }

    public void setup(Bundle savedInstanceState){
        super.setTitle(R.string.app_name);

        spinner = (Spinner) findViewById(R.id.state_spinner);

        arrayAdapter = ArrayAdapter.createFromResource(this,R.array.spinner_text_array,R.id.state_spinner);
    }

    public void appendLog(String text)
    {
        File logFile = new File("sdcard/log.file");
        if (!logFile.exists())
        {
            try
            {
                logFile.createNewFile();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        try
        {
            BufferedWriter buf = new BufferedWriter(new FileWriter(logFile, true));
            buf.append(text);
            buf.newLine();
            buf.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}