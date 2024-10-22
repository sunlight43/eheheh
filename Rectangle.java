public class Rectangle extends Shape {
   
   private int length, width;
   
   public Rectangle(String color, int length, int width) {
      super(color);
      this.length = length;
      this.width = width;
   }
   
   public String toString() {
      return "Rectengle[length=" + length + "width=" + width + "," + super.toString() + "]";
   }
   
   public double getArea() {
      return length*width;
   }
}