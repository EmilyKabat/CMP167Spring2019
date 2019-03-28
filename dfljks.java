import static org.junit.jupiter.api.Assertions.*;

class TestDMV {
	@Test
	void test() {
		System.out.println("Testing for ");
		assert((DMV.calculateExpirationDate(2019) != 2029)): "Test has not passed";
	}
	
	@Test
	void test2() {
	}

}
