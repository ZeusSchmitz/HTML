package testapilha;

class PilhaLista implements Pilha
{

  private NoLista topo;

  PilhaLista()
  {
    this.topo = null;
  }

  @Override
  public String toString()
  {
    return super.toString(); 
  }

  @Override
  public void push(int v) throws Exception
  {

    NoLista auxNovo = new NoLista();

    auxNovo.setInfo(v);
    auxNovo.setProx(topo);
    this.topo = auxNovo;
  }

  @Override
  public float pop() throws Exception
  {

    NoLista auxtopo = new NoLista();
    auxtopo = topo;

    if (vazia())
    {
      throw new Exception("Erro Pilha vazia!");
    }
    else
    {
      topo = topo.getProx();
      return auxtopo.getInfo();
    }

  }

  @Override
  public int top()
  {
    if (topo != null)
    {
      return topo.getInfo();
    }
    else
    {
      return 0;
    }

  }

  @Override
  public boolean vazia()
  {
    return this.topo == null;
  }

  @Override
  public void libera()
  {
    topo = null;
  }
}
