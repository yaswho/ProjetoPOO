package inatel.br.cdg.Decisao;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class Escolha{

    private int escolha;
    Scanner sc = new Scanner(System.in); // cria instancia de scanner

    public void Escolha(){ //Construtor de escolha

        try  {
            Path ArqEscolha = Paths.get("Interact.txt");
            List<String> TodosTextos = Files.readAllLines(ArqEscolha);
        } catch (IOException e) {  //Trata o erro
            System.out.println(e);

        }
    }

    public int LerInteract(int r0, int r1,int r2, int r3, int qtdescolhas) {
        //Referencia é a expressão para achar a linha que tem o texto
        //qtd escolhas é a quantidade de escolhas que vai estar disponivel


        Path arquivoInteract = Paths.get("Interact.txt"); //pega caminho de Interact.txt
        Map<Integer, String> num = new HashMap<>();
        int id = 1;

        try{ //Trata possivel erro (Se interact.txt não existir)
        Scanner scanInt = new Scanner(new File("Interact.txt")); //Lê Interact
            while(scanInt.hasNextLine()){                                    //associa cada linha com uma chave
                String line1 = scanInt.nextLine();
                num.put(id,line1);
                id ++;
            }
        }catch (FileNotFoundException e){
        e.printStackTrace();
        }


        System.out.println();
        if (qtdescolhas>0) { //Se for uma tomada de decisão mostre escolhas possiveis
            System.out.println(num.get(r0)); //formato
            System.out.println();
            System.out.println(num.get(r1));
            System.out.println(num.get(r2));
            System.out.println(num.get(r3));

            System.out.println();
            System.out.println("Digite o número da opção: ");
            escolha = sc.nextInt();


            while (escolha < 1 | escolha > qtdescolhas) { //Para pessoa não colocar escolha inválida
                System.out.println("Escolha inválida");
                System.out.println("Escreva a opção");
                escolha = sc.nextInt();

            }

            if (qtdescolhas == 2) { //Se tiver 2 escolhas disponiveis apenas
                if (escolha == 1) {
                    System.out.println("Você escolheu 1");
                    return 1;
                } else {
                    System.out.println("Você escolheu 2");
                    return 2;
                }

            } else if (qtdescolhas == 3) { //Se tiver 3 escolhas disponiveis apenas
                if (escolha == 1) {
                    System.out.println("Você escolheu 1");
                    return 1;
                } else if (escolha == 2) {
                    System.out.println("Você escolheu 2");
                    return 2;
                } else {
                    System.out.println("Você escolheu 3");
                    return 3;
                }
            } else {                  //Se tiver 4 escolhas disponiveis apenas
                if (escolha == 1) {
                    System.out.println("Você escolheu 1");
                    return 1;
                } else if (escolha == 2) {
                    System.out.println("Você escolheu 2");
                    return 2;
                } else if (escolha == 3) {
                    System.out.println("Você escolheu 3");
                    return 3;
                } else {
                    System.out.println("Você escolheu 4");
                    return 4;
                }
            }
        }
        else{        //Se não for uma tomada de decisão mostre apenas o texto
            System.out.println(num.get(r0));
            System.out.println(num.get(r1));
            System.out.println(num.get(r2));
            System.out.println(num.get(r3));

            return 5;
        }

    }

}








