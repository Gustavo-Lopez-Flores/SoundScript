import java.util.Scanner;
  
public class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    final int MAX = 12;
    int i, j;
    double media, soma = 0.0;
    double mat[][] = new double[MAX][MAX];
    char conta;
    conta = ler.next().charAt(0);
    for(i = 0; i < MAX; i++){
      for(j = 0; j < MAX; j++){
        mat[i][j] = ler.nextDouble();
        if(j < i){
          if((j+i) > 11){
            soma += (double)mat[i][j];           
          }
        }
      }
    }
    if(conta == 'S'){
      System.out.printf("%.1f%n",soma);    
    }
    if(conta == 'M'){
      media = (double)soma/30;
      System.out.printf("%.1f%n",media);    
    }
  }
}