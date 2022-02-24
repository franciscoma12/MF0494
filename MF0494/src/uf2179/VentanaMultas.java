package uf2179;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class VentanaMultas extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextArea txt;
	private JScrollPane scrollPane;
	private JLabel lblMatricula;
	private JTextField txtMatricula;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblApellidos;
	private JTextField txtApellidos;
	private JLabel lblSancion;
	private JComboBox comboBox;
	private JLabel lblImporte;
	private JLabel lblCantidad;
	private JButton btnAceptar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMultas frame = new VentanaMultas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaMultas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new MigLayout("", "[56px][6px][113.00px,grow][13.00px][10px][35.00px][2px][127.00px,grow]", "[25px][22px][22px][20px][20px][23px][23px][54px]"));
		JLabel lblTitulo = new JLabel("DGT-Infracciones");
		lblTitulo.setVerticalAlignment(SwingConstants.TOP);
		lblTitulo.setHorizontalAlignment(SwingConstants.LEFT);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setOpaque(true);
		lblTitulo.setBackground(Color.BLUE);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblTitulo, "cell 0 0 8 1,grow");
		
		lblMatricula = new JLabel("Matr\u00EDcula:");
		contentPane.add(lblMatricula, "cell 0 1");
		
		txtMatricula = new JTextField();
		contentPane.add(txtMatricula, "cell 2 1,growx");
		txtMatricula.setColumns(10);
		
		lblNombre = new JLabel("Nombre:");
		contentPane.add(lblNombre, "cell 3 1 3 1,alignx right");
		
		txtNombre = new JTextField();
		contentPane.add(txtNombre, "cell 6 1 2 1,growx");
		txtNombre.setColumns(10);
		
		lblApellidos = new JLabel("Apellidos:");
		contentPane.add(lblApellidos, "cell 0 2");
		
		txtApellidos = new JTextField();
		contentPane.add(txtApellidos, "cell 2 2 6 1,growx");
		txtApellidos.setColumns(10);
		
		lblSancion = new JLabel("Sanci\u00F3n:");
		contentPane.add(lblSancion, "cell 0 3");
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"No llevar casco", "Conducci\u00F3n temeraria"}));
		contentPane.add(comboBox, "cell 2 3 6 1,growx");
		
		lblImporte = new JLabel("Importe:");
		contentPane.add(lblImporte, "cell 0 4");
		
		lblCantidad = new JLabel("");
		contentPane.add(lblCantidad, "cell 2 4");
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				calcularSancion();
				double prontopago= Double.parseDouble(lblCantidad.getText());
				txt.setText(txt.getText() + "Conductor: " + txtNombre.getText()+" " + txtApellidos.getText());
				txt.setText(txt.getText() +"\n " + "Infracción: " +comboBox.getSelectedItem());
				txt.setText(txt.getText() + "\n " + "Importe: " +lblCantidad.getText());
				txt.setText(txt.getText() + "\n " + "Pronto pago: " +(prontopago/2));
				
				
			}
		});
		contentPane.add(btnAceptar, "cell 2 5");
		
		scrollPane = new JScrollPane();
		contentPane.add(scrollPane, "cell 0 7 8 1,grow");
		
		txt = new JTextArea();
		scrollPane.setViewportView(txt);
	}
	protected void calcularSancion() {
		String seleccionado = (String) comboBox.getSelectedItem();
		if (seleccionado.equals("No llevar casco")) {
		lblCantidad.setText("200");
		} else {
		lblCantidad.setText("500");
		}

		}

	}

