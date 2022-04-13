package ADT.hashtable;

public class SimpleHashTable {

    private StoredEmployee[] hashtable;

    public SimpleHashTable() {
        hashtable = new StoredEmployee[10];
    }

    public Employee get(String key){
        int index =  findKey(key);
        if(index == -1)
            return null;
        return hashtable[index].employee;
    }

    public void put(String key, Employee e){
        int hashedKey = hashKey(key);
        int stopIndex = hashedKey;

        while(Occupied(hashedKey)){
            hashedKey = (hashedKey + 1) % hashtable.length;
            if(stopIndex == hashedKey) {
                System.out.println("Sorry! key taken...");
                return;
            }
        }
        hashtable[hashedKey] = new StoredEmployee(key,e);
    }

    private boolean Occupied(int index){
        return hashtable[index] != null;
    }

    public boolean removeKey(String key) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] == null)
            return false;

        hashtable[hashedKey] = null;
        rehashing();
        return true;
    }

    private void rehashing(){
        StoredEmployee[] old = hashtable;
        hashtable = new StoredEmployee[old.length];
        for (StoredEmployee storedEmployee : old)
            if (storedEmployee != null)
                put(storedEmployee.key, storedEmployee.employee);
    }

    private int findKey(String key){
        int hashedKey = hashKey(key);
        int stopIndex = hashedKey;

        while(hashtable[hashedKey] == null || !hashtable[hashedKey].key.equals(key) ){
            hashedKey = (hashedKey + 1) % hashtable.length;
            if(stopIndex == hashedKey)
                return -1;
        }
        return hashedKey;
    }

    public boolean containsKey(String key){
        int hashedKey = hashKey(key);
        return hashtable[hashedKey] != null;
    }

    private int hashKey(String key){
        return key.length() % hashtable.length;
    }

    public void printHashtable(){
        for(StoredEmployee e : hashtable)
            if(e!=null)
                System.out.println(e);
    }

}
