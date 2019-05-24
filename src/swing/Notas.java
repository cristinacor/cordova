package swing;
import java.util.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import java.awt.Checkbox;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.TextArea;
import javax.swing.JTree;
import java.awt.Canvas;
import java.awt.Choice;
import javax.swing.JProgressBar;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.DropMode;
import java.awt.List;
import java.awt.FlowLayout;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Notas {

	private JFrame frmNotas;
	private JTextField txtCargarLaMugi;
	private JTextField txtUrgente;
	private JTextField txtImportante;
	private JTextField txtNormal;
	private final List list = new List();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notas window = new Notas();
					window.frmNotas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Notas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmNotas = new JFrame();
		frmNotas.getContentPane().setBackground(Color.WHITE);
		frmNotas.getContentPane().setForeground(Color.WHITE);
		
		txtCargarLaMugi = new JTextField();
		txtCargarLaMugi.setText("2. Cargar la mugi");
		txtCargarLaMugi.setColumns(10);
		
		txtUrgente = new JTextField();
		txtUrgente.setText("URGENTE :");
		txtUrgente.setColumns(10);
		
		txtImportante = new JTextField();
		txtImportante.setText("IMPORTANTE :");
		txtImportante.setColumns(10);
		
		txtNormal = new JTextField();
		txtNormal.setText("NORMAL :");
		txtNormal.setColumns(10);
		
		JLabel lblFecha = DefaultComponentFactory.getInstance().createLabel("FECHA");
		
		JComboBox comboBox = new JComboBox();
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.addContainerListener(new ContainerAdapter() {
			@Override
			public void componentAdded(ContainerEvent arg0) {
				System.out.println("la fecha de hoy es:");
				System.out.println(new Date());
			}
		});
		tabbedPane.addTab("New tab", null, list, null);
		list.setBackground(new Color(51, 153, 204));
		list.setMultipleMode(true);
		list.setFont(null);
		frmNotas.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		frmNotas.getContentPane().add(lblFecha);
		frmNotas.getContentPane().add(progressBar);
		frmNotas.getContentPane().add(tabbedPane);
		frmNotas.getContentPane().add(txtUrgente);
		frmNotas.getContentPane().add(txtCargarLaMugi);
		frmNotas.getContentPane().add(txtImportante);
		frmNotas.getContentPane().add(comboBox);
		frmNotas.getContentPane().add(txtNormal);
		
		JEditorPane dtrpnexamenDia = new JEditorPane();
		dtrpnexamenDia.setDropMode(DropMode.ON_OR_INSERT_COLS);
		dtrpnexamenDia.setText("*Examen dia\r\n5 de octubre\r\ntemas: 3,4,5");
		frmNotas.getContentPane().add(dtrpnexamenDia);
		
		JEditorPane dtrpnHacerLaCompra = new JEditorPane();
		dtrpnHacerLaCompra.setText("1. Hacer la compra \r\npara la semana\r\n*Verduras\r\n*Leche\r\n*Carne");
		frmNotas.getContentPane().add(dtrpnHacerLaCompra);
		
		JButton btnOk = new JButton("ok");
		frmNotas.getContentPane().add(btnOk);
		frmNotas.setTitle("Notas");
		frmNotas.setBounds(100, 100, 698, 508);
		frmNotas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
