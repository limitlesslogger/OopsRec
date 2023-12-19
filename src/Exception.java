import java.util.Scanner;

class Exception{
    public static void divide(float n1 , float n2) throws ArithmeticException{
        if (n2 == 0)
            throw new ArithmeticException("Division By 0 Not Possible");
        else
            System.out.println("Result = " + (n1/n2));
    }

    public static void main(String args[]){
        try{
            Scanner s = new Scanner(System.in);
            System.out.print("Enter Your First Number: ");
            float a = s.nextFloat();
            System.out.print("Enter Your Second Number: ");
            float b = s.nextFloat();
            divide(a,b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        finally{
            System.out.println("Inside Finally Block");
        }
        System.out.println("Outside Finally Block");
    }
}
/*
Enter Your First Number: 6
Enter Your Second Number: 0
Inside Finally Block
java.lang.ArithmeticException: Division By 0 Not Possible
	at Exception.divide(Exception.java:6)
	at Exception.main(Exception.java:18)
Outside Finally Block

Enter Your First Number: 5
Enter Your Second Number: 2
Result = 2.5
Inside Finally Block
Outside Finally Block
*/
