package hw_Lesson30.marathon.highschool.model;

public class Professor extends Person {
  private String specialty;
  private String department; // кафедра

  public Professor(String firstName, String lastName, int id, int age, String specialty, String department) {
    super(firstName, lastName, id, age);
    this.specialty = specialty;
    this.department = department;
  }

  public String getSpecialty() {
    return specialty;
  }

  public void setSpecialty(String specialty) {
    this.specialty = specialty;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  @Override
  public String toString() {
    return super.toString() + "Professor{" +
        "specialty='" + specialty + '\'' +
        ", department='" + department + '\'' +
        '}';
  }
}
