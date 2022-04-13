package customer;

class Customer{
    int customerId;
    String name;
    String city;
    String phone;
    String email;

    Customer(){}
    Customer(int customerId,String name,String city,String phone,String email)
    {
        this.customerId=customerId;
        this.name=name;
        this.city=city;
        this.phone=phone;
        this.email=email;
    }

    public int getcustomerId() {return customerId;}
    public void setcustomerId(int customerId) {this.customerId=customerId;}

    public String getname() {return name;}
    public void setcustomerId(String name) {this.name=name;}

    public String getcity() {return city;}
    public void setcity(String city) {this.city=city;}

    public String getphone() {return phone;}
    public void setphone(String phone) {this.phone=phone;}

    public String getemail() {return email;}
    public void setemail(String email) {this.email=email;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (customerId != customer.customerId) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (city != null ? !city.equals(customer.city) : customer.city != null) return false;
        if (phone != null ? !phone.equals(customer.phone) : customer.phone != null) return false;
        return email != null ? email.equals(customer.email) : customer.email == null;
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Customer c1=new Customer(1,"Vinod","Bangalore",null,null);
        Customer c2=new Customer(1,"Vinod","Bangalore",null,null);

        System.out.println(c1.equals(c2));

    }
}
