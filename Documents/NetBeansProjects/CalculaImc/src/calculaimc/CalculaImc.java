package calculaimc;

import java.util.Scanner;

public class CalculaImc
{

  public static void main(String[] args)
  {
    Scanner tec = new Scanner(System.in);
    
    IMC pessoa = new IMC();
    
    System.out.println("Digite seu Nome");
    pessoa.setNome(tec.next());
    System.out.println("Digite seu Sexo");
    pessoa.setSexo(tec.next());
    System.out.println("Digite sua Idade");
    pessoa.setIdade(tec.next());
    System.out.println("Digite seu peso em Kg");
    pessoa.setPeso(tec.nextDouble());
    System.out.println("Digite sua Altura em metros");
    pessoa.setAltura(tec.nextDouble());
    
    pessoa.Resultado();
  }
  
}
