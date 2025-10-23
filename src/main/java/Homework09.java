/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MoaathAlrajab
 */
public class Homework09 {

 public static void main(String[] args) {
        System.out.println(triangleNumbers(100));
    }
    
    public static long triangleNumbers(int n) {
        long triangleNumber = 1;
        long naturalNumber = 1;
        
        while (true) {
            naturalNumber++;
            triangleNumber += naturalNumber;
            
            int divisorCount = countDivisors(triangleNumber);
            
            if (divisorCount > n) {
                return triangleNumber;
            }
        }
    }
    
    public static int countDivisors(long num) {
        int count = 0;
        
        for (long i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                count += 2;
                
                if (i * i == num) {
                    count--;
                }
            }
        }
        
        return count;
    }
}
