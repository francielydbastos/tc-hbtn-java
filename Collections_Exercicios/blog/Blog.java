import java.util.*;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        this.posts.add(post);
    }

    public Set<String> obterTodosAutores() {
        Set<String> returnAutores = new TreeSet<String>();

        for (Post post : posts) {
            returnAutores.add(post.getAutor());
        }

        return returnAutores;
    }

    public Map<String,Integer> obterContagemPorCategoria() {
        Map<String,Integer> returnContagem = new TreeMap<String,Integer>();

        for (Post post : posts) {
            if (returnContagem.containsKey(post.getCategoria())) {
                Integer previousCount = returnContagem.get(post.getCategoria());
                returnContagem.put(post.getCategoria(), previousCount + 1);
            } else {
                returnContagem.put(post.getCategoria(), 1);
            }
        }

        return returnContagem;
    }
}
