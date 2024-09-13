public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        smartTv.mudarCanal(13);
        System.err.println("Canal atual:" + smartTv.canal);
        System.out.println("TV ligada: " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();
        System.err.println("Novo status - TV LIGADA " + smartTv.ligada);

        smartTv.desligar();
        System.err.println("Novo status - TV DESLIGADA " + smartTv.ligada);
    }
}
