public class Dog extends Animal implements Printable{
    private String breed;

    public Dog(int age, String color,String breed) {
        super(age, color);
        this.breed=breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void print() {
        System.out.println("Age:"+getAge()+
                "\nColor:"+getColor()+
                "\nBreed:"+getBreed());
    }
}
