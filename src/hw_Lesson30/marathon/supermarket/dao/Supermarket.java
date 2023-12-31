package hw_Lesson30.marathon.supermarket.dao;

import hw_Lesson30.marathon.supermarket.model.Product33;

public interface Supermarket {
    boolean addProduct(Product33 product33);

    Product33 removeProduct(long barCode);

    Product33 updateProduct();

    Product33 findProduct(long barCode);

    int quantity();

    void printProduct();

  // найти продукт по дате
    Product33[] findExpDateProduct (String expDate);
}
