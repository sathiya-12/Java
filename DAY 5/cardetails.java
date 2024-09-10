import java.util.Scanner;
class Car{
    String make;
    String model;
    int year;
    double price;
    public Car(String make,String model,int year,double price){
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public void displaydetails(){
        System.out.println("CAR MAKE :"+make);
        System.out.println("CAR MODEL:"+model);
        System.out.println("CAR YEAR:"+year);
        System.out.println("CAR PRICE:"+price);
    }
}
public class cardetails{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        Car[] obj=new Car[2];
        for(int i=0;i<2;i++){
            System.out.println("Enter details for car " + (i + 1));
            System.out.print("ENTER THE CAR MAKE:");
            String make=scanner.nextLine();
            System.out.print("ENTER THE CAR MODLE:");
            String model=scanner.nextLine();
            System.out.print("ENTER THE CAR YEAR:");
            int year=scanner.nextInt();
            System.out.print("ENTER THE CAR PRICE:");
            double price=scanner.nextDouble();
            scanner.nextLine();
            obj[i]=new Car(make,model,year,price);
        }
        System.out.println("DISPLAY THE CAR DETAILS");
        for(Car car:obj){
        car.displaydetails();
        System.out.println();    
        }
        scanner.close();

    }
}