package produtos;

public class Livro extends Produto {
    private int paginas;
    private String autor;
    private int edicao;


    @Override
    public double obterPrecoLiquido() {
        return super.precoBruto * 1.15;
    }

    public Livro(String titulo, int ano, String pais, double precoBruto, int paginas, String autor, int edicao) {
        super(titulo, ano, pais, precoBruto);
        this.paginas = paginas;
        this.autor = autor;
        this.edicao = edicao;
    }
}