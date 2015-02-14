package bean;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.inject.Inject;

import ejb.UserEJB;
import entity.User;

@ApplicationScoped
@ManagedBean
public class UserBean {

	@Inject
	UserEJB userEJB;

	public List<User> getAllUsers() {
		return userEJB.getAll();
	}
	
	public void add() {
		User user = new User();
		user.setUsername("John Doe2");
		
		userEJB.saveUser(user);
		
		User user2 = new User();
		user2.setUsername("John Doe3");
		
		userEJB.saveUser(user2);
		
		User user3 = new User();
		user3.setUsername("John Doe4");
		
		userEJB.saveUser(user3);
	}
}
