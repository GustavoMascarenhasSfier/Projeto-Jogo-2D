package Desafio3;
import java.awt.Color;

import javax.swing.JFrame;

public class moldura  extends JFrame {
	public moldura() {
		int largura = 600, altura = 600;
		int posX = 200, posY = 100;
		this.setAlwaysOnTop(true);
		this.setTitle("Cap 3- paineis");
		this.setSize(largura,altura);
		this.setLocation(posX, posY);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		//-------------------
		painel P1 = new painel();
		P1.definePosicao(0, 0);
		P1.defineTamanho(100, 100);
		P1.defineCor(Color.darkGray);
		this.add(P1);
		
		painel P2 = new painel();
		P2.definePosicao(100, 200 );
		P2.defineTamanho(150, 300);
		P2.defineCor(new Color(0, 255, 0));
		this.add(P2);
		
		painel P3 = new painel();
		P3.definePosicao(300, 100 );
		P3.defineTamanho(50, 50);
		P3.defineCor(new Color(0, 0, 255));
		this.add(P3);
		
		//-------------------
		this.setVisible(true);
	}

}
