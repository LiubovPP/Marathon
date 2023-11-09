package hw_Lesson30.marathon.highschool.dao;


import hw_Lesson30.marathon.highschool.model.Person;

public interface HighSchool {
  boolean addPerson (Person person);

  Person removePerson (int id);

  Person updatePerson();

  Person findPet(int id);

  Person findPerson(int id);

  int quantity();

}
