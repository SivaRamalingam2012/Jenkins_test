c class Rectangle {
  public int length;
  public int width;
 
  public Rectangle(int length, int width) {
    this.length = length;
    this.width = width;
  }
 
  public int getArea() {
    return length * width;
  }
 
  public int getPerimeter() {
    return 2 * (length + width);
  }
}
                          public class Rectangulator {
  public static void main(String[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);
 
    Rectangle myRectangle = new Rectangle(length, width);
 
    String output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());
 
    System.out.println(output);
  }
}
