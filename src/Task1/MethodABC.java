package Task1;

public class MethodABC {

    public void methodA(String input)   {
        System.out.println("A");
        if (input.equals("Banana")) {
            methodB("Start");
        }else{
            System.out.println("Have you written banana in the parameter");

        }
    }
    public void methodB(String Start)   {

        System.out.println("Hello this is B, if A method works, this is the message you get");
        if(Start.isEmpty())   {
            methodC("Check");
        }

    }
    public void methodC(String input)   {
        System.out.println("Hello I am C");
    }
    public void methodD(int number)   {
        System.out.println("Im Bored C is checking out");
        if (number == 5)    {
            System.out.println("Congratzzz you have written 5 in the parameter" + " , " +"I dont want to continue this assignment");
        }
    }
}
