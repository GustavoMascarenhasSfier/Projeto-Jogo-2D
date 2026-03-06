package Desafio2;

import java.awt.Color;

import javax.swing.JPanel;

public class painel extends JPanel {
	public painel(int LargMoldura, int AlturaMoldura) {
		System.out.println("Painel cirado");
		int posX = 100, posY = 100;

		int largura = 80, altura = 120;
		posX = LargMoldura/2 - largura/2;
		posY = AlturaMoldura/2 - altura/2;
		this.setLocation(posX, posY);
		this.setSize(largura, altura);
		this.setBackground(Color.YELLOW);
	}

}