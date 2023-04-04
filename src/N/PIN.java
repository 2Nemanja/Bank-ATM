package N;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PIN extends JFrame {

	protected static int brn;
	protected static int pin;
	private JPanel contentPane;
	private JTextField tPIN;
	private JTextField tNaKartici;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PIN frame = new PIN();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public static ArrayList<Nalog> n = new ArrayList<>();
	/**
	 * Create the frame.
	 */
	public PIN() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 255);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea tBRNalogaa = new JTextArea();
		tBRNalogaa.setEditable(false);
		tBRNalogaa.setText(""+PravljnjeNaloga.brojjjac());
		tBRNalogaa.setFont(new Font("Lato", Font.PLAIN, 14));
		tBRNalogaa.setBounds(205, 88, 96, 22);
		contentPane.add(tBRNalogaa);
		
		JLabel lblNewLabel = new JLabel("KORAK 2");
		lblNewLabel.setBounds(290, 10, 105, 30);
		lblNewLabel.setForeground(new Color(0, 51, 102));
		lblNewLabel.setFont(new Font("Lato", Font.BOLD, 24));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("BROJ NALOGA:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_1.setBounds(74, 91, 148, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PIN:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_1_1.setBounds(74, 124, 148, 14);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("UPLATI NOVAC:");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Lato", Font.ITALIC, 16));
		lblNewLabel_1_1_1.setBounds(74, 155, 148, 14);
		contentPane.add(lblNewLabel_1_1_1);
		
		tNaKartici = new JTextField();
		tNaKartici.setFont(new Font("Lato", Font.PLAIN, 14));
		tNaKartici.setColumns(10);
		tNaKartici.setBounds(205, 152, 96, 20);
		contentPane.add(tNaKartici);
		
		tPIN = new JTextField();
		tPIN.setFont(new Font("Lato", Font.PLAIN, 14));
		tPIN.setColumns(10);
		tPIN.setBounds(205, 121, 96, 20);
		contentPane.add(tPIN);
		
		JButton btnZavrsi = new JButton("ZAVRSI");
		btnZavrsi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int pin=Integer.parseInt(tPIN.getText().toString());
					if(pin>99 && pin<1000)
					{
					int brn=Integer.parseInt(tBRNalogaa.getText().toString());
				
					int nak=Integer.parseInt(tNaKartici.getText().toString());
					
					String ime=PravljnjeNaloga.tIme.getText().trim();
					
					String prezime=PravljnjeNaloga.tPrezime.getText().trim();
					
					String prebivaliste=PravljnjeNaloga.tPrebivaliste.getText().trim();
					
					String adresa=PravljnjeNaloga.tAdresa.getText().trim();
					
					int jmbg=Integer.parseInt(PravljnjeNaloga.tJMBG.getText());
					
					int brfona=Integer.parseInt(PravljnjeNaloga.tBRFona.getText());
					
					int brlicne=Integer.parseInt(PravljnjeNaloga.tBRLicne.getText());
					
					int postanskibr=Integer.parseInt(PravljnjeNaloga.tPostanskiBR.getText());
					
					Nalog p=new Nalog(ime,prezime, jmbg, brlicne, prebivaliste, adresa, brfona, postanskibr, brn, pin,nak);
					n.add(p);
					
					dispose();	
					PocetnaStrana PS = new PocetnaStrana();
					PS.setVisible(true);
					
					}else if(pin<100 && pin>999)
						JOptionPane.showMessageDialog(null, "PIN mora biti trocifren!");

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Nije kreiran nalog");
				}
				
			}
		});
	
		btnZavrsi.setForeground(new Color(0, 51, 102));
		btnZavrsi.setFont(new Font("Lato", Font.PLAIN, 18));
		btnZavrsi.setBackground(SystemColor.controlHighlight);
		btnZavrsi.setBounds(480, 110, 116, 32);
		contentPane.add(btnZavrsi);
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 686, 50);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("");
		lblNewLabel_2_1_1_1.setBounds(343, 25, -32, -20);
		lblNewLabel_2_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1_1.setFont(new Font("Lato", Font.BOLD, 17));
		lblNewLabel_2_1_1_1.setBackground(Color.WHITE);
		panel.add(lblNewLabel_2_1_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 153, 51));
		panel_1.setBounds(0, 204, 686, 14);
		contentPane.add(panel_1);
		

	
	}
}
