package EjerciciosSql;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.CaretEvent;

public class universidad extends JFrame implements ActionListener, MouseListener, CaretListener {

	private JPanel contentPane;
	private JButton btnProbar;
	private static final String base = "universidad";
	private static final String user = "root";
	private static final String pass = "";
	private static final String url = "jdbc:mysql://localhost:3306/" + base;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtCedula;
	private JTextField txtApellido;
	private JTextField txtNombres;
	private JTextField txtLugar;
	private JTextField txtFechaNac;
	private JTextField txtNota;
	private JButton btnGuardar;
	PreparedStatement ps = null;
	Connection con = null;
	ResultSet rs = null;
	private JButton btnBuscar;
	private JButton btnModificar;
	private JButton btnEliminar;
	private JButton btnNuevo;
	private JScrollPane scrollPane;
	private JTable table;
	DefaultTableModel model;
	private JTextField txtbuscar;
	public Connection getConexion() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Connection)DriverManager.getConnection(this.url,this.user,this.pass);

		} catch(Exception e) {
			System.err.println(e);
			//JOptionPane.showMessageDialog(null, "Error");
			
		} 
		return con;
		
		
		
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					universidad frame = new universidad();
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
	public universidad() {
		setTitle("CONEXION BDD");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		btnProbar = new JButton("Probar Conexion");
		btnProbar.setBounds(595, 297, 128, 32);
		btnProbar.setEnabled(false);
		btnProbar.addActionListener(this);
		contentPane.setLayout(null);
		contentPane.add(btnProbar);
		
		lblNewLabel = new JLabel("C\u00E9dula:");
		lblNewLabel.setBounds(35, 60, 46, 14);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Apellidos:");
		lblNewLabel_1.setBounds(35, 99, 69, 14);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Nombres:");
		lblNewLabel_2.setBounds(35, 138, 69, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Lugar de Nacimiento:");
		lblNewLabel_3.setBounds(32, 177, 138, 14);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Fecha de Nacimiento:");
		lblNewLabel_4.setBounds(31, 202, 129, 23);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Nota de Grado:");
		lblNewLabel_5.setBounds(31, 236, 103, 14);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(lblNewLabel_5);
		
		txtCedula = new JTextField();
		txtCedula.setBounds(111, 58, 103, 20);
		contentPane.add(txtCedula);
		txtCedula.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(111, 97, 103, 20);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(111, 138, 103, 18);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtLugar = new JTextField();
		txtLugar.setBounds(170, 175, 86, 20);
		contentPane.add(txtLugar);
		txtLugar.setColumns(10);
		
		txtFechaNac = new JTextField();
		txtFechaNac.setBounds(170, 204, 86, 20);
		contentPane.add(txtFechaNac);
		txtFechaNac.setColumns(10);
		
		txtNota = new JTextField();
		txtNota.setBounds(170, 234, 86, 20);
		txtNota.setText("0");
		contentPane.add(txtNota);
		txtNota.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 301, 89, 23);
		btnGuardar.addActionListener(this);
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 12));
		contentPane.add(btnGuardar);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(125, 302, 89, 23);
		btnBuscar.addActionListener(this);
		btnBuscar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnBuscar);
		
		btnModificar = new JButton("Modificar");
		btnModificar.setBounds(246, 302, 89, 23);
		btnModificar.addActionListener(this);
		btnModificar.setEnabled(false);
		btnModificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		contentPane.add(btnModificar);
		
		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(346, 302, 89, 23);
		btnEliminar.setEnabled(false);
		btnEliminar.addActionListener(this);
		contentPane.add(btnEliminar);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(448, 302, 89, 23);
		btnNuevo.addActionListener(this);
		contentPane.add(btnNuevo);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(266, 35, 457, 251);
		contentPane.add(scrollPane);
		table = new JTable();
		table.addMouseListener(this);
		scrollPane.setRowHeaderView(table);
		scrollPane.setViewportView(table);
		Connection connection;
		try {
			 model = new DefaultTableModel() {
				//bloquear columnas
				public boolean isCellEditable(int filas, int col) {
					if((col == 0) || (col == 1) || (col == 2) || (col == 3) || (col == 4) || (col == 5)) {
						return false;
					}
					else {
						return true;
					}
					
				}
			};
			table.setModel(model);
			
			txtbuscar = new JTextField();
			txtbuscar.addCaretListener(this);
			txtbuscar.setBounds(283, 11, 377, 20);
			contentPane.add(txtbuscar);
			txtbuscar.setColumns(10);
			model.addColumn("Cedula");
			model.addColumn("Apellidos");
			model.addColumn("Nombres");
			model.addColumn("Lugar de nacimiento");
			model.addColumn("Fecha de Nacimiento");
			model.addColumn("Nota de grado");
			connection = getConexion();
			ps = connection.prepareStatement("SELECT * FROM estudiantes");
			rs = ps.executeQuery();
			ResultSetMetaData rstabla = (ResultSetMetaData) rs.getMetaData();
			int numCampos = rstabla.getColumnCount();
			
			while (rs.next()) {
				Object [] filas = new Object[numCampos];
				for (int iterator = 0; iterator<numCampos; iterator++) {
					filas[iterator] = rs.getObject(iterator+1);	
				}
				model.addRow(filas);
				
			}
					} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error" + e);
		}
	
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNuevo) {
			actionPerformedBtnNuevo(e);
		}
		if (e.getSource() == btnEliminar) {
			actionPerformedBtnEliminar(e);
		}
		if (e.getSource() == btnModificar) {
			actionPerformedBtnModificar(e);
		}
		if (e.getSource() == btnBuscar) {
			actionPerformedBtnBuscar(e);
		}
		if (e.getSource() == btnGuardar) {
			actionPerformedBtnGuardar(e);
		}
		if (e.getSource() == btnProbar) {
			actionPerformedBtnProbar(e);
		}
	}
	protected void actionPerformedBtnProbar(ActionEvent e) {
		try {
			
			
		}catch(Exception e1){
	
		}
	}
	protected void actionPerformedBtnGuardar(ActionEvent e) {
		try {
			con = getConexion();
			ps=con.prepareStatement("INSERT INTO estudiantes(cedula,apellidos,nombres,lugar_nacimiento,fecha_nacimieno,nota_grado) VALUE(?,?,?,?,?,?)");
			ps.setString(1, txtCedula.getText());
			ps.setString(2, txtApellido.getText());
			ps.setString(3, txtNombres.getText());
			ps.setString(4, txtLugar.getText());
			ps.setDate(5, Date.valueOf(txtFechaNac.getText()));
			ps.setDouble(6, Double.valueOf(txtNota.getText()));
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "guardado exitoso");
			//añadir fila
			Object [] fila = new Object[6];
			fila[0] = txtCedula.getText();
			fila[1] = txtApellido.getText();
			fila[2] = txtNombres.getText();
			fila[3] = txtFechaNac.getText();
			fila[4] = txtLugar.getText();
			fila[5] = txtNota.getText();
			model.addRow(fila);
			 limpiar();
			con.close();
		}catch(Exception e1) {
			JOptionPane.showMessageDialog(null, "no se ha guardado" + e1);
		}
	}
	protected void actionPerformedBtnBuscar(ActionEvent e) {
		Connection con = getConexion();
		
		String sql = "SELECT * FROM estudiantes WHERE cedula=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, txtCedula.getText());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				//txtApel.setCedula(rs.getInt("Cedula"));
				txtApellido.setText(rs.getString("apellidos"));
				txtNombres.setText(rs.getString("nombres"));
				txtLugar.setText(rs.getString("lugar_nacimiento"));
				txtFechaNac.setText(String.valueOf(rs.getDate("fecha_nacimieno")));
				txtNota.setText(String.valueOf(rs.getDouble("nota_grado")));
				
				Object[] fila = new Object[6];
				for(int i=0; i<6; i++) {
					fila[i]=rs.getObject(i+1);
					
				}
				
				model.addRow(fila);
				table.setModel(model);
				
				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
				
				
				
				
			}
			 
			con.close();
			
		} catch (Exception e1) {
			
		}
	}
	protected void actionPerformedBtnModificar(ActionEvent e) {
		Connection con;
		try {
			con=getConexion();
			ps=con.prepareStatement("UPDATE estudiantes SET cedula=?,apellidos=?,nombres=?"
					+ ",lugar_nacimiento=?,fecha_nacimieno=?,nota_grado=? WHERE cedula=?");
			ps.setString(1, txtCedula.getText());
			ps.setString(2, txtApellido.getText());
			ps.setString(3, txtNombres.getText());
			ps.setString(4, txtLugar.getText());
			ps.setDate(5, Date.valueOf(txtFechaNac.getText()));
			 ps.setDouble(6, Double.valueOf(txtNota.getText()));
             ps.setString(7, txtCedula.getText());
             ps.executeUpdate();
             JOptionPane.showMessageDialog(null, "Se modificó con éxito!");
             limpiar();
             con.close();
		} catch (Exception e2) {
			// TODO: handle exception
			 JOptionPane.showMessageDialog(null, "Hubo un error en la conexion" + e2);
		}
	}
	protected void actionPerformedBtnEliminar(ActionEvent e) {
		Connection connection;
		try {
			
			int r;
			r = JOptionPane.showConfirmDialog(null, "¿Esta seguro?", "Eliminar registro",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
			if(r == 0) {
				connection = getConexion();
				ps=connection.prepareStatement("DELETE FROM estudiantes WHERE cedula=?");
				ps.setString(1, txtCedula.getText());
				ps.executeUpdate();
				JOptionPane.showMessageDialog(null, "Se elimino con éxito!");
			}
			
			 limpiar();
            con.close();
           
		} catch (Exception e2) {
			// TODO: handle exception
			 JOptionPane.showMessageDialog(null, "Hubo un error en la conexion" + e2);
		}
	}
	protected void actionPerformedBtnNuevo(ActionEvent e) {
		txtCedula.setText("");
		txtApellido.setText("");
		txtNombres.setText("");
		txtLugar.setText("");
		txtFechaNac.setText("");
		txtNota.setText("");
		
	}
	
	public void limpiar()
	{	
		txtCedula.setText("");
		txtApellido.setText("");
		txtNombres.setText("");
		txtLugar.setText("");
		txtFechaNac.setText("");
		txtNota.setText("");
	
	}
	
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == table) {
			mouseClickedTable(e);
		}
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mousePressed(MouseEvent e) {
	}
	public void mouseReleased(MouseEvent e) {
	}
	protected void mouseClickedTable(MouseEvent e) {
		Connection conn;
		int fila = table.getSelectedRow();
		String ced = table.getValueAt(fila, 0).toString();
		try {
			conn = getConexion();
			ps = conn.prepareStatement("SELECT * FROM estudiantes WHERE cedula=?");
			ps.setString(1, ced);
			rs = ps.executeQuery();
			if(rs.next()) {
			txtCedula.setText(rs.getString("cedula"));
			txtApellido.setText(rs.getString("apellidos"));
			txtNombres.setText(rs.getString("nombres"));
			txtLugar.setText(rs.getString("lugar_nacimiento"));
			txtFechaNac.setText(String.valueOf(rs.getDate("fecha_nacimieno")));
			txtNota.setText(String.valueOf(rs.getDouble("nota_grado")));
			
			}
		} catch (Exception e2) {
		JOptionPane.showMessageDialog(null, e);
		}
		
	}
	public void caretUpdate(CaretEvent e) {
		if (e.getSource() == txtbuscar) {
			caretUpdateTxtbuscar(e);
		}
	}
	protected void caretUpdateTxtbuscar(CaretEvent e) {
		Connection con = getConexion();
		
		String sql = "SELECT * FROM estudiantes WHERE cedula=?";
		
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, txtbuscar.getText());
			rs = ps.executeQuery();
			
			if(rs.next()) {
				//txtApel.setCedula(rs.getInt("Cedula"));
				txtApellido.setText(rs.getString("apellidos"));
				txtNombres.setText(rs.getString("nombres"));
				txtLugar.setText(rs.getString("lugar_nacimiento"));
				txtFechaNac.setText(String.valueOf(rs.getDate("fecha_nacimieno")));
				txtNota.setText(String.valueOf(rs.getDouble("nota_grado")));
				
				Object[] fila = new Object[6];
				for(int i=0; i<6; i++) {
					fila[i]=rs.getObject(i+1);
					
				}
				
				model.addRow(fila);
				table.setModel(model);
				
				btnModificar.setEnabled(true);
				btnEliminar.setEnabled(true);
				
				
				
				
			}
			 
			con.close();
			
		} catch (Exception e1) {
			
		}
	}
}
