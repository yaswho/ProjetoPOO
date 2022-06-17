package inatel.br.cdg.Funcoes;

public class Funcoes {

    //Retorna numero aleatório
    public int numAleatorio()
    {
        int min = 1;
        int max = 100;

        java.util.Random random = new java.util.Random();

        int value = random.nextInt(max + min) + min;

        return value;
    }

    public void temporizador(int tempo){
        try {
            Thread.sleep(tempo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
