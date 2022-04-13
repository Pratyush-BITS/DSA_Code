package HelpOthers;

import java.util.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the
   standard library */

/* Do not add a namespace declaration */

public class Main {

    static class User{
        String name;
        String location;
        int price;

        User(String s){
            String[] arr = s.split(",");
            this.name = arr[0];
            this.location = arr[1];
            this.price = Integer.parseInt(arr[4].substring(4));
        }

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", location='" + location + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    public static List<String> processData(ArrayList<String> array) {

        List<User> list = new ArrayList<>();
        for(String s : array)
            list.add(new User(s));

        list.sort((e1,e2)->{
            int a = e1.location.compareTo(e2.location);
            if(a == 0)
                return e2.price - e1.price;
            return a;
        });

        Set<String> retVal = new LinkedHashSet<>();

        String loc = list.get(0).location;
        int maxPrice = list.get(0).price;
        retVal.add(list.get(0).name);

        for(int i = 1; i<list.size(); i++){
            int diff = loc.compareTo(list.get(i).location);
            boolean update = false;

            if(diff!=0){
                update = true;
                loc = list.get(i).location;
                maxPrice = list.get(i).price;
            }

            if(update || maxPrice == list.get(i).price)
                retVal.add(list.get(i).name);
        }

        return retVal.stream().toList();
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<>();
        int i = 8;
        Scanner in = new Scanner(System.in);
        while (i-- > 0)
            inputData.add(in.nextLine());
        processData(inputData).forEach(System.out::println);
    }
}