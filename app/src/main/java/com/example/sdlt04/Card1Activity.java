package com.example.sdlt04;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Card1Activity extends AppCompatActivity {
    private String height;
    private String category;
    private String weight;
    private String ability;
    private TextView tvAttributeValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card1);

        Intent intent = getIntent();

        String name = intent.getStringExtra("NAME");
        String description = intent.getStringExtra("DESCRIPTION");
        height = intent.getStringExtra("HEIGHT");
        category = intent.getStringExtra("CATEGORY");
        weight = intent.getStringExtra("WEIGHT");
        ability = intent.getStringExtra("ABILITY");
        int image = intent.getIntExtra("IMAGES", 0);

        TextView tvName = findViewById(R.id.tvPokemonName);
        ImageView ivPokemon = findViewById(R.id.ivPokemonImage);
        TextView tvDescription = findViewById(R.id.tvPokemonDescription);
        RadioGroup rgAttributes = findViewById(R.id.rgPokemonAttributes);
        tvAttributeValue = findViewById(R.id.tvAttributeValue);

        ivPokemon.setImageResource(image);
        tvDescription.setText(description);
        tvAttributeValue.setText(height);
        tvName.setText(name);
    }


    public void radioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        if (!checked) return;

        if (view.getId() == R.id.rbHeight) {
            tvAttributeValue.setText(height);
        } else if (view.getId() == R.id.rbCategory) {
            tvAttributeValue.setText(category);
        } else if (view.getId() == R.id.rbWeight) {
            tvAttributeValue.setText(weight);
        } else if (view.getId() == R.id.rbAbility) {
            tvAttributeValue.setText(ability);
        }
    }


}