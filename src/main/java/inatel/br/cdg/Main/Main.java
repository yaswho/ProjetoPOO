package inatel.br.cdg.Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Path arquivoJogo = Paths.get("OJogo.txt"); //pega caminho de Ojogo.txt

        Scanner scan = new Scanner(new File("Instrucoes.txt")); //Lê instruções
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            System.out.println(line);
        }


    }
}
