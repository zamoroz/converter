package com.example.lr1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class HelpActivity extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        Bundle arg = getIntent().getExtras();
        String gallons = arg.get("gallons").toString();
        String litres = arg.get("litres").toString();
    }
}
