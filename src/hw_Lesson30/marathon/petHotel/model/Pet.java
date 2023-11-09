package hw_Lesson30.marathon.petHotel.model;

import java.util.Objects;

public class Pet implements Comparable <Pet> {
  private int petId; // чип
  private String name;
  private String breed;// порода
  private  int age;
  private double weight;
  private double hotelPetPrice;

  public Pet(int id, String name, String breed, int age, double weight,double hotelPrice) {
    this.petId = id;
    this.name = name;
    this.breed = breed;
    this.age = age;
    this.weight = weight;
    this.hotelPetPrice = hotelPrice;
  }

  public int getPetId() {
    return petId;
  }

  public void setPetId(int petId) {
    this.petId = petId;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getBreed() {
    return breed;
  }

  public void setBreed(String breed) {
    this.breed = breed;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getHotelPetPrice() {
    return hotelPetPrice;
  }

  public void setHotelPetPrice(double hotelPetPrice) {
    this.hotelPetPrice = hotelPetPrice;
  }

  @Override
  public String toString() {
    return "Pet{" +
        "petId=" + petId +
        ", name='" + name + '\'' +
        ", breed='" + breed + '\'' +
        ", age=" + age +
        ", weight=" + weight +
        ", hotelPrice=" + hotelPetPrice +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Pet pet = (Pet) o;
    return petId == pet.petId;
  }

  @Override
  public int hashCode() {
    return Objects.hash(petId);
  }

  @Override
  public int compareTo(Pet o) {
    int res = Integer.compare(getPetId(), o.getPetId() );
    return res;
  }
}
