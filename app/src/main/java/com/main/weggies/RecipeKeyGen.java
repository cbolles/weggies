package com.main.weggies;

import com.main.weggies.model.recipe.Recipe;
import com.main.weggies.wegmans.RecipeClient;

import java.lang.reflect.Array;

public class RecipeKeyGen {
    private Array reciReg;

    public RecipeKeyGen(long id){
        //For each ingredient, look at the sku and find the product from that sku
        // generate key from each product (or take pregenerated one) and apply bitwise operation
        // To all of these prodcuts to get a recipe key
        boolean[] reciReg = {true, true, true, true, true, true, true, true, true};
        RecipeClient recipeClient = new RecipeClient();
        for (recipeClient.getRecipes()) {

        }
    }
}
