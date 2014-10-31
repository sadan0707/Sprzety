import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Formulaz {

	public static void main(String[] args) {
		
		JFrame zgloszenie = new JFrame("Formulaz zgloszenia");
		
		zgloszenie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zgloszenie.setSize(700,800);	
		zgloszenie.setLocation(300, 100);
		zgloszenie.setLayout(null);		// zajmuje calosc	
		zgloszenie.setResizable(false); // mozliwosc zmiany rozmiaru okna
		zgloszenie.setVisible(true);   //za pomoca tej metody mozemy zauwa¿yc okno
		
		//JPanel panel = new JPanel();
		//zgloszenie.add(panel);
		
		
		JButton wystaw = new JButton("WYSTAW ZGLOSZENIE");
		wystaw.setBounds(250, 700, 200, 40);
		wystaw.setBorder(null);
		zgloszenie.add(wystaw);
		
		JLabel etykieta_nazwy = new JLabel("Nazwa urzadzenia");
		etykieta_nazwy.setBounds(20,10,120,40);
		zgloszenie.add(etykieta_nazwy);
		
		
		JTextField nazwa = new JTextField();
		nazwa.setBounds(20, 50, 650, 40);
		Font f = new Font("New Times Roman", Font.BOLD, 20);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa);
		
		JLabel etykieta_modelu = new JLabel("Model");
		etykieta_modelu.setBounds(20,110,120,40);
		zgloszenie.add(etykieta_modelu);
		
		
		JTextField model = new JTextField();
		model.setBounds(20, 150, 650, 40);
		model.setFont(f);
		model.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(model);
		
		JLabel etykieta_sn = new JLabel("Numer Fabryczny");
		etykieta_sn.setBounds(20,230,200,40);
		zgloszenie.add(etykieta_sn);
		
		JTextField sn = new JTextField();
		sn.setBounds(230, 230, 400, 40);
		sn.setFont(f);
		sn.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(sn);
		
		JLabel etykieta_lokalizacji = new JLabel("Miejsce u¿ytkowania");
		etykieta_lokalizacji.setBounds(20,290, 650,40);
		zgloszenie.add(etykieta_lokalizacji);
		
		
		
		//wersja aktualna najbardziej!!
		
		
		
	}
}




