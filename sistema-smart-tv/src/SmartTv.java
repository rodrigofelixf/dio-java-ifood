public class SmartTv { //aqui ficam os atributos
    boolean ligada = false;
    int canal = 1;
    private int volume = 99;


    public void ligar() {
        ligada = true;
    }

    public void desligar() {
        ligada = false;
        
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        
    }

    public void aumentarVolume() {
        if (ligada == true)
            volume ++;
        else 
            System.out.println("Não é possivel aumentar o volume. A tv encontra-se desligada");

        if (volume > 100)
            System.out.println("Você chegou ao volume máximo permitido");
            volume  = 100;
       
    }

    public void diminuirVolume() {
        volume --;
        if (volume < 0)
            System.out.println("Você já chegou ao volume minimo");
    }

    public int getVolume(){
        return volume;
    }

}