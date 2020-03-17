package haapala.dakota.chapter6.project;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Main {

	private JFrame frame;
	private JTextField numeratorTextField;
	private JTextField denominatorTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		numeratorTextField = new JTextField();
		numeratorTextField.setBounds(0, 64, 86, 26);
		frame.getContentPane().add(numeratorTextField);
		numeratorTextField.setColumns(10);

		denominatorTextField = new JTextField();
		denominatorTextField.setBounds(0, 125, 92, 26);
		frame.getContentPane().add(denominatorTextField);
		denominatorTextField.setColumns(10);

		JLabel lblNewLabel = new JLabel("Numerator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel.setBounds(0, 34, 92, 26);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblDenominator = new JLabel("Denominator");
		lblDenominator.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDenominator.setBounds(0, 94, 141, 26);
		frame.getContentPane().add(lblDenominator);

		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		calculateButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		calculateButton.setBounds(-6, 160, 92, 35);
		frame.getContentPane().add(calculateButton);

		JLabel resultLabel = new JLabel("");
		resultLabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		resultLabel.setBounds(95, 164, 92, 26);
		frame.getContentPane().add(resultLabel);
	

		calculateButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double numerator = Double.parseDouble(numeratorTextField.getText());
				double denominator = Double.parseDouble(denominatorTextField.getText());
				SimpleMath math = new SimpleMath();
				Double result = math.divide(numerator, denominator);
				resultLabel.setText(Double.toString(result));
				
				
			}
		});

	}
}
