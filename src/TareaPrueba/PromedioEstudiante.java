package TareaPrueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PromedioEstudiante extends JFrame {

	private JPanel contentPane;
	private JTextField txtN1;
	private JTextField txtN2;
	private JTextField txtN3;
	private JTextField txtPromedio;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PromedioEstudiante frame = new PromedioEstudiante();
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
	public PromedioEstudiante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtN1 = new JTextField();
		txtN1.setBounds(29, 29, 86, 20);
		contentPane.add(txtN1);
		txtN1.setColumns(10);
		
		txtN2 = new JTextField();
		txtN2.setBounds(29, 86, 86, 20);
		contentPane.add(txtN2);
		txtN2.setColumns(10);
		
		txtN3 = new JTextField();
		txtN3.setBounds(29, 131, 86, 20);
		contentPane.add(txtN3);
		txtN3.setColumns(10);
		
		txtPromedio = new JTextField();
		txtPromedio.setText("0");
		txtPromedio.setBounds(29, 192, 86, 20);
		contentPane.add(txtPromedio);
		txtPromedio.setColumns(10);
		
		JButton btnPromedio = new JButton("Promedio");
		btnPromedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float n1,n2,n3,prom;
				n1 = Float.parseFloat(txtN1.getText());
				n2 = Float.parseFloat(txtN2.getText());
				n3 = Float.parseFloat(txtN3.getText());
				prom = (n1+n2+n3)/3;
			
				txtPromedio.setText(Float.toString(prom)); 
			}
		});
		btnPromedio.setBounds(156, 115, 89, 23);
		contentPane.add(btnPromedio);
	}
}
