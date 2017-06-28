package testabuscabinaria;

public class TestaBuscaBinaria
{

  public static void main(String[] args)
  {
    ArvoreBinariaBusca arvoreBinariaBusca = new ArvoreBinariaBusca();
    arvoreBinariaBusca.insere(6);
    arvoreBinariaBusca.insere(8);
    arvoreBinariaBusca.insere(2);
    arvoreBinariaBusca.insere(-3);
    arvoreBinariaBusca.insere(73);

    System.out.println(arvoreBinariaBusca.toString());
    System.out.println(arvoreBinariaBusca.toStringDecrescente());

    System.out.println("SomaFolhas= " + arvoreBinariaBusca.somaFolhas());
    System.out.println("Maiores que -3= " + arvoreBinariaBusca.maioresX(-3));
    System.out.println("Maiores que -1= " + arvoreBinariaBusca.maioresX(-1));
    System.out.println("Maiores que 6= " + arvoreBinariaBusca.maioresX(6));
    System.out.println("Maiores que 50= " + arvoreBinariaBusca.maioresX(50));
    System.out.println("Maiores que 73= " + arvoreBinariaBusca.maioresX(73));

    System.out.println("Retira -3");
    arvoreBinariaBusca.retira(-3);
    System.out.println(arvoreBinariaBusca.toString());

    System.out.println("Retira 6");
    arvoreBinariaBusca.retira(6);
    System.out.println(arvoreBinariaBusca.toString());

    System.out.println("Retira 73");
    arvoreBinariaBusca.retira(73);
    System.out.println(arvoreBinariaBusca.toString());

    System.out.println("Retira 100");
    arvoreBinariaBusca.retira(100);
    System.out.println(arvoreBinariaBusca.toString());

    System.out.println("Retira 2");
    arvoreBinariaBusca.retira(2);
    System.out.println(arvoreBinariaBusca.toString());
  }
}
