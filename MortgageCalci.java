import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("enter the principal amount ($1000-$1,000,000):");
        float Principal = in.nextFloat();
        while(true) {
            if(Principal>=1000 && Principal<=1000000)
                break;
            else{
                System.out.println("please enter a valid principal amount between $1000 - $1,000,000");
                Principal = in.nextFloat();
            }
        }
        System.out.print("enter the rate of interest(1%-30%):");
        float rate=in.nextFloat();
        while(true) {
            if(rate>=1 && rate<=30)
                break;
            else{
                System.out.println("please enter a valid interest rate between 1% - 30%");
                rate = in.nextFloat();
            }
        }
        rate=rate/1200;
        System.out.print("enter the number of years(1-10):");
        int years=in.nextInt();
        while(true) {
            if(years>=1 && years<=30)
                break;
            else{
                System.out.println("please enter a valid period between 1 - 30");
                years = in.nextInt();
            }
        }
        years=years*12;
        float mathPower =(float)Math.pow(1 + rate, years);
        float Mort= Principal * (rate * mathPower / (mathPower - 1));
        NumberFormat dollars=NumberFormat.getCurrencyInstance(Locale.US);
        String result=dollars.format(Mort);
        System.out.println("The Mortgage is :"+result);
    }
}