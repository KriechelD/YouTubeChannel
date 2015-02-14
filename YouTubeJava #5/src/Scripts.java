import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Scripts {
	public static void main(String[] args) {
		try {
			ScriptEngineManager manager = new ScriptEngineManager();
			ScriptEngine javaScriptEngine = manager.getEngineByName("JavaScript");
			javaScriptEngine.eval("println('Simple JavaScript')");

			ScriptEngine pythonEngine = manager.getEngineByName("python");
			pythonEngine.eval("print \"Simple Python Script\"");
		} catch (ScriptException e) {
			e.printStackTrace();
		}
	}
}
