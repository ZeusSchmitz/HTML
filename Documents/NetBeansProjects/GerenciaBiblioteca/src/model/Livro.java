package model;

import java.io.Serializable;

public class Livro implements Serializable
{

  private String nomeLivro;
  private String autor;
  private String id;

  public Livro(String nomeLivro, String autor, String id)
  {
    this.nomeLivro = nomeLivro;
    this.autor = autor;
    this.id = id;
  }

  public Livro()
  {

  }

  public Livro(String linha)
  {
    // remove espacos
    linha = linha.replaceAll("\\s+", "");

    // configura os devidos valores
    String[] parts = linha.split(",");
    this.nomeLivro = parts[0];
    this.autor = parts[1];
    this.id = parts[2];
  }

  public String getAsCSVLineCads()
  {
    return this.getNomeLivro() + ","
            + this.getAutor() + ","
            + this.getId();
  }

  public String getAsCSVLineLer()
  {
    return this.getNomeLivro()+ ","
            + this.getAutor()+ ","
            + this.getId();
  }

  public String getNomeLivro()
  {
    return nomeLivro;
  }

  public void setNomeLivro(String nomeLivro)
  {
    this.nomeLivro = nomeLivro;
  }

  public String getAutor()
  {
    return autor;
  }

  public void setAutor(String autor)
  {
    this.autor = autor;
  }

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

}
