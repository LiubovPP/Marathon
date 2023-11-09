package hw_Lesson30.marathon.petHotel.dao;

import hw_Lesson30.marathon.petHotel.model.Pet;

public interface Hotel {
  boolean addPet(Pet pet);

  Pet removePet(int petId);

  Pet updatePet();

  Pet findPet(int petId);

  int quantity();

  double hotelPrice(int days, Pet pet);

  double hotelProceeds(int days);
}
