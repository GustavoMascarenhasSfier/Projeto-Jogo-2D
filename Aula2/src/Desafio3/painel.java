package Desafio3;
import java.awt.Color;

import javax.swing.JPanel;

public class painel extends JPanel {
	private int posX, posY;
	private int altura, largura;
	private Color cor;
	
	public painel() {
		System.out.println("painel criado");
	}
	
	public void definePosicao(int pX, int pY) {
		this.posX = pX;
		this.posY= pY;
		this.setLocation(this.posX, this.posY);
		
	}
	
	public void defineTamanho(int L, int A) {
		this.largura = L ;
		this.altura = A;
		this.setSize(this.largura, this.altura);
	}
	
	public void defineCor(Color cor) {
		this.cor = cor;
		this.setBackground(this.cor);
		
		
	}
	

}
