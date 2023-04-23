import java.util.Scanner;

class Fibo extends Thread{
    int num;

    Fibo(){
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the number of terms of fibonacci series (>2) = ");
        num = obj.nextInt();
    }

    public void run(){
        
        System.out.println("Fibo item 1 = "+0);
        //sleep time
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        System.out.println("Fibo item 2 = "+1);
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
        int a=0, b=1;
        for(int i=3; i<=num; ++i){
            int c=a+b;
            System.out.println("Fibo item "+i+" = "+c+" ");
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
            a = b;
            b = c;
        }
    }
}

class Prime extends Thread{
    int num;

    Prime(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number upto which prime no. to be calculated = ");
        num = obj.nextInt();
    }

    public void run(){
        int term = 1;
        //sleep time
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            System.out.println(e);
        }

        for(int i=2; i<=num; ++i){
            if(i==2){
                System.out.println("Prime term "+term+" = "+2+" ");
                term++;
                //sleep time
                try{
                    Thread.sleep(500);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                }
            }
            else{
                int flag=0;
                for(int j=2; j<i; ++j){
                    if(i%j==0){
                        flag=1;
                        break;
                    }
                }
                if(flag==0){
                    System.out.println("Prime term "+term+" = "+i+" ");
                    term++;
                    //sleep time
                    try{
                        Thread.sleep(500);
                    }
                    catch(InterruptedException e){
                        System.out.println(e);
                    }
                }
            }
        }
    }
}


public class Threading {
    public static void main(String args[]) {
        Fibo obj1 = new Fibo();
        Prime obj2 = new Prime();
        obj1.start();
        obj2.start();
    }
}