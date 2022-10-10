package edu.rodrigo.segundasemana;
public class MinhaClasse {
    //esse corpo é da classe
    public static void main(String[] args) {
        
        String primeiroNome = "Rodrigo";
        String segundoNome = "Felix";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

}

}
