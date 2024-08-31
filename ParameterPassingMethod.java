import java.util.Scanner;
public class ParameterPassingMethod {
    //making of function
    public static int SumOfNum(int a,int b) {//here a and b are parameters or formal parameters 
        int sum=a+b;
        return sum;//return type is int hence to return any suitable value is necessary here
    } 
    public static int Multiply(int a,int b) {
        int mul=a*b;
        return mul;
    }
    public static int Subtract(int a,int b) {
        int sub=a-b;
        return sub;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        //calling of function
        int sum=SumOfNum(a,b);//arguments of actual parameters
        System.out.println("sum is"+sum);
        int mul=Multiply(a,b);
        System.out.println("multiply is"+mul);
        int sub=Subtract(a,b);
        System.out.println("subtract is"+sub);
        
    }
    
}
