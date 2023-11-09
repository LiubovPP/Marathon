package hw_Lesson30.marathon.highschool.model;

public class Postgraduate extends Person {
  private String speciality;
  private String researchTopic;

  public Postgraduate(String firstName, String lastName, int id, int age, String speciality, String researchTopic) {
    super(firstName, lastName, id, age);
    this.speciality = speciality;
    this.researchTopic = researchTopic;
  }

  public String getSpeciality() {
    return speciality;
  }

  public void setSpeciality(String speciality) {
    this.speciality = speciality;
  }

  public String getResearchTopic() {
    return researchTopic;
  }

  public void setResearchTopic(String researchTopic) {
    this.researchTopic = researchTopic;
  }

  @Override
  public String toString() {
    return super.toString() + "Postgraduate{" +
        "speciality='" + speciality + '\'' +
        ", researchTopic='" + researchTopic + '\'' +
        '}';
  }
}
