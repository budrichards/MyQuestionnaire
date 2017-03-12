package com.example.android.myquestionnaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import java.lang.String.*;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.id.input;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onEditTextField( char input1[] ){
        char answer[] = {'1','7','7','5'};
        boolean outPut = input1.contentEquals(answer);


    }


    /** called when he user clicks a radio button
     *
     * @param view
     */
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_true:
                if (checked)
                    // True
                    break;
            case R.id.radio_false:
                if (checked)
                    // False
                    break;
        }
    }
}
