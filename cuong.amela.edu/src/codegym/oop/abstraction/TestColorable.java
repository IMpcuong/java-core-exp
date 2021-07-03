package codegym.abstraction;

public class TestColorable {
    public static void main(String[] args) {
        Shape[] shapeList = new Shape[6];
        shapeList[0] = new Rectangle(5.732, 6.789, "Blue", true);
        shapeList[1] = new Square(6.141, "Red", false);
        shapeList[2] = new Circle(8.364);
        shapeList[3] = new Square(7.124, "Yellow", true);
        shapeList[4] = new Square(9.014, "White", false);
        shapeList[5] = new Square(0.152, "Grey", true);

        System.out.println("Original-array: ");
        for(Shape shape : shapeList) {
            System.out.println(shape);
        }

        System.out.println();
        System.out.println("Sorted-square list: ");
        for (int i = 0; i < shapeList.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < shapeList.length; j++) {
                if (shapeList[i] instanceof Square && shapeList[j] instanceof Square) {
                    if (((Square) shapeList[minIndex]).compareTo(shapeList[j]) > 0) {
                        minIndex = j;
                    }
                    Square tempShape = (Square) shapeList[minIndex];
                    shapeList[minIndex] = shapeList[i];
                    shapeList[i] = tempShape;

                    System.out.printf("Shape %d is square: %s ", i + 1, shapeList[i]);
                    ((Square) shapeList[i]).howToColor();
                    System.out.print("with the color: " + shapeList[i].getColor() + ".");
                    System.out.println();
                }
            }
        }
    }
}
