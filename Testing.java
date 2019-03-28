
public class Testing {
	public static void main(String[] args) {
		Person person1 = new Person("Pearson", 55, 'm');
		Person person2 = new Person("Blareson", 47, 'f');
		Person person3 = new Person("Blare's son", 10, 'm');
		Person person4 = new Person("Pear's son", 13, 'm');
		
		System.out.println(person1.name);
		System.out.println(person2.age);
		System.out.println(person4.gender);
		System.out.println(person3.name);
		
		System.out.println("Expecting Cannot generate DL, got: ");
		DMV.generateDL(person1.age,  true);
		System.out.println("Expecting Cannot generate DL, got: ");
		DMV.generateDL(person2.age, true);		
		System.out.println("Expecting Cannot generate DL, got: ");
		DMV.generateDL(person3.age, false);
		System.out.println("Expecting Cannot generate DL, got: ");
		DMV.generateDL(person4.age, true);
		
		assert((DMV.calculateExpirationDate(2019) != 2029)): "Test has not passed";
	}
}
