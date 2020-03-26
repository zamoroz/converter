package com.example.lr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Bundle arg = getIntent().getExtras();
        String gallons = arg.get("gallons").toString();
        String litres = arg.get("litres").toString();

        textView = findViewById(R.id.textView7);
        textView.setText("В " + litres + " литрах - " + gallons + " галлонов.");

    }
}
