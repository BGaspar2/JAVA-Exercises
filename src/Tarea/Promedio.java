package Tarea;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Promedio extends JFrame implements KeyListener {

	private JPanel contentPane;
	private JTable tblMostrar;
	private JTextField txtApellidos;
	private JTextField txtNombres;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JTextField txtNota3;
	private JTextField txtPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Promedio frame = new Promedio();
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
	
	public Promedio() {
		setTitle("TAREA #9 PROMEDIO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 844, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("APELLIDOS");
		lblNewLabel.setBounds(33, 27, 68, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRES");
		lblNewLabel_1.setBounds(33, 52, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JComboBox cmbMateria = new JComboBox();
		cmbMateria.setModel(new DefaultComboBoxModel(new String[] {"BASE DE DATOS I", "FILOSOFIA DE LAS CIENCIAS COM.", "INTERNET DE LAS COSAS", "PROGRAMACION ORIENTADA A OBJETOS", "REDES II", "SISTEMAS OPERATIVOS", "TUTORIAS DE ACOMPA\u00D1AMIENTO"}));
		cmbMateria.setBounds(110, 92, 246, 22);
		contentPane.add(cmbMateria);
		
		JLabel lblNewLabel_2 = new JLabel("MATERIA");
		lblNewLabel_2.setBounds(33, 96, 67, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("NOTA P1");
		lblNewLabel_3.setBounds(33, 137, 54, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NOTA P2");
		lblNewLabel_4.setBounds(33, 162, 54, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("NOTA P3");
		lblNewLabel_4_1.setBounds(33, 190, 54, 14);
		contentPane.add(lblNewLabel_4_1);
		
		JButton btnPromedio = new JButton("PROMEDIO");
		btnPromedio.setBounds(41, 276, 101, 23);
		contentPane.add(btnPromedio);
		
		JLabel lblNewLabel_5 = new JLabel("PROMEDIO");
		lblNewLabel_5.setBounds(33, 234, 68, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnGuardar = new JButton("GUARDAR");
		btnGuardar.setEnabled(false);
		btnPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Double n1,n2,n3,prom;
				
				Restricciones datos = new Restricciones(txtNota1.getText(),txtNota2.getText(),txtNota3.getText());
				//Validacion
				if(datos.validarNotas(txtNota1.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Nota 1 incorrecta, por favor vuelva a ingresarla");
					txtNota1.setText("0.0");
					txtNota1.requestFocus();
				}
				else if(datos.validarNotas(txtNota2.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Nota 2 incorrecta, por favor vuelva a ingresarla");
					txtNota2.setText("0.0");
					txtNota2.requestFocus();
				}
				else if(datos.validarNotas(txtNota3.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Nota 3 incorrecta, por favor vuelva a ingresarla");
					txtNota3.setText("0.0");
					txtNota3.requestFocus();
				}
				else 
				{
					n1 = Double.parseDouble(txtNota1.getText());
					n2 = Double.parseDouble(txtNota2.getText());
					n3 = Double.parseDouble(txtNota3.getText());
					
					prom = (n1+n2+n3)/3;
					BigDecimal resultado= new BigDecimal(prom).setScale(2, RoundingMode.HALF_UP); 
					txtPromedio.setText(Double.toString(resultado.doubleValue())); 
				
					btnGuardar.setEnabled(true);
				
				}
			
							
			}
		});
		
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Restricciones datos = new Restricciones(txtNota1.getText(),txtNota2.getText(),txtNota3.getText());
				//Validacion
				if(datos.validarNotas(txtNota1.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Nota 1 incorrecta, por favor vuelva a ingresarla");
					txtNota1.setText("0.0");
					txtNota1.requestFocus();
				}
				else if(datos.validarNotas(txtNota2.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Nota 2 incorrecta, por favor vuelva a ingresarla");
					txtNota2.setText("0.0");
					txtNota2.requestFocus();
				}
				else if(datos.validarNotas(txtNota3.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Nota 3 incorrecta, por favor vuelva a ingresarla");
					txtNota3.setText("0.0");
					txtNota3.requestFocus();
				}
				else {
				try {
					FileWriter fw = new FileWriter("Estudiantes.txt",true);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(txtApellidos.getText() + " ");
					bw.write(txtNombres.getText() + " ");
					bw.write(cmbMateria.getSelectedItem() + " ");
					bw.write(txtNota1.getText() + " ");
					bw.write(txtNota2.getText() + " ");
					bw.write(txtNota3.getText() + " ");
					bw.write(txtPromedio.getText() + " ");
					bw.newLine();
					bw.flush();
					JOptionPane.showMessageDialog(null, "Se guardo con exito");
					txtApellidos.setText("");
					txtNombres.setText("");
					txtNombres.setText("");
					txtNota1.setText("0.0");
					txtNota2.setText("0.0");
					txtNota3.setText("0.0");
					txtPromedio.setText("0.0");
					btnGuardar.setEnabled(false);
				}
				catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Error de Compilacion");
				}
			}
				}
		});
		btnGuardar.setBounds(152, 276, 101, 23);
		contentPane.add(btnGuardar);
		
		JButton btnMostrar = new JButton("MOSTRAR");
		btnMostrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader fr = new FileReader("Estudiantes.txt");
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel modelTable = new DefaultTableModel();
					String linea;
					modelTable.addColumn("");
					while((linea=br.readLine())!=null) {
						modelTable.addRow(new String [] {linea});
					}
					tblMostrar.setModel(modelTable);
				}
				catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Error de Compilacion");
				}
			}
		});
		
		btnMostrar.setBounds(265, 276, 101, 23);
		contentPane.add(btnMostrar);
		
		tblMostrar = new JTable();
		tblMostrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		tblMostrar.setFillsViewportHeight(true);
		tblMostrar.setColumnSelectionAllowed(true);
		tblMostrar.setCellSelectionEnabled(true);
		tblMostrar.setBackground(SystemColor.window);
		tblMostrar.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		tblMostrar.setToolTipText("");
		tblMostrar.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"MATERIA", "NOTA3", "NOTA2", "NOTA1", "APELLIDOS", "NOMBRES"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		tblMostrar.setBounds(366, 26, 440, 232);
		contentPane.add(tblMostrar);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(111, 24, 245, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(111, 49, 245, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.addKeyListener(this);
		txtNota1.setText("0.0");
		txtNota1.setBounds(110, 130, 133, 20);
		contentPane.add(txtNota1);
		txtNota1.setColumns(10);
		
		txtNota2 = new JTextField();
		txtNota2.addKeyListener(this);
		txtNota2.setText("0.0");
		txtNota2.setBounds(110, 159, 133, 20);
		contentPane.add(txtNota2);
		txtNota2.setColumns(10);
		
		txtNota3 = new JTextField();
		txtNota3.addKeyListener(this);
		txtNota3.setText("0.0");
		txtNota3.setBounds(111, 187, 132, 20);
		contentPane.add(txtNota3);
		txtNota3.setColumns(10);
		
		txtPromedio = new JTextField();
		txtPromedio.setText("0.0");
		txtPromedio.setEditable(false);
		txtPromedio.setBounds(111, 231, 132, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
	}
	
	
	
	public void keyPressed(KeyEvent e) {
	}
	public void keyReleased(KeyEvent e) {
		if (e.getSource() == txtNota2) {
			keyReleasedTxtNota2(e);
		}
		if (e.getSource() == txtNota1) {
			keyReleasedTxtNota1(e);
		}
		if (e.getSource() == txtNota3) {
			keyReleasedTxtNota3(e);
		}
	}
	public void keyTyped(KeyEvent e) {
	}
	protected void keyReleasedTxtNota3(KeyEvent e) {
	}
	protected void keyReleasedTxtNota1(KeyEvent e) {
	}
	protected void keyReleasedTxtNota2(KeyEvent e) {
	}
}
