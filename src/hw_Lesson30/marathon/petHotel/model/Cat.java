package hw_Lesson30.marathon.petHotel.model;

public class Cat extends Pet {

  public Cat(int id, String name, String breed, int age, double weight, double hotelPrice) {
    super(id, name, breed, age, weight, hotelPrice);
  }

  @Override
  public String toString() {
    return "Cat{}";
  }

}
