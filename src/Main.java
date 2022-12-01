import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Animal> animals = new LinkedList<>();
        int dogAge = 1;
        int catAge = 1;
        int mauseAge = 1;

        for (int i = 0; i < 5; i++) {
        animals.add(new Cat("Max",catAge++ ));
        animals.add(new Dog("Bull",dogAge++ ));
        animals.add(new Mause("Jerry",mauseAge++ ));
        }


        LinkedList<Animal> animals1 = new LinkedList<>();
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Cat){
                animals1.addFirst(animals.get(i));
            }else if(animals.get(i) instanceof Dog){
                animals1.addLast(animals.get(i));

            }        }
        for (int i = 0; i < animals.size(); i++) {
            if(animals.get(i) instanceof Cat){
                animals1.addLast(animals.get(i));
            }
        }
        System.out.println(animals1);
    }
}