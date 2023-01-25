package codechallenges.linkedlist.animal;

public class catDog {
  private String cat;
  private String dog;

  public catDog(String cat, String dog) {
    this.cat = cat;
    this.dog = dog;
  }

  public String getCat() {
    return cat;
  }

  public void setCat(String cat) {
    this.cat = cat;
  }

  public String getDog() {
    return dog;
  }

  public void setDog(String dog) {
    this.dog = dog;
  }

  @Override
  public String toString() {
    return "catDog{" +
      "cat='" + cat + '\'' +
      ", dog='" + dog + '\'' +
      '}';
  }
}
