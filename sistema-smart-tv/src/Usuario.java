public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal da TV: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);


        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
    

        System.out.println("Volume atual: " + smartTv.volume);
        
        

        
    }
}
