
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int suma = sumOfNumbers(numbers);
        System.out.println("Suma numerelor este: " + suma);


        int numarulDeNumereImpare = numereImpare(numbers);
        System.out.println("Numarul de elemente impare este: " + numarulDeNumereImpare);


        int[] numbers2 = {10, 20, 30, 40, 50, 60};
        int limita = 30;
        List<Integer> rezultat = numereMaiMari(numbers2, limita);
        System.out.println("Numerele mai mari decat " + limita + " sunt: " + rezultat);


        int sumaDorita = 1000;
        donatiiPentruSumaDorita(sumaDorita);


        int numarMaximDeDonatii = 10;
        donatiiPentruSumaDorita2(sumaDorita, numarMaximDeDonatii);


        String fraza = "Aceasta este o propozitie. Iar aceasta este a doua propozitie. Si aceasta este a treia propozitie.";
        afiseazaPropozitii(fraza);



    }

    public static int sumOfNumbers(int[] array) {
        int sum = 0;
        for(int number : array) {
            sum += number;
        }
        return sum;
    }

    public static int numereImpare(int[] array){
        int numarImpare = 0;
        for(int numar : array) {
            if(numar % 2 != 0){
                numarImpare++;
            }
        }
        return numarImpare;
    }

    public static List<Integer> numereMaiMari(int[] array, int number){
        List<Integer> rezultat = new ArrayList<>();
        for(int numar : array){
            if(numar > number){
                rezultat.add(numar);
            }
        }
        return rezultat;
    }


    public static void donatiiPentruSumaDorita(int sumaDorita){
        Random random = new Random();
        int sumaTotala = 0;

        while(sumaTotala < sumaDorita){
            int donatie = random.nextInt(100);
            sumaTotala += donatie;
            System.out.println("S-a primit o donatie de: " + donatie + " lei.");
        }
        System.out.println("Suma dorita pentru donatii a fost atinsa! Suma totala: " + sumaTotala + " lei.");
    }

    public static void donatiiPentruSumaDorita2(int sumaDorita, int numarMaximDonatii){
        Random random = new Random();
        int sumaTotala = 0;
        int numarDonatii = 0;

        while(sumaTotala < sumaDorita && numarDonatii < numarMaximDonatii){
            int donatie = random.nextInt(100);
            sumaTotala += donatie;
            numarDonatii++;

            System.out.println("S-a primit o denatie de " + donatie + " lei");
        }

        if(sumaTotala >= sumaDorita){
            System.out.println("Suma dorita pentru donatii a fost atinsa. Suma totala este: " + sumaTotala + " lei");
        } else if (numarDonatii == numarMaximDonatii) {
            System.out.println("Campania de donatii s-a incheiat. Suma totala: " + sumaTotala + " lei");
        }
    }

    public static void afiseazaPropozitii(String fraza){
        String[] propozitii = fraza.split("\\.");

        for(String propozitie : propozitii) {
            System.out.println(propozitie.trim());
        }
    }
}













