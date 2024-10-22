public class Triangle extends Shape {

   private int base, height;
   
    public Triangle(String color, int length, int width) {
      super(color);
      this.base = base;
      this.height = height;
   }
   
   public String toString() {
      return "triangle[base=" + base + "height=" + height + "," + super.toString() + "]";
   }
   
   public double getArea() {
      return 0.5*base*height;
   }
}