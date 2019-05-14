public class Farm {
  private String farmName;
  private int numAnimals;
  private Farm animals;
  private Animal animalArray = new Animal();

  public Farm() {
    farmName = "";
    numAnimals = 0;
  }

  public Farm(String newFarmName) {
    farmName = newFarmName;
  }
}
