package calculaimc;

class IMC
{
  private String nome;
  private String sexo;
  private String idade;
  private double peso;
  private double altura;
  
  
  Double Imc()
  {
    return getPeso()/(getAltura()*getAltura());
  }
          
  String Situacao()
  { 
    if(Imc() < 18.5)
    {
      return "Abaixo do peso normal";
    }
    else
    {
      if((Imc() >= 18.5)&&(Imc() <= 25))
      {
        return "Peso normal";
      }
      else
      {
        if((Imc() >= 25)&&(Imc() <= 30))
        {
          return "Acima do peso normal";
        }
        else
        {
          if(Imc() >30)
          {
            return "Obesidade";
          }
        }
      }
    }
    return "Valor invalido"; 
  }
  void Resultado()
  {
    System.out.println("---------------------------------");
    System.out.println("Nome: " + getNome());
    System.out.println("Sexo: " + getSexo());
    System.out.println("Idade: " + getIdade());
    System.out.println("Seu IMC é de " + Imc() + "e sua situação é " + Situacao());
  }
  
  public double getPeso()
  {
    return peso;
  }

  public void setPeso(double peso)
  {
    this.peso = peso;
  }

  public double getAltura()
  {
    return altura;
  }

  public void setAltura(double altura)
  {
    this.altura = altura;
  }

  public String getIdade()
  {
    return idade;
  }

  public void setIdade(String idade)
  {
    this.idade = idade;
  }
  
  public String getNome()
  {
    return nome;
  }

  public void setNome(String nome)
  {
    this.nome = nome;
  }

  public String getSexo()
  {
    return sexo;
  }

  public void setSexo(String sexo)
  {
    this.sexo = sexo;
  }
    
}
