package ics.junit.ejb;

import javax.naming.Context;
import javax.naming.InitialContext;

import examples.ejb.basic.stateful.EmployeeLocal;
import junit.framework.TestCase;

public class EmployeeBeanTest extends TestCase {
	EmployeeLocal employee;
	
	public EmployeeBeanTest(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		Context context = new InitialContext();
		employee=(EmployeeLocal)context.lookup(
				"java:app/StatefulEJBProject/Employee!examples.ejb.basic.stateful.Employee");

	}

	protected void tearDown() throws Exception {
		super.tearDown();
		employee = null;

	}

	public void testEmployeeMethods() throws Exception {
		employee.setName("Mats");
		employee.setAddress("Lund");
		assertEquals(employee.getName(),"Mats");
		assertEquals(employee.getAddress(),"Lund");
	}
	public void testEmployeeMethods2() throws Exception {
		employee.setAddress("Halmstad");
		assertEquals(employee.getAddress(),"Halmstad");
	}

}
