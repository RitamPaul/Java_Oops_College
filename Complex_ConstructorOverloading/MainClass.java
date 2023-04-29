import java.util.Scanner;

class Complex{
    public float real, imag;
    Complex(){
        real=0;
        imag=0;
    }
    Complex(String r, String i){
        this();
        if(!r.equals(""))   this.real=Float.parseFloat(r);
        if(!i.equals(""))   this.imag=Float.parseFloat(i);
    }
    Complex(Complex obj){
        this.real=obj.real;
        this.imag=obj.imag;
    }
    public Complex add(Complex obj1, Complex obj2){
        Complex ans = new Complex();
        ans.real = obj1.real+obj2.real;
        ans.imag = obj1.imag+obj2.imag;
        return ans;
    }
    public Complex sub(Complex obj1, Complex obj2){
        Complex ans = new Complex();
        ans.real = obj1.real-obj2.real;
        ans.imag = obj1.imag-obj2.imag;
        return ans;
    }
    public Complex mul(Complex obj1, Complex obj2){
        Complex ans = new Complex();
        ans.real = (obj1.real*obj2.real)-(obj1.imag*obj2.imag);
        ans.imag = (obj1.real*obj2.imag)+(obj1.imag*obj2.real);
        return ans;
    }
}

class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        Complex obj1=new Complex(), obj2=new Complex();

        System.out.print("\nEnter the real part of 1st complex number = ");
        String r = input.nextLine();
        System.out.print("Enter the imaginary part of 1st complex number = ");
        String i = input.nextLine();
        obj1 = new Complex(r, i);

        System.out.print("Want to copy previous values & create another complex number ? (1/0) = ");
        int ch = input.nextInt();
        input.nextLine();
        if(ch==1){
            obj2 = new Complex(obj1);
        }
        else{
            System.out.print("Enter the real part of 2nd complex number = ");
            r = input.nextLine();
            System.out.print("Enter the imaginary part of 2nd complex number = ");
            i = input.nextLine();
            obj2 = new Complex(r, i);
        }

        Complex ans = new Complex();
        System.out.println("\nThe results are :-");
        ans = ans.add(obj1, obj2);
        System.out.println("("+obj1.real+" + "+obj1.imag+"i) + ("+obj2.real+" + "+obj2.imag+"i) = ("+ans.real+" + "+ans.imag+"i)");

        ans = ans.mul(obj1, obj2);
        System.out.println("("+obj1.real+" + "+obj1.imag+"i) * ("+obj2.real+" + "+obj2.imag+"i) = ("+ans.real+" + "+ans.imag+"i)");

        ans = ans.sub(obj1, obj2);
        System.out.println("("+obj1.real+" + "+obj1.imag+"i) - ("+obj2.real+" + "+obj2.imag+"i) = ("+ans.real+" + "+ans.imag+"i)");

        input.close();
    }
}