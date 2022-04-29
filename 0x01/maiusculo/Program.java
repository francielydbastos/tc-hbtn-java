public class Program {
    public static void main(String[] args) {

        boolean caractereEhMaiusculo1 = Caractere.ehMaiusculo('a');
        boolean caractereEhMaiusculo2 = Caractere.ehMaiusculo('B');
        boolean caractereEhMaiusculo3 = Caractere.ehMaiusculo('d');
        boolean caractereEhMaiusculo4 = Caractere.ehMaiusculo('f');
        boolean caractereEhMaiusculo5 = Caractere.ehMaiusculo('G');

        System.out.printf("%b\n", caractereEhMaiusculo1);
        System.out.printf("%b\n", caractereEhMaiusculo2);
        System.out.printf("%b\n", caractereEhMaiusculo3);
        System.out.printf("%b\n", caractereEhMaiusculo4);
        System.out.printf("%b\n", caractereEhMaiusculo5);
    }
}
