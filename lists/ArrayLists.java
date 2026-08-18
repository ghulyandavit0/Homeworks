import java.util.ArrayList;

public class ArrayLists {

    public static void addNames(ArrayList<String> names) {
        names.add("Artur");
        names.add("Arsen");
        names.add("Davit");
    }

    public static void addName(ArrayList<String> names, int index, String value) {
        names.add(index, value);
    }

    public static String getName(ArrayList<String> names, int index) {
        return names.get(index);
    }

    public static void setName(ArrayList<String> names, int index, String value) {
        names.set(index, value);
    }

    public static void removeName(ArrayList<String> names, int index){
        names.remove(index);
    }

    public static void size(ArrayList<String> names) {
        System.out.println("Size: " + names.size());
    }
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        addNames(names);
        System.out.println("list of names " + names);

        System.out.println("first name of the list: " + getName(names,0));

        setName(names, 1, "Aram");
        System.out.println("after replacing: " + names);

        removeName(names, 0);
        addName(names, 1, "Arsen");
        System.out.println("final result: " + names);


    }
}
