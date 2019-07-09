/**
 * This class models a rectangle
 * 
 * @author Krish Thawani
 * 
 *         Unit 8 Lab 1
 */

public class Rectangle {

    private int length;
    private int width;

    public void setLength(int l) {
        if (l > 30 || l < 1) {
            System.out.println("Invalid Length");
            System.exit(0);
        } else
            length = l;
    }

    public void setWidth(int w) {
        if (w > 30 || w < 1) {
            System.out.println("Invalid Width");
            System.exit(0);
        } else
            width = w;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int calculateArea() {
        return length * width;
    }

    public int calculatePerimeter() {
        return (length * 2) + (width * 2);
    }

    public void drawRectangle(char symbol) {

        for (int i = 0; i < width; i++) {
            for (int n = 0; n < length; n++)
                System.out.print(symbol);
            System.out.println();
        }

    }
}