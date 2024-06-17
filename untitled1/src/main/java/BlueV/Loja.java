package BlueV;

public class Loja {

        private List<Produto> produtos;

        private String nLoja;
        private static Loja loja;


        private Loja(String nome){
            nLoja = nome;
        }

    public static Loja getLoja (){
        // nenhuma loja foi iniciada
        if (loja == null){
            loja = new Loja("Blue Velvet Music Store");
        }
        return loja;
    }

    
}
