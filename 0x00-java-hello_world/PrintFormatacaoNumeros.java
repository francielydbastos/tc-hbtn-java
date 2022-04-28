import java.text.NumberFormat;

public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.println(NumberFormat.getCurrencyInstance().format(valor));
        System.out.printf("Taxa: %.2f", taxa);
        System.out.print("%");
    }
}
