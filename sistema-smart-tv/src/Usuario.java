public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(); // Orientação Objeto

        // verificando status da TV - ligada true or false
        System.out.println("TV Ligada? " + smartTv.ligada);

        smartTv.ligarTV();

        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual:  " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();

        smartTv.avancarCanal();
        smartTv.avancarCanal();
        smartTv.voltarCanal();
        smartTv.mudarCanal(25);

        smartTv.desligarTV();
    }
}
