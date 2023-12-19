import java.util.Random;
class RandomNumbers extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            Random rd=new Random();
            int randomInteger=rd.nextInt(100);
            System.out.println("Random Number generated: "+randomInteger);
            if((randomInteger%2)==0)
            {
                SquareThread sThread=new SquareThread(randomInteger);
                sThread.start();
            }
else
            {
                CubeThread cThread=new CubeThread(randomInteger);
                cThread.start();
            }
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
}
class SquareThread extends Thread
{
    int number;
    SquareThread(int randomNumbern)
    {
        number=randomNumbern;
    }
    public void run()
    {
        System.out.println("Square of "+number+"= "+(number*number));
    }
}
class CubeThread extends Thread
{
    int number;
    CubeThread(int randomNumbern)
    {
        number=randomNumbern;
    }
    public void run()
    {
        System.out.println("Cube of "+number+"= "+(number*number*number));
    }
}
class MultipleThreads
{
    public static void main(String args[])
    {
        RandomNumbers rn=new RandomNumbers();
        rn.start();
    }
}
/*Random Number generated: 76
Square of 76= 5776
Random Number generated: 86
Square of 86= 7396
Random Number generated: 46
Square of 46= 2116
Random Number generated: 87
Cube of 87= 658503
Random Number generated: 56
Square of 56= 3136
Random Number generated: 57
Cube of 57= 185193
Random Number generated: 76
Square of 76= 5776
Random Number generated: 80
Square of 80= 6400
Random Number generated: 2
Square of 2= 4
Random Number generated: 43
Cube of 43= 79507*/
