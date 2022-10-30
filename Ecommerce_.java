
package ecommerce_;

import java.util.Scanner;


public class Ecommerce_ {


    public static void main(String[] args) {
        CreditCard creditCard1 = new CreditCard(000000, "Esra Kaya", 152, "05.29");
        User user1 = new User("Esra", "Kaya","05.11.2001", "eskaya64@gmail.com", "sfdgfhgjhkjl",
        "adres1", "adres2", 0, "product1", creditCard1);
        Product product1 = new Product("uzun elbise", "kırmızı", "elbise", 12, 0.25, "52055");
        
        CreditCard creditCard2 = new CreditCard(0000010, " Burak Refik Erdem", 162, "05.29");
        User user2 = new User("Burak Refik", "Erdem","29.10.2001", "brk.1903@gmail.com", "sfdgfhgjhkjl",
        "adres11", "adres22", 0, "product11", creditCard2);
        Product product2 = new Product("kot pantolon", "siyah", "pantolon", 12, 0.25, "52055");
        
        CreditCard creditCard3 = new CreditCard(000000, "İlayda Yıldız", 172, "05.28");
        User user3 = new User("İlayda", "Yıldız","04.09.2001", "iloşko@gmail.com", "sfdgfhgjhkjl",
        "adres111", "adres222", 0, "product111", creditCard3);
        Product product3 = new Product("mini elbise", "siyah", "elbise", 12, 0.25, "52055");
      
        Scanner scan = new Scanner(System.in);
        System.out.println("User: " +  user1.getName());
        System.out.print("Product: " );
        String numberWhat = scan.next();
        System.out.print("Product: ");
        System.out.println("How many product do you want? ");
        int howMany = scan.nextInt();
        System.out.println(product1.decreaseStock(howMany));

    }
   
    
}
