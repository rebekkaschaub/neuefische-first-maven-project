public class Factorial {

    //Möglichkeit 1: forLoop
//    public static int factorial(int number){
//        int factorial = 1;
//
//        for (int i = 1; i<=number; i++){
//            factorial *=i;
//        }
//
//        return factorial;
//    }

    //Möglichkeit 2: whileLoop
//    public static int factorial(int number){
//        int factorial = 1;
//        int i =1;
//
//        while (i++<number){
//            factorial *=i;
//        }
//
//        return factorial;
//    }

    //Möglichkeit 3: rekursiv
    public static int factorial(int number){
        if(number<=0){
            return 1;
        }
        return factorial(number-1) * number;
    }
}
