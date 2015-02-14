package table;

import org.jdesktop.swingx.treetable.AbstractMutableTreeTableNode;

public class Node extends AbstractMutableTreeTableNode {

	public Node(Object[] data) {
		super(data);
	}

	@Override
	public int getColumnCount() {
		return getData().length;
	}

	@Override
	public Object getValueAt(int columnIndex) {
		return getData()[columnIndex];
	}

	public Object[] getData() {
		return (Object[]) getUserObject();
	}

}
