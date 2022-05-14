import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, Integer number) {
        for (Integer integer : list) {
            if (integer.equals(number)){
                return list.indexOf(integer);
            }
        }
        return -1;
    }

    public static void adicionarNumero(List<Integer> list, Integer number) throws Exception {
        if (buscarPosicaoNumero(list,number) != -1) {
            throw new Exception("Numero jah contido na lista");
        }

        list.add(number);
    }

    public static void removerNumero(List<Integer> list, Integer number) throws Exception {
        int posicaoNumero = buscarPosicaoNumero(list,number);

        if (posicaoNumero == -1) {
            throw new Exception("Numero nao encontrado na lista");
        }

        list.remove(posicaoNumero);
    }

    public static void substituirNumero(List<Integer> list, Integer numeroSubstituir, Integer numeroSubstituto) {
        int posicaoNumero = buscarPosicaoNumero(list,numeroSubstituir);

        if (posicaoNumero == -1) {
            list.add(numeroSubstituto);
        } else {
            list.set(posicaoNumero, numeroSubstituto);
        }
    }

    }
