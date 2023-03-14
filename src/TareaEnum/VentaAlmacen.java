package TareaEnum;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 * 
 * Clase Venta Almacen donde se va a crear los diferentes jlabels y jtextsfields para el diseño
 *
 */
public class VentaAlmacen extends JFrame implements ActionListener {
	/**
	 * Variables para creacion del panel
	 */
	private JPanel contentPane;
	/**
	 * Variables para creacion de un label
	 */
	private JLabel lblNewLabel;
	/**
	 * Variables para creacion del combobox
	 */
	private JComboBox cmbElectrodomestico;
	/**
	 * Variables para creacion de otro panel
	 */
	private JPanel panel;
	/**
	 * Variables para creacion del label cantidad
	 */
	private JLabel lblCantidad;
	/**
	 * Variables para creacion del txtcantidad
	 */
	private JTextField txtCantidad;
	/**
	 * Variables para creacion del label Precio unitario
	 */
	private JLabel lblPrecioUnitario;
	/**
	 * Variables para creacion del txtPrecioUnitario
	 */
	private JTextField txtPrecioUnitario;
	/**
	 * Variables para creacion del label precio total
	 */
	private JLabel lblPrecioTotal;
	/**
	 * Variables para creacion del txtPrecioTotal
	 */
	private JTextField txtPrecioTotal;
	/**
	 * Variables para creacion del label del precio sin iva
	 */
	private JLabel lblPrecioTotalsinIva;
	/**
	 * Variables para creacion del label del iva
	 */
	private JLabel lblIva;
	/**
	 * Variables para creacion del precio con iva
	 */
	private JLabel lblPrecioTotalconIva;
	/**
	 * Variables para creacion del boton calular
	 */
	private JButton btnCalcular;
	/**
	 * Variables para creacion del boton nuevo
	 */
	private JButton btnNuevo;
	/**
	 * Variables para creacion del txt precio sin iva
	 */
	private JTextField txtPrecioSinIva;
	/**
	 * Variables para creacion del txt del iva
	 */
	private JTextField txtIva;
	/**
	 * Variables para creacion del txtprecio con iva
	 */
	private JTextField txtPrecioConIva;
	/**
	 * Variables para creacion de la variable doble precio total
	 */
	double PrecioTotal = 0.0;
	/**
	 * Variables para creacion de la variable doble precio total con iva
	 */
	double PrecioTotalConIva = 0.0;
	/**
	 * Variables para creacion de la variable doble precioEIva para ir almacenando el iva total
	 */
	double precioEIva2 = 0.0;
	/**
	 * Variables para redondeo del total de iva
	 */
	BigDecimal resultadoEIva;
	/**
	 *  Variables para redondeo del resultado con iva
	 */
	BigDecimal resultado;
	/**
	 * Variables para redondeo del resultado con iva
	 */
	BigDecimal resultadoIva;
	/**
	 * Variables para creacion del boton nuevo
	 */
	private JButton btnNuevoProducto;
	/**
	 * Launch the application.
	 */
	/**
	 * funcion main donde se inicia el JFrame
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentaAlmacen frame = new VentaAlmacen();
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
	public VentaAlmacen() {
		setTitle("Electrodomesticos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Electrodomesticos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(0, 0, 693, 266);
		contentPane.add(panel);
		panel.setLayout(null);
		
		cmbElectrodomestico = new JComboBox();
		cmbElectrodomestico.setBounds(216, 35, 153, 20);
		panel.add(cmbElectrodomestico);
		/**
		 * Se asigna los valores que se mostraran en el combobox de electrodomesticos
		 */
		cmbElectrodomestico.setModel(new DefaultComboBoxModel(Electrodomesticos.values()));
		
		lblNewLabel = new JLabel("Eliga un Electrodomestico:");
		lblNewLabel.setBounds(24, 36, 169, 16);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		lblCantidad = new JLabel("Cantidad de Electrodomesticos:");
		lblCantidad.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblCantidad.setBounds(25, 84, 204, 16);
		panel.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setText("0");
		txtCantidad.setBounds(239, 83, 130, 20);
		panel.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		lblPrecioUnitario = new JLabel("Precio Unitario:");
		lblPrecioUnitario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecioUnitario.setBounds(24, 121, 204, 16);
		panel.add(lblPrecioUnitario);
		
		txtPrecioUnitario = new JTextField();
		txtPrecioUnitario.setText("0.0");
		txtPrecioUnitario.setBounds(239, 120, 130, 20);
		panel.add(txtPrecioUnitario);
		txtPrecioUnitario.setColumns(10);
		
		lblPrecioTotal = new JLabel("Precio Total/Electrodomestico:");
		lblPrecioTotal.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecioTotal.setBounds(24, 158, 204, 16);
		panel.add(lblPrecioTotal);
		
		txtPrecioTotal = new JTextField();
		txtPrecioTotal.setEditable(false);
		txtPrecioTotal.setText("0.0");
		txtPrecioTotal.setBounds(239, 157, 130, 20);
		panel.add(txtPrecioTotal);
		txtPrecioTotal.setColumns(10);
		
		lblPrecioTotalsinIva = new JLabel("Precio Total/Sin Iva:");
		lblPrecioTotalsinIva.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecioTotalsinIva.setBounds(399, 38, 139, 16);
		panel.add(lblPrecioTotalsinIva);
		
		lblIva = new JLabel("IVA:");
		lblIva.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblIva.setBounds(399, 86, 35, 16);
		panel.add(lblIva);
		
		lblPrecioTotalconIva = new JLabel("Precio Total/Con Iva:");
		lblPrecioTotalconIva.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPrecioTotalconIva.setBounds(399, 123, 145, 16);
		panel.add(lblPrecioTotalconIva);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(this);
		btnCalcular.setBounds(409, 156, 89, 23);
		panel.add(btnCalcular);
		
