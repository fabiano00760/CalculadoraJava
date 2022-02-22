package Calcula2;

import javax.swing.JOptionPane;

public class MetodoCalcular  {
	
	int num1;
	int num2;
	int result;
	
	public void somar() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		result = num1+num2;
		JOptionPane.showMessageDialog(null, "O resultado da soma é: " + result);
	}
	
	public void subitrair() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		result = num1-num2;
		JOptionPane.showMessageDialog(null, "O resultado da subitrair é: " + result);
	}
	public void multiplicar() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));
		result = num1*num2;
		JOptionPane.showMessageDialog(null, "O resultado da multiplicar é: " + result);
		
	}
	
	public void dividir() {
		num1 = Integer.parseInt(JOptionPane.showInputDialog("digite o primeiro numero"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("digite o segundo numero"));		
		result = num1/num2;
		JOptionPane.showMessageDialog(null, "O resultado da dividir é: " + result);
		
	}
	

}
