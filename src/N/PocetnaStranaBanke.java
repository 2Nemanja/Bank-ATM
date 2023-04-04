package N;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PocetnaStranaBanke extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	static JTextField tBankovniBudzet;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PocetnaStranaBanke frame = new PocetnaStranaBanke();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	
	}
	
	public static int BB;
	
	/**
	 * Create the frame.
	 */
	public PocetnaStranaBanke() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 855, 413);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(430, 10, 1, 1);
		panel.setLayout(null);
		panel.setForeground(new Color(0, 64, 128));
		panel.setBackground(new Color(64, 128, 128));
		contentPane.add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(80, 88, 87));
		panel_1.setBounds(0, 0, 863, 61);
		panel.add(panel_1);
		
		JLabel lblNewLabel = new JLabel("N BANK");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setFont(new Font("Lato", Font.BOLD, 24));
		lblNewLabel.setBounds(345, 5, 152, 30);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Jedina prava!");
		lblNewLabel_1.setForeground(new Color(255, 153, 51));
		lblNewLabel_1.setFont(new Font("Lato", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(385, 36, 84, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nemate nalog?");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Lato", Font.PLAIN, 17));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setBounds(52, 237, 123, 20);
		panel.add(lblNewLabel_2);
		
		JButton btnNapraviNalog = new JButton("NAPRAVI NALOG");
		btnNapraviNalog.setForeground(new Color(255, 153, 51));
		btnNapraviNalog.setFont(new Font("Lato", Font.PLAIN, 18));
		btnNapraviNalog.setBackground(new Color(253, 245, 230));
		btnNapraviNalog.setBounds(52, 268, 189, 32);
		panel.add(btnNapraviNalog);
		
		JButton btnPrijaviSe = new JButton("PRIJAVI SE");
		btnPrijaviSe.setForeground(new Color(255, 153, 51));
		btnPrijaviSe.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPrijaviSe.setBackground(new Color(253, 245, 230));
		btnPrijaviSe.setBounds(366, 179, 146, 32);
		panel.add(btnPrijaviSe);
		
		JLabel lblNewLabel_2_1 = new JLabel("Broj naloga:");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Lato", Font.PLAIN, 17));
		lblNewLabel_2_1.setBackground(Color.WHITE);
		lblNewLabel_2_1.setBounds(217, 98, 123, 20);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("PIN:");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Lato", Font.PLAIN, 17));
		lblNewLabel_2_1_1.setBackground(Color.WHITE);
		lblNewLabel_2_1_1.setBounds(217, 141, 123, 20);
		panel.add(lblNewLabel_2_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(366, 98, 144, 20);
		panel.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(366, 138, 144, 20);
		panel.add(textField_1);
		
		JLabel lblNewLabel_3 = new JLabel("Zahvalni smo Vam na poverenju!");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Lato", Font.BOLD, 30));
		lblNewLabel_3.setBounds(208, 332, 450, 42);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DOBRODOSLI U NBANK");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Lato", Font.BOLD, 30));
		lblNewLabel_4.setBounds(241, 11, 375, 50);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Kako bi zapoceli radni dan unesite kolicinu sredstava za rad");
		lblNewLabel_5.setFont(new Font("Graphie", Font.ITALIC, 18));
		lblNewLabel_5.setForeground(new Color(255, 255, 255));
		lblNewLabel_5.setBounds(43, 93, 509, 35);
		contentPane.add(lblNewLabel_5);
		
		tBankovniBudzet = new JTextField();
		tBankovniBudzet.setForeground(new Color(0, 51, 153));
		tBankovniBudzet.setFont(new Font("Graphie", Font.PLAIN, 18));
		tBankovniBudzet.setBounds(565, 99, 193, 26);
		contentPane.add(tBankovniBudzet);
		tBankovniBudzet.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Imajuci u vidu da nasa banka trenutno poseduje 5 bankomata");
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(43, 141, 466, 26);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("u vasem gradu, sredstva ce biti rasporedjena na sledeci nacin:");
		lblNewLabel_7.setForeground(new Color(255, 255, 255));
		lblNewLabel_7.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(43, 164, 466, 26);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Bankovno stanje:  (80%)");
		lblNewLabel_8.setForeground(new Color(255, 255, 255));
		lblNewLabel_8.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(565, 147, 200, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("Bankomat-1  (4%)");
		lblNewLabel_8_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_8_1.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_8_1.setBounds(565, 172, 167, 14);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("Bankomat-2  (4%)");
		lblNewLabel_8_1_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_8_1_1.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_8_1_1.setBounds(565, 197, 167, 14);
		contentPane.add(lblNewLabel_8_1_1);
		
		JLabel lblNewLabel_8_1_2 = new JLabel("Bankomat-3  (4%)");
		lblNewLabel_8_1_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_8_1_2.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_8_1_2.setBounds(565, 222, 167, 14);
		contentPane.add(lblNewLabel_8_1_2);
		
		JLabel lblNewLabel_8_1_3 = new JLabel("Bankomat-4  (4%)");
		lblNewLabel_8_1_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_8_1_3.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_8_1_3.setBounds(565, 247, 167, 14);
		contentPane.add(lblNewLabel_8_1_3);
		
		JLabel lblNewLabel_8_1_4 = new JLabel("Bankomat-5  (4%)");
		lblNewLabel_8_1_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_8_1_4.setFont(new Font("Graphie", Font.PLAIN, 16));
		lblNewLabel_8_1_4.setBounds(565, 272, 167, 14);
		contentPane.add(lblNewLabel_8_1_4);
		
		JLabel lblNewLabel_9 = new JLabel("(Bankomati se dopunjavaju kada je trenutno stanje bankomata nize od 25% unete vrednosti)");
		lblNewLabel_9.setForeground(new Color(255, 255, 255));
		lblNewLabel_9.setFont(new Font("Lato", Font.BOLD, 16));
		lblNewLabel_9.setBounds(85, 309, 714, 35);
		contentPane.add(lblNewLabel_9);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setForeground(new Color(255, 153, 51));
		panel_2_1_1.setBackground(new Color(255, 153, 51));
		panel_2_1_1.setBounds(0, 414, 861, 14);
		contentPane.add(panel_2_1_1);
		
		JButton btnNastavi = new JButton("NASTAVI");
		btnNastavi.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
		});
		btnNastavi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
				try {
					int budzet=Integer.parseInt(tBankovniBudzet.getText());
					if(budzet>0)
					{
					Bankomat p1= new Bankomat(budzet*0.04, "Dragana Vranica 14");
					Bankomat p2= new Bankomat(budzet*0.04, "Pigova 24");
					Bankomat p3= new Bankomat(budzet*0.04, "Crnogorska 34");
					Bankomat p4= new Bankomat(budzet*0.04, "Cara Lazara 44");
					Bankomat p5= new Bankomat(budzet*0.04, "Obiliceva 54");
					b.add(p1);
					b.add(p2);
					b.add(p3);
					b.add(p4);
					b.add(p5);
					dispose();
					PocetnaStrana PS= new PocetnaStrana();
					PS.setVisible(true);
					}
					else if(budzet<0)
						JOptionPane.showMessageDialog(null, "Unesite pozitivnu vrednost!");
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		
		btnNastavi.setForeground(new Color(0, 51, 102));
		btnNastavi.setFont(new Font("Lato", Font.PLAIN, 18));
		btnNastavi.setBackground(SystemColor.controlHighlight);
		btnNastavi.setBounds(43, 254, 116, 32);
		contentPane.add(btnNastavi);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setForeground(new Color(255, 255, 255));
		lblNewLabel_10.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		lblNewLabel_10.setBounds(0, 0, 841, 380);
		contentPane.add(lblNewLabel_10);
	}
	
	public static ArrayList<Bankomat> b= new ArrayList<>();		
	
	
}
