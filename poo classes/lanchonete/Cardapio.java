package lanchonete;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Cardapio{

    /// CARACTERISTICAS ///
    private ArrayList<Produto> produtos;
    private int tamanho = 0;

    /// CONSTRUTORES ///
    public Cardapio() {
        produtos = new ArrayList<Produto>();
    }

    /// METODOS GET ///
    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    /// METODOS SET ///
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    /// METODOS ADD ///
    public void addProduto(Produto p) {
        tamanho += 1;
        p.setID(tamanho);
        produtos.add(p);    
    }

    public void addProduto() {
        try (Scanner in = new Scanner(System.in)) {
            double presso = 0;
            System.out.println();
            System.out.println("=> ADICIONAR PRODUTO <=");
            System.out.print("NOME: ");
            String nome = in.nextLine();

            if ((nome == null) || (nome.equals(" "))) {
                MensagensPadrao.erro("Valor Invalido!\nO Campo Nome é Obrigatorio!");
                addProduto();
            } else {
                System.out.print("DESCRIÇÃO: ");
                String descricao = in.nextLine();
                System.out.print("PREÇO: ");
                
                try {
                    presso = in.nextDouble();
                    System.out.print("CUSTO DE PRODUÇÃO: ");
                   
                    
                    addProduto(new Produto(nome, descricao, presso));
                } catch (InputMismatchException ex) {
                    MensagensPadrao.erro("Opção Inválida!\nEscolha um Número Válido!");
                    addProduto();
                    return;
                }
            }
        }
    }

    /// OUTROS METODOS ///
    @Override
    public String toString() {
        String tudo = "";
        tudo += "\n-------------------------------------------------------------";
        
        for (Produto produto : produtos) {
            tudo += "\n" + produto.toString();
            tudo += "\n-------------------------------------------------------------";
        }
        
        return tudo;
    }

    public Produto procurarProduto(int ID) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getID() == ID) {
                return produtos.get(i);
            }
        }
        
        return null;
    }
}