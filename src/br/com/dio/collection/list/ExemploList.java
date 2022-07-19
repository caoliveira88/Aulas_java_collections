package br.com.dio.collection.list;

// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6] Crie uma lista e adicione as 7 notas.

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {

//      List notas = new ArrayList(); Antes do Java 5

        System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<>(); //Generics(jdk 5) - Diamond Operator
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas);
//      System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); //Indica posição

        System.out.println("\nAdicione na lista a nota 8.0 na posição 4: ");
        notas.add(4,8d);
        System.out.println(notas);

        System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0);
        System.out.println(notas);

        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d)); // não possue elemento 5.0

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas ) //foreach
            System.out.println(nota);

        System.out.println("\nExiba a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas);

        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
                Double next = iterator.next();
                soma += next;
        }
        System.out.println("\nExiba a soma dos valores: " + soma);

        System.out.println("\nExiba a media das notas: " + (soma/ notas.size()));

        System.out.println("\nRemova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas);

 /*     System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }
        System.out.println(notas);*/

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("\nConfira se a lista está vazia: " + notas.isEmpty());
    }
}
