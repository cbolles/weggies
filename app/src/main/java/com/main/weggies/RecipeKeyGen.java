package com.main.weggies;

import java.lang.reflect.Array;

public class RecipeKeyGen {
    private Array reciReg;

    public RecipeKeyGen(){
        //For each ingredient, look at the sku and find the product from that sku
        // generate key from each product (or take pregenerated one) and apply bitwise operation
        // To all of these prodcuts to get a recipe key
        boolean[] reciReg = {true, true, true, true, true, true, true, true, true};
    }
}
