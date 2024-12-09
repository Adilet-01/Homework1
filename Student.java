public class Student  {
    String name;
    String surname;
    String address;
    int id;

    public Student(String name , String surname,String address,int id) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("name:%s, surname:%s, address:%s, id:%s",name,surname,address,id);
    }
}
