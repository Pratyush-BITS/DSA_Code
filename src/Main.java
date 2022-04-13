import java.util.regex.Pattern;

class Credentials {

    String userName;
    String password;

    Credentials (String userName, String password){
        this.userName = userName;
        this.password = password;
    }
}


class Implementation {

    public String passwordValidator(Credentials credentials){
        try{
            String pass = credentials.password.toLowerCase();

            Pattern len = Pattern.compile("^.{8,40}");
            if(!len.matcher(pass).matches()){
               throw new WeakPasswordException("length of the password is not between 8 to 40");
            }

            //isDigAlpha doesn't work
            Pattern isDigAlpha = Pattern.compile("^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])");
            if(!isDigAlpha.matcher(pass).matches()){
                throw new WeakPasswordException("password must contain at least one alphabet and one digit");
            }

            return "valid password";
        }
        catch(WeakPasswordException wpe){
            return wpe.getMessage();
        }
    }

     public String signUp(Credentials credentials) {
         try {
             String s = passwordValidator(credentials);
             if (s.equals("valid password"))
                 return "signup successfully";
             else throw new WeakPasswordException(s);
         }
         catch (Exception e) {
             return e.getMessage();
         }
     }

}

class WeakPasswordException extends Exception {
    WeakPasswordException (String s) {
        super(s);
    }
}


public class Main {
    public static void main(String[] args) throws Exception {

        Implementation obj = new Implementation();
        System.out.println(obj.passwordValidator(new Credentials("bob","Piuar4")));
        System.out.println(obj.signUp(new Credentials("bob","34534534a53")));
    }
}
