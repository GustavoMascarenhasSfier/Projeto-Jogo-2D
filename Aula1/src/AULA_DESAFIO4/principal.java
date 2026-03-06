package AULA_DESAFIO4;
import javax.swing.JFrame;

public class principal {

	public static void main(String[] args) {
		
		String Titulo = "Capitulo 2 - Java";
		
		// -------------- MOLDURA 1 --------------
		
		JFrame Moldura1 = new JFrame();
		
		Moldura1.setTitle(Titulo);
		
		Moldura1.setLocationRelativeTo(null);
		Moldura1.setResizable(false);
		Moldura1.setExtendedState(JFrame.MAXIMIZED_BOTH);
		Moldura1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Moldura1.setAlwaysOnTop(true);
		Moldura1.setVisible(true);
		
		// -------------- MOLDURA 2 --------------
		
		
		JFrame Moldura2 = new JFrame();
		
		int Largura = 500;
		int Altura = 500;
		int posX = 400;
		int posY = 300;
		
		Moldura2.setTitle(Titulo);
		
		Moldura2.setSize(Largura, Altura);
		Moldura2.setLocation(posX, posY);
		Moldura2.setLocationRelativeTo(Moldura1);
		
		Moldura2.setResizable(false);
		Moldura2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		Moldura2.setAlwaysOnTop(true);
		Moldura2.setVisible(true);
		
	}

}
