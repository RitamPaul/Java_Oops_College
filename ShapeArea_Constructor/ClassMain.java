import java.util.Scanner;
import java.lang.Math;

class Shape{
    private double length=0, breadth=0, side=0, a=0, b=0, c=0;

    Shape(double x, double y, double z){
        if(x!=0)   this.a = x;
        if(y!=0)   this.b = y;
        if(z!=0)   this.c = z;
    }

    Shape(double l, double b){
        if(l!=0)   this.length = l;
        if(b!=0)   this.breadth = b;
    }

    Shape(double s){
        if(s!=0)   this.side = s;
    }

    public void area(){
        if(side != 0){
            System.out.println("Area of your shape as square = "+(side*side));
            System.out.println("Area of your shape as circle = "+(3.14*side*side));
        }
        else if(length!=0 && breadth!=0){
            System.out.println("Area of your shape as rectangle = "+(length*breadth));
        }
        else{
            double s = (a+b+c)/2;
            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("Area of your shape as triangle = "+area);
        }
    }
}

class ClassMain{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("\nMaximum 3 inputs are allowed \nEmpty input denotes value = 0");
        System.out.println("\nEnter your arguments :- ");
        double arr[] = {0,0,0};
        for(int i=0; i<3; ++i){
            System.out.print("["+(i+1)+"] = ");
            String f = scan.nextLine();
            if(!f.equals(""))   arr[i]=Double.parseDouble(f);
            else if(f.equals(""))   break;
        }

        if(arr[2]!=0){
            Shape sq = new Shape(arr[0], arr[1], arr[2]);
            sq.area();
        }
        else if(arr[1]!=0){
            Shape sq = new Shape(arr[0], arr[1]);
            sq.area();
        }
        else{
            Shape sq = new Shape(arr[0]);
            sq.area();
        }

        scan.close();
    }
}