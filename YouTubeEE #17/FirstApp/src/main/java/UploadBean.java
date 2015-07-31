import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
import javax.servlet.http.Part;


@ManagedBean
@ViewScoped
public class UploadBean {

	private Part file;

	public void upload() throws IOException {
		Scanner s = new Scanner(file.getInputStream());
		String fileContent = s.useDelimiter("\\A").next();
		s.close();
		
		System.out.println(fileContent);
		
		Files.write(Paths.get("C:\\"+file.getSubmittedFileName()), fileContent.getBytes(), StandardOpenOption.CREATE);
	}
	
	public void validate(FacesContext context, UIComponent component, Object value) {
		Part file = (Part) value;
		if (file.getSize() > 11) {
			throw new ValidatorException(new FacesMessage("File is too large"));
		}
		if (!file.getContentType().equals("text/plain")) 
			throw new ValidatorException(new FacesMessage("File is not a text file"));
	}
	
	public Part getFile() {
		return file;
	}

	public void setFile(Part file) {
		this.file = file;
	}
	
	
	
}
