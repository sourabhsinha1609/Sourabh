import java.lang.*;

public class IllegalArgumentException extends Thread
{

    // the main method
    public static void main(String argvs[])
    {

        Thread.currentThread().setPriority(17);


        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

    }
}