package Desafio2;
import javax.swing.JFrame;

public class moldura extends JFrame {

    public moldura(){
        int largura = 1200, altura = 600;
        int posX = 200, posY = 100;
        this.setAlwaysOnTop(true);
        this.setTitle("Capitulo 3 - paineis");
        this.setSize(largura, altura);
        this.setLocation(posX, posY);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        
        //-------------------
        painel P1 = new painel(largura, altura);
        this.add(P1);
        //-------------------
        this.setVisible(true);
    }
}