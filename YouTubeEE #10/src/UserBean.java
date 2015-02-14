import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class UserBean {

	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
	public void submit() {
		System.out.println("User " + username + " submitted");
	}
	
	public void keypress() {
		System.out.println(username);
	}
	
}
