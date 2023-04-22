import java.util.Scanner;

class Room{
    private float length=0, breadth=0, side=0;
    Room(String s){
        if(s!="")   this.side = Float.parseFloat(s);
    }
    Room(String l, String b){
        if(l!="")   this.length = Float.parseFloat(l);
        if(b!="")   this.breadth = Float.parseFloat(b);
    }
    Room(String l, String b, String s){
        if(s!="")   Room(s);
        else    Room(l,b);
    }
    public void display(int i){
        System.out.println("Room-" + i + " area as rectangle = " + length*breadth + " sq.units");
        System.out.println("Room-" + i + " area as square = " + side*side + " sq.units");
        System.out.println("Room-" + i + " perimeter as rectangle = " + 2*(length+breadth) + " units");
        System.out.println("Room-" + i + " perimeter as square = " + 4*side + " units");
    }
}

class RectangleMain{
    public static void main(String args[]){
        System.out.println("Empty input signifies default value = 0 unit");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length of 1st room as rectangle = ");
        String l = scan.nextLine();
        System.out.print("Enter breadth of 1st room as rectangle = ");
        String b = scan.nextLine();
        System.out.print("Enter side of 1st room as square = ");
        String s = scan.nextLine();
        Room obj1 = new Room(l, b, s);

        System.out.print("Enter length of 2nd room as rectangle = ");
        l = scan.nextLine();
        System.out.print("Enter breadth of 2nd room as rectangle = ");
        b = scan.nextLine();
        System.out.print("Enter side of 2nd room as square = ");
        s = scan.nextLine();
        Room obj2 = new Room(l, b, s);

        obj1.display(1);
        obj2.display(2);
    }
}