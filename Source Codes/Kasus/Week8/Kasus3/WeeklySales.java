package Kasus.Week8.Kasus3;

// *************************************************************
// WeeklySales.java
//
// Sorts the sales staff in descending order by sales.
// ************************************************************
import java.util.Scanner;
public class WeeklySales
{
    public static void main(String[] args)
    {
        // Salesperson[] salesStaff = new Salesperson[10];
        // salesStaff[0] = new Salesperson("Jane", "Jones", 3000);
        // salesStaff[1] = new Salesperson("Daffy", "Duck", 4935);
        // salesStaff[2] = new Salesperson("James", "Jones", 3000);
        // salesStaff[3] = new Salesperson("Dick", "Walter", 2800);
        // salesStaff[4] = new Salesperson("Don", "Trump", 1570);
        // salesStaff[5] = new Salesperson("Jane", "Black", 3000);
        // salesStaff[6] = new Salesperson("Harry", "Taylor", 7300);
        // salesStaff[7] = new Salesperson("Andy", "Adams", 5000);
        // salesStaff[8] = new Salesperson("Jim", "Doe", 2850);
        // salesStaff[9] = new Salesperson("Walt", "Smith", 3000);
        Scanner scan = new Scanner(System.in);
        System.out.println("How many sales person? ");
        int size = scan.nextInt();
        Salesperson[] salesStaff = new Salesperson[size];
        for(int i=0;i<size;i++)
        {
            String firstName = scan.next();
            String lastName = scan.next();
            int totalSales = scan.nextInt();
            salesStaff[i] = new Salesperson(firstName, lastName, totalSales); 
        }
        Sorting.insertionSort(salesStaff);
        System.out.println ("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesStaff)
        System.out.println (s);
        scan.close();
    }
}
