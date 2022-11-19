package assignment2.contentCoupling;

public class ContentCoupling {
    public static void main(String[] args){
        Person person = new Person();
        person.name = "Nazmul";
        person.id = 200042118;
        person.age = 20;
    }
}
//That i can directly modify a module from another module is content coupling.
//I can reduce the tight coupling by using getters and setters.