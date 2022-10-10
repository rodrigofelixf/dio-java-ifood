public class Operadores {
    public static void main(String[] args) throws Exception {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1"; // aqui vai somar os 3 primeiros "1" + o caracters 1, vai dar "31"

        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1; // aqui como começa com uma operação, porem o proximo ele concatenou com "1" em seguida as operações não funcional mais, dando o resultado de "1111"

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); // Priorizou o que está em parênteses, para depois fazer a concatenação dando o resultado de "13"

        System.out.println(concatenacao);

    }
}
