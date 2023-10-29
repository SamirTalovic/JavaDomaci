package dom;

import java.util.Scanner;

public class Domaci1 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Unesite broj X: ");
        int X = scanner.nextInt();
        for (int i = 100; i <= 999; i++) {
            int sumaCifara = sumaCifaraBroja(i);
            if (sumaCifara == X) {
                System.out.println(i);
            }
        }
        
        scanner.close();
    }
    
    public static int sumaCifaraBroja(int broj) {
        int suma = 0;
        
        while (broj > 0) {
            suma += broj % 10; 
            broj /= 10;         
        }
        
        return suma;
    }
}
