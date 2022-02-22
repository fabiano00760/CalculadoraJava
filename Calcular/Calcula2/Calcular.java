package Calcula2;

import javax.swing.JOptionPane;

import Calcula.MetodosCalcular;

public class Calcular {

	public static void main(String[] args) {
		MetodoCalcular c1 = new MetodoCalcular();
		
		int num1;
		int num2;
		String result = "";
		int escolher;

		while (true) {
			escolher = Integer.parseInt(JOptionPane.showInputDialog("Você entrou na calculadora! "
					+ "Digite 1 = somar  Digite 2 = subtrair  digite = 3 multiplicar  digite 4 = dividir"
					+ "Digite 5 = sair"));
			
			if (escolher == 1) {
				c1.somar();
				continue;

			}

			else if (escolher == 2) {
				c1.subitrair();
				continue;
				
			} else if (escolher == 3) {
				c1.multiplicar();
				continue;

			} else if (escolher == 4) {
				c1.dividir();
				continue;
				
			}else if  (escolher == 5){
				JOptionPane.showMessageDialog(null, "voce saiu da calculadora , execulte novamente para iniciar");
				break;
				
			}else {
				JOptionPane.showMessageDialog(null, " você digitou o numero invalido , digite um numero valido");
				continue;
			}
			
		}
			
		
		
	}
	    

	}

	


