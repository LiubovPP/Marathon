package hw_Lesson30.marathon.petHotel.model;

public class Dog extends Pet{
  public Dog(int id, String name, String breed, int age, double weight, double hotelPrice) {
    super(id, name, breed, age, weight, hotelPrice);
  }

  @Override
  public String toString() {
    return "Dog{}";
  }
}
