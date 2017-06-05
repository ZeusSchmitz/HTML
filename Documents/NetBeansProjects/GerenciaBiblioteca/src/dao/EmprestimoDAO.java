package dao;

import model.SalvaEmprestimo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class EmprestimoDAO
{
  public void saveAllEmpretimos(ArrayList<SalvaEmprestimo> empresta)
  {
    FileOutputStream fout = null;
    try
    (PrintWriter writer = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\GerenciaBiblioteca\\GereciaBilioteca\\LivrosEmprestados\\livros.csv", "UTF-8")) {

      for (SalvaEmprestimo empLivro : empresta)
      {
        writer.println(empLivro.getAsCSVLineEmp());
      }
      JOptionPane.showMessageDialog(null, "Emprestimo com sucesso");
    } catch (Exception ex)
    {
      System.out.println("Erro: " + ex.getMessage());
    }
  }

  public void salvaEmpLivro(String nomeAluno, String nomeLivro, String dataEmprest, String dataEntrega)
  {
    ArrayList<SalvaEmprestimo> salvEmp = loadAllLivros();
    salvEmp.add(new SalvaEmprestimo(nomeAluno, nomeLivro, dataEmprest, dataEntrega));
    saveAllEmpretimos(salvEmp);    
  }

  public ArrayList<SalvaEmprestimo> loadAllLivros()
  {
    ArrayList<SalvaEmprestimo> carregEmpre = new ArrayList();

    try
    {
      Scanner arq;
      arq = new Scanner(new File("C:\\Users\\User\\Documents\\NetBeansProjects\\GerenciaBiblioteca\\GereciaBilioteca\\LivrosEmprestados\\livros.csv"));

      while (arq.hasNextLine())
      {
        String linha = arq.nextLine();
        SalvaEmprestimo l = new SalvaEmprestimo(linha);
        carregEmpre.add(l);
      }
    } catch (Exception ex)
    {
      System.out.println("erro ao ler dados: " + ex.getMessage());
    }
    return carregEmpre;
  }

  public void leituraEmpre()
  {
    ArrayList<SalvaEmprestimo> lerArq = loadAllLivros();
    for (SalvaEmprestimo empreSalvos : lerArq)
    {
      System.out.println(empreSalvos.getAsCSVLineLer());
    }
  }  
}
