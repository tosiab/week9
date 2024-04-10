import java.util.*;
public class Game21 {
    public static void main(String[]args){
        int sum1 = 0;
        int sum2 = 0;
        int newcard;
        int num1 = (int)(10*Math.random())+1;
        int num2 = (int)(10*Math.random())+1;
        int num3;
        int num4 = (int)(10*Math.random())+1;
        int num5 = (int)(10*Math.random())+1;
        int num6 = (int)(10*Math.random())+1;
        sum1 = num1+num2;
        sum2 = num4+num5+num6;
        Scanner input = new Scanner(System.in);
        System.out.println("You have a "+num1+" and a "+num2+" for a total of "+sum1+".");
        System.out.print("Enter a 1 if you want another card or any other number for no card.");
        newcard = input.nextInt();
        if (newcard == 1){
            num3 = (int)(10*Math.random())+1;
            sum1 = sum1 +num3;
            System.out.println("You got a "+num3+" for a total of "+sum1+".");
        }
        System.out.println("The dealer has a "+num4+", "+num5+", and "+num6+"for a total of "+sum2+".");
        if(sum1>21){
            System.out.println("Player loses.");
        }




    }
    
}
