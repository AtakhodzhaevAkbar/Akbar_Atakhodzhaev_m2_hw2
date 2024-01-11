public class Hamster extends Animal implements Printable {
    private int size;

    public Hamster(int age, String color, int size) {
        super(age, color);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void print() {
        System.out.println("Age:" + getAge() +
                "\nColor:" + getColor() + "\nSize:" + getSize()+"cm");
    }
}
