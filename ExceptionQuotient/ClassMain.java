import java.util.Scanner;

class ClassMain{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the dividend = ");
        float dividend = scan.nextFloat();
        scan.nextLine();
        System.out.print("Enter the divisor = ");
        float divisor = scan.nextFloat();
        scan.nextLine();
        float quotient=0, count=0;
        try{
            quotient = dividend / divisor;
            if(quotient==Float.POSITIVE_INFINITY || quotient==Float.NEGATIVE_INFINITY)
                throw new Exception("Divided by 0");
        }
        catch(Exception e){
            System.out.println(e);
            count++;
        }
        finally{
            if(quotient==-1)
                System.out.println("Exception: quotient = -1");
            else if(count==0)
                System.out.println(dividend+" / "+divisor+" = "+quotient);
        }
        scan.close();
    }
}