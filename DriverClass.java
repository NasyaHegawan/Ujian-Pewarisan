import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);

        System.out.println("Choose One : ");
        System.out.print("1. Rectangle\n2. Circle\n3. Cube");
        System.out.println();
        int pilihan = n.nextInt();
        n.nextLine();

        if (pilihan == 1) {
            System.out.println("=== Rectangle ===");
            System.out.println("Name : ");
            String name = n.nextLine();
            System.out.println("Color : ");
            String color = n.nextLine();
            System.out.println("Lenght : ");
            int lenght = n.nextInt();
            System.out.println("Width : ");
            int width = n.nextInt();
            Rectangle r1 = new Rectangle(name, color, lenght, width);
            r1.print();
            r1.luas();

        } else if (pilihan == 2) {
            System.out.println("=== Circle ===");
            System.out.println("Name : ");
            String name = n.nextLine();
            System.out.println("Color : ");
            String color = n.nextLine();
            System.out.println("Radius : ");
            int radius = n.nextInt();
            Circle c1 = new Circle(name, color, radius);
            c1.print();
            c1.luas();

        } else if (pilihan == 3) {
            System.out.println("=== Cube ===");
            System.out.println("Name : ");
            String name = n.nextLine();
            System.out.println("Color : ");
            String color = n.nextLine();
            System.out.println("Lenght : ");
            int lenght = n.nextInt();
            System.out.println("Width : ");
            int width = n.nextInt();
            System.out.println("Height : ");
            int height = n.nextInt();
            Cube c2 = new Cube(name, color, lenght, width, height);
            c2.print();
            int luascube = (lenght*width*height);
            System.out.println("Luas Cube adalah " + luascube);

        }
    }
}
