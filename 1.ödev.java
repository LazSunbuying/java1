package vektor;

public class vektorhoca {

    public static void main(String[] args) {
      
        int[] vektor1 = {2, 3};   // İlk vektörü tanımlayalım
    
        int[] vektor2 = {4, 5};     // İkinci vektörü tanımlayalım
        
        
        int[] carpim = new int[2]; // Çarpım işlemi için bir vektör oluşturalım
       
        for (int i = 0; i < 2; i++) {
            carpim[i] = vektor1[i] * vektor2[i];   // İki vektörü çarpalım
        }
        
        
        System.out.print("Vektörlerin Çarpımı: "); // Çarpım sonucunu ekrana yazdıralım
        for (int i = 0; i < 2; i++) {
            System.out.print(carpim[i] + " ");
        }
        System.out.println();
        
        
        int[] toplam = new int[2];  // Toplama işlemi için bir vektör oluşturalım

        for (int i = 0; i < 2; i++) {
            toplam[i] = vektor1[i] + vektor2[i];   // İki vektörü toplayalım
        }
        
        // Toplamı ekrana yazdıralım
        System.out.print("Vektörlerin Toplamı: "); Toplamı ekrana yazdıralım
        for (int i = 0; i < 2; i++) {
            System.out.print(toplam[i] + " ");
        }
        System.out.println();
    }
}