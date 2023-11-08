package hw_Lesson30.marathon.shop.dao;


import hw_Lesson30.marathon.shop.model.Computer;

public interface Shop {
    boolean addDevice(Computer computer);

    Computer removeDevice(int id);

    Computer updateDevice();

    Computer findDevice(int id);

    int quantity();

    void printComputer();

    // найти компьютеры со скидкой на BlackFriday
    Computer[] findBlackFridayDiscountDevices(int minPrice, int maxPrice);//
}
