package Task1;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[]args){
        MethodABC aA = new MethodABC();
        MethodABC bB = new MethodABC();
        MethodABC cC = new MethodABC();
        MethodABC dD = new MethodABC();
        aA.methodA("Banana");
        bB.methodB("");
        cC.methodC("Check");
        dD.methodD(5);
    }
}
