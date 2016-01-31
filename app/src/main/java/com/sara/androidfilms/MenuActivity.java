package com.sara.androidfilms;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        switch (v.getId()) {
            case R.id.btn_nowPlaying:
                i.putExtra("button", "btn_nowPlaying");
                startActivityForResult(i, 1);
                break;
            case R.id.btn_popular:
                i.putExtra("button", "btn_popular");
                startActivityForResult(i, 1);
                break;
            case R.id.btn_topRated:
                i.putExtra("button", "btn_topRated");
                startActivityForResult(i, 1);
                break;
            case R.id.btn_comingSoon:
                i.putExtra("button", "btn_comingSoon");
                startActivityForResult(i, 1);
                break;
            case R.id.btn_search:
                Intent it = new Intent(getApplicationContext(), SearchActivity.class);
                startActivityForResult(it, 1);
                break;
        }
    }

}
