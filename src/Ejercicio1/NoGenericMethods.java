package Ejercicio1;

public class NoGenericMethods {

    private Object firstArgument;
    private Object secondArgument;
    private Object thirdArgument;

    public NoGenericMethods(Object firstArgument, Object secondArgument, Object thirdArgument){

        this.firstArgument = firstArgument;
        this.secondArgument = secondArgument;
        this.thirdArgument = thirdArgument;
    }

    public Object getFirstArgument() {
        return firstArgument;
    }

    public Object getSecondArgument() {
        return secondArgument;
    }

    public Object getThirdArgument() {
        return thirdArgument;
    }

    public void setFirstArgument(Object firstArgument) {
        this.firstArgument = firstArgument;
    }

    public void setSecondArgument(Object secondArgument) {
        this.secondArgument = secondArgument;
    }

    public void setThirdArgument(Object thirdArgument) {
        this.thirdArgument = thirdArgument;
    }

    public Object getAllArguments(){
        return "Primer Argumento: " + firstArgument + "\n" +
        "Segundo Argumento: " + secondArgument + "\n" +
        "Tercer Argumento: " + thirdArgument + "\n";
    }


}
