package inatel.br.cdg.Decisao;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Escolha{

    private int escolha;

    public void Escolha(){ //Construtor de escolha

        try  {
            Path ArqEscolha = Paths.get("Interact.txt");
            List<String> TodosTextos = Files.readAllLines(ArqEscolha);
        } catch (IOException e) {  //Trata o erro
            System.out.println(e);

        }
    }

    public int LerInteract(String referencia, int qtdescolhas){
        //Referencia é a expressão para achar a linha que tem o texto
        //qtd escolhas é a quantidade de escolhas que vai estar disponivel

        //Ler interact com referencia


        //Escolha da pessoa
        Scanner in = new Scanner(System.in);
        System.out.println("Digite a opção: ");
        escolha = in.nextInt();

        while (escolha < 1 | escolha > qtdescolhas) { //Para pessoa não colocar escolha inválida
            System.out.println("Escolha inválida");
            System.out.println("Digite a opção: ");
            escolha = in.nextInt();
        }
        
        if(qtdescolhas==2){
            
        }else if(qtdescolhas==3){
            
        }else{

        }

        if(escolha ==1){
            System.out.println("Você escolheu 1");
            return 1;
        }
        else if(escolha ==2){
            return 2;
        }
        else if(escolha ==3){
            return 3;
        }
        else{
            return 4;
        }

    }

//    Scanner in = new Scanner(System.in);
//    System.out.println("Digite a opção");
//    escolha = in.nextInt();
}








