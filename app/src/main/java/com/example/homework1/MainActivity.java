package com.example.homework1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    String location;
    EditText locationInput;

    Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        locationInput = (EditText) findViewById(R.id.locationInput);
        searchButton =  (Button) findViewById(R.id.button);
        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location = locationInput.getText().toString();
                openMap();
            }
        });

    }

    public void openMap(){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);

    }
}
