
package Ejercicio2;

public class GenericMethods {

      public GenericMethods(){

    }

    public <T, U, K>  void showArguments(T firstArgument, U secondArgument, K thirdArgument){
    print(firstArgument);
    print(secondArgument);
    print(thirdArgument);

    }

    private <E> void print(E argument){
        System.out.println(argument);
    }

}
