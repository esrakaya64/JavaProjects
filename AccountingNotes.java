
package accountingnotes;

import java.util.Scanner;


public class AccountingNotes {

 
    public static void main(String[] args) {
     int [][] note = new int[5][2];
        note[0][0] = 50;
        note[0][1] = 45;
        note[1][0] = 65;
        note[1][1] = 85;
        note[2][0] = 12;
        note[2][1] = 35;
        note[3][0] = 85;
        note[3][1] = 48;
        note[4][0] = 46;
        note[4][1] = 54;
        
  // We take student number from user.
    Scanner scan = new Scanner(System.in);
        System.out.println("Please enter student number");
        int number = scan.nextInt();
        int sum = note[number][0] + note[number][1];
        double average = sum/2;
   // We want to avarage and final note is greater than 50 for successfullity.
    if(average >= 50 && note[number][1]>50 ){
            System.out.println("Average is " + average + "SUCCESSFULL");
}
    else{
            System.out.println("Average is " + average + "UNSUCCESSFULL");
}
    
    
}
}
