import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void mySimpleEqualsTest() {
		String expectedName="Raj";
		assertEquals(expectedName,Employee.getEmpNameWithHighestSalary());
	}
	
	@Test
	public void myObjectEqualsTest() {
		Employee expectedEmpObj=new Employee(1,"Raj",15000);
		assertEquals(expectedEmpObj,Employee.getHighestPaidEmployee());
		//this uses .equals() which is overridden in class Employee
	}

}
