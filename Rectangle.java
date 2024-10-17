public class Rectangle extends Shape {

    private int lenght;
    private int width;

    public int getLenght() {
        return this.lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public Rectangle() {
        super();
        lenght = 0;
        width = 0;
    }

    public Rectangle(String name, String color, int lenght, int width) {
        super(name, color);
        this.lenght = lenght;
        this.width = width;
    }

    public void print() {
        super.print();
        System.out.println("Lenght\t\t: " + lenght);
        System.out.println("Width\t: " + width);
    }
    public void luas () {
        System.out.println("Luas Rectangle adalah " + (lenght*width));
    }
}
