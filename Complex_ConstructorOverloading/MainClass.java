import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Complex{
    private float real, imag;
    Complex(){
        real=0, imag=0;
    }
    Complex(float r, float i){
        this.real=r;    this.imag=i;
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
    public static void main(String args[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Complex obj1=new Complex(), obj2=new Complex();

        System.out.print("Enter the real part of the 1st complex number = ");
        String r = input.readLine();
        System.out.print("Enter the imaginary part of the 1st complex number = ");
        String i = input.readLine();
        if(r=="")   obj1=New()
    }
}