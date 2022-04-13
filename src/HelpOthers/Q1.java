package HelpOthers;//Qn1
import java.util.*;

enum AreaFocus {SECURITY, BIGDATA, MULTIMEDIA, BBIS};

interface Payment
{
    public final double ProjectCost = 10000.00;
    public final double PerTerm = 5000.00;
    public double getPayment ();
}


abstract class UsefulInfo implements Payment
{
    //Instance variables
    protected String name;
    protected char gender;

    //Other constructor
    public UsefulInfo(char gender){
        this.gender = gender;
    }

    public UsefulInfo (String name, char gender)
    {
        this.name = name;
        this.gender = gender;
    }

    //Copy constructor
    public UsefulInfo (UsefulInfo ui)
    {
        this.name = ui.name;
        this.gender = ui.gender;
    }

    public UsefulInfo() {

    }

    //Accessor method
    public String getName ()
    {
        return name;
    }

    public char getGender ()
    {
        return gender;
    }

    //Mutator method
//    public void setName (String name)
//    {
//        this.name = name;
//    }
//
//    public void setGender (char gender)
//    {
//        this.gender = gender;
//    }

    //toString method
    @Override
    public String toString ()
    {
        return String.format ("Name: %s%n" + "Gender: %c%n", name, gender);
    }
}


class LoanLender extends UsefulInfo
{
    //Instance variables
    private int idNumber;
    private double amount;
    private int years;
    private double interest;

    //Default constructor
//    public HelpOthers.LoanLender ()
//    {
//        super(gender);
//    }

    //Other constructor
    public LoanLender (String name, char gender, int idNumber, double amount, int years, double interest)
    {
        super (name, gender);
        this.idNumber = idNumber;
        this.years = years;
        this.amount = amount;
        this.interest = interest;
    }

    //Copy constructor
    public LoanLender (LoanLender ll)
    {
        this (ll.name, ll.gender, ll.idNumber, ll.amount,ll.years, ll.interest);
    }


    //Accessor method
    public String getName ()
    {
        return name;
    }

    public char getGender ()
    {
        return gender;
    }

    public int getIdNumber ()
    {
        return idNumber;
    }

    public double getAmount ()
    {
        return amount;
    }

    public int getYears ()
    {
        return years;
    }

    public double getInterest ()
    {
        return interest;
    }

    @Override
    public double getPayment ()
    {
        double totalinterest = amount * (interest/100) * years;
        double payment = (amount + totalinterest)/ (years * 12);

        return payment;
    }

    //Mutator method
    public void setLoan (String name, char gender, int idNumber, double amount, int years, double interest)
    {
        this.name = name;
        this.gender = gender;
        this.idNumber = idNumber;
        this.amount = amount;
        this.years = years;
        this.interest = interest;
        //this.set (name, gender, idNumber, amount, years, interest);
    }

    //toString method
    @Override
    public String toString ()
    {
        return String.format ("%s" + "NRIC: %s%n" + "Loan amount: %.2f%n" + "Loan period: %d years%n" +
                        "Installment per month: %.2f%n", super.toString (), idNumber, amount,
                years, getPayment ());
    }

}


class SIMUOW extends UsefulInfo
{
    //Instance variables
    private static int id = 2020000;
    protected final int studentId;

    //Default constructor


    //Other constructor
    public SIMUOW (String name, char gender)
    {
        super (name, gender);
        ++id;
        studentId = id;
    }

    public SIMUOW(String name, char gender, int studentId) {
        super(name,gender);
        this.studentId = studentId;
    }


    //Copy constructor
    public SIMUOW(SIMUOW s1)
    {
        this (s1.name, s1.gender);
    }


    //Accessor method
    public String getName ()
    {
        return name;
    }

    public char getGender ()
    {
        return gender;
    }

    public int getStudentId ()
    {
        return studentId;
    }

    @Override
    public double getPayment ()
    {
        return PerTerm;
    }

    //Mutator method
    public void setInfo ()
    {
        this.name = name;
        this.gender = gender;
    }

    //toString method
    @Override
    public String toString ()
    {
        return String.format ("%s" + "HelpOthers.SIMUOW id: %d%n", super.toString (), studentId);
    }
}


class SIMUOW_1 extends SIMUOW
{
    //Instance variables
    protected AreaFocus a;

    //Default constructor


