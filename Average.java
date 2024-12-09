public class Average {
    double x;
    double y;
    double z;

   public Average(double x, double y, double z){
       this.x=x;
       this.y=y;
       this.z=z;
   }
   public double averageValue(double x, double y, double z){
       return (x+y+z)/3;
   }
    @Override
    public String toString() {
        return String.format("AverageValue=%s",averageValue(x,y,z));
    }







}
