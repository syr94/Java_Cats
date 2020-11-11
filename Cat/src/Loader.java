import static java.lang.Math.round;

public class Loader
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();

        System.out.println(cat.getStatus());

        Cat Vasiliy = new Cat();
        Cat Kirill = new Cat();
        Cat Alma = new Cat();
        Cat Rasheed = new Cat();
        Cat Nikita = new Cat();
        Cat Saif = new Cat();
        Cat Kazmi = new Cat();

     //   System.out.println("Weight of Vasiliy is " + round(Vasiliy.getWeight()));
     //   System.out.println("Weight of Kirill is " + round(Kirill.getWeight()));
        System.out.println("Weight of Alma is " + round(Alma.getWeight()));
     //   System.out.println("Weight of Rasheed is " + round(Rasheed.getWeight()));
        System.out.println("Weight of Nikita is " + round(Nikita.getWeight()));
      //  System.out.println("Weight of Saif is " + round(Saif.getWeight()));
      //  System.out.println("Weight of Kazmi is " + round(Kazmi.getWeight()));


        while(Alma.getStatus() != "Dead") {
            System.out.print("Alma said ");
            Alma.meow();
        }
       System.out.println("Alma status is " + Alma.getStatus());
    }
}