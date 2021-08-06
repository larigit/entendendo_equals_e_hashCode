package br.com.aprendendojava.equalsehashcode;

import br.com.aprendendojava.equalsehashcode.modelo.Produto;

import java.util.*;

public class CadastradorProdutos {

    public static void main(String[] args) {
        Collection<Produto> produtos = new HashSet<Produto>();

        System.out.println("##### Cadastro de produtos #####\n");

        try (Scanner entrada = new Scanner(System.in)) {
            String continuar = "s";
            while ("s".equalsIgnoreCase(continuar)) {
                System.out.print("SKU: ");
                String sku = entrada.nextLine();

                System.out.print("Nome: ");
                String nome = entrada.nextLine();

                Produto produto = new Produto(sku, nome);
                if (produtos.contains(produto)) {
                    System.err.println("Esse produto já foi adicionado. Utilize outro SKU!");
                } else {
                    produtos.add(produto);
                    System.out.println("Produto adicionado.");
                }

                System.out.print("Deseja adicionar mais algum produto? (s/n) ");

                continuar = entrada.nextLine();
            }
        }

        produtos.forEach(System.out::println);

        System.out.println("Fim");
    }

}
