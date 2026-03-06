package Desafio1;

import javax.swing.JFrame;

public class moldura extends JFrame{
    private String Titulo;
    private JFrame MolduraMae;
    private int Altura = 0;
    private int Largura = 0;

    public moldura(String Titulo) {
        this.Titulo = Titulo;
        setExtendedState(JFrame.MAXIMIZED_BOTH); // tela cheia
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Inicializar();
    }

    public moldura(String Titulo, JFrame MolduraMae, int L, int A) {
        this.Titulo = Titulo;
        this.MolduraMae = MolduraMae;
        this.Altura = A;
        this.Largura = L;
        setSize(this.Largura, this.Altura);
        setLocationRelativeTo(this.MolduraMae);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        Inicializar();
    }

    private void Inicializar() {
        setTitle(this.Titulo);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
