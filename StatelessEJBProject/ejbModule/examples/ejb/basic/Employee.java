package examples.ejb.basic;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Employee
 */
@Stateless
@LocalBean
public class Employee implements EmployeeRemote, EmployeeLocal {
	private String name;
	private String address;

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


	public Employee() {
		System.out.println("Constructor anropas");
	}
	@PostConstruct
	public void init() {
		System.out.println("PostConstruct init() anropas");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("PreDestroy destroy() anropas");
	}

}
