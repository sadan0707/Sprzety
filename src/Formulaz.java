import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;


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
		//zgloszenie.setBackground(UIManager.getColor());
		
		//JPanel panel = new JPanel();
		//zgloszenie.add(panel);
		
		//Date data = new Date();
		//int dzien = data.getTime(Calendar.DATE);
		
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
		
		JComboBox<String> serwis = new JComboBox();
		serwis.setBounds(160,260,650,40);
		serwis.setFont(f);
		//serwis.setHorizontalAlignment(JComboBox.RIGHT);
		serwis.setEditable(true);
		serwis.addItem("SIEMENS HEALTHCARE POLSKA SP. Z O.O.");
		serwis.addItem("GE HEALTHCARE POLSKA SP. Z O.O.");
		serwis.addItem("KOSMED S.A.");
		serwis.addItem("PROMED S.A.");
		serwis.addItem("DUTCHMED POLSKA SP. Z O.O.");
		serwis.addItem("DRAGER POLSKA SP. Z.O.O");
		serwis.addItem("T.M.S. SP. Z O.O.");
		serwis.addItem("PHILIPS HEALTHCARE POLSKA SP. Z O.O.");
		serwis.addItem("EKOMARK SP. Z O.O.");
		serwis.addItem("EKOMED S.A");
		serwis.addItem("ENDOELEKTRONIK SP. Z O.O.");
		serwis.addItem("MIRO S.A.");
		serwis.addItem("SYNEKTIK SP. Z O.O.");
		serwis.addItem("VARIMED SP. Z O.O.");
		serwis.addItem("HLM SERWIS SP. Z O.O.");
		serwis.addItem("MVS SP. Z O.O.");
		
		
		zgloszenie.add(serwis);
		
		JLabel rodzaj_zgloszenia = new JLabel("Rodzaj Zgloszenia");
		rodzaj_zgloszenia.setBounds(20,310,200,40);
		zgloszenie.add(rodzaj_zgloszenia);
		
		ButtonGroup przelacznik1 = new ButtonGroup();
				
		JRadioButton naprawa = new JRadioButton("Naprawa");
		naprawa.setBounds(200, 320, 160, 20);
		naprawa.setSelected(false);
		przelacznik1.add(naprawa);
		zgloszenie.add(naprawa);
		
		JRadioButton przeglad = new JRadioButton("Przeglad");
		przeglad.setBounds(400, 320, 160, 20);
		przeglad.setSelected(false);
		przelacznik1.add(przeglad);
		zgloszenie.add(przeglad);
		
		
		
		JLabel rodzaj_dokumentu = new JLabel ("Rodzaj Dokumentu");
		rodzaj_dokumentu.setBounds(20,360,200,40);
		zgloszenie.add(rodzaj_dokumentu);
		
		ButtonGroup przelacznik2 = new ButtonGroup();
		
		JRadioButton zapytanie = new JRadioButton("Zapytanie o ofertê");
		zapytanie.setBounds(200, 370, 160, 20);
		zapytanie.setSelected(false);
		przelacznik2.add(zapytanie);
		zgloszenie.add(zapytanie);
		
		JRadioButton zlecenie = new JRadioButton("Zlecenie");
		zlecenie.setBounds(400, 370, 160, 20);
		zlecenie.setSelected(false);
		przelacznik2.add(zlecenie);
		zgloszenie.add(zlecenie);
		
		JLabel etykieta_opisu = new JLabel("Opis usterki");
		etykieta_opisu.setBounds(20,430,200,40);
		zgloszenie.add(etykieta_opisu);
		
		
		
		JTextArea opis_usterki = new JTextArea();
		opis_usterki.setLineWrap(true);
		//opis_usterki.setEditable(false);
		
		JScrollPane przewijacz_opisu = new JScrollPane(opis_usterki);
		przewijacz_opisu.setBounds(160,440,650,140);
		
		zgloszenie.add(przewijacz_opisu, BorderLayout.EAST);
		
		
		
	}
}



