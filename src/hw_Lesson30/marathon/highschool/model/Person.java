package hw_Lesson30.marathon.highschool.model;

import java.util.Objects;

public class Person implements Comparable<Person> { // от него будут наследовать классы Student, Aspirant, Professor
  private String firstName;
  private String lastName;
  private int id;
  private int age;

  public Person(String firstName, String lastName, int id, int age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.age = age;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return id == person.id;
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Person{" +
        "firstName='" + firstName + '\'' +
        ", lastName='" + lastName + '\'' +
        ", id=" + id +
        ", age=" + age +
        '}';
  }

  @Override
  public int compareTo(Person o) {
    int res = Integer.compare(getId(), o.getId());
    return res;
  }
}
