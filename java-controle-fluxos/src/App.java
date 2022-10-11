public class App {
    public static void main(String[] args) throws Exception {
        String olhos = "vermelho";

        switch(olhos){
            case "azul":
                System.out.println("seu olho é " + olhos );
                break;
            case "verde":
                System.out.println("seu olho é " + olhos);
                break;
            default:
                System.out.println("Seus olhos não tem a cor");
                break;
        }
       
    }
}
