package com.pram.togglebutton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    ToggleButton tgbOnOff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tgbOnOff = (ToggleButton) findViewById(R.id.tgbOnOff);

        tgbOnOff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tgbOnOff.isChecked()) {
                    Toast.makeText(MainActivity.this, "Is On", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Is Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
