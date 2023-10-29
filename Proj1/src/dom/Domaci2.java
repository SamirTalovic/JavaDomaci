package dom;

import java.util.Scanner;

public class Domaci2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Unesite broj K: ");
        int K = scanner.nextInt();

        int brojPronadjenih = 0;
        for (int i = 999; i >= 100 && brojPronadjenih < 10; i--) {
            if (i % K == 0) {
                System.out.println(i);
                brojPronadjenih++;
            }
        }

        if (brojPronadjenih == 0) {
            System.out.println("Nema trocifrenih brojeva deljivih sa " + K);
        }

        scanner.close();
    }
}
