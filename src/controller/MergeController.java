package controller;

import java.util.Scanner;
import model.MergeSort;

public class MergeController {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("============================");
        System.out.println("=== Algoritmo Merge Sort ===");
        System.out.println("============================");

        System.out.print("\nDigite o tamanho da lista: ");
        int tamanho = input.nextInt();

        // Lista principal e auxiliar do algoritmo Merge Sort
        int lista[] = new int[tamanho];
        int vetorAuxiliar[] = new int[lista.length];

        // Entrada de dados da lista
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Digite um número para a posição [%s]: ", i);
            lista[i] = input.nextInt();
        }

        // Cria um objeto da classe MergeSort e chama o método
        MergeSort algoritmo = new MergeSort();
        int[] listaOrdenada = algoritmo.mergeSort(lista, vetorAuxiliar, 0, lista.length - 1);

        System.out.println("\nLista ordenada:");

        // Itera e imprime a lista ordena
        for (int num : listaOrdenada ){
            System.out.printf(num + " ");
        }

        input.close();
    }
}
