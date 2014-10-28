import java.awt.*;
import java.awt.event.*;
import java.beans.*;

import javax.swing.*;



public class Tabelka {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				JFrame frame = new RamkaTabelkiSprzetu();
				frame.setTitle("Wykaz Sprzêtu");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
		

	}

}

class RamkaTabelkiSprzetu extends JFrame {

	
	private String[] nazwyKolumn = { 
			"Lokalizacja", "Nazwa Aparatury", "Rodzaj", "Model", 
			"Numer Fabr sn", "Producent", "Rok Produkcji", 
			"Data uruchomienia", "Serwis", 
			"Modernizacja", "Kod tech", 
			"Poprzedni Przeglad", 
			"Nastepny Przeglad", "Zaznacz" };
	
	private Object [][] komorki = {{"PRACOWNIA TOMOGRAFII KOMPUTEROWEJ","TOMOGRAF KOMPUTEROWY (CT)",
		"64-RZÊDOWY", "AQUILION 64", "","TOSHIBA MEDICAL SYSTEMS", "2013","26.03.2013","TMS SP. Z O.O.",
		"TAK", "","","",false},
	{"PRACOWNIA REZONANSU MAGNETYCZNEGO","REZONANS MAGNETYCZNY (MRI)",
		"1,5 TESLA", "EXCELART VANTAGE ATLAS-Z", "","TOSHIBA MEDICAL SYSTEMS", "2008","17.12.2008","TMS SP. Z O.O.",
		"TAK", "","","",true}
	};
	
	public RamkaTabelkiSprzetu()
	{
		final JTable tabelka = new JTable(komorki, nazwyKolumn);
		tabelka.setAutoCreateRowSorter(true);
		tabelka.setFillsViewportHeight(true);
		JScrollPane przewijacz = new JScrollPane(tabelka);
		add(przewijacz, BorderLayout.CENTER);
		
		
		JButton przyciskDrukuj = new JButton("Drukuj Tabelke");
		przyciskDrukuj.addActionListener(EventHandler.create(ActionListener.class, tabelka, "print"));
		JPanel panelPrzycisku = new JPanel();
		panelPrzycisku.add(przyciskDrukuj);
		add(panelPrzycisku, BorderLayout.SOUTH);
		pack();
	}



	
}

