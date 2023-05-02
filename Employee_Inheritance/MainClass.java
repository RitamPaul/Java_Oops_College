import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Employee{
    public String em_code="", em_name="", location="", mobile="";
    public double da=0, hra=0;
    Employee(String m_c, String m_name, String loc, String mob){
        this.em_code = m_c;
        this.em_name = m_name;
        this.location = loc;
        this.mobile = mob;
    }
}

class Teaching extends Employee{
    private String sub_sp="", desig="";
    private double b_pay=70000;
    Teaching(String m_c, String m_name, String loc, String mob, String s_sp, String des){
        super(m_c, m_name, loc, mob);
        sub_sp = s_sp;
        desig = des;
    }
    public void salary(){
        da = b_pay * 0.10;
        hra = b_pay * 0.20;
        System.out.println(em_name+" total salary = "+(b_pay + da + hra));
    }
}

class Office extends Employee{
    private String desig;
    private double b_pay=35000;
    Office(String m_c, String m_name, String loc, String mob, String des){
        super(m_c, m_name, loc, mob);
        desig = des;
    }
    public void salary(){
        da = b_pay * 0.10;
        hra = b_pay * 0.20;
        System.out.println(em_name+", your total salary = "+(b_pay + da + hra));
    }
}

class ClassMain{
    public static void main(String args[]) throws IOException{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String sp="";
            System.out.print("\nEnter your employee code = ");
            String code = input.readLine();
            System.out.print("Enter your name = ");
            String name = input.readLine();
            System.out.print("Enter your address = ");
            String loc = input.readLine();
            System.out.print("Enter your mobile no. = ");
            String mob = input.readLine();

            System.out.println("\nEnter 1 if you are Teacher or Enter 2 if you are Office staff");
            System.out.print("Enter your choice = ");
            int ch = Integer.parseInt(input.readLine());
            if(ch==1){                
                System.out.print("\nEnter your subject specialisation = ");
                sp = input.readLine();
            }
            else if(ch!=2){
                System.out.println("Exited");
                break;
            }

            System.out.print("Enter your designation = ");
            String des = input.readLine();

            if(ch==1){
                Teaching obj = new Teaching(code, name, loc, mob, sp, des);
                obj.salary();
            }
            else{
                Office obj = new Office(code, name, loc, mob, des);
                obj.salary();
            }

            System.out.print("\nWant to continue? (1/0) = ");
            int choice = Integer.parseInt(input.readLine());
            if(choice==0)   break;
        }
        input.close();
    }
}