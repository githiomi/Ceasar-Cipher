
import java.io.Console;

public class AppCeasarCipher{
    public static void main (String[] args) throws Exception{

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Console myC = System.console();

//        try{
            System.out.println("------------WELCOME TO ENCODE-DECODE------------");
            System.out.println("Here we take a message and encode it so that unwanted eyes do not see it!");
            System.out.println("-------------------------------------------------------------------------");
            System.out.print("Enter the message you would like us to encode: ");
                String enteredInput = myC.readLine();
            System.out.print("Enter the key (1-25) that you would like us to encode your message with: ");
                int enteredKey = Integer.parseInt(myC.readLine());

                System.out.println("We are going to encode: '" + enteredInput + "' using the key: " + enteredKey);

//            }catch (IOException e){
//                 e.printStackTrace();
//        }
    }
}