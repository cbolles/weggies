package com.main.weggies.wegmans;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.main.weggies.model.recipe.Recipe;
import com.main.weggies.model.recipe.RecipeRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RecipeClient extends WegmansClient {

    public Recipe getRecipeById(long id) {
        String requestURL = RECIPE_URL + id + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getJSON(requestURL);

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.readValue(jsonResponse, Recipe.class);
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Recipe> getRecipes() {
        String requestURL = RECIPE_URL + "?" + API_VERSION + "&" + SUBSCRIPTION_KEY;

        String jsonResponse = getJSON(requestURL);

        try {
            ObjectMapper mapper = new ObjectMapper();
            RecipeRequest recipesRequest = mapper.readValue(jsonResponse, RecipeRequest.class);
            List<Recipe> recipes = new ArrayList<>();
            for(Recipe recipe : recipesRequest.getRecipes())
                recipes.add(getRecipeById(recipe.getId()));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
