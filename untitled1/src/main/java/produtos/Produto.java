package produtos;



//US-1050: Create product
public class Produto {

    private int id; //
    private String nome;
    private String descricao;
    private String marca;
    private String categoria;
    private double precoLista;
    private double custo;

    // Construtor
    public Produto(String nome, String descricao, String marca, String categoria, double precoLista, double custo) {
        this.nome = nome;
        this.descricao = descricao;
        this.marca = marca;
        this.categoria = categoria;
        this.precoLista = precoLista;
        this.custo = custo;
    }
    // Getters
    public int getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecoLista() {
        return precoLista;
    }

    public double getCusto() {
        return custo;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPrecoLista(double precoLista) {
        this.precoLista = precoLista;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }
    // Métodos Adicionais para garantir que nome e preçoLista não serão vazios
    public boolean isValido() {
        if (nome == null || nome.isEmpty()) {
            return false;
        }

        if (precoLista <= 0) {
            return false;
        }
        return true;}
}