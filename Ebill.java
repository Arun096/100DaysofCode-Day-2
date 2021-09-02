import java.util.Scanner;
class Ebill
{
public static void main(String[] args)
  {
      type ob=new type();
      ob.getdata();
      ob.update();
      ob.display();
   }
 }
 class type
 {
    Scanner sc=new Scanner(System.in);
    Scanner scs=new Scanner(System.in);
    String cname;
    int num;
    double current,previous,units,tbill;
    void getdata()
    {
       System.out.print("Enter the consumer number:");
       num=sc.nextInt();
       System.out.print("Enter the consumer name:");
       cname= scs.nextLine();
       System.out.print("Enter previous month reading:");
       previous=sc.nextDouble();
       System.out.print("Enter current month reading:");
       current= sc.nextDouble();
    }
    void update()
    {
       units=current-previous;
       if(units<=100)
            tbill=1*units;
       else if(units>100 && units<=200)
            tbill=2.50*units;
       else if(units>200 && units<=500)
            tbill=4*units;
       else tbill= 6*units;
    }
    void display()
    {
		System.out.println();
        System.out.println("Consumer's number =" +num);
        System.out.println("Consumer's name =" +cname);
        System.out.println("Current Month Reading =" +current);
        System.out.println("Previous Month Reading =" +previous);
        System.out.println("Total units =" +units);
        System.out.println("Total bill =Rs" +tbill);
    }
}

