import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try {
            FileOutputStream fileOut = new FileOutputStream(this.nomeArquivo);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);

            objectOut.writeObject(estudantes);
            objectOut.close();
        } catch(Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        List<Estudante> estudantesList = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(this.nomeArquivo);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            estudantesList = (List<Estudante>) objectIn.readObject();
            objectIn.close();
        } catch(Exception e) {
            System.out.println("Nao foi possivel desserializar");
        }

        return estudantesList;
    }
}
