public class Main {
    public static void main(String[] args) {
    //1
    Student student=new Student("Алиса","Смит","Коктем-2",24);
    Student student1=new Student("Азамат","Кадырбаев","Ауезова-3",56);
    Student student2=new Student("Кристина","Пушкин","Орбита-1",75);

        System.out.println(student);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(" ");
//2
        Triangle triangle=new Triangle(3,4,5);
        System.out.println(triangle);
        System.out.println(" ");
//3
        Rectangle rectangle=new Rectangle(5,9);
        Rectangle rectangle1=new Rectangle(10,14);
        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(" ");
 //4
        Average average= new Average(5.5,8.5,7);
        System.out.println(average);
        System.out.println(" ");
//5
        Movie movie= new Movie("Фокус","RatPac-Dune Entertainment","R");
        System.out.println(movie);

        Movie movie1 = new Movie("Главный герой","20th Century Studios");
        System.out.println(movie1);
    }
}