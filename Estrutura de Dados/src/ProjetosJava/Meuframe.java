package ProjetosJava;


import javax.swing.JFrame;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Meuframe extends JFrame implements ActionListener{
	
	public Meuframe() {
		
		super("Programa Teste");
		
		JButton botao = new JButton("Clique");
		botao.addActionListener(this);
		
		getContentPane().add(botao);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Meuframe();

	}
	
	public void actionPerfomed(ActionEvent e) {
		System.out.println("Você clicou!");
	}

}
