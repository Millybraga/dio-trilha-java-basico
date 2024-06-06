public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv(); // Orientação Objeto

        // verificando status da TV - ligada true or false
        System.out.println("TV Ligada? " + smartTv.ligada);

        // chamada do método ligar TV
        smartTv.ligarTV();

        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual:  " + smartTv.volume);

        // chamada do método aumentar volume
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();

        // chamada do método diminuir volume
        smartTv.diminuirVolume();
        // avançando canais
        smartTv.avancarCanal();
        smartTv.avancarCanal();

        // retrocedendo canais
        smartTv.voltarCanal();

        smartTv.mudarCanal(25);

        // chamada do método desligar TV
        smartTv.desligarTV();
    }
}
