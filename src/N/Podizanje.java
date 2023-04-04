package N;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.SystemColor;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Podizanje extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void NewScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Podizanje frame = new Podizanje();
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
	public Podizanje() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 472);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(64, 128, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
		Home.setBounds(799, 11, 32, 35);
		contentPane.add(Home);
		
		JLabel Strelica = new JLabel("");
		Strelica.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				Raskrsnica R= new Raskrsnica();
				R.setVisible(true);
			}
		});
		Strelica.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\arrow (2) 1.png"));
		Strelica.setForeground(Color.WHITE);
		Strelica.setFont(new Font("Lato", Font.BOLD, 17));
		Strelica.setBackground(Color.WHITE);
		Strelica.setBounds(10, 11, 24, 32);
		contentPane.add(Strelica);
		
		JLabel lblNewLabel = new JLabel("Odaberite bankomat sa kojeg zelite podici novac:");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Graphie", Font.BOLD, 28));
		lblNewLabel.setBounds(81, 58, 655, 41);
		contentPane.add(lblNewLabel);
		
		JCheckBox cbBankomat11 = new JCheckBox("");
		cbBankomat11.setBounds(118, 111, 21, 21);
		contentPane.add(cbBankomat11);
		
		JLabel lblNewLabel_1 = new JLabel("Bankomat-1  (Dragana Vranica 14)");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setFont(new Font("Lato", Font.BOLD, 20));
		lblNewLabel_1.setBounds(154, 110, 328, 23);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox cbBankomat2 = new JCheckBox("");
		cbBankomat2.setBounds(118, 141, 21, 21);
		contentPane.add(cbBankomat2);
		
		JCheckBox cbBankomat3 = new JCheckBox("");
		cbBankomat3.setBounds(118, 175, 21, 21);
		contentPane.add(cbBankomat3);
		
		JCheckBox cbBankomat4 = new JCheckBox("");
		cbBankomat4.setBounds(118, 210, 21, 21);
		contentPane.add(cbBankomat4);
		
		JCheckBox cbBankomat5 = new JCheckBox("");
		cbBankomat5.setBounds(118, 246, 21, 21);
		contentPane.add(cbBankomat5);
		
		JLabel lblNewLabel_1_1 = new JLabel("Bankomat-2  (Dragana Vranica 24)");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Lato", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(154, 139, 309, 23);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Bankomat-3  (Dragana Vranica 34)");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Lato", Font.BOLD, 20));
		lblNewLabel_1_2.setBounds(154, 173, 309, 23);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Bankomat-4  (Dragana Vranica 44)");
		lblNewLabel_1_3.setForeground(Color.WHITE);
		lblNewLabel_1_3.setFont(new Font("Lato", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(154, 208, 309, 23);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Bankomat-5  (Dragana Vranica 54)");
		lblNewLabel_1_4.setForeground(Color.WHITE);
		lblNewLabel_1_4.setFont(new Font("Lato", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(154, 244, 309, 23);
		contentPane.add(lblNewLabel_1_4);
		
		JPanel panel = new JPanel();
		panel.setBounds(81, 349, 623, 4);
		contentPane.add(panel);
		
	 ButtonGroup bankomati = new ButtonGroup();
	 bankomati.add(cbBankomat11);
	 bankomati.add(cbBankomat2);
	 bankomati.add(cbBankomat3);
	 bankomati.add(cbBankomat4);
	 bankomati.add(cbBankomat5);
	 
			 
		
		JButton btnPodigni = new JButton("PODIGNI");
		btnPodigni.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean B1 = cbBankomat11.isSelected();
				boolean B2 = cbBankomat2.isSelected();
				boolean B3 = cbBankomat3.isSelected();
				boolean B4 = cbBankomat4.isSelected();
				boolean B5 = cbBankomat5.isSelected();
				double z;
				
				try {
					if(B1 && (PocetnaStranaBanke.b.get(0).getNovacNaRaspolaganju()>= Integer.valueOf(Raskrsnica.tPodizetNovac.getText())))
					{
						PocetnaStranaBanke.b.get(0).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(0).getNovacNaRaspolaganju()-Integer.valueOf(Raskrsnica.tPodizetNovac.getText()));
						for(Trenutni y:PocetnaStrana.t)
							for(Nalog x:PIN.n)
							{
								if(y.getBrojNaloga()==x.getBrojNaloga())
								{
									z=y.getKes() - Integer.valueOf(Raskrsnica.tPodizetNovac.getText());
									y.setKes(z);
									x.setNaKartici(z);
									JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!"  + "\n\n" + "Sa bankomata: B1" + "\n" + "Podignuto: " + Integer.valueOf(Raskrsnica.tPodizetNovac.getText()) + "\n" + "Ostalo na B1: " + PocetnaStranaBanke.b.get(0).getNovacNaRaspolaganju()  + "\n" +  "Na Racunu: " + x.getNaKartici() + "\n\n");
								}	

							}
						if(PocetnaStranaBanke.b.get(0).getNovacNaRaspolaganju()<10000)
						{
							JOptionPane.showMessageDialog(null, "Sredstva ovog bankomata su pri kraju\n");
							Banka.setIznoss(Banka.getIznoss()-100000);
							PocetnaStranaBanke.b.get(0).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(0).getNovacNaRaspolaganju()+100000);
							JOptionPane.showMessageDialog(null, "Bankomat je upravo dopunjen iznosom od 100000din");
						}
					}
					if(B2 && (PocetnaStranaBanke.b.get(1).getNovacNaRaspolaganju()>= Integer.valueOf(Raskrsnica.tPodizetNovac.getText())))
					{
						PocetnaStranaBanke.b.get(1).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(1).getNovacNaRaspolaganju()-Integer.valueOf(Raskrsnica.tPodizetNovac.getText()));
						for(Trenutni y:PocetnaStrana.t)
							for(Nalog x:PIN.n)
							{
								if(y.getBrojNaloga()==x.getBrojNaloga())
								{
									z=x.getNaKartici() - Integer.valueOf(Raskrsnica.tPodizetNovac.getText());
									x.setNaKartici(z);
									y.setKes(z);
									JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!"  + "\n\n" + "Sa bankomata: B2" + "\n" + "Podignuto: " + Integer.valueOf(Raskrsnica.tPodizetNovac.getText()) + "\n" + "Ostalo na B2: " + PocetnaStranaBanke.b.get(1).getNovacNaRaspolaganju()  + "\n" +  "Na Racunu: " + z + "\n\n");
								}	

							}
						if(PocetnaStranaBanke.b.get(1).getNovacNaRaspolaganju()<10000)
						{
							JOptionPane.showMessageDialog(null, "Sredstva ovog bankomata su pri kraju\n");
							Banka.setIznoss(Banka.getIznoss()-100000);
							PocetnaStranaBanke.b.get(1).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(1).getNovacNaRaspolaganju()+100000);
							JOptionPane.showMessageDialog(null, "Bankomat je upravo dopunjen iznosom od 100000din");
						}
					}
					if(B3 && (PocetnaStranaBanke.b.get(2).getNovacNaRaspolaganju()>= Integer.valueOf(Raskrsnica.tPodizetNovac.getText())))
					{
						PocetnaStranaBanke.b.get(2).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(2).getNovacNaRaspolaganju()-Integer.valueOf(Raskrsnica.tPodizetNovac.getText()));
						for(Trenutni y:PocetnaStrana.t)
							for(Nalog x:PIN.n)
							{
								if(y.getBrojNaloga()==x.getBrojNaloga())
								{
									z=x.getNaKartici() - Integer.valueOf(Raskrsnica.tPodizetNovac.getText());
									x.setNaKartici(z);
									y.setKes(z);
									JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!"  + "\n\n" + "Sa bankomata: B3" + "\n" + "Podignuto: " + Integer.valueOf(Raskrsnica.tPodizetNovac.getText()) + "\n" + "Ostalo na B3: " + PocetnaStranaBanke.b.get(2).getNovacNaRaspolaganju()  + "\n" +  "Na Racunu: " + z + "\n\n");
								}	

							}
						if(PocetnaStranaBanke.b.get(2).getNovacNaRaspolaganju()<10000)
						{
							JOptionPane.showMessageDialog(null, "Sredstva ovog bankomata su pri kraju\n");
							Banka.setIznoss(Banka.getIznoss()-100000);
							PocetnaStranaBanke.b.get(2).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(2).getNovacNaRaspolaganju()+100000);
							JOptionPane.showMessageDialog(null, "Bankomat je upravo dopunjen iznosom od 100000din");
						}
					}
					if(B4 && (PocetnaStranaBanke.b.get(3).getNovacNaRaspolaganju()>= Integer.valueOf(Raskrsnica.tPodizetNovac.getText())))
					{
						PocetnaStranaBanke.b.get(3).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(3).getNovacNaRaspolaganju()-Integer.valueOf(Raskrsnica.tPodizetNovac.getText()));
						for(Trenutni y:PocetnaStrana.t)
							for(Nalog x:PIN.n)
							{
								if(y.getBrojNaloga()==x.getBrojNaloga())
								{
									z=x.getNaKartici() - Integer.valueOf(Raskrsnica.tPodizetNovac.getText());
									x.setNaKartici(z);
									y.setKes(z);
									JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!"  + "\n\n" + "Sa bankomata: B4" + "\n" + "Podignuto: " + Integer.valueOf(Raskrsnica.tPodizetNovac.getText()) + "\n" + "Ostalo na B4: " + PocetnaStranaBanke.b.get(3).getNovacNaRaspolaganju()  + "\n" +  "Na Racunu: " + z + "\n\n");
								}	

							}
						if(PocetnaStranaBanke.b.get(3).getNovacNaRaspolaganju()<10000)
						{
							JOptionPane.showMessageDialog(null, "Sredstva ovog bankomata su pri kraju\n");
							Banka.setIznoss(Banka.getIznoss()-100000);
							PocetnaStranaBanke.b.get(3).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(3).getNovacNaRaspolaganju()+100000);
							JOptionPane.showMessageDialog(null, "Bankomat je upravo dopunjen iznosom od 100000din");
						}
					}
					if(B5 && (PocetnaStranaBanke.b.get(0).getNovacNaRaspolaganju()>= Integer.valueOf(Raskrsnica.tPodizetNovac.getText())))
					{
						PocetnaStranaBanke.b.get(4).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(4).getNovacNaRaspolaganju()-Integer.valueOf(Raskrsnica.tPodizetNovac.getText()));
						for(Trenutni y:PocetnaStrana.t)
							for(Nalog x:PIN.n)
							{
								if(y.getBrojNaloga()==x.getBrojNaloga())
								{
									z=x.getNaKartici() - Integer.valueOf(Raskrsnica.tPodizetNovac.getText());
									x.setNaKartici(z);
									y.setKes(z);
									JOptionPane.showMessageDialog(null, "USPESNA TRANSAKCIJA!"  + "\n\n" + "Sa bankomata: B5" + "\n" + "Podignuto: " + Integer.valueOf(Raskrsnica.tPodizetNovac.getText()) + "\n" + "Ostalo na B5: " + PocetnaStranaBanke.b.get(4).getNovacNaRaspolaganju()  + "\n" +  "Na Racunu: " + z + "\n\n");
								}	

							}
						if(PocetnaStranaBanke.b.get(4).getNovacNaRaspolaganju()<10000)
						{
							JOptionPane.showMessageDialog(null, "Sredstva ovog bankomata su pri kraju\n");
							Banka.setIznoss(Banka.getIznoss()-100000);
							PocetnaStranaBanke.b.get(4).setNovacNaRaspolaganju(PocetnaStranaBanke.b.get(4).getNovacNaRaspolaganju()+100000);
							JOptionPane.showMessageDialog(null, "Bankomat je upravo dopunjen iznosom od 100000din");
						}
					}
					
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(null, "Nemoguce je podici zeljenu sumu sa ovog bankomata, ");
				}
			}
		});
		btnPodigni.setForeground(new Color(0, 51, 102));
		btnPodigni.setFont(new Font("Lato", Font.PLAIN, 18));
		btnPodigni.setBackground(SystemColor.controlHighlight);
		btnPodigni.setBounds(582, 293, 116, 32);
		contentPane.add(btnPodigni);
		
		JLabel cbBankomat1 = new JLabel("");
		cbBankomat1.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\pozadinaprava.png"));
		cbBankomat1.setBounds(0, -13, 841, 461);
		contentPane.add(cbBankomat1);
	}
}
