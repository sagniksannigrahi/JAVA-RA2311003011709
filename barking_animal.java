import java.util.*;

class animal{
    public void Sound(){
        System.out.println("Various sound of animal");
    }
}
class Bird extends animal{

    public void Sound(){
        System.out.println("Kohu kohu");
    }
}

class Cat extends animal{
    public void sound ()
    {
        System.out.println("Meu meu");
    }
}

public class barking_animal {
    public static void main(String[] args) {

        animal a1 = new animal();
        Bird a2 = new Bird();
        Cat a3 = new Cat();

        a1.Sound();
        a2.Sound();
        a3.sound();
    }
}
