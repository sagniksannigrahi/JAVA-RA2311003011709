public class own_class {

    static class employee { // here we cannnot use public as in java we cannot use two class as public. one  class should be non public

        int id ; // attribute 1
        String name ; // attribute 2 //STRING er "S" ta boro hater hobea
        int salary;
        public void printdetais()
        {
            System.out.println("My id is "+id);
            System.out.println("and my name is "+name);
        }
        public int getsalary()  // here we use int as as a salary is an intiger value
        {
         return salary;
        }
    }

    public static void main(String[] args) {
        System.out.println(" hi hellow namaste salama");
        employee sagnik = new employee(); // ey line takea use korar jonno jodi  ekta main class jodi static  hoy tobea opor class keo static hotea hobea.
       sagnik.id=12;
       sagnik.name= "sagniik sannigrahi";
       sagnik.salary=520000;
        sagnik.printdetais();
       int salary=sagnik.getsalary();
        System.out.println("My salary is "+salary);


        employee sampurna = new employee();
        sampurna.id=17;
        sampurna.name="sampurna sannigrahi";
        sampurna.salary=2;
        sampurna.printdetais();
        salary=sampurna.getsalary(); //ageea ekhbar ey class er modhyey  salary takea int hisabea defined kora hoyea gechea tay arr ekhanea int salary=sampurna.getsalary(); na likhea shusu salary likhtea hobea.
        System.out.println("my salary is"+salary);

    }
}
