import java.util.Scanner;

public class UserCheck {

    public static void main(String[] args){

        System.out.print("Name : ");
        String getUserName = new Scanner(System.in).next();
        System.out.print("Password : ");
        String getPassword = new Scanner(System.in).next();

        UserCheck user = new UserCheck();
        boolean v = user.userLogin(getUserName,getPassword);

        if(v){
            System.out.println("Login Success");
            int count = 0,countA = 0,countB = 0,countC = 0;

            while(count < 10){

                System.out.print("Enter Grade "+(count+1)+" Value : ");
                String getValue = new Scanner(System.in).nextLine();

                switch (getValue) {
                    case "A" -> countA++;
                    case "B" -> countB++;
                    case "C" -> countC++;
                }
                count++;
            }
            System.out.println("A :"+countA);
            System.out.println("B :"+countB);
            System.out.println("C :"+countC);

        }else {
            System.out.println("Login Field");
        }

    }
    public boolean userLogin(String userName,String password){

        String savedUserName = "dilshanpathirage";
        String savedPassword = "abcd23";
        return savedUserName.equals(userName) && savedPassword.equals(password);

    }
}
