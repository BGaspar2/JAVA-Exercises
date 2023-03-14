package Parcial3;

import java.awt.EventQueue;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Libros extends JFrame {

	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNombre;
	private JLabel lblAutor;
	private JLabel lblMateria;
	private JLabel lblCantidad;
	private JLabel lblPrecioUnitario;
	private JLabel lblPrecioTotal;
	private JLabel lblDescuento;
	private JLabel lblTotalAPagar;
	private JTextField txtCodigo;
	private JTextField txtNombre;
	private JTextField txtAutor;
	private JTextField txtCantidad;
	private JTextField txtPrecioU;
	private JTextField txtPrecioT;
	private JTextField txtDesc;
	private JTextField txtTotal;
	private JButton btnGuardar;
	private JButton btnLeer;
	//lista para materias
	private JComboBox<Materias> cmbMaterias;
	private JScrollPane scrollPane;
	private JTable table;
	//modelo para scrollPane
	DefaultTableModel model;
	//resultados para redondear
	BigDecimal resultado;
	BigDecimal resultado2;
	BigDecimal resultado3;
	//Valor donde almacenar el precio total a pagar
	double PrecioTotal = 0.00;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Libros frame = new Libros();
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
	public Libros() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1008, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNewLabel = new JLabel("Codigo Libro:");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNewLabel.setBounds(79, 67, 118, 17);
		contentPane.add(lblNewLabel);
		
		lblNombre = new JLabel("Nombre Libro:");
		lblNombre.setFont(new Font("Arial", Font.PLAIN, 20));
		lblNombre.setBounds(79, 112, 125, 17);
		contentPane.add(lblNombre);
		
		lblAutor = new JLabel("Autor:");
		lblAutor.setFont(new Font("Arial", Font.PLAIN, 20));
		lblAutor.setBounds(109, 156, 88, 17);
		contentPane.add(lblAutor);
		
		lblMateria = new JLabel("Materia:");
		lblMateria.setFont(new Font("Arial", Font.PLAIN, 20));
		lblMateria.setBounds(89, 200, 88, 17);
		contentPane.add(lblMateria);
		
		lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setFont(new Font("Arial", Font.PLAIN, 20));
		lblCantidad.setBounds(89, 245, 88, 17);
		contentPane.add(lblCantidad);
		
		lblPrecioUnitario = new JLabel("Precio Unitario:");
		lblPrecioUnitario.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPrecioUnitario.setBounds(480, 69, 134, 17);
		contentPane.add(lblPrecioUnitario);
		
		lblPrecioTotal = new JLabel("Precio Total:");
		lblPrecioTotal.setFont(new Font("Arial", Font.PLAIN, 20));
		lblPrecioTotal.setBounds(480, 114, 118, 17);
		contentPane.add(lblPrecioTotal);
		
		lblDescuento = new JLabel("Descuento:");
		lblDescuento.setFont(new Font("Arial", Font.PLAIN, 20));
		lblDescuento.setBounds(480, 158, 134, 17);
		contentPane.add(lblDescuento);
		
		lblTotalAPagar = new JLabel("Total a pagar:");
		lblTotalAPagar.setFont(new Font("Arial", Font.PLAIN, 20));
		lblTotalAPagar.setBounds(484, 202, 134, 20);
		contentPane.add(lblTotalAPagar);
		
		txtCodigo = new JTextField();
		txtCodigo.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				//Condicion para que admita no mas de 5 caracteres
			if (txtCodigo.getText().length() >= 5) {
				
				e.consume();
				//metodo que ayuda a anunciar que el codigo es erroneo
				Toolkit.getDefaultToolkit().beep();
				JOptionPane.showMessageDialog(null, "El campo debe ser numerico y no puede ingresar mas de 5 caracteres");
				txtCodigo.setText("");
				txtCodigo.requestFocus();
			}
			}
		});
		txtCodigo.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCodigo.setBounds(210, 65, 253, 20);
		contentPane.add(txtCodigo);
		
		txtCodigo.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Arial", Font.PLAIN, 12));
		txtNombre.setBounds(210, 110, 253, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtAutor = new JTextField();
		txtAutor.setFont(new Font("Arial", Font.PLAIN, 12));
		txtAutor.setBounds(210, 154, 253, 20);
		contentPane.add(txtAutor);
		txtAutor.setColumns(10);
		
		txtCantidad = new JTextField();
		txtCantidad.setText("0");
		txtCantidad.setFont(new Font("Arial", Font.PLAIN, 12));
		txtCantidad.setBounds(210, 245, 253, 20);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		txtPrecioU = new JTextField();
		txtPrecioU.setText("0.00");
		txtPrecioU.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPrecioU.setBounds(624, 67, 88, 20);
		contentPane.add(txtPrecioU);
		txtPrecioU.setColumns(10);
		
		txtPrecioT = new JTextField();
		txtPrecioT.setText("0.00");
		txtPrecioT.setEnabled(false);
		txtPrecioT.setFont(new Font("Arial", Font.PLAIN, 12));
		txtPrecioT.setBounds(624, 112, 88, 20);
		contentPane.add(txtPrecioT);
		txtPrecioT.setColumns(10);
		
		txtDesc = new JTextField();
		txtDesc.setHorizontalAlignment(SwingConstants.LEFT);
		txtDesc.setText("0.00");
		txtDesc.setEnabled(false);
		txtDesc.setFont(new Font("Arial", Font.PLAIN, 14));
		txtDesc.setBounds(624, 156, 88, 20);
		contentPane.add(txtDesc);
		txtDesc.setColumns(10);
		
		txtTotal = new JTextField();
		txtTotal.setText("0.00");
		txtTotal.setEnabled(false);
		txtTotal.setFont(new Font("Arial", Font.PLAIN, 12));
		txtTotal.setBounds(624, 200, 88, 20);
		contentPane.add(txtTotal);
		txtTotal.setColumns(10);
		
		btnGuardar = new JButton("GUARDAR");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				//variables para calculos
				double precioT, precioU, desc = 0.00;
				int cantidad;
				//llamnado a restricciones
				Restricciones datos = new Restricciones(txtCantidad.getText(), txtPrecioU.getText(), txtCodigo.getText());
				//Validacion
				if(datos.validarCantidad(txtCantidad.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Cantidad incorrecta, por favor la cantidad solo debe ser numerica y entera");
					txtCantidad.setText("0");
					txtCantidad.requestFocus();
				}
				else if(datos.validarPrecioUni(txtPrecioU.getText()) == false) {
					JOptionPane.showMessageDialog(null, "Precio Unitario incorrecto, el valor solo debe ser decimal (.)");
					txtPrecioU.setText("0.0");
					txtPrecioU.requestFocus();
				}
				else if(datos.validarCodigo(txtCodigo.getText()) == false) {
					JOptionPane.showMessageDialog(null, "El codigo debe ser un valor numerico");
					txtCodigo.setText("");
					txtCodigo.requestFocus();
				}
				//Si los campos estan vacios marcar error
				else if(txtCantidad.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Rellene el campo cantidad");
				     txtCantidad.setText("0");
				     txtCantidad.requestFocus();
				}
				else if(txtAutor.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Rellene el campo autor");
					txtAutor.setText("");
					txtAutor.requestFocus();
				}
				else if(txtCodigo.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Rellene el campo codigo");
					txtCodigo.setText("");
					txtCodigo.requestFocus();
				}
				
				else if(txtNombre.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Rellene el campo Nombre");
					txtNombre.setText("");
					txtNombre.requestFocus();
				}
				else if(txtPrecioU.getText().length()==0){
					JOptionPane.showMessageDialog(null, "Rellene el campo precio Unitario");
					txtPrecioU.setText("0.00");
					txtPrecioU.requestFocus();
				}
				
				else {
					
					precioU = Double.parseDouble(txtPrecioU.getText());
					cantidad = Integer.parseInt(txtCantidad.getText());
				
					/**
					 * se hacen los calculos y se redondea
					 */
					
					//Condicion de cantidad es mayor a 5
					if (cantidad > 5 ) {
						lblDescuento.setText("Descuento 3%");
						desc = (precioU*cantidad)*0.03;
						resultado= new BigDecimal(desc).setScale(2, RoundingMode.HALF_UP); 
						txtDesc.setText(String.valueOf(resultado));
						precioT =  (precioU*cantidad)- desc; 
						
					}
					else {
						lblDescuento.setText("Descuento 0%");
						precioT = precioU*cantidad;
						txtDesc.setText(String.valueOf(0.00));
					}
					
					PrecioTotal += precioT;
					
					
					
					 resultado2= new BigDecimal(precioT).setScale(2, RoundingMode.HALF_UP); 
					 resultado3= new BigDecimal(PrecioTotal).setScale(2, RoundingMode.HALF_UP); 
					 
				
					txtPrecioT.setText(resultado2.toString());
					txtTotal.setText(resultado3.toString());
					//guardar en txt
					try {
						FileWriter fw = new FileWriter("Libros.txt",true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.write(txtCodigo.getText() + " ");
						bw.write(txtNombre.getText() + " ");
						bw.write(txtAutor.getText() + " ");
						bw.write(cmbMaterias.getSelectedItem() + " ");
						bw.write(txtCantidad.getText() + " ");
						bw.write(txtPrecioU.getText() + " ");
						bw.write(txtPrecioT.getText() + " ");
						bw.write(txtDesc.getText() + " ");
						bw.write(txtTotal.getText() + " ");
						bw.newLine();
						bw.flush();
						JOptionPane.showMessageDialog(null, "Se guardo con exito");
						txtCodigo.setText("");
						txtNombre.setText("");
						txtAutor.setText("");
						txtCantidad.setText("0");
						txtPrecioU.setText("0.0");
						txtPrecioT.setText("0.0");
						txtDesc.setText("0.0");
						lblDescuento.setText("Descuento");
					}
					catch (Exception e1) {
						JOptionPane.showMessageDialog(null, "Error de Compilacion");
					}
				}	
			
			
			
			
			}
			});
			
		btnGuardar.setFont(new Font("Arial", Font.PLAIN, 14));
		btnGuardar.setBounds(493, 244, 149, 23);
		contentPane.add(btnGuardar);
		
		btnLeer = new JButton("LEER");
		btnLeer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					 model = new DefaultTableModel() {
							//bloquear columnas
							public boolean isCellEditable(int filas, int col) {
								if((col == 0) ) {
									return false;
								}
								else {
									return true;
								}
								
							}
						};
						table.setModel(model);
						//leer txt
					FileReader fr = new FileReader("Libros.txt");
					BufferedReader br = new BufferedReader(fr);
					String linea;
					model.addColumn("Mostrar Datos Libros");
					while((linea=br.readLine())!=null) {
						model.addRow(new String [] {linea});
					}
					table.setModel(model);
				}
				catch (Exception a) {
					JOptionPane.showMessageDialog(null, "Error de Compilacion");
				}
			
			
			}
			});
		btnLeer.setFont(new Font("Arial", Font.PLAIN, 14));
		btnLeer.setBounds(667, 244, 141, 23);
		contentPane.add(btnLeer);
		
		cmbMaterias = new JComboBox();
		cmbMaterias.setFont(new Font("Arial", Font.PLAIN, 12));
		cmbMaterias.setBounds(210, 197, 253, 22);
		cmbMaterias.setModel(new DefaultComboBoxModel(Materias.values()));
		contentPane.add(cmbMaterias);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(79, 313, 795, 144);
		contentPane.add(scrollPane);
		table = new JTable();
		scrollPane.setRowHeaderView(table);
		scrollPane.setViewportView(table);
		
		
		
	}
		


	

	
	
}
