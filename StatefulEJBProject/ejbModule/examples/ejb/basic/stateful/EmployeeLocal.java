package examples.ejb.basic.stateful;

import javax.ejb.Local;

@Local
public interface EmployeeLocal {
	public String getName();

	public void setName(String name);

	public String getAddress();

	public void setAddress(String address);
}
