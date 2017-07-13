package com.example.terry.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersList(View v) {
        Intent intent = new Intent(this, NumbersActivity.class);
        startActivity(intent);

    }

    public void familymembersList(View v) {
        Intent intent = new Intent(this, FamilymemberActivity.class);
        startActivity(intent);

    }

    public void colorsList(View v) {
        Intent intent = new Intent(this, ColorsActivity.class);
        startActivity(intent);
    }

    public void phrasesList(View v) {
        Intent intent = new Intent(this, PhrasesActivity.class);
        startActivity(intent);
    }

}
