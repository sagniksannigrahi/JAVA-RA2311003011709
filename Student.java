public class Student {
    static class student_details
    {
        public
      String name;
      int roll_number ;
      int marks;
      String grade;


        public void detils()
        {
            System.out.println("The name of the student is "+name+ " . His roll number is "+ roll_number+ " and his marks is "+marks);
        }

      public void calculateGrade()
      {
         if(marks>90&& marks<100)
         {
             System.out.println("His grade is A+");
         }
          if(marks>81&& marks<89)
          {
              System.out.println("His grade is A");
          }
          if(marks>71&& marks<80)
          {
              System.out.println("His grade is B+");
          }
          if(marks>70&& marks<60)
          {
              System.out.println("His grade is B");
          }
          if( marks<69)
          {
              System.out.println("His grade is C+");
          }

      }
    }

    public static void main(String[] args) {
        student_details s1 =new student_details();

        s1.name="SAGNIK SANNIGRAHI";
        s1.roll_number =709 ;
        s1.marks = 96;

        s1.detils();
        s1.calculateGrade();
    }
}
