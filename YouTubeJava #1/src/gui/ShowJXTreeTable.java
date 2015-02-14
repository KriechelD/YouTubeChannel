package gui;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import table.TreeTable;

public class ShowJXTreeTable {
	public static void main(String[] args) {
		JFrame testFrame = new JFrame();

		List<String[]> content = new ArrayList<>();

		content.add(new String[] { "Heading 1" });
		content.add(new String[] { "Sub 1", "Sub 2", "Sub 3" });
		content.add(new String[] { "Sub 4", "Sub 5", "Sub 6" });
		content.add(new String[] { "Heading 2" });
		content.add(new String[] { "Sub 1", "Sub 2", "Sub 3" });
		content.add(new String[] { "Sub 4", "Sub 5", "Sub 6" });
		content.add(new String[] { "Heading 3" });
		content.add(new String[] { "Sub 1", "Sub 2", "Sub 3" });
		content.add(new String[] { "Sub 4", "Sub 5", "Sub 6" });

		TreeTable treeTable = new TreeTable(content);

		testFrame.setSize(500, 500);

		testFrame.setLayout(new BorderLayout());

		testFrame.add(new JScrollPane(treeTable.getTreeTable()), BorderLayout.CENTER);

		testFrame.setVisible(true);

	}
}
