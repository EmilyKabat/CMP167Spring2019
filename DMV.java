public class DMV {
	public static void generateDL(int age, boolean testPass) {
		if ((age >= 17) && (testPass)) {
			System.out.println("Driver's License generated");
		}
		
		else {
			System.out.println("Cannot generate Driver's License");
		}
	}
	
	public static int calculateExpirationDate(int yearGenerated) {
		return yearGenerated + 10;
	}
	
	public static void main(String[] args) {
		generateDL(6, true);
		System.out.println(calculateExpirationDate(2019));
	}

}
