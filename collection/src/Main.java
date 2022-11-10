import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        notas.add(10d);
        notas.add(9.5d);
        notas.add(8.5);
        notas.add(10d);
        notas.add(8d);
        notas.add(9.7d);
        notas.add(10d);

        notas.add(4, 10d);
        notas.set(notas.indexOf(8d), 6d );

        System.out.println(notas);

        System.out.println("Existe o número 10 na lista? " + notas.contains(10d));
        System.out.println("O que tem na posição 2?: " + notas.get(2));

        System.out.println("O menor valor da lista é: " + Collections.min(notas));
        System.out.println("O maior valor da lista é: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }

        System.out.println("A soma de todos os valores da lista é: " + soma);
        System.out.println("A média das notas da lista é " + (soma / notas.size()));
        System.out.println("Removendo o valor 6 da lista: " + notas.remove(6d)); // se quiser escolher a posição, colocar número inteiro

        System.out.println(notas.toString());

        Iterator<Double> iterator1 = notas.iterator();

        // removendo os numeros menores que 10

        while (iterator1.hasNext()) {
            Double next2 = iterator1.next();
            if (next2 < 10) iterator1.remove();
        }

        System.out.println(notas);

    }
}
