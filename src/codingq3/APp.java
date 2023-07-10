package codingq3;

public class APp {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAddress("Gaya");
        person.setAge(24);
        person.setName("Gaurav");
        System.out.println(person.getName()+person.getAge()+person.getAddress());
    }
}
