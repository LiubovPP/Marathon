package hw_Lesson30.marathon.supermarket.test;

import hw_Lesson33.supermarket.dao.Supermarket;
import hw_Lesson33.supermarket.dao.SupermarketImpl;
import hw_Lesson33.supermarket.model.Food33;
import hw_Lesson33.supermarket.model.MeatFood33;
import hw_Lesson33.supermarket.model.MilkFood33;
import hw_Lesson33.supermarket.model.Product33;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertNull;

class SupermarketImplTest implements Comparable <Product33> {
    Supermarket supermarket;
    Product33[] prod;

    @BeforeEach
    void setUp() {
        supermarket = new SupermarketImpl(5);
        prod = new Product33[4];
        prod[0] = new Food33("potato", 10000100, 3, "23.10.2023");
        prod[1] = new MeatFood33("meat", 10000200, 7, "25.12.2023", "beef");
        prod[2] = new MilkFood33("milk", 10000300, 1, "10.11.2023", "sour cream", 20);
        for (int i = 0; i < prod.length; i++) {
            supermarket.addProduct(prod[i]);
        }
    }

    @Test
    void addProduct() {
        assertFalse(supermarket.addProduct(null));
        assertFalse(supermarket.addProduct(prod[1]));
        Product33 prod1 = new Food33("tomato", 10000400, 3, "30.11.2023");
        assertTrue(supermarket.addProduct(prod1));
        assertEquals(4, supermarket.quantity());
        Product33 prod2 = new Food33("watermelon", 10000400, 7, "31.01.2024");
        assertFalse(supermarket.addProduct(prod2));
        supermarket.printProduct();
    }

    @Test
    void removeProduct() {
        assertEquals(prod[1], supermarket.removeProduct(10000200));
        assertEquals(2, supermarket.quantity());
        assertNull(supermarket.removeProduct(10000200));
        assertNull(supermarket.findProduct(10000200));
    }

    @Test
    void updateProduct() {
    }

    @Test
    void findProduct() {
        assertEquals(prod[0], supermarket.findProduct(10000100));
        assertNull(supermarket.findProduct(10000700));
    }

    @Test
    void quantity() {
        assertEquals(3, supermarket.quantity());
    }

    @Test
    void printProduct() {
        supermarket.printProduct();
    }

    @Test
    void findExpDateProduct() {

    }

    @Override
    public int compareTo(Product33 o) {

        return 0;
    }
    @Test
    void testCompareByExpDate(){
        Array.sort(prod, (p1-p2)->p1.getExpDate -p2.getExpDate)
    }

}