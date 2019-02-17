package com.main.weggies;

import com.main.weggies.model.product.Product;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * ProductKeyGen creates a key for a specified product based on its characteristics
 * This is done by creating a psuedo register in java based on the booleans in a products details
 */
public class ProdcutKeyGen {
    private boolean[] prefReg;
    
    public ProdcutKeyGen(Product product){
        boolean[] prefReg = {product.getIsMsgFree(), product.getIsAntibioticFree(),
                product.getIsCornFree(), product.getIsLactoovoVegetarian(),
                product.getIsFairtrade(), product.getIsIrradiated(),
                product.getIsCertifiedHumane(), product.getIsWildCaught(),
                product.getIsHasNoAddedHormones()};
    }

    public boolean[] getKey(){
        return prefReg;
    }
}
