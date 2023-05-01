import java.util.Scanner;

class Add{
    public static float add(float a, float b){
        return a+b;
    }
}
class Multiply{
    public static float multi(float a, float b){
        return a*b;
    }
}
class Subtract{
    public static float sub(float a, float b){
        return a-b;
    }
}
class Divide{
    public static float div(float a, float b){
        return a/b;
    }
}

class Maths{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        float num1=0, num2=0;
        System.out.println("\nEmpty input signifies default value = 0");

        System.out.print("\nEnter your 1st number = ");
        String s1 = scan.nextLine();
        if(!s1.equals(""))  num1=Float.parseFloat(s1);
        for(int i=1; i>0; ++i){
            System.out.print("Enter your 2nd number = ");
            String s2 = scan.nextLine();
            if(!s2.equals("")){
                num2=Float.parseFloat(s2);
                break;
            }
            else
                System.out.println("This input can never be empty");
        }

        System.out.println("\nResults are :-");
        System.out.println(num1 + " + " + num2 + " = " + Add.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + Subtract.sub(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + Multiply.multi(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + Divide.div(num1, num2));
        scan.close();
    }
}