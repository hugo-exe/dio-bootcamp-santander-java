public class ExemploBreak {
 public static void main(String[] args) {
  for(int numero = 1; numero <= 5; numero ++) {
   if(numero == 3)
    continue;

   System.out.println(numero);
  }

  System.out.println("Exemplo com continue");

  for(int numero = 1; numero <= 5; numero ++) {
   if(numero == 3)
    break;

   System.out.println(numero);
  }
 }
}