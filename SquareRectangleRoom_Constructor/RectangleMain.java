import java.util.Scanner;

class Room{
    private float length=0, breadth=0, side=0;
    Room(String l, String b){
        if(!l.equals(""))   this.length=Float.parseFloat(l);
        if(!b.equals(""))   this.breadth=Float.parseFloat(b);
    }
    Room(String s){
        if(!s.equals(""))   this.side=Float.parseFloat(s);
    }
    public void display(int i){
        System.out.println("\nRoom-" + i + " area as rectangle = " + length*breadth + " sq.units");
        System.out.println("Room-" + i + " area as square = " + side*side + " sq.units");
        if(length!=0 && breadth!=0)
            System.out.println("Room-" + i + " perimeter as rectangle = " + 2*(length+breadth) + " units");
        else
            System.out.println("Room-" + i + " perimeter as rectangle = " + 0.0 + " units");
        System.out.println("Room-" + i + " perimeter as square = " + 4*side + " units");
    }
}

class RectangleMain{
    public static void main(String args[]){
        Room obj1;
        Room obj2;
        System.out.println("\nEmpty input signifies default value = 0 unit");

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter length of room-1 as rectangle = ");
        String l = scan.nextLine();
        System.out.print("Enter breadth of room-1 as rectangle = ");
        String b = scan.nextLine();
        System.out.print("Enter side of room-1 as square = ");
        String s = scan.nextLine();
        if(!s.equals(""))   obj1 = new Room(s);
        else    obj1 = new Room(l,b);

        System.out.print("\nEnter length of room-2 as rectangle = ");
        l = scan.nextLine();
        System.out.print("Enter breadth of room-2 as rectangle = ");
        b = scan.nextLine();
        System.out.print("Enter side of room-2 as square = ");
        s = scan.nextLine();
        if(!s.equals(""))   obj2 = new Room(s);
        else    obj2 = new Room(l,b);

        obj1.display(1);
        obj2.display(2);
        scan.close();
    }
}