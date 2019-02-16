package com.main.weggies;

import com.main.weggies.model.product.Product;
import com.main.weggies.wegmans.ProductClient;

import org.junit.Test;

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
        ProductClient testClient = new ProductClient();
        Product testProduct = testClient.getProductById(484208);
        System.out.println(testProduct.getBrand());
        System.out.print(testProduct.getStates().get(0).getState());
    }
}