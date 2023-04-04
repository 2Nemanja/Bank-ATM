package N;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PromenaPina extends JFrame {

	private JPanel contentPane;
	private JTextField tNoviPIN;
	private JTextField tPonovi;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PromenaPina frame = new PromenaPina();
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
	public PromenaPina() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 256);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 686, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("PROMENI PIN");
		lblNewLabel.setBounds(264, 11, 157, 30);
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Lato", Font.BOLD, 24));
		panel.add(lblNewLabel);
		
		JLabel Strelica = new JLabel("");
		Strelica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				OstaleOpcije OO=new OstaleOpcije();
				OO.setVisible(true);
			}
		});
		Strelica.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\arrow (2) 1.png"));
		Strelica.setForeground(Color.WHITE);
		Strelica.setFont(new Font("Lato", Font.BOLD, 17));
		Strelica.setBackground(Color.WHITE);
		Strelica.setBounds(10, 9, 24, 32);
		panel.add(Strelica);
		
		JLabel Home = new JLabel("");
		Home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				PocetnaStrana PS= new PocetnaStrana();
				PS.setVisible(true);
			}
		});
		Home.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\home 1.png"));
		Home.setForeground(Color.WHITE);
		Home.setFont(new Font("Lato", Font.BOLD, 17));
		Home.setBackground(Color.WHITE);
		Home.setBounds(644, 6, 32, 35);
		panel.add(Home);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Novi PIN:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(85, 90, 86, 33);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Ponovi:");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1_1_1_1.setBounds(85, 134, 86, 33);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		tNoviPIN = new JTextField();
		tNoviPIN.setFont(new Font("Lato", Font.PLAIN, 14));
		tNoviPIN.setBounds(181, 98, 86, 20);
		contentPane.add(tNoviPIN);
		tNoviPIN.setColumns(10);
		
		tPonovi = new JTextField();
		tPonovi.setFont(new Font("Lato", Font.PLAIN, 14));
		tPonovi.setColumns(10);
		tPonovi.setBounds(181, 142, 86, 20);
		contentPane.add(tPonovi);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(0, 205, 686, 14);
		contentPane.add(panel_1);
		
		JButton btnPromeni = new JButton("PROMENI");
		btnPromeni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int noviPIN=Integer.parseInt(tNoviPIN.getText());
				int ponoviPIN=Integer.parseInt(tPonovi.getText());
			
				if(noviPIN==ponoviPIN)
				{
					for(Nalog i:PIN.n)
					{
						PocetnaStrana.t.get(0).setPin(noviPIN);
						i.setPIN(noviPIN);
						JOptionPane.showMessageDialog(null, "USPESNO PROMENJEN PIN!" + "\n\nVas PIN Ce Od Sada Biti: " + PocetnaStrana.t.get(0).getPin());

					}
					dispose();
					PocetnaStrana PS= new PocetnaStrana();
					PS.setVisible(true);
				}
				else if (noviPIN!=ponoviPIN)
					JOptionPane.showMessageDialog(null, "Untei PIN-ovi se ne podudaraju!");
				
			}
		});
		btnPromeni.setForeground(new Color(0, 51, 102));
		btnPromeni.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPromeni.setBackground(SystemColor.controlHighlight);
		btnPromeni.setBounds(440, 111, 124, 32);
		contentPane.add(btnPromeni);
	}
}
