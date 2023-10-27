package basicsjunit;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestReporter;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@DisplayName("Test cases for Math class")
class MyMathTest {
	//hooks
	MyMath myMath;
	TestInfo testInfo;
	TestReporter testReporter;
	
	@BeforeAll
	static void beforeAllInit() {
		System.out.println("This prints before all");
	}
	
	@BeforeEach
	void init(TestInfo testInfo, TestReporter testReporter) {
		this.testInfo = testInfo;
		this.testReporter = testReporter;
		myMath = new MyMath();
		testReporter.publishEntry("Running "+testInfo.getDisplayName()+ " with tags "+testInfo.getTags());
		
	}
	
	@AfterEach
	void cleanUp(){
		System.out.println("cleaning ..... ");
	}

	@Test
	@DisplayName("Testing add method")
	@Tag("Math")
	void testAdd() {
//		MyMath myMath = new MyMath();
		int expected = 2;
		int actual = myMath.add(1,1);
		System.out.println("Running "+testInfo.getDisplayName()+ " with tags "+testInfo.getTags());
		assertEquals(expected, actual,"The add method that adds 2 numbers");
	}
	
	@Nested
	@DisplayName("Adding Nested class")
	@Tag("Math")
	class Adding{
		// if any method fails, adding class too fails. So it is a PROBLEM
		@Test
		@DisplayName("Testing add method for +")
		void testAddPositive() {
			assertEquals(2, myMath.add(1,1), () -> "should return the right sum");
			// assert string message is computed before method runs.
			// so even if it fails/passes the msg is computed
			// if you pass a lambda, string only computes if test case fails 
		}
		@Test
		@DisplayName("Testing add method for -")
		void testAddNegative() {
			assertEquals(-2, myMath.add(-1,-1),"The add method that adds 2 numbers");
		}
		
		@Test
		void testZero() {
			assertEquals(0, myMath.add(-1, 1));
		}
	}
	
	
	
	@Test
//	@RepeatedTest(3)
	@Tag("Circle")
	void testComputeCircleArea() {
//		MyMath myMath = new MyMath();
		assertEquals(63.61725123519331, myMath.computeCircleArea(4.5),"should return right radius"); 
		
	}
	
	@Test
	@DisplayName("Testing Multiply Method")
	@Tag("Math")
	void testMultiply() {
//		assertEquals(4,myMath.multiply(2, 2) ,"should return right product"); //multiple cases
		assertAll(
				() -> assertEquals(4, myMath.multiply(2,2)),
				() -> assertEquals(0, myMath.multiply(2,0)),
				() -> assertEquals(-2, myMath.multiply(2,-1))
				);
	}
	
	@Test
//	@EnabledOnOs(OS.LINUX)
	@Tag("Math")
	void testDivide(){
//		MyMath myMath = new MyMath();
		boolean value = false;
		assumeTrue(value); // if value is not true don't run the tests.
		assertThrows(ArithmeticException.class, () -> myMath.divide(14, 0),"Divide by zero throws exception"); //passes
//		assertThrows(NullPointerException.class, () -> myMath.divide(14, 0),"Divide by zero throws exception"); //fails
		
//		myMath.divide(14, 0);
	}
	
	@Test
	@Disabled
	@DisplayName("Disabled method")
	void disabledMethod() {
		System.out.println("This should be disabled");
	}

}
