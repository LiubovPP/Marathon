package hw_Lesson30.marathon.petHotel.dao;

import hw_Lesson30.marathon.petHotel.model.Pet;

public class HotelImpl implements Hotel{
  private Pet[] pets; // массив для хранения
  private int size; // текущее кол-во
  public HotelImpl (int capacity){
    pets = new Pet[capacity];
  }
  @Override
  public boolean addPet(Pet pet) {
    if (pet == null || size == pets.length || findPet(pet.getPetId()) != null) {
      return false;
    }
    pets[size++] = pet;
    return true;
  }

  @Override
  public Pet removePet(int petId) {
    for (int i = 0; i < size; i++) {
      if (pets[i].getPetId() == petId) {
        Pet petVictim = pets[i];
        pets[i] = pets[--size];
        pets[size] = null;
        return petVictim;
      }
    }
    return null;
  }

  @Override
  public Pet updatePet() {
    return null;
  }

  @Override
  public Pet findPet(int petId) {
    for (int i = 0; i < size; i++) {
      if (pets[i].getPetId() == petId) {
        return pets[i];
      }
    }
    return null;
  }

  @Override
  public int quantity() {
    return size;
  }

  @Override
  public double hotelPrice(int days, Pet pet) {
    double hotelPrice = days*pet.getHotelPetPrice();
    return hotelPrice ;
  }

  @Override
  public double hotelProceeds(int days) {
    int sum = 0;
    for (int i = 0; i < size; i++) {
      sum += hotelPrice(days, pets[i]);
    }
    return sum;
  }
}
