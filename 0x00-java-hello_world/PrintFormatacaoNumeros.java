import java.text.NumberFormat;
import java.util.Locale;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        Locale localBrasil = new Locale("pt", "BR");
        System.out.println("Valor: " + NumberFormat.getCurrencyInstance(localBrasil).format(valor));
        System.out.printf("Taxa: %.2f", taxa);
        System.out.print("%");
    }
}
