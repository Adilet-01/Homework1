public class Rectangle {
    int length;
    int width;

    public Rectangle(int length,int width){
        this.length=length;
        this.width=width;
    }
    public int returnArea(int length, int width) {
        return length * width;
    }

    @Override
    public String toString(){
        return String.format("Length:%s and Width:%s , Area=%s",length,width,returnArea(length,width));
    }

}
