package com.example.dungeonfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button button_mainMenu = (Button) findViewById(R.id.button_mainMenu);
        ImageButton button_questMenu =  findViewById(R.id.button_questMenu);

//        button_mainMenu.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View activity_main) {
//                startActivity(new Intent(MainActivity.this, YourNewActivity.class));
//            }
//        });
// TEst
        button_questMenu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View activity_main) {
                startActivity(new Intent(MainActivity.this, QuestMenuActivity.class));
            }
        });

    }

}
