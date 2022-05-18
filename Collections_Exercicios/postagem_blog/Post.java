public class Post implements Comparable<Post>{
    private Autor autor;
    private String titulo;
    private String corpo;
    private Categorias categoria;

        public Post(Autor autor, String titulo, String corpo, Categorias categoria) {
        this.autor = autor;
        this.titulo = titulo;
        this.corpo = corpo;
        this.categoria = categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCorpo() {
        return corpo;
    }

    public Categorias getCategoria() {
        return categoria;
    }

    @Override
    public String toString() {
        return titulo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Post post = (Post) o;

        if (!autor.equals(post.autor)) return false;
        return titulo.equals(post.titulo);
    }

    @Override
    public int hashCode() {
        int result = autor.hashCode();
        result = 31 * result + titulo.hashCode();
        return result;
    }

    @Override
    public int compareTo(Post post) {
        return this.titulo.compareTo(post.titulo);
    }
}
