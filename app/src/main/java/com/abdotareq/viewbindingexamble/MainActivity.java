package com.abdotareq.viewbindingexamble;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.abdotareq.viewbindingexamble.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    private ActivityMainBinding binding;
    private String name;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this for view binding to replace findviewbyid
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        // now u can access views through binding
        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = binding.editText.getText().toString();
                Toast.makeText(MainActivity.this, "My name is " + name, Toast.LENGTH_SHORT).show();
            }
        });

    }


}
