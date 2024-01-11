public class Snake extends Animal implements Printable{
    private int length;

    public Snake(int age, String color, int length) {
        super(age, color);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public void print() {
        System.out.println("Age:" + getAge() +
                "\nColor:" + getColor() + "\nLength:" + getLength()+"cm");
    }
}
