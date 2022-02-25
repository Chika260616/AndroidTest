package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private boolean start_stop = false;
    ImageButton simpleImageButton;
    private EditText textEntry;
    private Button changeActivityButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =findViewById(R.id.button);

        changeActivityButton = findViewById(R.id.button2);
        textEntry = findViewById(R.id.editText);

        changeActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String textEntered = textEntry.getText().toString();

                Context context = MainActivity.this;
                Class destinationActivity = Activity2.class;

                Intent ActivityIntent = new Intent(context, destinationActivity);
                ActivityIntent.putExtra(Intent.EXTRA_TEXT, textEntered);
                startActivity(ActivityIntent);
            }
        });

    }



    public void onClickChyngyz(View view) {
        if(!start_stop){
            button.setText("Ryskeldiev");
            Toast toast = Toast.makeText(MainActivity.this,"My last name", Toast.LENGTH_LONG);
            toast.show();
            start_stop=true;
    } else {
            start_stop = false;
            button.setText("Chyngyz");
            Toast toast2 = Toast.makeText(MainActivity.this,"My first name", Toast.LENGTH_LONG);
            toast2.show();
        }
    }
    public void onClickIuca(View view) {
        start_stop = false;
        button.setText("Chyngyz");
        Toast toast2 = Toast.makeText(MainActivity.this,"I changed my name", Toast.LENGTH_LONG);
        toast2.show();

    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        start_stop = false;
    }

    public void imageButton(View view) {
    }



}