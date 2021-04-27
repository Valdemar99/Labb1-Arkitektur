package examples.ejb.basic.stateful;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class Employee
 */
@Stateful
@LocalBean
public class Employee implements EmployeeRemote, EmployeeLocal {
	private String name;
	private String address;

    /**
     * Default constructor. 
     */
    public Employee() {
        // TODO Auto-generated constructor stub
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
