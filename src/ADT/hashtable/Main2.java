package ADT.hashtable;

public class Main2 {

    public static void main(String[] args) {
        Employee a = (new Employee("James","Bond",7));
        Employee b = (new Employee("Joey","Tribbiani",69));
        Employee c = (new Employee("Marie","Fila",10));
        Employee d = (new Employee("Mike","Tyson",5));
        Employee e = (new Employee("Mike","Simon",15));

        ChainedHashTable cht = new ChainedHashTable();
        cht.put(a.getLastName(),a);
        cht.put(b.getLastName(),b);
        cht.put(c.getLastName(),c);
        cht.put(c.getLastName(),e);
        System.out.println(cht.removeKey(a.getLastName())+" removed "+a.getLastName());
        cht.printHashtable();
        System.out.println(cht.removeKey(a.getLastName())+" removed "+a.getLastName());
        cht.put(d.getLastName(),d);
        System.out.println(cht.removeKey(b.getLastName())+" removed "+b.getLastName());
        System.out.println(cht.containsKey("Bond"));
        cht.printHashtable();
        System.out.println("Retrieving");
        System.out.println(cht.get(a.getLastName()));
        System.out.println(cht.get("trio"));
        System.out.println(cht.get(c.getLastName()));
        System.out.println("printing table");
        cht.printHashtable();

    }

}
