package testapilha;

public interface Pilha
{

  public void push(int v) throws Exception;

  public float pop() throws Exception;

  public int top();

  public boolean vazia();

  public void libera();
}
