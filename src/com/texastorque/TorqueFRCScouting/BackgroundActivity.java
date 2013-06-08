package com.texastorque.TorqueFRCScouting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

//TODO if not using spinner, delete these import statements
/*import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;*/

/**
 * Created with IntelliJ IDEA.
 * User: Shyam Raghavan
 * Date: 6/3/13
 * Time: 1:28 PM
 */

public class BackgroundActivity extends Activity {

    //TODO if not using spinner, delete these declarations
    /*private SpinnerAdapter arrayAdapter;
    private Spinner spinner;*/

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setup(savedInstanceState);

        //spinner.setAdapter(arrayAdapter);

        setContentView(R.layout.background_activity);
    }

    public void buttonClick(View view){
        Intent sendDataIntent = new Intent(this,SendData.class);

        EditText user_entered_message = (EditText) findViewById(R.id.text_entry_box);

        sendDataIntent.putExtra("com.texastorque.TorqueFRCScouting.user_entered_message",user_entered_message.getText().toString());

        startActivity(sendDataIntent);
    }

    /*
    @param savedInstanceState Used for transferring information to setup method
     */
    public void setup(Bundle savedInstanceState){
        super.setTitle(R.string.app_name);

        //TODO if not using spinner, delete these lines of code
        /*spinner = (Spinner) findViewById(R.id.state_spinner);
        arrayAdapter = ArrayAdapter.createFromResource(this,R.array.spinner_text_array,R.id.state_spinner); */
    }
}