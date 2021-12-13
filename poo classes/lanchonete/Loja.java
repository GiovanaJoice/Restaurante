package lanchonete;

import java.util.ArrayList;
/*
import java.util.InputMismatchException;
import java.util.Scanner;
*/


public class Loja {

    /// CARACTERISTICAS ///
    private String nome;
    private String endereco;
    private Cardapio cardapio = new Cardapio();
    private double lucroTotal = 0;

    /// LISTAS DE PEDIDOS ///
    private ArrayList<ConjuntoDePedidos> pedidosNaFila = new ArrayList<ConjuntoDePedidos>();
    private ArrayList<ConjuntoDePedidos> pedidosConcluidos = new ArrayList<ConjuntoDePedidos>();

    /// CONSTRUTORES ///
    public Loja(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Loja(String nome, String endereco, double lucroTotal) {
        this.nome = nome;
        this.endereco = endereco;
        this.lucroTotal = lucroTotal;
    }

    /// METODO OPEN ///
    /*
    public void abrirLoja(Loja loja) {
        System.out.println();
        System.out.println("=> ENTRAR"
                + ""
                + ""
                + ""
                + ""
                + " COMO: <=");
        System.out.println("1 - COZINHEIRO");
        System.out.println("2 - EXIT");
        System.out.print("=> ");
        Scanner in = new Scanner(System.in);
        int x = 0;
        
        try {
            x = in.nextInt();
        } catch (InputMismatchException er0) {
        }
        
        switch (x) {
            case 1: {
                loja.getFuncionario();
                break;
            }
            case 2: {
                MensagensPadrao.bye();
                System.exit(0);
                break;
            }
            default: {
                MensagensPadrao.erro();
                abrirLoja(loja);
            }
        }
    }*/

    /// METODOS GET ///
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public Cardapio getCardapio() {
        return cardapio;
    }

    public ArrayList<ConjuntoDePedidos> getPedidosNaFila() {
        return pedidosNaFila;
    }

    public String getPedidosNaFilaString() {
        String tudo = "";
        
        for (ConjuntoDePedidos pedidos : pedidosNaFila) {
            tudo += pedidos.toString() + "\n";
        }
        
        return tudo;
    }

    public ArrayList<ConjuntoDePedidos> getPedidosConcluidos() {
        return pedidosConcluidos;
    }

    public void getLojaBuild() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("=> LOJA <=");
        System.out.println("NOME: " + nome);
        System.out.println("ENDEREÇOO: " + endereco);
        System.out.println("DINHEIRO DO CAIXA: R$ " + lucroTotal);
        System.out.println("-------------------------------------------------------------");
    }

    public double getLucroTotal() {
        return this.lucroTotal;
    }

    public String getDatas(ArrayList<Integer> list) {
        String tudo = "";
        
        if (pedidosConcluidos.size() > 0) {
            for (int i = 0; i < pedidosConcluidos.size(); i++) {
                if (i == 0) {
                    list.add(i);
                    tudo += i + " - " + pedidosConcluidos.get(0).getData() + "\n";
                } else if (!pedidosConcluidos.get(i).getData().equals(pedidosConcluidos.get(i - 1).getData())) {
                    list.add(i);
                    tudo += i + " - " + pedidosConcluidos.get(i).getData() + "\n";
                }
            }
        }
        
        return tudo;
    }

    /// METODOS SET ///
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCardapio(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    public void setPedidosNaFila(ArrayList<ConjuntoDePedidos> pedidosNaFila) {
        this.pedidosNaFila = pedidosNaFila;
    }

    public void setPedidosConcluidos(ArrayList<ConjuntoDePedidos> pedidosConcluidos) {
        this.pedidosConcluidos = pedidosConcluidos;
    }

    public void setLucroTotal(double lucroTotal) {
        this.lucroTotal = lucroTotal;
    }

    /// METODOS ADD ///
    public void addLucroTotal(double lucroTotal) {
        this.lucroTotal += lucroTotal;
    }

    /// OUTROS METODOS ///

    public ArrayList<ConjuntoDePedidos> conjuntoDataID(String data) {
        ArrayList<ConjuntoDePedidos> aux = new ArrayList<ConjuntoDePedidos>();
        
        for (int i = 0; i < pedidosConcluidos.size(); i++) {
            if (pedidosConcluidos.get(i).getData().equals(data)) {
                aux.add(pedidosConcluidos.get(i));
            }
        }
        
        return aux;
    }
}