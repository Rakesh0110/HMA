
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class x {
	// frame
	JFrame f;
	// Table
	JTable j;

	// Constructor
	x()
	{
		// Frame initiallization
		f = new JFrame();

		// Frame Title
		f.setTitle("Processed Reports");

		// Data to be displayed in the JTable
		String[][] data = {
			{ "R31V-00386", "2455.0", "25.0" ,"2019-05"},
			{ "R31V-00383", "86.13125", "37.5" ,"2019-05"},
            { "R31V-00384", "89.2875", "275.0" ,"2019-05"},
            { "R31V-00385", "86.5625", "50.0" ,"2019-05"},
            { "R31V-00380", "89.2875", "275.0" ,"2019-05"},
            { "R31V-00381", "86.5625", "50.0" ,"2019-05"},
            { "R31V-00382", "86.13125", "37.5" ,"2019-05"},
            { "R31V-00379", "2454.9875", "25.0" ,"2019-05"},
            { "R31V-00378", "86.13125", "37.5" ,"2019-05"},
            { "R31V-00370", "66.574998", "1003.125" ,"2019-03"}
		};

		// Column Names
		String[] columnNames = { "Emission ID", "Freq/Fmin[MHz]", "BW[KHz]/Fmax...","FTN"};

		// Initializing the JTable
		j = new JTable(data, columnNames);
		j.setBounds(30, 40, 200, 300);

		// adding it to JScrollPane
		JScrollPane sp = new JScrollPane(j);
		f.add(sp);
		// Frame Size
		f.setSize(500, 200);
		// Frame Visible = true
		f.setVisible(true);
	}

	// Driver method
	public static void main(String[] args)
	{
		new x();
	}
}
//vs
