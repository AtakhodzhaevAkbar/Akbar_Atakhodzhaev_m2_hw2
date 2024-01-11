import java.rmi.Remote;

public class Main { public static void main(String[] args) {
    Printable animal = createObject("Кошка");
    Printable animal1=createObject("Хомяк");
    Printable animal2=createObject("Змея");
    Printable[] animals={animal,animal1,animal2};
    for (Printable print:animals){
        print.print();
    }
}
    public static Printable createObject(String className){
    Printable animal = null;
        switch (className){
            case "Кошка":
                Cat cat = new Cat(12,"Белый","Желтый");
                animal=cat;
                break;
            case "Хомяк":
                Hamster hamster = new Hamster(5,"Желтый",2);
                animal=hamster;
                break;
            case "Змея":
                Snake snake = new Snake(2,"Зеленный",12);
                animal=snake;
                break;
            default:
                System.out.println("Такого животного нет");
                break;
        }
        return animal;
    }
}