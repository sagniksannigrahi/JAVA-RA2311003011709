public class class_named_Car {

    static class car{
        String model;
        int year;
        String colour;

      public void display_Carinfo()
      {
          System.out.println("The model of the SAGNIK's car is "+ model + ". It is a "+ year +" car.And the colour is "+colour);
      }
    }

    public static void main(String[] args) {

car c1=new car() ;
c1.model ="Suzuki";// string should be written inside a double bracket
c1.colour="white";
c1.year=2015;
c1.display_Carinfo();

car c2=new car() ;
c2.model ="Mahindra xuv";// string should be written inside a double bracket
c2.colour="Black";
c2.year=2023;
c2.display_Carinfo();

    }
}
