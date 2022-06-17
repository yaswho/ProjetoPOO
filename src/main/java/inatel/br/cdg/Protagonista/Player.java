package inatel.br.cdg.Protagonista;

import inatel.br.cdg.Funcoes.Funcoes;
import inatel.br.cdg.Inimigo.Inimigo;

import java.util.Scanner;

public class Player {

    public Player(int vida, int dano) {// Construtor do player
        this.Vida = vida;
        this.Dano = dano;
    }

    //0 - 100
    private int Vida;

    public void AcrescentaDano(int dano) {
        this.Dano += dano;
    }

    private int Dano;
    private int escolha;

    public void setVida(int vida) {
        Vida = vida;
    }


    Funcoes funcoes = new Funcoes();

    public void mostrainfo(Inimigo fantasma) {
        System.out.println("Sua vida é: " + Vida);
        System.out.println("Vida do fantasma é: " + fantasma.getVida());
    }


    FantasmaServical f1 = new  FantasmaServical(200, 5);

    public void Luta(Inimigo fantasma) {

        while (fantasma.getVida() > 0 && Vida > 0) { //A luta continua enquanto nenhuma vida chegar a zero
            //Chama função de opções -> Ataque(10% para errar), Defesa(50% para não defender), Fugir(5%), Atacar e Defender(20%)
            System.out.println("O que deseja fazer?");
            System.out.printf("Digite: %n 1- Atacar %n 2- Defender %n 3- Fugir %n 4- Atacar e Defender %n");
            System.out.println(); //pula linha

            Scanner in = new Scanner(System.in);

            System.out.println("Digite a opção: ");
            escolha = in.nextInt();

             while (escolha < 1 | escolha > 4) { //Para pessoa não colocar escolha inválida
                    System.out.println("Escolha inválida");
                    System.out.println("Digite a opção: ");
                    escolha = in.nextInt();
            }

             int numAleatorio = Funcao.numAleatorio();
             int novaVida = fantasma.getVida() - Dano;


            //se escolher 1 (Atacar)
            if (escolha == 1){
                //se funcionar
                if (numAleatorio >= 10){
                    System.out.println("Atacando fantasma");
                    fantasma.setVida(novaVida);
                    this.Vida = Vida - fantasma.getAtaque();
                }
                //se não funcionar
                else{
                    System.out.println("Você errou! O fantasma está de atacando");
                    this.Vida = Vida - (fantasma.getAtaque()+5);
                }

            }

            //se escolher 2 (Defender)
            if (escolha == 2) {
                //Se funcionar
                if(numAleatorio >= 50 ){
                    System.out.println("Você defendeu!");
                }

                //Se não funcionar
                else{
                    System.out.println("Você pensou em defender porem seu corpo não reagiu a tempo %n");
                    System.out.println("O fantasma te atacou %n");
                    this.Vida = Vida - (fantasma.getAtaque()+10);
                }
            }

            //se escolher 3 (Fugir)
            if (escolha == 3) {
                //Se funcionar
                if(numAleatorio >= 95){
                    System.out.println("Você conseguiu fugir %n");
                }

                //Se não funcionar
                else{
                    System.out.println("Você não conseguiu fugir %n");
                    System.out.println("O fantasma te atacou %n");
                    this.Vida = Vida - (fantasma.getAtaque()+5);

                }

            }

            //se escolher 4 (Atacar e defender)
            if (escolha == 4) {

                //Se funcionar
                if(numAleatorio >= 80){
                    System.out.println("Você atacou e defendeu %n");
                    fantasma.setVida(novaVida);
                }

                //Se não funcionar
                else{
                    System.out.println("Seu cérebro bugou e você não fez nada %n");
                    System.out.println("O fantasma te atacou %n");
                    this.Vida = Vida - (fantasma.getAtaque()+15);

                }
            }
        }


        if (Vida < 0) { //Se o jogador perdeu muda corromper para 1 no arquivo Ojogo.txt
            //Código antes
            System.out.println("ERRO");
            for(int i = 0; i<10; i++){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ERRO......");
            }
            System.out.println("ERROERROERROERROERROERROERROERROERROERROERROERROERRO");
            System.out.println("Isto não era para ter acontecido ");
            System.out.println("ou era? ");
            funcoes.temporizador(1000);

            System.exit(1); //Fecha o jogo
        }
        else{ //Se o jogador venceu a luta
            return 1;
        }

    }


}
