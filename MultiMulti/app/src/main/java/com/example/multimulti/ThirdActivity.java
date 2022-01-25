package com.example.multimulti;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.multimulti.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {
    ActivityThirdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        setTitle("Troisième Activitée");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Activity1:
                Intent i = new Intent(ThirdActivity.this, MainActivity.class);
                startActivity(i);
                return true;

            case R.id.Activity2:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                Intent d = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(d);
                return true;

            case R.id.Activity3:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
                Intent t = new Intent(ThirdActivity.this, ThirdActivity.class);
                startActivity(t);

                return true;
            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }

}
