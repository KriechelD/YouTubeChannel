import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class DataBean {
	private String inputString;
	private int inputInt;
	private double inputDouble;

	public String getInputString() {
		return inputString;
	}

	public void setInputString(String inputString) {
		this.inputString = inputString;
	}

	public int getInputInt() {
		return inputInt;
	}

	public void setInputInt(int inputInt) {
		this.inputInt = inputInt;
	}

	public double getInputDouble() {
		return inputDouble;
	}

	public void setInputDouble(double inputDouble) {
		this.inputDouble = inputDouble;
	}

}
