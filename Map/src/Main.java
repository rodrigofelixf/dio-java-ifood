import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

        System.out.println("Subistitua o consumo do gol por 15.2 km/l: ");
        carrosPopulares.put("gol", 15.2d);
        System.out.println(carrosPopulares);

        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));
        System.out.println("Exiba o consumo do uni: " + carrosPopulares.get("uno"));

        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet(); // transforma os modelos dos carros em uma lista com Strings
        System.out.println(modelos);

        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());

        System.out.println(consumoMaisEficiente);

        System.out.println("Menor Consumo: ");

        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        System.out.println(consumoMenosEficiente);

        System.out.println("Soma dos consumos: ");
        Double soma = 0d;
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        for (double valor : carrosPopulares.values()){
            soma += valor;
        }

        System.out.println(soma);

    }
}