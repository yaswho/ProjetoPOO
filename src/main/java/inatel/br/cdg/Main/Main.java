package inatel.br.cdg.Main;
import inatel.br.cdg.Decisao.Escolha;
import inatel.br.cdg.Funcoes.Funcoes;
import inatel.br.cdg.Inimigo.FantasmaCozinheiro;
import inatel.br.cdg.Inimigo.FantasmaServical;
import inatel.br.cdg.Protagonista.Player;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args){

        Path arquivoJogo = Paths.get("OJogo.txt"); //pega caminho de Ojogo.txt
        Escolha escolha = new Escolha();
        Funcoes funcoes = new Funcoes();

        int auxiliar;
        int terminouparte1 = 0;
        int venceuservical = 0;
        int venceucozinheiro = 0;
        Player player = null; //Cria instancia nula só para o programa deixar usar ela

        //Instruções iniciais
        escolha.LerInteract(141,142,143,139,0);
        auxiliar = escolha.LerInteract(2, 3, 4, 5, 2); // texto inicial, escolha 1, escolha 2 , escolha 3, quantidade de escolhas

        if (auxiliar == 1) {

            escolha.LerInteract(7, 2, 2, 2, 0);

            auxiliar = escolha.LerInteract(9, 10, 11, 12, 3); //Como você se sente
            if (auxiliar == 1) { //Está com medo
                player = new Player(90, 7);   // player null recebe a instancia prejudicada
            } else if (auxiliar == 2) { //neutro
                player = new Player(100, 10); // player null recebe a instancia de player normal
            } else { // nada me afeta mais
                player = new Player(120, 12); // player null recebe a instancia de player forte
            }

            //Explorar a casa ou os arredores
            auxiliar = escolha.LerInteract(14, 16, 17, 15, 2);

            //Explorando arredores
            while (auxiliar != 1) {
                if (auxiliar == 2) {
                    escolha.LerInteract(37, 38, 39, 40, 0);
                    player.AcrescentaDano(3); //acrescenta + 3 de dano ao dano do jogador
                } else {
                    System.out.println("Invalido");
                }
                //Explorar a casa?
                auxiliar = escolha.LerInteract(34, 35, 36, 37, 2);

                //Fazer nada
                if(auxiliar == 2){
                    escolha.LerInteract(32, 31, 31, 31, 0);
                    funcoes.temporizador(2000);
                    System.out.printf("Jogo encerrado, Careca!");
                    System.exit(1); //Fecha o jogo
                }
            }

            //Explorando a casa
            if (auxiliar == 1) {
                escolha.LerInteract(19, 20, 21, 22, 0);
                //Escolher quall andar da casa vai explorar
                auxiliar = escolha.LerInteract(43, 44, 45, 46, 2);

                //Terreo
                if (auxiliar == 1) {
                    //Cozinha ou sala de jantar?
                    auxiliar = escolha.LerInteract(75, 78, 79, 80, 2);

                    while (auxiliar != 1) {
                        //Sala de jantar
                        if (auxiliar == 2) {
                            escolha.LerInteract(82, 83, 84, 85, 0);
                        }
                        //Cozinha ou sala de jantar?
                        auxiliar = escolha.LerInteract(75, 78, 79, 80, 2);

                    }

                    //cozinha
                    if (auxiliar == 1) {
                        escolha.LerInteract(85, 86, 87, 88, 0);
                        auxiliar = escolha.LerInteract(90, 91, 92, 93, 2);

                        //Aceitar o chá
                        if (auxiliar == 1) {
                            escolha.LerInteract(100, 101, 102, 103, 0);
                            escolha.LerInteract(104, 105, 106, 107, 0);
                            //Escolher comodo
                            auxiliar = escolha.LerInteract(109, 110, 111, 112, 3);

                            while (auxiliar != 3) {

                                //Banheiro
                                if (auxiliar == 1) {
                                    escolha.LerInteract(116, 117, 118, 119, 0);
                                }
                                //Quarto
                                if (auxiliar == 2) {
                                    escolha.LerInteract(121, 122, 123, 124, 0);
                                }
                                //Escolher cômodo
                                auxiliar = escolha.LerInteract(109, 110, 111, 112, 3);
                            }

                            //Correr pro abraço
                            if (auxiliar == 3) {
                                //Final pacifista
                                escolha.LerInteract(127, 128, 129, 130, 0);
                                System.exit(1); //Fecha o jogo
                            }

                        }
                        //Chama o fantasma de babaca
                        else if (auxiliar == 2) {

                            escolha.LerInteract(96, 95, 95, 95, 0);
                            FantasmaCozinheiro henrique = new FantasmaCozinheiro(50, 12);
                            player.Luta(henrique);

                            //Você venceu a luta contra o cozinheiro
                            escolha.LerInteract(134, 135, 136, 137, 0);
                            escolha.LerInteract(51, 53, 54, 55, 0);

                            //Luta com serviçal
                            FantasmaServical joao = new FantasmaServical(50, 12);
                            player.Luta(joao);

                            //Final Caçador
                            escolha.LerInteract(68, 69, 70, 71, 0);
                            System.exit(1); //Fecha o jogo
                        }

                    }
                }
                //1 andar
                if (auxiliar == 2) {
                    escolha.LerInteract(51, 53, 54, 55, 0);
                    //Luta com serviçal
                    FantasmaServical joao = new FantasmaServical(50, 12);
                    player.Luta(joao);

                    escolha.LerInteract(59,60,62,63,0);

                    //Luta com cozinheiro
                    FantasmaCozinheiro henrique = new FantasmaCozinheiro(50, 12);
                    player.Luta(henrique);

                    //Final Caçador
                    escolha.LerInteract(68, 69, 70, 71, 0);
                    System.exit(1); //Fecha o jogo
                }

            }

        }
        else if (auxiliar == 2){
            escolha.LerInteract(28, 31, 31, 31, 0);
            funcoes.temporizador(2000);
            System.out.printf("Jogo encerrado, Careca!");
            System.exit(1); //Fecha o jogo
        }
    }
}


