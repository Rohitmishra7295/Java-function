/*you are given a num n
 * you are given a digit d
 * you are required to calculate the frequency of digit d in num n
 */
import java.util.Scanner;
public class DigitFrequincy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println("Eneter the digit to find frequency");
        int d=sc.nextInt();

        int f=getDigitFrequency(n,d);
        System.out.println(f);
    }
    public static int getDigitFrequency(int n,int d){

        int frequency=0;

        while(n>0){
            int digit=n%10;
            n=n/10;

            if(digit==d){
                frequency++;
            }
        }
        return frequency;
    }
}
