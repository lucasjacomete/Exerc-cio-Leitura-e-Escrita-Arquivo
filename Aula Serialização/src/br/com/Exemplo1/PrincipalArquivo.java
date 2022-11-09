package br.com.Exemplo1;

import java.io.IOException;

public class PrincipalArquivo {

    public static void main(String[] args) throws IOException {
        String path = "./arquivo.txt";

        ManipuladorAquivo.escritor(path);
        ManipuladorAquivo.leitor(path);
        
    }
}
