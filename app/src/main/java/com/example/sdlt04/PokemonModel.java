package com.example.sdlt04;

public class PokemonModel {
    String pokemonImages;
    String pokemonNames;
    String pokemonDescriptions;
    String pokemonHeights;
    String pokemonCategories;
    String pokemonWeights;
    String pokemonAbilities;
    int image;



    public String getPokemonImages() {
        return pokemonImages;
    }

    public String getPokemonNames() {
        return pokemonNames;
    }

    public String getPokemonDescriptions() {
        return pokemonDescriptions;
    }

    public String getPokemonHeights() {
        return pokemonHeights;
    }

    public String getPokemonCategories() {
        return pokemonCategories;
    }

    public String getPokemonWeights() {
        return pokemonWeights;
    }

    public String getPokemonAbilities() {
        return pokemonAbilities;
    }

    public int getImage() {
        return image;
    }

    public PokemonModel(String pokemonNames,
                        String pokemonDescriptions,
                        String pokemonHeights,
                        String pokemonCategories,
                        String pokemonWeights,
                        String pokemonAbilities,
                        int image) {
        this.pokemonImages = pokemonImages;
        this.pokemonNames = pokemonNames;
        this.pokemonDescriptions = pokemonDescriptions;
        this.pokemonHeights = pokemonHeights;
        this.pokemonCategories = pokemonCategories;
        this.pokemonWeights = pokemonWeights;
        this.pokemonAbilities = pokemonAbilities;
        this.image = image;
    }
}
