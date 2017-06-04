package testapilha;

public class TestaPilha
{

  public static void main(String[] args) throws Exception
  {
    PilhaLista pl = new PilhaLista();
    pl.push(1);
    pl.push(10);
    pl.push(30);
    pl.push(40);
    pl.push(50);
    pl.push(1000000);

    System.out.println("Top: " + pl.top());
    System.out.println("Pop: " + pl.pop());
    System.out.println("Top: " + pl.top());
    pl.libera();
    System.out.println("Depois do Libera: " + pl.top());
  }
}
