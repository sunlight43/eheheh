public class Cylinder extends Circle {
   
   private double height;
   
   public Cylinder(double height, double radius) {
      super(radius);
      this.height = height;
   }
   
   public double getHight() {
      return this.height;
   }
   
   public double getVolume() {
      return super.getArea() * height;
   }
   
   @Override
   
   public String toString() {
      return "Cylinder[height=" + height + "," + super.toSting() + "]";
   }
}