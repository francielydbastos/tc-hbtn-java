import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializarEstudantes<Estudante> {
    private String nomeArquivo;

    public SerializarEstudantes(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void serializar(List<Estudante> estudantes) {
        try (ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(this.nomeArquivo))){
            objectOut.writeObject(estudantes);
        } catch(Exception e) {
            System.out.println("Nao foi possivel serializar");
        }
    }

    public List<Estudante> desserializar() {
        try (ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(this.nomeArquivo))){
            @SuppressWarnings("unchecked") List<Estudante> estudantesList = (List<Estudante>) objectIn.readObject();
            return estudantesList;
        } catch(Exception e) {
            System.out.println("Nao foi possivel desserializar");
            return null;
        }
    }
}