    //Other constructor
    public SIMUOW_1 (String name, char gender, int studentId, AreaFocus a)
    {
        super (name, gender, studentId);
        this.a = a;
    }

    //Copy constructor
    public SIMUOW_1 (SIMUOW_1 s1)
    {
        this (s1.name, s1.gender, s1.studentId, s1.a);
    }


    //Accessor method
    public String getName ()
    {
        return name;
    }

    public char getGender ()
    {
        return gender;
    }

    public AreaFocus getAreaFocus ()
    {
        return a;
    }

    @Override
    public double getPayment ()
    {
         return PerTerm;
    }

    //Mutator method
    public void setInfo ()
    {
        //this.set (name, gender, studentId, a);
        this.name = name;
        this.gender = gender; //Variable is already assigned to this value
        this.a = a;//Variable is already assigned to this value
    }

    //toString method
    @Override
    public String toString ()
    {
        return String.format ("%s" + "Area Focus 1: %s%n", super.toString (), a);
    }
}


class SIMUOW_2 extends SIMUOW_1
{
    //Instance variables
    private AreaFocus a;
    private AreaFocus b;

    //Default constructor


    //Other constructor
    public SIMUOW_2 (String name, char gender, int studentId, AreaFocus a, AreaFocus b)
    {
        super (name, gender, studentId,a);
        this.a = a;
        this.b = b;
    }

    //Copy constructor
    public SIMUOW_2 (SIMUOW_1 s2)
    {
        this (s2.name, s2.gender, s2.studentId, s2.a, null);
    }

    //Accessor method
    public String getName ()
    {
        return name;
    }

    public char getGender ()
    {
        return gender;
    }

    public AreaFocus getAreaFocus ()
    {
        return a;
    }

    public AreaFocus getAreaFocus2 ()
    {
        return b;
    }

    @Override
    public double getPayment ()
    {
        return PerTerm;
    }

    //Mutator method
    public void setInfo ()
    {
        //this.set (name, gender, studentId, a, b);
        this.name = name;
        this.gender = gender;//Variable is already assigned to this value
        this.a = a;//Variable is already assigned to this value
        this.b = b;//Variable is already assigned to this value
    }

    //toString method
    @Override
    public String toString ()
    {
        return String.format ("%s" + "Area Focus 1: %s%n" + "Area Focus 2: %s%n", super.toString (), a, b);
    }
}


class SIMUOW_F extends SIMUOW_1
{
    //Instance variables
    private AreaFocus a;

    //Default constructor


    //Other constructor
    public SIMUOW_F (String name, char gender, int studentId, AreaFocus a)
    {
        super (name, gender, studentId,a);//not sure about this
        this.a = a;
    }

    //Copy constructor
    public SIMUOW_F (SIMUOW_1 sf)
    {
        this (sf.name, sf.gender, sf.studentId, sf.a);
    }

    //Accessor method
    public String getName ()
    {
        return name;
    }

    public char getGender ()
    {
        return gender;
    }

    public AreaFocus getAreaFocus ()
    {
        return a;
    }

    @Override
    public double getPayment ()
    {
        return PerTerm;
    }

    //Mutator method
    public void setInfo ()
    {
        //this.set (name, gender, studentId, a);
        this.name = name;
        this.gender = gender;
        this.a = a;
    }

    //toString method
    @Override
    public String toString ()
    {
        return String.format ("%s" + "Area Focus 1: %s%n" + "Total program cost: %.2f%n",
                super.toString ());
    }
}


public class Q1
{
    private static void constructList (ArrayList <Payment> alist)
    {
        alist.add (new LoanLender ("Customer 1", 'M', 8888888, 50000.00, 5,6.5));
        alist.add (new SIMUOW ("Student 1", 'F'));
        alist.add (new SIMUOW ("Student 2", 'M'));
        alist.add (new SIMUOW ("Student 3", 'F'));
        alist.add (new SIMUOW ("Student 4", 'M'));
    }

    private static void displayList (ArrayList <Payment> aList)
    {
        for(Payment p : aList) {
            System.out.print(p);
            System.out.println("I am " + p.getClass()+'\n');
        }
    }

	/*private static void lambdaAnalysis (ArrayList <HelpOthers.Payment> alist)
	{

	}*/

    public static void main (String [] args)
    {
        ArrayList <Payment> aList = new ArrayList <> ();
        constructList (aList);
        displayList (aList);
    }
}

