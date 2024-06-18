package produtos;

public class Editar {

// US-0809: Edit product information


    private List<Produto> produtos;

    public Editar(List<Produto> produtos) {
        this.produtos = new ArrayList<>();
    }

    // Método para adicionar um novo produto
    public void adicionarProduto(Produto produto) {
        if (produto.isValido()) {
            produtos.add(produto);
            System.out.println("Produto adicionado com sucesso!");
        } else {
            System.out.println("Erro: Produto inválido!");

        }
    }

    // Método para buscar um produto por ID
    public Produto buscarProdutoPorId(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    // Método para editar um produto existente
    public void editarProduto(Produto produto) {
        Produto produtoEncontrado = buscarProdutoPorId(produto.getId());

        if (produtoEncontrado != null) {
            produtoEncontrado.setNome(produto.getNome());
            produtoEncontrado.setDescricao(produto.getDescricao());
            produtoEncontrado.setMarca(produto.getMarca());
            produtoEncontrado.setCategoria(produto.getCategoria());
            produtoEncontrado.setPrecoLista(produto.getPrecoLista());
            produtoEncontrado.setCusto(produto.getCusto());

            System.out.println("Produto editado com sucesso!");
        } else {
            System.out.println("Erro: Produto não encontrado!");
        }
    }

    // Método para remover um produto por ID
    public void removerProdutoPorId(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
        System.out.println("Produto removido com sucesso!");
    }

    // Método para exibir a lista de produtos
    public void exibirProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Não há produtos cadastrados.");
        } else {
            for (Produto produto : produtos) {
                System.out.println("------------------");
                System.out.println("ID: " + produto.getId());
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Descrição: " + produto.getDescricao());
                System.out.println("Marca: " + produto.getMarca());
                System.out.println("Categoria: " + produto.getCategoria());
                System.out.println("Preço Lista: R$" + produto.getPrecoLista());
                System.out.println("Custo: R$" + produto.getCusto());
                System.out.println("------------------");
            }
        }
    }
}
