package bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean
public class RequestNumberBean {

	private int number = 1;
	
	public int getNumber() {
		return number;
	}
	
	public void increase() {
		number++;
	}
	
}
