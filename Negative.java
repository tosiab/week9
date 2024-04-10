/**Tosia Bednarz, 
 * 4/10/24, 
 * Negative.java */
public class Negative{
    public static void main(String[]args){
        int sum = 0;
        int num1 = (int)(7*Math.random())-3;
        int num2 = (int)(7*Math.random())-3;
        int num3 = (int)(7*Math.random())-3;
        int num4 = (int)(7*Math.random())-3;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
        sum = num1+num2+num3+num4;
        if(sum<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Not Negative");
        }


    }

}