import java.util.*;

public class Blog {
    private ArrayList<Post> posts;

    public Blog() {
        this.posts = new ArrayList<Post>();
    }

    public void adicionarPostagem(Post post) {
        if (posts.contains(post)) {
            throw new IllegalArgumentException("Postagem jah existente");
        }
        this.posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> returnAutores = new TreeSet<Autor>();

        for (Post post : posts) {
            returnAutores.add(post.getAutor());
        }

        return returnAutores;
    }

    public Map<Categorias,Integer> obterContagemPorCategoria() {
        Map<Categorias,Integer> returnContagem = new TreeMap<Categorias,Integer>();

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

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> returnPosts = new TreeSet<Post>();

        for (Post post : posts) {
            if (post.getAutor().equals(autor)) {
                returnPosts.add(post);
            }
        }

        return returnPosts;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> returnPosts = new TreeSet<Post>();

        for (Post post : posts) {
            if (post.getCategoria().equals(categoria)) {
                returnPosts.add(post);
            }
        }

        return returnPosts;
    }

    public Map<Categorias,Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias,Set<Post>> returnPosts = new TreeMap<>();

        for (Post post : posts) {
            if (returnPosts.containsKey(post.getCategoria())) {
                Set<Post> values = returnPosts.get(post.getCategoria());
                values.add(post);
                returnPosts.put(post.getCategoria(), values);
            } else {
                Set<Post> values = new TreeSet<>();
                values.add(post);
                returnPosts.put(post.getCategoria(), values);
            }
        }

        return returnPosts;
    }

    public Map<Autor,Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor,Set<Post>> returnPosts = new TreeMap<>();

        for (Post post : posts) {
            if (returnPosts.containsKey(post.getAutor())) {
                Set<Post> values = returnPosts.get(post.getAutor());
                values.add(post);
                returnPosts.put(post.getAutor(), values);
            } else {
                Set<Post> values = new TreeSet<>();
                values.add(post);
                returnPosts.put(post.getAutor(), values);
            }
        }

        return returnPosts;
    }
}
