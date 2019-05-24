package swing;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JScrollPane;

public class Pruebas extends JPanel {

	/**
	 * Create the panel.
	 */
	public Pruebas() {
		setForeground(Color.CYAN);
		setLayout(new BorderLayout(0, 0));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		add(rdbtnNewRadioButton);
		
		JSpinner spinner = new JSpinner();
		add(spinner);
		
		JButton btnNewButton = new JButton("New button");
		add(btnNewButton);
		
		JEditorPane dtrpnHellooo = new JEditorPane();
		dtrpnHellooo.setText("hellooo");
		add(dtrpnHellooo);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane, BorderLayout.NORTH);

	}

}
