package br.com.Exercicio1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeiroArquivo {
  static String nome[] = new String[10];
  static String sobreNome[] = new String[10];

  public static void lerNome(String path) throws IOException {
    BufferedReader bufferReader = new BufferedReader(new FileReader(path));
    for (int i = 0; i < 10; i++) {
      nome[i] = bufferReader.readLine();
    }
    bufferReader.close();
  }

  public static void lerSobreNome(String path) throws IOException {
    BufferedReader bufferReader = new BufferedReader(new FileReader(path));
    for (int i = 0; i < 10; i++) {
      sobreNome[i] = bufferReader.readLine();
    }
    bufferReader.close();
  }

  public static void escritor(String path) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
    for (int i = 0; i < 10; i++) {
      bufferedWriter.append(nome[i] + " " + sobreNome[i] + "\n");
    }
    bufferedWriter.close();
  }

  public static void lerNomeCompleto(String path) throws IOException {
    BufferedReader bufferReader = new BufferedReader(new FileReader(path));
    for (int i = 0; i < 10; i++) {
      System.out.println(bufferReader.readLine());
    }
    bufferReader.close();
  }
}