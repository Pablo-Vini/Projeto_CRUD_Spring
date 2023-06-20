package AcompanhamentoDeProjetos;

import java.awt.FlowLayout; // especifica como os componentes são organizados
import javax.swing.JFrame; // fornece recursos básicos de janela
import javax.swing.JLabel; // exibe texto e imagens
import javax.swing.SwingConstants; // constantes comuns utilizadas com Swing
import javax.swing.Icon; // interface utilizada para manipular imagens
import javax.swing.ImageIcon; // carrega imagens

public class Frame extends JFrame{
	private final JLabel label1;
	private final JLabel label2;
	private final JLabel label3;
	
	public Frame() {
		super("Testando Label");
		setLayout(new FlowLayout());
		
		label1 = new JLabel("Label with text");
		label1.setToolTipText("Esta é a Label1");
		add(label1);
		
		Icon bug = new javax.swing.ImageIcon("img.PNG");
		label2 = new JLabel("Label de Texto com Icone", bug, SwingConstants.LEFT);
		label2.setToolTipText("Esta é a Label2");
		add(label2);
		
		label3 = new JLabel();
		label3.setText("Esta é uma Label com Icone e um Botao");
		label3.setIcon(bug);
		label3.setHorizontalTextPosition(SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		label3.setToolTipText("Esta é a Label3");
		add(label3);
		
	}
}
