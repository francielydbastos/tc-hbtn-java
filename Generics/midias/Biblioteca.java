import java.util.ArrayList;

public class Biblioteca <T extends Midia>{
    ArrayList<T> listaMidias = new ArrayList<>();

    public void adicionarMidia(T midia) {
        listaMidias.add(midia);
    }

    public ArrayList<T> obterListaMidias() {
        return listaMidias;
    }
}
