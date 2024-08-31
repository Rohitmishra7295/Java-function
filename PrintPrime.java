public class PrintPrime {

    public static boolean IsPrime(int n){
        //to check prime or not 
        int d=2;
        while(d<n){
            if(n%d==0){
                return false;
            }
            d++;
        }
        return true;
    }

    public static void PrintPrime(int n){
        for(int i=2;i<=n;i++){
            boolean IsPrime=IsPrime(i);//one function PrintPrime is calling another function IsPrime
            if(IsPrime){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        PrintPrime(100);//function call in main it calls PrintPrime function
        
    }
}
