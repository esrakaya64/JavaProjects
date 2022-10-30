/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExampleOfWhileLoop;

import java.util.Scanner;

/**
 *
 * @author Esra Kaya
 */
public class ExampleOfWhileLoop {

    //Bu kodda kullanıcıdan 0 ile 5 arasında bir sayı girmesini istiyoruz.
    public static void main(String[] args) {
       //Scanner komutuyla sayıyı istiyoruz
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 5");
        int number = input.nextInt();
        // Eğer geçersiz bir sayı girerse while döngüsü kullanarak kullanıcıya uyarı gönderiyoruz.
        while(number<0 || number>5){
            System.out.println("Please enter a valid number!!!");
            number = input.nextInt();
    }
        //Doğru sayı girdiğinde ise başarılı olduğunu gösteriyoruz.
        System.out.println("SUCCESSFULL!");
        
    }
    
}
