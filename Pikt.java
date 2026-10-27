import java.awt.*;
// class Color { static Color RED = ...; static Color BLUE = ...;}
interface Pict {}
class ColorHelper {
   static Color named(String color) {
    if(color.equals("red")) { return Color.RED; }
    else if(color.equals("blue")) { return Color.BLUE; }
    else { return Color.WHITE; }
  }
}
record Circle(int radius, Color color) implements Pict {
  Circle(int radius, String color) {
    this(radius, ColorHelper.named(color)); // calls the record's constructor
  }
}
void main() {
  Circle c = new Circle(40, Color.RED);
  Circle c2 = new Circle(30, Color.GREEN);
  // I want to write this:
  Circle c3 = new Circle(20, "red");
  Circle c4 = new Circle(55, "blue");
  System.out.println(c + "\n" + c2 + "\n" + c3 + "\n" + c4);

}