package lanchonete;

import java.util.ArrayList;

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
        
                /// PEDIDOS PARA TEST ///
                ArrayList<Pedido> pedidos1 = new ArrayList();
                pedidos1.add(new Pedido(new Produto("Água Mineral", "H2O - Água importada, porque no Brasil não tem", 2), 10));
                pedidos1.add(new Pedido(new Produto("Suco de Frutas", "Frutas de final de Feira", 4), 202));
                pedidos1.add(new Pedido(new Produto("Refrigerante", "Produtos quimicos perigosos para seu corpo com Corante", 3), 303));
                pedidos1.add(new Pedido(new Produto("Misto", "O mesmo que você faz em casa, só que mais caro", 3), 404));
        
                ArrayList<Pedido> pedidos2 = new ArrayList();
                pedidos2.add(new Pedido(new Produto("Água Mineral", "H2O - Água importada, porque no Brasil não tem", 2), 1000));
                pedidos2.add(new Pedido(new Produto("Suco de Frutas", "Frutas de final de Feira", 4), 20));
                pedidos2.add(new Pedido(new Produto("Salsichão", "Não recomendado para menores de 18", 4), 30));
                pedidos2.add(new Pedido(new Produto("Misto", "O mesmo que você faz em casa, só que mais caro", 3), 40));
        
                ArrayList<Pedido> pedidos3 = new ArrayList();
                pedidos3.add(new Pedido(new Produto("Água Mineral", "H2O - Água importada, porque no Brasil não tem", 2), 200));
                pedidos3.add(new Pedido(new Produto("Suco de Frutas", "Frutas de final de Feira", 4), 37));
                pedidos3.add(new Pedido(new Produto("Salsichão", "Não recomendado para menores de 18", 4), 20));
                pedidos3.add(new Pedido(new Produto("Misto", "O mesmo que você faz em casa, só que mais caro", 3), 10));
                
                System.out.println(pedidos1);
                System.out.println(pedidos2);
                System.out.println(pedidos3);
                
    }
}