import java.util.Random;

public class vektorhoca {

    public static void main(String[] args) {
        // Vektör ve matris boyutunu belirleyelim
        int boyut = 2;

        // İlk vektörü ve matrisi oluşturalım
        int[] vektor = new int[boyut];
        int[][] matris = new int[boyut][boyut];

        // Random nesnesi oluşturalım
        Random rand = new Random();

        // Vektörü random olarak dolduralım
        System.out.print("Vektör: ");
        for (int i = 0; i < boyut; i++) {
            vektor[i] = rand.nextInt(10); // 0 ile 10 arasında random sayılar
            System.out.print(vektor[i] + " ");
        }
        System.out.println();

        // Matrisi random olarak dolduralım ve ekrana yazdıralım
        System.out.println("Matris:");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                matris[i][j] = rand.nextInt(10); // 0 ile 10 arasında random sayılar
                System.out.print(matris[i][j] + " ");
            }
            System.out.println();
        }

        // Çarpım işlemi için bir matris oluşturalım
        int[][] carpim = new int[boyut][boyut];

        // Vektörü matrisle çarparak çarpım matrisini hesaplayalım
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                carpim[i][j] = vektor[i] * matris[i][j];
            }
        }

        // Çarpım matrisini ekrana yazdıralım
        System.out.println("Çarpım Matrisi:");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(carpim[i][j] + " ");
            }
            System.out.println();
        }

        // Toplama işlemi için bir matris oluşturalım
        int[][] toplam = new int[boyut][boyut];

        // Vektörü matrisle toplayarak toplam matrisini hesaplayalım
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                toplam[i][j] = vektor[i] + matris[i][j];
            }
        }

        // Toplam matrisini ekrana yazdıralım
        System.out.println("Toplam Matrisi:");
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(toplam[i][j] + " ");
            }
            System.out.println();
        }
    }
}