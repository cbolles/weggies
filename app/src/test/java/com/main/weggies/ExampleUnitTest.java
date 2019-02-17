package com.main.weggies;

import com.main.weggies.model.product.Product;
import com.main.weggies.model.recipe.Recipe;
import com.main.weggies.model.store.Store;
import com.main.weggies.wegmans.ProductClient;
import com.main.weggies.wegmans.RecipeClient;
import com.main.weggies.wegmans.StoreClient;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void testProduct() {
        ProductClient testClient = new ProductClient(68);
        Product testProduct = testClient.getProductById(484208);
        System.out.println(testProduct.getBrand());
        System.out.println(testProduct.getStates().get(0).getState());
        System.out.println(testProduct.getPrice());
    }

    @Test public void testProductByKeyword() {
        ProductClient testClient = new ProductClient(68);
        Product testProduct = testClient.getProductByKeyWord("Milk").get(0);
        System.out.println(testProduct.getName());
    }

    @Test public void testStore() {
        StoreClient storeClient = new StoreClient();
        Store test = storeClient.getStoreByNumber(68);
        System.out.println(test.getName());
        List<Store> stores = storeClient.getStores();
        System.out.println(stores.get(0).getName());
    }

    @Test public void testRecipe() {
        RecipeClient recipeClient =  new RecipeClient();
        Recipe recipe = recipeClient.getRecipeById(22187);
        System.out.println(recipe.getName());
        List<Recipe> recipes = recipeClient.getRecipes();
        System.out.println(recipes.get(0).getName());
    }
}