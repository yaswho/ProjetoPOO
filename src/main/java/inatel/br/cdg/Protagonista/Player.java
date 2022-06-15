package inatel.br.cdg.Protagonista;

import inatel.br.cdg.Inimigo.FantasmaCozinheiro;
import inatel.br.cdg.Inimigo.FantasmaServical;

public class Player {

    //0 - 100
    private int Vida;
    private int Defesa;
    private int Dano;
    int escolha;

    FantasmaServical f1 = new  FantasmaServical(200, 5);

    public void Luta1(FantasmaCozinheiro Henrique, FantasmaServical João){

        //Chama função de opções -> Ataque(10% para errar), Defesa(50% para não defender), Fugir(5%), Atacar e Defender(20%)
        System.out.println("O que deseja fazer?");
        System.out.printf("Digite: %n 1- Atacar %n 2- Defender %n 3- Fugir %n 4- Atacar e Defender %n");

        int VidaF = 100;
        int AtaqueF = 100;

        //se escolher 1
        if(escolha == 1){

                int Random = (int) (Math.random() *10);
                System.out.println(Random);
        }



        //se escolher 2
        {
            //Se funcionar
            System.out.println("Você defendeu!");
            //Se não funcionar
            {
                this.Vida = Vida - AtaqueF;
            }
        }

        //se escolher 3
        {
            //Se funcionar
            System.out.println("Você conseguiu fugir");
            //Se não funcionar
            {
                System.out.println("Você não conseguiu fugir");

            }

        }

    }

}
