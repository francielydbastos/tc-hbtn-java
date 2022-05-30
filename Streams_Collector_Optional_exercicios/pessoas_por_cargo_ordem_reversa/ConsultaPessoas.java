import java.util.Comparator;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static TreeMap<String, TreeSet<Pessoa>> obterPessoasAgrupadasPorCargoEmOrdemReversa(List<Pessoa> pessoas) {
        Supplier<TreeMap<String, TreeSet<Pessoa>>> myMapSupplier = () -> new TreeMap<>(Comparator.reverseOrder());
        return pessoas.stream().collect(Collectors.groupingBy(Pessoa::getCargo, myMapSupplier, Collectors.toCollection(TreeSet::new)));
    }

}
