public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal da TV: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.getVolume());


        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(13);
        smartTv.aumentarVolume();
        
    

        System.out.println("Volume atual: " + smartTv.getVolume());
        System.out.println("Canal Atual " + smartTv.canal);
        
        

        
    }
}
