
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
 
    
    char[] tablica = {'z','x','c','Z','X','C'};
    
    int liczbaZmian = 0;
    for (int i = 0; i < tablica.length; i++){
      if (Character.isLowerCase(tablica[i])) {
        tablica[i] = Character.toUpperCase(tablica[i]);
        liczbaZmian++;
      }
    }
    
    String nowyTekst = new String(tablica);
    System.out.println(""+nowyTekst);
    System.out.println("ile zmian "+liczbaZmian);
  }
}
    
  
