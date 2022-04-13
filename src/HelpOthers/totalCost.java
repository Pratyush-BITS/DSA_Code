package HelpOthers;


class charCost{
    Character a;
    Character b;
    int valA;
    int valB;

    public charCost(Character a, int valA, Character b, int valB) {
        this.a = a;
        this.b = b;
        this.valA = valA;
        this.valB = valB;
    }
}


public class totalCost {

    static int TotalCost(charCost[] ch){
        int cost =0;

        for (charCost ch1:ch){
            if(ch1.a == null && ch1.b == null)
                return -1;
            if(ch1.a >= ch1.b)
                cost +=ch1.valA;
            else
                cost +=ch1.valB;
        }

        return cost;
    }

    public static void main(String[] args) {

        charCost ch1 = new charCost('o',11,'l',13);
        charCost ch2 = new charCost('h',15,'m',8);
        charCost[] ch = {ch1,ch2};
        System.out.println(TotalCost(ch));
    }

}
