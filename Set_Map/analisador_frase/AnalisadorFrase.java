import java.util.TreeMap;

public class AnalisadorFrase {

    public static TreeMap<String, Integer> contagemPalavras(String frase) {
        TreeMap<String, Integer> mapPalavras = new TreeMap<String, Integer>();

        String fraseTratada = frase.replaceAll("[?!.]", "");
        String[] palavras = fraseTratada.split(" ");

        for (String palavra : palavras) {
            //String mapPalavra = palavra.toLowerCase();
            if (mapPalavras.containsKey(palavra.toLowerCase())) {
                mapPalavras.put(palavra.toLowerCase(), mapPalavras.get(palavra.toLowerCase()) + 1);
            } else {
                mapPalavras.put(palavra.toLowerCase(), 1);
            }
        }
        return mapPalavras;
    }
}
