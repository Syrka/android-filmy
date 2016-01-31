package com.sara.androidfilms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class SearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        final EditText searchBar = (EditText) findViewById(R.id.searchBar);
        searchBar.setText("");
        EditText.OnEditorActionListener exampleListener = new EditText.OnEditorActionListener(){
            public boolean onEditorAction(TextView exampleView, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_NULL && event.getAction() == KeyEvent.ACTION_DOWN) {
                    if (!searchBar.getText().toString().equals("")) {
                        //TODO: arreglar cuando no hay texto
                        Intent i = new Intent(getApplicationContext(), MainActivity.class);
                        i.putExtra("button", "btn_search");
                        i.putExtra("searchText", searchBar.getText().toString());
                        startActivityForResult(i, 1);
                    }
                    else {
                        searchBar.setText("");
                        return false;
                    }
                }
                return true;
            }
        };
        searchBar.setOnEditorActionListener(exampleListener);
    }
}
