import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Algorytm wydawania reszty");
        System.out.println("Jaka kwote masz do zaplaty");
        int zaplata = (int) ((scanner.nextDouble()) * 100);
        System.out.println("Ile pieniędzy dałes");
        int kwotaWplacona = (int) ((scanner.nextDouble()) * 100);
        int [] moneyArray = {50000,20000,10000,5000,2000,1000,500,200,100,5,2,1};
        int rest = kwotaWplacona-zaplata;
        int [] reszta = givingChange(moneyArray,rest);
        for (int i = 0; i<reszta.length;i++) {
            System.out.println("Banknot o wartosci "+((double)(moneyArray[i]))/100+" jest tutaj w ilosci: "+reszta[i]);
        }
    }

    public static int[] givingChange(int[] moneyArray,int rest){
        int size = moneyArray.length;
        int[] amountOfMoney = new int[size];
        for (int i=0;i<size;i++) amountOfMoney[i] = 0;
        int i=0;

        while (rest>0) {
            amountOfMoney[i] = rest/moneyArray[i];
            rest -= amountOfMoney[i]*moneyArray[i];
            i++;
        }
        return amountOfMoney;
    }
}