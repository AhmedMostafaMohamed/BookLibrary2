package com.example.booklibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {
    EditText name ;
    EditText author ;
    EditText pages ;
    Button add_button ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        name =findViewById(R.id.title_input);
        author = findViewById(R.id.author_input);
        pages = findViewById(R.id.pages_input);
        add_button = findViewById(R.id.add_button);

        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DataBaseHelper myDb = new DataBaseHelper(AddActivity.this);
                myDb.addBook(name.getText().toString().trim(),author.getText().toString().trim(),Integer.valueOf(pages.getText().toString().trim()));


            }
        });
    }
}