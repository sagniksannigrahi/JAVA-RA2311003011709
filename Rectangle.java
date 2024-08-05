public class Rectangle {

    static class Rectangle_work
    {
        double width ,height;
        public void area_cal()
        {
            double area = width * height;
            System.out.println("The rectangle area is "+ area);
        }
        public void perimeter_cal()
            {
                   double perimeter= 2*(width+height);
                System.out.println("The perimeter of the rectangle is "+ perimeter);
            }
    }

    public static void main(String[] args) {

        Rectangle_work r1 =new Rectangle_work();
        r1.height=20;
        r1.width=40;
        r1.area_cal();
        r1.perimeter_cal();
    }
}
