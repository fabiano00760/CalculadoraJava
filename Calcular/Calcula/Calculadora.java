package Calcula;

import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) {
		MetodosCalcular c1 = new MetodosCalcular();

		int escolher;

		while (true) {
			escolher = Integer.parseInt(JOptionPane.showInputDialog("Você entrou na calculadora! "
					+ "Digite 1 = somar  Digite 2 = subtrair  digite = 3 multiplicar  digite 4 = dividir"
					+ "Digite 5 = sair"));
			
			if (escolher == 1) {

				int num1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
				int num2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
				int result = c1.somar(num1, num2);

				JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
				continue;

			}

			else if (escolher == 2) {
				int num3 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
				int num4 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
				int result = c1.subtração(num3, num4);
				
				JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
				continue;
				
			} else if (escolher == 3) {
				int num5 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
				int num6 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
				int result = c1.multiplicação(num5, num6);

				JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
				continue;

			} else if (escolher == 4) {
				int num7 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
				int num8 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
				int result = c1.divisão(num7, num8);

				JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
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
