package testabuscabinaria;

public class ArvoreBinariaBusca
{

  private NoArvoreBinaria raiz;

  public void arvoreBinariaBusca()
  {
    this.raiz = null;
  }

  public void imprime(NoArvoreBinaria no)
  {
    if (no != null)
    {
      imprime(no.getEsq());
      System.out.println(no.getInfo());
      imprime(no.getDir());
    }
  }

  public NoArvoreBinaria busca(int v)
  {
    return buscaAux(raiz, v);
  }

  private NoArvoreBinaria buscaAux(NoArvoreBinaria a, int v)
  {
    if (a == null)
    {
      return null;
    }
    else if (v < a.getInfo())
    {
      return buscaAux(a.getEsq(), v);
    }
    else if (v > a.getInfo())
    {
      return buscaAux(a.getEsq(), v);
    }
    else
    {
      return a;
    }
  }

  public void insere(int v)
  {
    raiz = insereAux(raiz, v);
  }

  private NoArvoreBinaria insereAux(NoArvoreBinaria no, int v)
  {
    if (no == null)
    {
      no = new NoArvoreBinaria(v);
      no.setInfo(v);
      no.setEsq(null);
      no.setDir(null);
    }
    else if (v < no.getInfo())
    {
      no.setEsq(insereAux(no.getEsq(), v));
    }
    else
    {
      no.setDir(insereAux(no.getDir(), v));
    }
    return no;
  }

  public void retira(int v)
  {
    retiraAux(raiz, v);
  }

  private NoArvoreBinaria retiraAux(NoArvoreBinaria no, int v)
  {
    if (no == null)
    {
      return null;
    }
    else if (v < no.getInfo())
    {
      no.setEsq(retiraAux(no.getEsq(), v));
    }
    else if (v > no.getInfo())
    {
      no.setDir(retiraAux(no.getDir(), v));
    }
    else if ((no.getEsq() == null) && (no.getDir() == null))
    {
      return null;
    }
    else if (no.getEsq() == null)
    {
      no = no.getDir();
    }
    else if (no.getDir() == null)
    {
      no = no.getEsq();
    }
    else
    {
      NoArvoreBinaria p = no.getEsq();
      while (p.getDir() != null)
      {
        p = p.getDir();
      }
      no.setInfo(p.getInfo());
      p.setInfo(v);
      no.setEsq(retiraAux(no.getEsq(), v));
    }
    return no;
  }

  @Override
  public String toString()
  {
    return toString(raiz);
  }

  public String toString(NoArvoreBinaria no)
  {
    String string = "<";
    if (no != null)
    {
      string += toString(no.getEsq());
      string += no.getInfo();
      string += toString(no.getDir());
    }
    string += ">";
    return string;
  }

  public String toStringDecrescente()
  {
    return toStringDecrescente(raiz);
  }

  public String toStringDecrescente(NoArvoreBinaria no)
  {
    String string = "<";
    if (no != null)
    {
      string += toStringDecrescente(no.getDir());
      string += no.getInfo();
      string += toStringDecrescente(no.getEsq());
    }
    string += ">";
    return string;
  }

  public int somaFolhas()
  {
    return somaFolhas(raiz);
  }

  public int somaFolhas(NoArvoreBinaria no)
  {
    if (no == null)
    {
      return 0;
    }

    if (no.getDir() == null && no.getEsq() == null)
    {
      return 1;
    }

    return somaFolhas(no.getDir()) + somaFolhas(no.getEsq());
  }

  public int maioresX(int x)
  {
    return maioresX(raiz, x);
  }

  public int maioresX(NoArvoreBinaria no, int x)
  {
    if (no == null)
    {
      return 0;
    }

    if (no.getInfo() > x)
    {
      return maioresX(no.getDir(), x) + maioresX(no.getEsq(), x) + 1;
    }
    else
    {
      return maioresX(no.getDir(), x);
    }
  }

}
