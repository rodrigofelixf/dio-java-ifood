import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        System.out.println(notas.toString());

        System.out.println("Confira se a nota 5.0 está no conjunto: " + notas.contains(5d));
        System.out.println("Exiba a menor nota " + Collections.min(notas));
        System.out.println("Exiba a maior nota " + Collections.max(notas));

        double soma = 0d;
        for (double nota : notas){
            soma += nota;
        }
        System.out.println("Exiba a soma dos valores: " + soma);
        System.out.println("Exiba a média das notas: " + (soma / notas.size()));
        System.out.println(notas);
        System.out.println("Remova a nota 0: " );
        notas.remove(0d);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista ");
        Iterator<Double> iterator = notas.iterator();

        while (iterator.hasNext()) {
            Double next = iterator.next();
            if (next < 7) iterator.remove();
        }
        System.out.println(notas);

        System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente: ");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("Apague todo o conjunto ");
        notas3.clear();
        System.out.println(notas3);

        System.out.println("Confira se o conjunto está vazio: " + notas3.isEmpty() );






    }
}