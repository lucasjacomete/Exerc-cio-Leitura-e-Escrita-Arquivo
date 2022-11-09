package br.com.Exercicio1;

import java.io.IOException;

public class PrincipalArquivo {
  public static void main(String[] args) throws IOException {
    String path = "./src/br/com/Exercicio1/ArquivoNomes.txt";
    PrimeiroArquivo.lerNome(path);

    path = "./src/br/com/Exercicio1/SobreNomes.txt";
    PrimeiroArquivo.lerSobreNome(path);

    path = "./src/br/com/Exercicio1/NomeESobrenome.txt";
    PrimeiroArquivo.escritor(path);
    PrimeiroArquivo.lerNomeCompleto(path);
  }
}