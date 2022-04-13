package ADT.hashtable;

import java.util.LinkedList;

public class ChainedHashTable {

    private final LinkedList<StoredEmployee>[] hashtable;

    ChainedHashTable(){
        hashtable = new LinkedList[10];
        for(int i = 0; i<hashtable.length;i++)
            hashtable[i] = new LinkedList<>();
    }

    public void put(String key, Employee e){
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredEmployee(key,e));
    }

    public Employee get(String key){
        int hashedKey = hashKey(key);
        for (StoredEmployee se : hashtable[hashedKey])
            if(key.equals(se.key))
                return se.employee;
        return null;
    }
    
    public boolean containsKey(String key){
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey]!=null){
            for (StoredEmployee se : hashtable[hashedKey])
                if(key.equals(se.key))
                    return true;
        }
        return false;
    }
    
    public boolean removeKey(String key){
        int hashedKey = hashKey(key);
        int index =0;
        for (StoredEmployee se : hashtable[hashedKey]) {
            if (se.key.equals(key)) {
                hashtable[hashedKey].remove(index);
                return true;
            }
            index++;
        }
        System.out.print( key +" "+index+" ");
        return false;
    }
    
    private int hashKey(String key){
//        return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }
    
    public void printHashtable(){
        for(LinkedList<StoredEmployee> le : hashtable)
            if(le!=null)
                for (StoredEmployee se : le)
                    System.out.println(se);
            else
                System.out.println("Position is empty");
    
    }
}
