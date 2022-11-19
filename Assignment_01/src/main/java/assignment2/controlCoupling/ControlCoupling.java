package assignment2.controlCoupling;

public class ControlCoupling {
    int person;
    public ControlCoupling(int person) {
        this.person = person;
    }
    public void Trip(){
        if(person <=2)
        {
            Bike bike = new Bike();
            bike.print();
        }
        else {
            Bus bus = new Bus();
            bus.print();
        }
    }
}
// The Trip class is controlling which class between Bus or Bike will be used for the code.
// This is control coupling.