import java.util.*;

class shape{
    public  void calculateArea()
    {
        System.out.println("Calculating the areas -->");
    }
}

class circle extends shape{

    public void calculateArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the radius of the rectangle=");
        int radius=sc.nextInt();
        float area= (float) (3.14*radius*radius);// ekahnea typecsting baboher kora hoche.
        System.out.println("The area of the circle is--> "+area);

    }
}

class rectangle extends shape{

    public void calculateArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Height and the Area of the rectangle=");
        int height=sc.nextInt();
        int leangth=sc.nextInt();
        float area= (float) (height * leangth);// ekahnea typecsting baboher kora hoche.
        System.out.println("The area of the rectangle is--> "+area);

    }
}

class triangle extends shape{

    public void calculateArea()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Base and the perpendicular height of the rectangle=");
        int base=sc.nextInt();
        int perpendicuar_height=sc.nextInt();
        float area= (float) (0.5*base*perpendicuar_height);// ekahnea typecsting baboher kora hoche.
        System.out.println("The area of the circle is--> "+area);

    }
}

public class areacalculation {
    public static void main(String[] args) {

        shape a1=new shape();
        circle c1= new circle();
        rectangle r1=new rectangle();
        triangle t1=new triangle();

        a1.calculateArea();
        c1.calculateArea();
        r1.calculateArea();
        t1.calculateArea();

    }
}
