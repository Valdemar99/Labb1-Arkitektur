package examples.ejb.basic;

import javax.ejb.Remote;

@Remote
public interface EmployeeRemote {
	public String getName();
	public void setName(String name);
	public String getAddress();
	public void setAddress(String address);
}
