package Desafio2;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class painel extends JPanel {
	private int idPosicao;
	private int largura, altura;
	private Color CorDeFundo;
	
	 painel(int Id_Posicao) {
		 this.idPosicao = Id_Posicao;
		if(Id_Posicao == 1 ) {
			this.largura = 500;
			this.altura = 400;
			this.CorDeFundo = Color.red;
		} else {
			this.largura = 500;
			this.altura = 100;
			this.CorDeFundo = Color.BLACK;
			
		}
		this.setPreferredSize(new Dimension(this.largura, this.altura));
		this.setBackground(this.CorDeFundo);
	}
	
	public void paintComponent(Graphics desenho) {
		Graphics2D desenho2D = (Graphics2D) desenho;
		//moldura.fillRect(200, 50, 150, 50); // Substitua o X por 200 e o Y por 50;|Substitua o L por 150 e o A por 50;|desenhe um retângulo preenchido
		 {
			 
			desenho.setColor(this.getBackground());
			desenho.fillRect(0 ,0, this.getWidth(), this.getHeight());
			if(this.idPosicao == 1) {
				//texto
				
				 Font fonte1 = new Font ("TimesRoman", Font.BOLD, 20);

				 desenho.setColor(Color.black);
				 desenho.setFont(fonte1);
				 desenho2D.drawString("Autor: Gustavo Mascarenhas", 100, 50);
				 
				//quadrado vermelho
				desenho.setColor(Color.WHITE);
				desenho.fillRect(130, 130, 100, 100);
				//circulo azul 
				desenho.setColor(Color.blue);
				 desenho.fillOval(0, 0, 30, 30);
				 //circulo COM BORDA PRETA NO QUADRADO 
				 desenho.setColor(Color.BLACK);
				 desenho.drawOval(130, 130, 100, 100);
				 
				 //Triangulo 1
				 int[] pontosX_T1 = {100,170,135};
				 int[] pontosY_T1 = {280,280,360};

				 desenho.fillPolygon(pontosX_T1, pontosY_T1, 3);
				 
				 desenho2D.setStroke(new BasicStroke(3));
				 desenho2D.setColor(Color.WHITE);
				 desenho2D.drawPolygon(pontosX_T1, pontosY_T1, 3);
				 
				//Triangulo 2
				 int[] pontosX_T2 = {400,350,455};
				 int[] pontosY_T2 = { 80,310,310};
				 desenho.fillPolygon(pontosX_T2, pontosY_T2, 3);
				 desenho2D.setStroke(new BasicStroke(3));
				 desenho2D.setColor(Color.BLACK);
				 desenho2D.drawPolygon(pontosX_T2, pontosY_T2, 3);
				 
				//QUADRADO PARA O ARCO
				 desenho2D.setColor(Color.CYAN);
				 desenho2D.fillRect(250, 250, 120, 120);
				 //dois arcos preenchidos de cores diferentes
				 desenho2D.setStroke(new BasicStroke(3));
				 desenho2D.setColor(Color.blue);
				 desenho2D.drawRect(250, 250, 120, 120);
				 
				 //Arcos com ou sem preenchimento
				 desenho.setColor(Color.PINK);
				 desenho.drawArc(0, 0, 70, 50, 0, 180);
				 desenho2D.setStroke(new BasicStroke(1));//largura
				 desenho.setColor(Color.yellow);
				 desenho.drawArc(220, 250, 60, 100, 0, -180);
				
			}else {
				desenho.setColor(Color.WHITE);
				desenho.drawRect(10, 10, 50, 70);
				
				// triângulo equilátero somente borda 
				desenho.setColor(Color.yellow);
				int[] pontosX_T3 = {10, 60, 35};
				 int[] pontosY_T3 = {10, 10, 45};
				 desenho.drawPolygon(pontosX_T3, pontosY_T3, 3);
			

				 
				// triângulo equilátero preenchido 
				 desenho.setColor(Color.yellow);
				 int[] pontosX_T4 = {10, 60, 35};
				 int[] pontosY_T4 = {80, 80, 45};
				 desenho.fillPolygon(pontosX_T4, pontosY_T4, 3);
				
				
				
				//Desenhando Linhas 
				desenho.setColor(Color.CYAN);
				desenho.drawLine(0, 0, this.getWidth(), this.getHeight());
				desenho.setColor(Color.ORANGE);
				desenho.drawLine(0, this.getHeight(), this.getWidth(), 0);
				
				//círculo amarelo 
				 desenho.setColor(Color.YELLOW);
				 desenho.fillOval(250, -25, 50, 50);
				 
				 desenho.setColor(Color.magenta);
				 desenho.fillOval(300, 25, 70, 50); 
				 
				 // QUADRADO PARA O ARCO
				 desenho2D.setColor(Color.red);
				 desenho2D.fillRect(90, 10, 70, 70);
				 // arcos preenchidos de cores diferentes
				 desenho2D.setStroke(new BasicStroke(3));
				 desenho2D.setColor(Color.WHITE);
				 desenho2D.drawRect(90, 10, 70, 70);

			}
			
		}
	}
}