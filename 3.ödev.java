import java.util.Random;

public class MatrisIslemleri {

    public static void main(String[] args) {
        // İlk matrisin boyutları
        int satir1 = 2;
        int sutun1 = 3;

        // İkinci matrisin boyutları
        int satir2 = 4;
        int sutun2 = 2;

        // İki matrisi oluşturalım
        int[][] matris1 = new int[satir1][sutun1];
        int[][] matris2 = new int[satir2][sutun2];

        // Random nesnesi oluşturalım
        Random rand = new Random();

        // İlk matrisi random olarak dolduralım ve ekrana yazdıralım
        System.out.println("Matris 1:");
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                matris1[i][j] = rand.nextInt(10); // 0 ile 9 arasında random sayılar
                System.out.print(matris1[i][j] + " ");
            }
            System.out.println();
        }

        // İkinci matrisi random olarak dolduralım ve ekrana yazdıralım
        System.out.println("\nMatris 2:");
        for (int i = 0; i < satir2; i++) {
            for (int j = 0; j < sutun2; j++) {
                matris2[i][j] = rand.nextInt(10); // 0 ile 9 arasında random sayılar
                System.out.print(matris2[i][j] + " ");
            }
            System.out.println();
        }

        // Çarpım işlemi için bir matris oluşturalım
        int[][] carpim = new int[satir1][sutun2];

        // İki matrisi çarparak çarpım matrisini hesaplayalım
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun2; j++) {
                for (int k = 0; k < sutun1; k++) {
                    carpim[i][j] += matris1[i][k] * matris2[k][j];
                }
            }
        }

        // Çarpım matrisini ekrana yazdıralım
        System.out.println("\nÇarpım Matrisi:");
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun2; j++) {
                System.out.print(carpim[i][j] + " ");
            }
            System.out.println();
        }

        // Toplama işlemi için bir matris oluşturalım
        int[][] toplam = new int[satir1][sutun1]; // veya satir2, sutun2 de olabilirdi, çünkü aynı boyutta

        // İki matrisi toplayarak toplam matrisini hesaplayalım
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                toplam[i][j] = matris1[i][j] + matris2[i][j];
            }
        }

        // Toplam matrisini ekrana yazdıralım
        System.out.println("\nToplam Matrisi:");
        for (int i = 0; i < satir1; i++) {
            for (int j = 0; j < sutun1; j++) {
                System.out.print(toplam[i][j] + " ");
            }
            System.out.println();
        }
    }
}