		btnNuevo = new JButton("Nueva factura");
		btnNuevo.addActionListener(this);
		btnNuevo.setBounds(526, 156, 124, 23);
		panel.add(btnNuevo);
		
		txtPrecioSinIva = new JTextField();
		txtPrecioSinIva.setText("0.0");
		txtPrecioSinIva.setEditable(false);
		txtPrecioSinIva.setBounds(552, 35, 114, 20);
		panel.add(txtPrecioSinIva);
		txtPrecioSinIva.setColumns(10);
		
		txtIva = new JTextField();
		txtIva.setEditable(false);
		txtIva.setText("0.0");
		txtIva.setBounds(443, 83, 86, 20);
		panel.add(txtIva);
		txtIva.setColumns(10);
		
		txtPrecioConIva = new JTextField();
		txtPrecioConIva.setText("0.0");
		txtPrecioConIva.setEditable(false);
		txtPrecioConIva.setBounds(552, 120, 86, 20);
		panel.add(txtPrecioConIva);
		txtPrecioConIva.setColumns(10);
		
		btnNuevoProducto = new JButton("Nuevo Producto");
		btnNuevoProducto.addActionListener(this);
		btnNuevoProducto.setBounds(399, 190, 124, 23);
		panel.add(btnNuevoProducto);
	}
	/**
	 * se crear las acciones de los botones
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNuevoProducto) {
			actionPerformedBtnNuevoProducto(e);
		}
		if (e.getSource() == btnNuevo) {
			actionPerformedBtnNuevo(e);
		}
		if (e.getSource() == btnCalcular) {
			actionPerformedBtnCalcular(e);
		}
	}
	
	/**
	 * Esta Clase actua en el boton calcular y realiza las operaciones necesarias para mostrar los resultados en el diseño
	 * @param e 
	 */
	protected void actionPerformedBtnCalcular(ActionEvent e) {
		/**
		 * Se declaran variables
		 */
		final double IVA = 0.12;
		double precioE, precioTotalxE , precioEIva;
		int cantidadE;
		/**
		 * se les asigna el valor de los JTextFields a las variables creadas
		 */
		Restricciones datos = new Restricciones(txtPrecioUnitario.getText(),txtCantidad.getText());
		//Validacion
		if(datos.validarPrecioUni(txtPrecioUnitario.getText()) == false) {
			JOptionPane.showMessageDialog(null, "Precio Unitario incorrecto, por favor vuelva a ingresarla");
			txtPrecioUnitario.setText("0.0");
			txtPrecioUnitario.requestFocus();
		}
		else if(datos.validarCantidad(txtCantidad.getText()) == false) {
			JOptionPane.showMessageDialog(null, "Cantidad incorrecta, por favor vuelva a ingresarla");
			txtCantidad.setText("0");
			txtCantidad.requestFocus();
		}
		else {
		precioE = Double.parseDouble(txtPrecioUnitario.getText());
		cantidadE = Integer.parseInt(txtCantidad.getText());
	
		/**
		 * se hacen los calculos y se redondea
		 */
		precioE = precioE*cantidadE;
		
		PrecioTotal += precioE;
		
		precioEIva = precioE*IVA;
		precioEIva2 += precioEIva;
		precioTotalxE = precioE+(precioEIva);
		PrecioTotalConIva += precioTotalxE;
		
		 resultadoEIva= new BigDecimal(precioEIva2).setScale(2, RoundingMode.HALF_UP); 
		 resultado= new BigDecimal(PrecioTotal).setScale(2, RoundingMode.HALF_UP); 
		 resultadoIva= new BigDecimal(PrecioTotalConIva).setScale(2, RoundingMode.HALF_UP); 
		/**
		 * Se asignan los valores a los JTextFields que solo estan habilitados para mostrar
		 */
		txtPrecioTotal.setText(Double.toString(precioE));
		/**
		 * se deshabilitan los botones
		 */
		txtIva.setText(resultadoEIva.toString());
		txtPrecioSinIva.setText(resultado.toString());
		txtPrecioConIva.setText(resultadoIva.toString());
		/**
		 * se deshabilitan los botones
		 */
		btnCalcular.setEnabled(false);
		txtCantidad.setEditable(false);
		txtPrecioUnitario.setEditable(false);
		
		
		}
	}
	/**
	 * Funcion del boton nuevo que resetea los valores a 0 y habilita los botones y los txt para ingresar la cantidad y precio unitario
	 * @param e
	 */
	protected void actionPerformedBtnNuevo(ActionEvent e) {
		
		btnCalcular.setEnabled(true);
		txtCantidad.setEditable(true);
		txtPrecioUnitario.setEditable(true);
		txtPrecioUnitario.setText("0.0");
		txtCantidad.setText("0");
		txtPrecioTotal.setText("0.0");
		txtIva.setText("0.0");
		txtPrecioSinIva.setText("0.0");
		txtPrecioConIva.setText("0.0");
		PrecioTotal = 0.0;
		PrecioTotalConIva = 0.0;
		precioEIva2 = 0.0;
		
	}
	/**
	 * Funcion que permite sumar el valor de un nuevo producto a la factura actual
	 * @param e
	 */
	protected void actionPerformedBtnNuevoProducto(ActionEvent e) {
		btnCalcular.setEnabled(true);
		txtCantidad.setEditable(true);
		txtPrecioUnitario.setEditable(true);
		txtPrecioUnitario.setText("0.0");
		txtCantidad.setText("0");
		txtPrecioTotal.setText("0.0");
		 
	}
}
