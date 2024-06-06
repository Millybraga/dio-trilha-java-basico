public class SmartTv {
    boolean ligada;
    int canal = 5;
    int volume = 15;

    public void ligarTV() {
        ligada = true;
        System.out.println("Status TV: ON");
    }

    public void desligarTV() {
        ligada = false;
        System.out.println("Status TV: OFF");
    }

    public void aumentarVolume() {
        volume++;
        System.out.println("Volume: " + volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("Volume: " + volume);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
        System.out.println("Canal:" + novoCanal);
    }

    public void avancarCanal() {
        canal++;
        System.out.println("Canal: " + canal);
    }

    public void voltarCanal() {
        canal--;
        System.out.println("Canal: " + canal);
    }
}