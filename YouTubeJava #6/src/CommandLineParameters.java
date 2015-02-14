import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

public class CommandLineParameters {
	public static void main(String[] args) {
		CommandLineParser parser = new BasicParser();
		Options options = new Options();

		options.addOption("a", "abc", true, "First Parameter");
		options.addOption("b", "bcd", true, "Second Parameter");
		options.addOption("h", "help", false, "Shows this help");

		try {
			CommandLine commandLine = parser.parse(options, args);

			System.out.println(commandLine.getOptionValue("a"));
			System.out.println(commandLine.getOptionValue("b"));

			if (commandLine.hasOption("h")) {
				HelpFormatter formatter = new HelpFormatter();

				formatter.printHelp("CommandLineParameters", options);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
