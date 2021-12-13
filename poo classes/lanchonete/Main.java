package lanchonete;
public class Main {
    public static void main(String[] args) throws Exception {
                /// CRIANDO LOJA ///
                Loja loja = new Loja("Lanchonete Lan-X's", "Na Rua dos Bobos, 0");
                Cliente cleiton = new Cliente("Cleiton", 18, "Homi");

                
                /// CRIANDO PRODUTOS ///
                loja.getCardapio().addProduto(new Produto("Água Mineral", "H2O - Água importada, porque no Brasil não tem", 0.5));
                loja.getCardapio().addProduto(new Produto("Suco de Frutas", "Frutas de final de Feira", 4));
                loja.getCardapio().addProduto(new Produto("Refrigerante", "Produtos quimicos perigosos para seu corpo com Corante", 3, 1));
                loja.getCardapio().addProduto(new Produto("SandWich", "Lanche com Areia", 5, 2));
                loja.getCardapio().addProduto(new Produto("Salsichão", "Não recomendado para menores de 18", 4));
                loja.getCardapio().addProduto(new Produto("Misto", "O mesmo que você faz em casa, só que mais caro", 3));
                loja.getCardapio().addProduto(new Produto("Feijão amantegado", "MUITA MANTEIGA", 30));
                loja.getCardapio().addProduto(new Produto("HotCat", "Comida com carne de origens duvidosas", 10));
                cleiton.clienteMenu(loja);

    }
}