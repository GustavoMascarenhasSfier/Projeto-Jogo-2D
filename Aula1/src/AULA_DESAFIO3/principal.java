package AULA_DESAFIO3;
import javax.swing.JFrame;

public class principal {

	public static void main(String[] args) {
		JFrame Moldura = new JFrame();
		
		String Titulo = "Capitulo 2 - Java";
		
		int Largura = 700;
		int Altura = 300;
		
		int posX = 200;
		int posY = 300;
		
		Moldura.setTitle(Titulo);
		
		Moldura.setSize(Largura, Altura);
		Moldura.setLocation(posX, posY);
		
		Moldura.setResizable(false);
		Moldura.setAlwaysOnTop(true);
		Moldura.setVisible(true);
		
	}

}