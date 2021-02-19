import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ConvertidorTemperatura extends JFrame implements ActionListener{
	
	JTextArea entrada = new JTextArea();
	JTextArea salida = new JTextArea();
	JComboBox  enter = new JComboBox(); 
	JComboBox out = new JComboBox();
	
	public ConvertidorTemperatura() {
		getContentPane().setLayout(null);
		setSize(320,130);
		getContentPane().setBackground(new Color(160,230,170));
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("T1_A1_ConversionTemperaturas");
		setVisible(true);
	
		JLabel convertir = new JLabel("Convertir");
		convertir.setBounds(10, 10, 80, 20);
		add(convertir);
	
		entrada.setBounds(85, 10, 80, 20);
		add(entrada);
		
		enter.setBounds(180, 10, 110, 20);
		enter.addItem("Centigrados");
		enter.addItem("Fahrenheit");
		enter.addItem("Kelvin");
		enter.addItem("Rankine");
		add(enter);
		
		JLabel a = new JLabel("A");
		a.setBounds(10, 50, 10, 20);
		add(a);
		
		out.setBounds(30, 50, 110, 20);
		out.addItem("Centigrados");
		out.addItem("Fahrenheit");
		out.addItem("Kelvin");
		out.addItem("Rankine");
		add(out);
		
		JLabel igual = new JLabel("=");
		igual.setBounds(160, 50, 10, 20);
		add(igual);
		
		salida.setBounds(190, 50, 80, 20);
		add(salida);
	}
	

	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
	}//Listener
	
}//Class



public class PruebaConversionCalculadora {

	public static void main(String[] args) {
		
		new ConvertidorTemperatura();

	}

}
