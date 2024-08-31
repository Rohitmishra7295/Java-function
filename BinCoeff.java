public class BinCoeff {
    public static int factorial(int num){
        if (num<=1){
            return 1;
        }else{
            return num*factorial(num-1);
        }
    }

    public static int BinCoeff(int n,int r){
        int fact_n= factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int BinCoeff=fact_n/(fact_r*fact_nmr);
        return BinCoeff;
    }
    

    public static void main(String[] args) {
        
        System.out.println(BinCoeff(5,4));
    }
    
}
