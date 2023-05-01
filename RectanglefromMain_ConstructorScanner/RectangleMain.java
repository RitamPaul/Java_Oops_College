import java.util.Scanner;

class Rectangle{
    private float length=1, breadth=1;
    Rectangle(String l, String b){
        if(!l.equals(""))   this.length = Float.parseFloat(l);
        if(!b.equals(""))   this.breadth = Float.parseFloat(b);
    }
    public float rectArea(){
        return length*breadth;
    }
}

class RectangleMain{
    public static void main(String args[]){
        System.out.println("Empty input signifies default value = 1 units");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of 1st rectangle = ");
        String l = scan.nextLine();
        System.out.print("Enter breadth of 1st rectangle = ");
        String b = scan.nextLine();
        Rectangle obj1 = new Rectangle(l, b);

        System.out.print("Enter length of 2nd rectangle = ");
        l = scan.nextLine();
        System.out.print("Enter breadth of 2nd rectangle = ");
        b = scan.nextLine();
        Rectangle obj2 = new Rectangle(l, b);

        System.out.println("1st rectangle's area = "+obj1.rectArea()+" sq.units");
        System.out.println("2nd rectangle's area = "+obj2.rectArea()+" sq.units");
        scan.close();
    }
}