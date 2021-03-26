package ru.learning.android1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        changeToActivityMainLayout();
    }

    protected void changeToActivityMainLayout() {
        setContentView(R.layout.activity_main);
        Button mainActivityButton = findViewById(R.id.button);
        mainActivityButton.setOnClickListener(v -> {
            changeToTestExampleLayout();
        });
    }

    protected void changeToTestExampleLayout() {
        setContentView(R.layout.edit_text_example);
        Button editTextButton = findViewById(R.id.editTextButton);
        editTextButton.setOnClickListener(v -> {
            changeToActivityMainLayout();
        });

    }

    private void onClick(View v) {
        ;
    }
}