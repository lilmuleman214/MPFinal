package swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class main extends JFrame {

	private JPanel contentPane;
	private JTextField txtTGI;
	private JTextField txtTMD;
	private JTextField txtMIR;
	private JTextField txtDP;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setBackground(Color.GREEN);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtTGI = new JTextField();
		txtTGI.setBounds(135, 61, 86, 20);
		contentPane.add(txtTGI);
		txtTGI.setColumns(10);
		
		txtTMD = new JTextField();
		txtTMD.setBounds(135, 92, 86, 20);
		contentPane.add(txtTMD);
		txtTMD.setColumns(10);
		
		txtMIR = new JTextField();
		txtMIR.setBounds(135, 123, 86, 20);
		contentPane.add(txtMIR);
		txtMIR.setColumns(10);
		
		JComboBox cmbTerm = new JComboBox();
		cmbTerm.setModel(new DefaultComboBoxModel(new String[] {"10", "15", "30"}));
		cmbTerm.setBounds(135, 154, 86, 20);
		contentPane.add(cmbTerm);
		
		txtDP = new JTextField();
		txtDP.setText("0");
		txtDP.setBounds(135, 185, 86, 20);
		contentPane.add(txtDP);
		txtDP.setColumns(10);
		
		JLabel lblTotalGrossIncome = new JLabel("Total Gross Income:");
		lblTotalGrossIncome.setBounds(10, 63, 96, 17);
		contentPane.add(lblTotalGrossIncome);
		
		JLabel lblTotalMonthlyDebt = new JLabel("Total Monthly debt:");
		lblTotalMonthlyDebt.setBounds(10, 95, 96, 14);
		contentPane.add(lblTotalMonthlyDebt);
		
		JLabel lblMortgageInterestRate = new JLabel("Mortgage Interest Rate:");
		lblMortgageInterestRate.setBounds(10, 126, 118, 14);
		contentPane.add(lblMortgageInterestRate);
		
		JLabel lblTerm = new JLabel("Term:");
		lblTerm.setBounds(10, 157, 46, 14);
		contentPane.add(lblTerm);
		
		JLabel lblDownPayment = new JLabel("Down Payment:");
		lblDownPayment.setBounds(10, 188, 96, 14);
		contentPane.add(lblDownPayment);
		
		JLabel lblHousingPayment = new JLabel("Housing Payment:");
		lblHousingPayment.setBounds(256, 64, 103, 14);
		contentPane.add(lblHousingPayment);
		
		JLabel lblHousingPayment_1 = new JLabel("Housing Payment + Other Obligations:");
		lblHousingPayment_1.setBounds(256, 126, 178, 14);
		contentPane.add(lblHousingPayment_1);
		
		JLabel lblMaximumPaymentAllowed = new JLabel("Maximum Payment Allowed:");
		lblMaximumPaymentAllowed.setBounds(256, 188, 133, 14);
		contentPane.add(lblMaximumPaymentAllowed);
		
		JLabel lblMortgagedFiananced = new JLabel("Mortgaged fiananced:");
		lblMortgagedFiananced.setBounds(256, 246, 111, 14);
		contentPane.add(lblMortgagedFiananced);
		
		JLabel lblHP = new JLabel(" ");
		lblHP.setBounds(266, 95, 46, 14);
		contentPane.add(lblHP);
		
		JLabel lblHPO = new JLabel(" ");
		lblHPO.setBounds(266, 157, 46, 14);
		contentPane.add(lblHPO);
		
		JLabel lblMPA = new JLabel(" ");
		lblMPA.setBounds(266, 220, 46, 14);
		contentPane.add(lblMPA);
		
		JLabel lblMF = new JLabel(" ");
		lblMF.setBounds(377, 246, 46, 14);
		contentPane.add(lblMF);
		
		JButton btnCalc = new JButton("Calculate");
		btnCalc.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				double totalGrossIncome = Double.parseDouble(txtTGI.getText());
				double totalMonthlyDebt = Double.parseDouble(txtTMD.getText());
				double mortgageInterestRate = Double.parseDouble(txtMIR.getText());
				//double term = Double.parseDouble(cmbTerm.getName());
				double downPayment = Double.parseDouble(txtDP.getText());
				
				double HP = totalGrossIncome * .18;
				lblHP.setText("" + HP);
				
				double HPO = totalGrossIncome * .36;
				lblHPO.setText("" + HPO);
				
				lblMPA.setText("" + HP);
			}
		});
		btnCalc.setBounds(132, 216, 89, 23);
		contentPane.add(btnCalc);
	}
}
