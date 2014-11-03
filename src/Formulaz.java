import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Formulaz {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		JFrame zgloszenie = new JFrame("Formulaz zgloszenia");
		
		zgloszenie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zgloszenie.setSize(900,700);	
		zgloszenie.setLocation(300, 50);
		zgloszenie.setLayout(null);		// zajmuje calosc	
		zgloszenie.setResizable(false); // mozliwosc zmiany rozmiaru okna
		zgloszenie.setVisible(true);   //za pomoca tej metody mozemy zauwa¿yc okno
		
		//JPanel panel = new JPanel();
		//zgloszenie.add(panel);
		
		
		JButton wystaw = new JButton("WYSTAW ZGLOSZENIE");
		wystaw.setBounds(350, 600, 200, 40);
		wystaw.setBorder(null);
		zgloszenie.add(wystaw);
		
		
		Font f = new Font("New Times Roman", Font.BOLD, 20);
		
		
		JLabel etykieta_numeru = new JLabel("Numer dokumentu");
		etykieta_numeru.setBounds(20,10,120,40);
		zgloszenie.add(etykieta_numeru);
		
		JTextField numer_dokumentu = new JTextField();
		numer_dokumentu.setBounds(160,10,80,40);
		numer_dokumentu.setFont(f);
		numer_dokumentu.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(numer_dokumentu);
		
		JLabel etykieta_daty = new JLabel("Data");
		etykieta_daty.setBounds(530, 10, 80, 40);
		zgloszenie.add(etykieta_daty);
		
		JTextField aktualna_data = new JTextField();
		aktualna_data.setBounds(610,10,200,40);
		aktualna_data.setFont(f);
		aktualna_data.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(aktualna_data);
		
		
		JLabel etykieta_nazwy = new JLabel("Nazwa urzadzenia");
		etykieta_nazwy.setBounds(20,60,120,40);
		zgloszenie.add(etykieta_nazwy);
				
		JTextField nazwa = new JTextField();
		nazwa.setBounds(160, 60, 650, 40);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa);
		
		JLabel etykieta_modelu = new JLabel("Model");
		etykieta_modelu.setBounds(20,110,120,40);
		zgloszenie.add(etykieta_modelu);
		
		
		JTextField model = new JTextField();
		model.setBounds(160, 110, 650, 40);
		model.setFont(f);
		model.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(model);
		
		JLabel etykieta_sn = new JLabel("Numer Fabryczny");
		etykieta_sn.setBounds(20,160,200,40);
		zgloszenie.add(etykieta_sn);
		
		JTextField sn = new JTextField();
		sn.setBounds(160, 160, 400, 40);
		sn.setFont(f);
		sn.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(sn);
		
		JLabel etykieta_lokalizacji = new JLabel("Miejsce u¿ytkowania");
		etykieta_lokalizacji.setBounds(20,210, 200,40);
		zgloszenie.add(etykieta_lokalizacji);
		
		JTextField lokalizacja = new JTextField();
		lokalizacja.setBounds(160, 210, 650, 40);
		lokalizacja.setFont(f);
		lokalizacja.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(lokalizacja);
		
		JLabel etykieta_serwisu = new JLabel("Serwis");
		etykieta_serwisu.setBounds(20,260,200,40);
		zgloszenie.add(etykieta_serwisu);
		
		JTextField serwis = new JTextField();
		serwis.setBounds(160,260,650,40);
		serwis.setFont(f);
		serwis.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(serwis);
		
		JLabel rodzaj_zgloszenia = new JLabel("Rodzaj Zgloszenia");
		rodzaj_zgloszenia.setBounds(20,310,200,40);
		zgloszenie.add(rodzaj_zgloszenia);
		
		JCheckBox naprawa = new JCheckBox("Naprawa");
		naprawa.setLocation(160, 310);
		naprawa.setSelected(true);
		zgloszenie.add(naprawa);
		
		JLabel rodzaj_dokumentu = new JLabel ("Rodzaj Dokumentu");
		rodzaj_dokumentu.setBounds(20,360,200,40);
		zgloszenie.add(rodzaj_dokumentu);
		
		JLabel etykieta_opisu = new JLabel("Opis usterki");
		etykieta_opisu.setBounds(20,430,200,40);
		zgloszenie.add(etykieta_opisu);
		
		
		//JPanel opis = new JPanel();
		//opis.setLayout(null);
		//opis.setBounds(160,440,650,120);
		JTextArea opis_usterki = new JTextArea(640,110);
		JScrollPane przewijacz_opisu = new JScrollPane(opis_usterki);
		
		przewijacz_opisu.add(opis_usterki);
		opis_usterki.setLocation(650,120);
		opis_usterki.setSize(640,110);
		opis_usterki.setLineWrap(true);
		
		
		//JScrollBar przewijacz_opisu = new JScrollBar();
		
		przewijacz_opisu.setBounds(160,440,650,120);
		//przewijacz_opisu.setLocation(1,1);
		//przewijacz_opisu.setMinimumSize(new Dimension(100,100));
		//przewijacz_opisu.setPreferredSize(new Dimension(100,100));
		//przewijacz_opisu.setMaximumSize(new Dimension(100,100));
		//opis_usterki.add(przewijacz_opisu);
		
		//opis.add(opis_usterki);
		//opis.add(przewijacz_opisu);
		//zgloszenie.add(opis);
		zgloszenie.add(przewijacz_opisu);
		//zgloszenie.add(opis_usterki);
		
		
		//wersja aktualna najbardziej!!
		
		
		
	}
}



