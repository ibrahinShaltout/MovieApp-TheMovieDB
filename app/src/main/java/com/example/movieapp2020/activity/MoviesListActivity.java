package com.example.movieapp2020.activity;


import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;
import android.widget.Toast;

import com.example.movieapp2020.R;

import butterknife.BindView;

public class MoviesListActivity extends AppCompatActivity {

    @BindView(R.id.movies_list_gridview)
    GridView gridView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.menu_action_favorite) {
            Toast.makeText(this, "favorite", Toast.LENGTH_LONG).show();
            return true;
        } else if (id == R.id.menu_action_logout){
            Toast.makeText(this, "Logout", Toast.LENGTH_LONG).show();
    }

        return super.onOptionsItemSelected(item);
    }
}
