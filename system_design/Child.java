package system_design;

/**
 *  system_design.Parent class
 */
class Parent {
    void showMessage() {
        System.out.println("Hello system_design.Parent class");
    }
}

/**
 * system_design.Child class inheriting from system_design.Parent
 */
public class Child extends Parent {
    @Override
    void showMessage() {
        super.showMessage();
        System.out.println("Hello system_design.Child class");
    }
}

/**
 * system_design.Parent class
 */
class SuperClass {
    String message = "Hello system_design.SuperClass class";
}
/**
 * Subclass inheriting from superclass
 */
class SubClass extends SuperClass {
    String message = "Hello system_design.SubClass class";
}
class Car {
    int passengerCount;
    char engineType;

    public Car(int passengerCount, char engineType) {
        makePassengerCount(passengerCount);
        setEngineType(engineType);
    }


    public int getPassengerCount() {
        return passengerCount;
    }
    /**
     * sets passenger count must be higher than 2
     * @param count count of passengers
     */

    public void makePassengerCount(int count) {
        if (count<2) {
            System.out.println("less than 2");
        } else {
            passengerCount = count;
        }
    }
    public char getEngineType() {
        return engineType;
    }
    /**
     * sets engine type should be a-z or A-Z
     * @param type type of the engine
     */
    public void setEngineType(char type) {
        if ((type >= 'a' && type <= 'z') || (type >= 'A' && type <= 'Z')) {
            engineType = type;
        } else {
            System.out.println("type should be either 'a-z' or 'A-Z'");
        }
    }
}
/**
 * inherits from system_design.Car class
 */
class Truck extends Car {
    int capacity;

    Truck(int passengerCount, char engineType) {
        super(passengerCount, engineType);
        this.capacity = 0;
    }

    /**
     * gets the capacity
     *
     * @return capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * sets the capacity
     *
     * @param capacity the new capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static void main(String[] args) {
        Child obj1 = new Child();
        obj1.showMessage();

        SubClass obj2 = new SubClass();
        System.out.println(obj2.message);
        System.out.println(((SuperClass) obj2).message);

        Truck truck = new Truck(3, 'D');
        System.out.println("Passenger count: " + truck.getPassengerCount());
        System.out.println("Engine type: " + truck.getEngineType());
        System.out.println("Capacity: " + truck.getCapacity());
        truck.setCapacity(1000);
        System.out.println("new capacity: " + truck.getCapacity());
    }
}