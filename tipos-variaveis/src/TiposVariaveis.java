public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        int idade = 28;
        double salarioMinimo = 1500;
        salarioMinimo = 2000;
        long cpf = 98765432109L;
        System.out.println(idade);
        System.out.println(salarioMinimo);
        System.out.println(cpf);
    //Na linha abaixo esto testando as regras dos numeros primitivos
        short numeroCurto = 1;
        int numeroNormal = numeroCurto; // o tipo primitivo "int" pode receber um tipo "short"
        short numeroCurto = numeroNormal; // mas ao contrario não funciona. O short não recebe um tipo "int"

    }
}
