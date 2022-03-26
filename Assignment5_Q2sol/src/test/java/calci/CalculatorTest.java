package calci;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class CalculatorTest {

	/*@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
*/

	private Calculator calculator;
	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		calculator=new Calculator();
		Assertions.assertEquals(5, calculator.add(3, 2));
		calculator=null;
		System.out.println("add test run successfully.");
	}

	@Test
	public void testMultiply() {
		//fail("Not yet implemented");
		calculator=new Calculator();
		Assertions.assertEquals(8, calculator.multiply(4, 2));
		calculator=null;
		System.out.println("multiply test run successfully.");
	}

	@Test
	public void testDivide() {
		//fail("Not yet implemented");
		calculator=new Calculator();
		Assertions.assertEquals(2, calculator.divide(4, 2));
		calculator=null;
		System.out.println("divide test run successfully.");
	}


	

}
