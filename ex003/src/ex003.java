import java.awt.*;

public class ex003 {
    public static void main(String[] args) {
        Dimension tamanhoTela = Toolkit.getDefaultToolkit().getScreenSize();
        var Altura = tamanhoTela.width;
        var Largura = tamanhoTela.height;
        System.out.println("A resolução de seu monitor é " + Altura + "x" + Largura);
    }
}