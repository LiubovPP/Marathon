package hw_Lesson30.marathon.highschool.model;

public class Student extends Person {
  private String speciality;

  public Student(String firstName, String lastName, int id, int age, String speciality) {
    super(firstName, lastName, id, age);
    this.speciality = speciality;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  @Override
  public String toString() {
    return super.toString()+ "Student{" +
        "speciality='" + speciality + '\'' +
        '}';
  }
}
