package ADT.hashtable;

public class Main {
    public static void main(String[] args) {

        Employee a = (new Employee("James","Bond",7));
        Employee b = (new Employee("Joey","Tribbiani",69));
        Employee c = (new Employee("Marie","Fila",10));
        Employee d = (new Employee("Mike","Tyson",5));

        SimpleHashTable sht = new SimpleHashTable();
        sht.put(a.getLastName(),a);
        sht.put(b.getLastName(),b);
        sht.put(d.getLastName(),d);
        sht.put(c.getLastName(),c);
        sht.printHashtable();
        System.out.println(sht.removeKey(a.getLastName())+" removed "+a.getLastName());
        System.out.println(sht.removeKey(a.getLastName())+" removed "+b.getLastName());
        System.out.println(sht.containsKey("Bond"));
        sht.printHashtable();
        System.out.println("Retrieving");
        System.out.println(sht.get(a.getLastName()));
        System.out.println(sht.get("trio"));
        System.out.println(sht.get(c.getLastName()));
        System.out.println("printing table");
        sht.printHashtable();

    }
}
