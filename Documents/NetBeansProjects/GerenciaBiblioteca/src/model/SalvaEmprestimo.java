package model;

import java.io.Serializable;

public class SalvaEmprestimo  implements Serializable
{
  private String nomeAluno;
  private String nomeLivro;
  private String dataEmprestimo;
  private String dataEntrega;

  public SalvaEmprestimo(String nomeAluno, String nomeLivro, String dataEmprestimo, String dataEntrega)
  {
    this.nomeAluno = nomeAluno;
    this.nomeLivro = nomeLivro;
    this.dataEmprestimo = dataEmprestimo;
    this.dataEntrega = dataEntrega;
  }

  public SalvaEmprestimo()
  {
  }

  public SalvaEmprestimo(String linha)
  {
    // remove espacos
    linha = linha.replaceAll("\\s+", "");

    // configura os devidos valores
    String[] parts = linha.split(",");
    this.nomeAluno = parts[0];
    this.nomeLivro = parts[1];
    this.dataEmprestimo = parts[2];
    this.dataEntrega = parts[3];
  }
  
  public String getAsCSVLineEmp()
  {
    return this.getNomeAluno()+ ","
            + this.getNomeLivro()+ ","
            + this.getDataEmprestimo()+ ","
            + this.getDataEntrega();
  }

  public String getAsCSVLineLer()
  {
    return this.getNomeAluno()+ ","
            + this.getNomeLivro()+ ","
            + this.getDataEmprestimo()+ ","
            + this.getDataEntrega();
  }

  public String getNomeAluno()
  {
    return nomeAluno;
  }

  public void setNomeAluno(String nomeAluno)
  {
    this.nomeAluno = nomeAluno;
  }

  public String getNomeLivro()
  {
    return nomeLivro;
  }

  public void setNomeLivro(String nomeLivro)
  {
    this.nomeLivro = nomeLivro;
  }

  public String getDataEmprestimo()
  {
    return dataEmprestimo;
  }

  public void setDataEmprestimo(String dataEmprestimo)
  {
    this.dataEmprestimo = dataEmprestimo;
  }

  public String getDataEntrega()
  {
    return dataEntrega;
  }

  public void setDataEntrega(String dataEntrega)
  {
    this.dataEntrega = dataEntrega;
  }
  
  
}
