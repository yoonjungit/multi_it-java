package �迭��ȭ;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class �������迭 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 500);
		
		String[] header = {"A", "B", "C"};
		
		Integer[][] contents = {
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3},
				{1, 2, 3}
		};
		
		JTable table = new JTable(contents, header);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
	}

}
