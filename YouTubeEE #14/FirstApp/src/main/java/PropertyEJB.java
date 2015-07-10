import java.util.Properties;

import javax.annotation.Resource;
import javax.ejb.LocalBean;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

@LocalBean
@Stateless
public class PropertyEJB {

	@Resource(name = "properties/example")
	private Properties properties;

	@Schedule(second = "*/5",minute="*",hour="*")
	public void refresh() throws NamingException {
		Context initalContext = new InitialContext();
		properties = (Properties) initalContext.lookup("properties/example");
	}

	public String getProp1() {
		return properties.getProperty("prop1");
	}

}
