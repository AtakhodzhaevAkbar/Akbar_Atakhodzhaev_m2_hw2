public class Cat extends Animal implements Printable {
    private String eyeColor;

    public Cat(int age, String color, String eyeColor) {
        super(age, color);
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    @Override
    public void print() {
        System.out.println("Age:" + getAge() +
                "\nColor " + getColor() + "\nEye color " + getEyeColor());
    }
}
