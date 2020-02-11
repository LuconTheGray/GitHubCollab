/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancefromaverage;

import java.util.Scanner;

/**
 *
 * @author johng
 */
public class DistanceFromAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        double[] numbers = new double[15];
        double entry;
        double total = 0;
        double average = 0;
        final int QUIT = 99999;
        int x = 0, y = 0;
        
        System.out.println("Enter a numeric value or " + QUIT + " to quit : ");
        System.out.println("Enter my name");
        entry = input.nextDouble();
        while(entry != QUIT && x < numbers.length){
            numbers[x] = entry;
            total += numbers[x];
            ++x;
            if(x < numbers.length){
                System.out.println("Enter next number or " + QUIT + " to quit : ");
                entry = input.nextDouble();
            }
        }
        if(x == 0)
            System.out.println("Average cannot be calculated becayse no numbers were entered");
        else{
            average = total / x;
            System.out.println("You entered " + x + " numbers and their average is " + average);
            for(y = 0; y < x; ++y)
                System.out.println(numbers[y] + " is " + (numbers[y] - average) + " away from the average");
        }
        // TODO code application logic here
    }
    
}
