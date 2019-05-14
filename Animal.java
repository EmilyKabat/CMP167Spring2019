public class Animal {
	private String name;
	private int birthYear;
	private double weight;
	private char gender;

	public Animal() {
		String name = new String("");
		int birthYear = 1900;
		double weight = 0.0;
		char gender = 'u';
	}

	public Animal(String animalName, int animalBirthYear, double animalWeight, char animalGender) {
		name = animalName;
		birthYear = animalBirthYear;
		weight = animalWeight;
		gender = animalGender;
		if (weight < 0.0) {
			weight = -1.0;
		}
		if ((gender != 'f') && (gender != 'F') && (gender != 'M') && (gender != 'm')) {
			gender = 'u';
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		this.name = newName;
	}

	public int getBirthYear() {
		return this.birthYear;
	}

	public void setBirthYear(int newBirthYear) {
		this.birthYear = newBirthYear;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double newWeight) {
		this.weight = newWeight;
		if (weight < 0.0) {
			weight = -1.0;
		}
	}

	public char getGender() {
		return this.gender;
	}

	public void setGender(char newGender) {
		this.gender = newGender;
		if ((gender != 'f') && (gender != 'F') && (gender != 'M') && (gender != 'm')) {
			gender = 'u';
		}
	}

	public int calculateAge(int currentYear) {
		if (currentYear >= birthYear) {
			return currentYear - birthYear;
		}
		else {
			return -1;
		}
	}

	public boolean isMale() {
		if ((gender == 'M') || (gender == 'm')) {
			return true;
		}
		else {
			return false;
		}
	}

	public boolean isFemale() {
		if ((gender == 'F') || (gender == 'f')) {
			return true;
		}
		else {
			return false;
		}
	}

	public void printDetails() {
	}

	public void gainWeight() {
		weight = weight + 1;
		if (weight < 0) {
			weight = 0;
		}
	}

	public void gainWeight(double Weight) {
		weight = weight + Weight;
		if (weight < 0) {
			weight = 0;
		}
	}

	public void loseWeight() {
		weight = weight - 1;
		if (weight < 0) {
			weight = 0;
		}
	}

	public void loseWeight(double Weight) {
		weight = weight - Weight;
		if (weight < 0) {
			weight = 0;
		}
	}
}
