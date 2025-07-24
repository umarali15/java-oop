

import java.util.Arrays;
public class temp {
     private int[] temperature;
    private double[] smooth;

   
    public temp(int[] temperature) {
        this.temperature = temperature;
        this.smooth = new double[temperature.length];
    }

   
    public void smooth() {
        int n = temperature.length;
        if (n == 0) return;

        if (n == 1) {
            smooth[0] = temperature[0];
            return;
        }

        smooth[0] = temperature[0];
        smooth[n - 1] = temperature[n - 1];

        for (int i = 1; i < n - 1; i++) {
            smooth[i] = (temperature[i - 1] + temperature[i] + temperature[i + 1]) / 3.0;
        }
    }

   
    public void displayInfo() {
        System.out.println("Original temperatures = " + Arrays.toString(temperature));
        System.out.println("Smoothed temperatures = " + Arrays.toString(smooth));
    }
}
// main class
import java.util.Scanner;
public class Tem {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter number of temperature readings: ");
        int n = sc.nextInt();

        int[] temps = new int[n];

     
        System.out.println("Enter the temperatures:");
        for (int i = 0; i < n; i++) {
            temps[i] = sc.nextInt();
        }

     
        temp processor = new temp(temps);
        processor.smooth();         
        processor.displayInfo();    

        sc.close();
 
    }
}

