package com.example.android.myquestionnaire;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void editText (View view) {
        EditText editText = (EditText) findViewById(R.id.question1);
        editText.getText().toString().equals("1775");
        if (question1 == 1775) {
            Toast.makeText(this, "Answer is correct", Toast.LENGTH_SHORT).show();
        }

        Toast.makeText(this, "Answer is incorrect", Toast.LENGTH_SHORT).show();

    }


    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.radio_true:
                if (checked)
                    Toast.makeText(this, "Answer is incorrect", Toast.LENGTH_SHORT).show();
                    break;
        }

        switch (view.getId()) {
            case R.id.radio_false:
                if (checked)
                    Toast.makeText(this, "Answer is correct", Toast.LENGTH_SHORT).show();
                    break;
        }
    }

    public void editText (View view) {
        EditText editText = (EditText) findViewById(R.id.question5);
        editText.getText().toString().equalsIgnoreCase("Donald Trump");
    }


}
