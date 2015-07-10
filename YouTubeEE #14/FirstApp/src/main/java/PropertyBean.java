import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class PropertyBean {

	@Inject
	private PropertyEJB properties;
	
	public void jndi() {
		System.out.println(properties.getProp1());
	}
	
}
