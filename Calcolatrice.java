package calcolatrice;

public class Calcolatrice {

     private int numero1;
     private int numero2;

     public Calcolatrice(int numero1, int numero2) {
          this.numero1 = numero1;
          this.numero2 = numero2;
     }

     public int somma() {
          return numero1 + numero2;
     }

     public static void main(String[] args) {
          int numero1 = 5;
          int numero2 = 3;

          Calcolatrice calcolatrice = new Calcolatrice(numero1, numero2);
          int risultato = calcolatrice.somma();

          System.out.println("La somma di " + numero1 + " e " + numero2 + " è: " + risultato);
     }

}
