public class Triangle {
    int a,b,c;

    public Triangle(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public double trianglePerimetre(int a,int b ,int c){
        return a+b+c;
    }
    public double triangleArea(int a, int b , int c){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    @Override
    public String toString() {
        return String.format("Perimetre=%s , Area=%s", trianglePerimetre(a, b, c), triangleArea(a, b, c));
    }

}
