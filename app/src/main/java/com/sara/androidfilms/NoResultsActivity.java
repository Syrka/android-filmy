package com.sara.androidfilms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class NoResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_results);

        Bundle extra = getIntent().getExtras();
        if (extra == null) return;
        // Reading extra
        String queryString;
        queryString = extra.getString("queryString");

        TextView errorMessage = (TextView) findViewById(R.id.errorMessage);
        String message = "There are no coincidences for " + queryString;
        errorMessage.setText(message);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SearchActivity.class);
                startActivity(i);
            }
        });
    }
}
