class Rectangle{
    private float length, breadth;
    public void setData(float l, float b){
        this.length = l;
        this.breadth = b;
    }
    public float rectArea(){
        return length*breadth;
    }
}

class RectangleMain{
    public static void main(String args[]){
        Rectangle obj1 = new Rectangle();
        obj1.setData(Float.parseFloat(args[0]), Float.parseFloat(args[1]));
        Rectangle obj2 = new Rectangle();
        obj2.setData(Float.parseFloat(args[2]), Float.parseFloat(args[3]));
        System.out.println("1st rectangle's area = "+obj1.rectArea());
        System.out.println("2nd rectangle's area = "+obj2.rectArea());
    }
}