package udea.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField txtPesos;
	private JTextField txtDolares;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmPrincipal frame = new frmPrincipal();
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
	public frmPrincipal() {
		setTitle("Conversi\u00F3n de moneda");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 263);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Pesos");
		lblNewLabel.setBounds(76, 80, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("D\u00F3lares");
		lblNewLabel_1.setBounds(76, 109, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		txtPesos = new JTextField();
		txtPesos.setText("0");
		txtPesos.setBounds(164, 77, 96, 19);
		contentPane.add(txtPesos);
		txtPesos.setColumns(10);
		
		txtDolares = new JTextField();
		txtDolares.setText("0");
		txtDolares.setBounds(164, 106, 96, 19);
		contentPane.add(txtDolares);
		txtDolares.setColumns(10);
		
		JButton btnConvertir = new JButton("Convertir");
		btnConvertir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double pesos = Double.valueOf(txtPesos.getText());
				double dolares =  pesos / 3800;
				txtDolares.setText(String.valueOf(dolares));
			}
		});
		btnConvertir.setBounds(157, 146, 85, 21);
		contentPane.add(btnConvertir);
	}
}
