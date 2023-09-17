package com.example.sdlt04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
//created by S hukri
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface{
    ArrayList<PokemonModel> pokemonModels = new ArrayList<>();
    int[] pokemonImages = {
            R.drawable.bulbasur,
            R.drawable.ivysaur,
            R.drawable.venusaur,
            R.drawable.charmander,
            R.drawable.charmeleon,
            R.drawable.charizard,
            R.drawable.squirtle,
            R.drawable.wartortle,
            R.drawable.blastoise,
            R.drawable.caterpie
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.myRecyclerView);
        setUpPokemonModels();
        AA_RecyclerViewAdapter adapter = new AA_RecyclerViewAdapter(this, pokemonModels, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void setUpPokemonModels(){

        String[] pokemonNames = getResources().getStringArray(R.array.pokemon_names);
        String[] pokemonDescriptions = getResources().getStringArray(R.array.pokemon_descriptions);
        String[] pokemonHeights = getResources().getStringArray(R.array.pokemon_heights);
        String[] pokemonCategories = getResources().getStringArray(R.array.pokemon_categories);
        String[] pokemonWeights = getResources().getStringArray(R.array.pokemon_weights);
        String[] pokemonAbilities = getResources().getStringArray(R.array.pokemon_abilities);

        for(int i = 0; i < pokemonNames.length; i++){
            pokemonModels.add(new PokemonModel(
                    pokemonNames[i],
                    pokemonDescriptions[i],
                    pokemonHeights[i],
                    pokemonCategories[i],
                    pokemonWeights[i],
                    pokemonAbilities[i],
                    pokemonImages[i]));
        }
    }

    @Override
    public void onItemClick(int position) {
        Intent intent = new Intent(MainActivity.this, Card1Activity.class);
        intent.putExtra("NAME", pokemonModels.get(position).getPokemonNames());
        intent.putExtra("DESCRIPTION", pokemonModels.get(position).getPokemonDescriptions());
        intent.putExtra("HEIGHT", pokemonModels.get(position).getPokemonHeights());
        intent.putExtra("CATEGORY", pokemonModels.get(position).getPokemonCategories());
        intent.putExtra("WEIGHT", pokemonModels.get(position).getPokemonWeights());
        intent.putExtra("ABILITY", pokemonModels.get(position).getPokemonAbilities());
        intent.putExtra("IMAGES", pokemonModels.get(position).getImage());
        startActivity(intent);
    }
}

















//created by S hukri