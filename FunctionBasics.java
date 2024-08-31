public class FunctionBasics{
    /*when we write any function code
     inside classess then it is known as methods of that function 
    */
    /*In function we don't need to write a particular logic again and again.
    We write logic of any program once and can perform that task as
     much time as we want by simply calling that function name.
      We can call the function any where in our program*/

      //making of function or method
    public static int Sum(){
        System.out.println(100+500);
        //System.out.println(100+500);
        return 2;
    }
    public static void PrintHelloWorld(){
        /*when return type of any function is 
        void we dont need to use retun function at the end*/ 
        System.out.println("hello world");
        System.out.println("hello world");
        System.out.println("hello world");
        return;//optional when retun type is void

        //Note:: we can make multiple function inside a single class
    }
    public static void main(String[] args) {
        //calling of function
        Sum();
        Sum();
        PrintHelloWorld();
    }
}