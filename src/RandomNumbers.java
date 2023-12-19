import java.util.Random;
class RandomNumbers extends Thread
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            Random rd=new Random();
            int randomInteger=rd.nextInt(100);
            System.out.println("Randm Number generated:
                    "+randomInteger);
            if((randomInteger%2)==0)
            {
                SquareThread sThread=new
                        SquareThread(randomInteger);
                sThread.start();
            }

            09-02-2022

            27

            27

else
            {
                CubeThread cThread=newCubeThread(randomInteger);
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
        System.out.println("Square of "+number+"=
                "+(number*number));
    }
}
class CubeThread extends Thread
{
    int number;

28

        28

    CubeThread(int randomNumbern)
    {
        number=randomNumbern;
    }
    public void run()
    {
        System.out.println("Cube of "+number+"=
                "+(number*number*number));
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
