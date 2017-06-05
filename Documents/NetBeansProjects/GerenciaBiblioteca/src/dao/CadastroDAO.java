package dao;

import model.Livro;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class CadastroDAO
{

  public void saveAllLivros(ArrayList<Livro> livro)
  {
    FileOutputStream fout = null;
    try (PrintWriter writer = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\GerenciaBiblioteca\\GereciaBilioteca\\livros.csv", "UTF-8"))
    {

      for (Livro livCads : livro)
      {
        writer.println(livCads.getAsCSVLineCads());
      }
      JOptionPane.showMessageDialog(null, "Cadastro com sucesso");
      writer.close();
    } catch (Exception ex)
    {
      System.out.println("Erro: " + ex.getMessage());
    }
  }

  public void salvaLivro(String nomeLivro, String autor, String numLivro)
  {
    ArrayList<Livro> cadsLivro = loadAllLivros();
    cadsLivro.add(new Livro(nomeLivro, autor, numLivro));
    saveAllLivros(cadsLivro);
  }

  public ArrayList<Livro> loadAllLivros()
  {
    ArrayList<Livro> livros = new ArrayList();

    try
    {
      Scanner arq;
      arq = new Scanner(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\GerenciaBiblioteca\\GereciaBilioteca\\livros.csv"));

      while (arq.hasNextLine())
      {
        String linha = arq.nextLine();
        Livro l = new Livro(linha);
        livros.add(l);
      }
    } catch (Exception ex)
    {
      System.out.println("erro ao ler dados: " + ex.getMessage());
    }
    return livros;
  }

  public void leitura()
  {
    ArrayList<Livro> lerArq = loadAllLivros();
    for (Livro livro : lerArq)
    {
      System.out.println(livro.getAsCSVLineLer());
    }

  }
}
