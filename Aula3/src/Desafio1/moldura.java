package Desafio1;
import javax.swing.BoxLayout;
import javax.swing.JFrame;

public class moldura extends JFrame{
    public moldura() {
    	this.setTitle("Cap 4- Formas geométricas");
    	this.setAlwaysOnTop(true);
    	this.setSize(500,500);
    	this.setResizable(false);
    	this.setLayout(new BoxLayout(this.getContentPane(), BoxLayout.Y_AXIS));//Y_AXIS define o eixo principal 
    	this.setLocationRelativeTo(null);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	//cria paineis
		painel P1 = new painel(1);
		 painel P2 = new painel(2);
		 //adiciona paineis na moldura
		 this.add(P1);//painel vermelho
		 this.add(P2);//painel pink
    	this.pack();
    	this.setVisible(true);
    	
    }
    
    

   
}
