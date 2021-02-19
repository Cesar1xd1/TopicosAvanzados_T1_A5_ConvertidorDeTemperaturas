import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.*;

class ConvertidorTemperatura extends JFrame implements ActionListener{
	
	JTextArea entrada = new JTextArea();
	JTextArea salida = new JTextArea();
	JComboBox  enter = new JComboBox(); 
	JComboBox out = new JComboBox();
	JButton limpiar = new JButton("Limpiar");
	
	public ConvertidorTemperatura() {
		getContentPane().setLayout(null);
		setSize(320,155);
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
		out.addActionListener(this);
		add(out);
		
		
		JLabel igual = new JLabel("=");
		igual.setBounds(160, 50, 10, 20);
		add(igual);
		
		salida.setBounds(190, 50, 80, 20);
		add(salida);
		
		
		limpiar.setBounds(100, 85, 100, 20);
		limpiar.addActionListener(this);
		add(limpiar);
	
	
		entrada.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent k) {
                String digitado = entrada.getText();
                int c =k.getKeyCode();
                if ((k.getKeyChar() >= '0' && k.getKeyChar() <= '9')||(!digitado.contains(".")&&k.getKeyChar()=='.')||(c==KeyEvent.VK_BACK_SPACE)) {
                    entrada.setEditable(true);
                }else{
                    entrada.setEditable(false);
                }
            }
        });
	
	}
	

	
	
	
	
	public void actionPerformed(ActionEvent e) {
		double tempeEntrada = Double.parseDouble(entrada.getText());
		double resultado = 0.0;
		if(e.getSource()==limpiar) {
			if(entrada.getText().length()!=0) {
			entrada.setText("");
			}
			if(salida.getText().length()!=0) {
				salida.setText("");
				}
		}
		
		if(e.getSource()==out) {
			//CENTIGRADOS
			if(enter.getSelectedIndex()==0) {
				//Centigrados
				if(out.getSelectedIndex()==0) {
					resultado = tempeEntrada;
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
				//Farenheit
				}else if(out.getSelectedIndex()==1) {
					resultado = (tempeEntrada * (1.8)+32);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Kelvin
				}else if(out.getSelectedIndex()==2) {
					resultado = (tempeEntrada +273.15);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Rankine
				}else if(out.getSelectedIndex()==3) {
					resultado = (tempeEntrada*(1.8) +491.67);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
				}
					//FARENHEIT
			}else if(enter.getSelectedIndex()==1) {
				//Centigrados
				if(out.getSelectedIndex()==0) {
					resultado = (tempeEntrada-32) * (0.55);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
				//Farenheit
				}else if(out.getSelectedIndex()==1) {
					resultado =tempeEntrada;
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Kelvin
				}else if(out.getSelectedIndex()==2) {
					resultado = (tempeEntrada - 32)*(0.55)+273.15;
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Rankine
				}else if(out.getSelectedIndex()==3) {
					resultado = (tempeEntrada+ 459.67);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
				}
				//KELIVN
			}else if(enter.getSelectedIndex()==2) {
				//Centigrados
				if(out.getSelectedIndex()==0) {
					resultado = (tempeEntrada - 273.15);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf((resultado)));
				//Farenheit
				}else if(out.getSelectedIndex()==1) {
					resultado =(tempeEntrada - 273.15)*(1.8)+32;
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Kelvin
				}else if(out.getSelectedIndex()==2) {
					resultado =tempeEntrada ;
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Rankine
				}else if(out.getSelectedIndex()==3) {
					resultado = (tempeEntrada - 273.15)* 1.8 + 491.67;
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
				}
				//RANKINE
			}else if(enter.getSelectedIndex()==3) {
				//Centigrados
				if(out.getSelectedIndex()==0) {
					resultado = (tempeEntrada - 491.67)*(0.55);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
				//Farenheit
				}else if(out.getSelectedIndex()==1) {
					resultado =(tempeEntrada - 459.67);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Kelvin
				}else if(out.getSelectedIndex()==2) {
					resultado =tempeEntrada*(0.55) ;
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
					//Rankine
				}else if(out.getSelectedIndex()==3) {
					resultado = (tempeEntrada);
					resultado = resultado/100.0*100.0;
					salida.setText(String.valueOf(resultado));
				}
			}
		}//IF MASTER
		
	}//Listener
	
}//Class



public class PruebaConversionCalculadora {

	public static void main(String[] args) {
		
		new ConvertidorTemperatura();

	}

}
