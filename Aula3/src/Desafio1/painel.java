package Desafio1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class painel extends JPanel {
	private int  Id_P;
	private int largura, altura;
	private Color CorDeFundo;
	
	 painel(int Id_Posicao) {
		 
		if(Id_Posicao == 1 ) {
			this.largura = 500;
			this.altura = 400;
			this.CorDeFundo = Color.red;
		} else {
			this.largura = 500;
			this.altura = 100;
			this.CorDeFundo = Color.PINK;
			
		}
		this.setPreferredSize(new Dimension(this.largura, this.altura));
		this.setBackground(this.CorDeFundo);
	}
	
	public void paintComponent(Graphics desenho) {
		//moldura.fillRect(200, 50, 150, 50); // Substitua o X por 200 e o Y por 50;|Substitua o L por 150 e o A por 50;|desenhe um retângulo preenchido
		 {
			desenho.setColor(this.getBackground());
			desenho.fillRect(0 ,0, this.getWidth(), this.getHeight());
			
		}
	}
}