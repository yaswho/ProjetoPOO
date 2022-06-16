package inatel.br.cdg.Main;

import inatel.br.cdg.Decisao.Escolha;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Path arquivoJogo = Paths.get("OJogo.txt"); //pega caminho de Ojogo.txt
        Escolha escolha = new Escolha();
        int auxiliar;

        Scanner scan = new Scanner(new File("Instrucoes.txt")); //Lê instruções
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }

        auxiliar = escolha.LerInteract(1,2,3,4, 2); // texto inicial, escolha 1, escolha 2 , escolha 3, quantidade de escolhas

        if(auxiliar==1){
            escolha.LerInteract(6,1,1,1,0);
            escolha.LerInteract(8,9,10,11,3);

        }

        //auxiliar = 2 == não
        if(auxiliar==2){

        }




    }
}

