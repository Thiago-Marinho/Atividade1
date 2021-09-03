package application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import entity.Conta;
import entity.Corrente;
import entity.Poupanca;

public class Program {

	public static void main(String[] args) {

		List<Conta> list = new ArrayList<>();

		Integer Num = Integer.parseInt(JOptionPane.showInputDialog("Quantas contas quer cadastrar?"));

		for (int i = 0; i < Num; i++) {

			char Op = JOptionPane.showInputDialog("Qual Conta? (p ou c)").charAt(0);
			

			if (Op == 'p') {

				String nome = JOptionPane.showInputDialog("Poupança - Nome:");
				int conta = Integer.parseInt(JOptionPane.showInputDialog("Poupança -Conta:"));
				double saldo = Double.parseDouble(JOptionPane.showInputDialog("Poupança - Saldo:"));

				Conta n = new Poupanca(saldo, nome, conta);
				n.saque(Double.parseDouble(JOptionPane.showInputDialog("Poupança - Saque:")));
				
				System.out.println("Nome " + nome);
				System.out.println("Conta " + conta);
				System.out.println("Saldo " +n.getSaldo());
				System.out.println("----------------------");
				list.add(n);
				
			} else if (Op == 'c') {

				String nome = JOptionPane.showInputDialog("Corrente - Nome:");
				int conta = Integer.parseInt(JOptionPane.showInputDialog("Corrente - Conta:"));
				double saldo = Double.parseDouble(JOptionPane.showInputDialog("Corrente - Saldo:"));

				Conta n = new Corrente(saldo, nome, conta);
				n.saque(Double.parseDouble(JOptionPane.showInputDialog("Corrente - Saque:")));
								
				System.out.println("Nome " + nome);
				System.out.println("Conta " + conta);	
				System.out.println("Saldo " +n.getSaldo());
				System.out.println("----------------------");
				list.add(n);
				
			} else {
				JOptionPane.showMessageDialog(null, "Tipo de conta inesistente");
				i--;
			}

		}
	}
}
