package N;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JToolBar;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Prebaci extends JFrame {

	private JPanel contentPane;
	private final JPanel panel = new JPanel();
	private JTextField tBRNPrebaci;
	private JTextField tZeljeniIznos;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prebaci frame = new Prebaci();
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
	public Prebaci() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 860, 479);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPrebaci = new JButton("PREBACI");
		btnPrebaci.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNPrebaci.getText());
				int kolicina=Integer.parseInt(tZeljeniIznos.getText());
				
				for(Nalog i:PIN.n)
				{
			
					if(brn==i.getBrojNaloga() && kolicina>0)
					{
						double z=i.getNaKartici();
						if(PocetnaStrana.t.get(0).getKes()<kolicina)
							JOptionPane.showMessageDialog(null, "Nemate dovoljno novca!");
						else
						{
							
						
						for(Nalog x:PIN.n)
						{
							
							
							 if(PocetnaStrana.t.get(0).getBrojNaloga()==x.getBrojNaloga())
							{
								x.setNaKartici(PocetnaStrana.t.get(0).getKes()-kolicina);
								PocetnaStrana.t.get(0).setKes(x.getNaKartici());
								z+=kolicina;
								i.setNaKartici(z);
								JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!\n\n" + "Sa Naloga: " + PocetnaStrana.t.get(0).getBrojNaloga() + "\nPrebaceno: " + kolicina + "\nNa Nalog: " + i.getBrojNaloga() + "\nStanje: " + PocetnaStrana.t.get(0).getKes());

							}
							
						}
						}
					}
				}
				
			}
		});
		btnPrebaci.setForeground(new Color(0, 51, 102));
		btnPrebaci.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPrebaci.setBackground(SystemColor.controlHighlight);
		btnPrebaci.setBounds(576, 338, 161, 32);
		contentPane.add(btnPrebaci);
		panel.setBackground(SystemColor.windowBorder);
		panel.setBounds(0, 0, 846, 70);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\Logo banke 1.png"));
		lblNewLabel.setBounds(342, 11, 160, 48);
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
		Strelica.setBounds(10, 11, 24, 32);
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
		Home.setBounds(804, 8, 32, 35);
		panel.add(Home);
		
		JLabel lblNewLabel_1 = new JLabel("Broj naloga na koji zelite da prebacite novac:");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(99, 122, 364, 33);
		contentPane.add(lblNewLabel_1);
		
		tBRNPrebaci = new JTextField();
		tBRNPrebaci.setFont(new Font("Lato", Font.PLAIN, 14));
		tBRNPrebaci.setBounds(480, 130, 129, 20);
		contentPane.add(tBRNPrebaci);
		tBRNPrebaci.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Iznos:");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(99, 176, 53, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btn1000din = new JButton("1000din");
		btn1000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNPrebaci.getText());
				
				for(Nalog i:PIN.n)
				{
					if(brn==i.getBrojNaloga())
					{
						double z=i.getNaKartici();
						for(Nalog x:PIN.n)
						{
							if(PocetnaStrana.t.get(0).getKes()<1000)
							{
								JOptionPane.showMessageDialog(null, "Nemate dovoljno novca!");
							break;
							}
							
							else if(PocetnaStrana.t.get(0).getBrojNaloga()==x.getBrojNaloga())
							{
								x.setNaKartici(PocetnaStrana.t.get(0).getKes()-1000);
								PocetnaStrana.t.get(0).setKes(x.getNaKartici());
								z+=1000;
								i.setNaKartici(z);
								JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!\n\n" + "Sa Naloga: " + PocetnaStrana.t.get(0).getBrojNaloga() + "\nPrebaceno: 1000"  + "\nNa Nalog: " + i.getBrojNaloga() + "\nStanje: " + PocetnaStrana.t.get(0).getKes());
								break;
							}
							
					}
						}
				}
				
			}
			
		});
		btn1000din.setForeground(new Color(0, 51, 102));
		btn1000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn1000din.setBackground(SystemColor.controlHighlight);
		btn1000din.setBounds(213, 176, 149, 32);
		contentPane.add(btn1000din);
		
		JButton btn5000din = new JButton("5000din");
		btn5000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNPrebaci.getText());
				for(Nalog i:PIN.n)
				{
					if(brn==i.getBrojNaloga())
					{
						double z=i.getNaKartici();
						for(Nalog x:PIN.n)
						{
							if(PocetnaStrana.t.get(0).getKes()<5000)
							{
								JOptionPane.showMessageDialog(null, "Nemate dovoljno novca!");
							break;
							}
							else if(PocetnaStrana.t.get(0).getBrojNaloga()==x.getBrojNaloga())
							{
								x.setNaKartici(PocetnaStrana.t.get(0).getKes()-5000);
								PocetnaStrana.t.get(0).setKes(x.getNaKartici());
								z+=5000;
								i.setNaKartici(z);
								JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!\n\n" + "Sa Naloga: " + PocetnaStrana.t.get(0).getBrojNaloga() + "\nPrebaceno: 5000"  + "\nNa Nalog: " + i.getBrojNaloga() + "\nStanje: " + PocetnaStrana.t.get(0).getKes());

							}	
						}
						
				   }
				}
			}
		});
		btn5000din.setForeground(new Color(0, 51, 102));
		btn5000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn5000din.setBackground(SystemColor.controlHighlight);
		btn5000din.setBounds(401, 176, 149, 32);
		contentPane.add(btn5000din);
		
		JButton btn15000din = new JButton("15000din");
		btn15000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNPrebaci.getText());
				for(Nalog i:PIN.n)
				{
					if(brn==i.getBrojNaloga())
					{
						double z=i.getNaKartici();
						for(Nalog x:PIN.n)
						{
							if(PocetnaStrana.t.get(0).getKes()<15000)
							{
								JOptionPane.showMessageDialog(null, "Nemate dovoljno novca!");
							break;
							}
							
							else if(PocetnaStrana.t.get(0).getBrojNaloga()==x.getBrojNaloga())
							{
								x.setNaKartici(PocetnaStrana.t.get(0).getKes()-15000);
								PocetnaStrana.t.get(0).setKes(x.getNaKartici());
								z+=15000;
								i.setNaKartici(z);
								JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!\n\n" + "Sa Naloga: " + PocetnaStrana.t.get(0).getBrojNaloga() + "\nPrebaceno: 15000"  + "\nNa Nalog: " + i.getBrojNaloga() + "\nStanje: " + PocetnaStrana.t.get(0).getKes());

							}
							
					}
						}
				}
			}
		});
		btn15000din.setForeground(new Color(0, 51, 102));
		btn15000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn15000din.setBackground(SystemColor.controlHighlight);
		btn15000din.setBounds(213, 247, 149, 32);
		contentPane.add(btn15000din);
		
		JButton btn30000din = new JButton("30000din");
		btn30000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNPrebaci.getText());
				for(Nalog i:PIN.n)
				{
					if(brn==i.getBrojNaloga())
					{
						double z=i.getNaKartici();
						for(Nalog x:PIN.n)
						{
							if(PocetnaStrana.t.get(0).getKes()<30000)
							{
								JOptionPane.showMessageDialog(null, "Nemate dovoljno novca!");
							break;
							}
							
							else if(PocetnaStrana.t.get(0).getBrojNaloga()==x.getBrojNaloga())
							{
								x.setNaKartici(PocetnaStrana.t.get(0).getKes()-30000);
								PocetnaStrana.t.get(0).setKes(x.getNaKartici());
								z+=30000;
								i.setNaKartici(z);
								JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!\n\n" + "Sa Naloga: " + PocetnaStrana.t.get(0).getBrojNaloga() + "\nPrebaceno: 30000"  + "\nNa Nalog: " + i.getBrojNaloga() + "\nStanje: " + PocetnaStrana.t.get(0).getKes());

							}
							
					}
						}
				}
			}
		});
		btn30000din.setForeground(new Color(0, 51, 102));
		btn30000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn30000din.setBackground(SystemColor.controlHighlight);
		btn30000din.setBounds(401, 247, 149, 32);
		contentPane.add(btn30000din);
		
		JButton btn10000din = new JButton("10000din");
		btn10000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNPrebaci.getText());
				for(Nalog i:PIN.n)
				{
					if(brn==i.getBrojNaloga())
					{
						double z=i.getNaKartici();
						for(Nalog x:PIN.n)
						{
							if(PocetnaStrana.t.get(0).getKes()<10000)
							{
								JOptionPane.showMessageDialog(null, "Nemate dovoljno novca!");
							break;
							}
							if(PocetnaStrana.t.get(0).getBrojNaloga()==x.getBrojNaloga())
							{
								x.setNaKartici(PocetnaStrana.t.get(0).getKes()-10000);
								PocetnaStrana.t.get(0).setKes(x.getNaKartici());
								z+=10000;
								i.setNaKartici(z);
								JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!\n\n" + "Sa Naloga: " + PocetnaStrana.t.get(0).getBrojNaloga() + "\nPrebaceno: 10000"  + "\nNa Nalog: " + i.getBrojNaloga() + "\nStanje: " + PocetnaStrana.t.get(0).getKes());

							}
							
						}	
					}
				}
			}
		});
		btn10000din.setForeground(new Color(0, 51, 102));
		btn10000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn10000din.setBackground(SystemColor.controlHighlight);
		btn10000din.setBounds(588, 175, 149, 32);
		contentPane.add(btn10000din);
		
		JButton btn50000din = new JButton("50000din");
		btn50000din.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int brn=Integer.parseInt(tBRNPrebaci.getText());
				for(Nalog i:PIN.n)
				{
					if(brn==i.getBrojNaloga())
					{
						double z=i.getNaKartici();
						for(Nalog x:PIN.n)
						{
							if(PocetnaStrana.t.get(0).getKes()<50000)
							{
								JOptionPane.showMessageDialog(null, "Nemate dovoljno novca!");
							break;
							}
							
							else if(PocetnaStrana.t.get(0).getBrojNaloga()==x.getBrojNaloga())
							{
								x.setNaKartici(PocetnaStrana.t.get(0).getKes()-50000);
								PocetnaStrana.t.get(0).setKes(x.getNaKartici());
								z+=50000;
								i.setNaKartici(z);
								JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!\n\n" + "Sa Naloga: " + PocetnaStrana.t.get(0).getBrojNaloga() + "\nPrebaceno: 50000"  + "\nNa Nalog: " + i.getBrojNaloga() + "\nStanje: " + PocetnaStrana.t.get(0).getKes());

							}
							
						}
					}
				}
			}
		});
		btn50000din.setForeground(new Color(0, 51, 102));
		btn50000din.setFont(new Font("Lato", Font.PLAIN, 18));
		btn50000din.setBackground(SystemColor.controlHighlight);
		btn50000din.setBounds(588, 247, 149, 32);
		contentPane.add(btn50000din);
		
		JLabel lblNewLabel_1_2 = new JLabel("Upisite zeljeni iznos:");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1_2.setBounds(99, 342, 168, 33);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("ili");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Graphie", Font.PLAIN, 18));
		lblNewLabel_1_2_1.setBounds(473, 297, 12, 33);
		contentPane.add(lblNewLabel_1_2_1);
		
		tZeljeniIznos = new JTextField();
		tZeljeniIznos.setFont(new Font("Lato", Font.PLAIN, 14));
		tZeljeniIznos.setColumns(10);
		tZeljeniIznos.setBounds(277, 350, 129, 20);
		contentPane.add(tZeljeniIznos);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		lblNewLabel_2.setBounds(0, 71, 846, 371);
		contentPane.add(lblNewLabel_2);
	}
}
