
import java.io.Console;
import java.util.Scanner;

public class AppCeasarCipher{
    public static void main (String[] args) throws Exception{

         Scanner in = new Scanner(System.in);
        Console myC = System.console();

         boolean repeat = true;

         while( repeat ) {

             System.out.println("------------WELCOME TO ENCODE-DECODE------------");
             System.out.print(" Would you like to: (Choose by number)\n 1. Encode a message \n 2. Exit ENCODE-DECODE? ");
                int choice = in.nextInt();

                if ( choice == 1) {

                    System.out.println("Here we take a message and encode it so that unwanted eyes do not see it!");
                    System.out.println("-------------------------------------------------------------------------");
                    System.out.print("Enter the message you would like us to encode: ");
                        String enteredInput = myC.readLine();

                    System.out.print("Enter the key (1-25) that you would like us to encode your message with: ");
                        int enteredKey = Integer.parseInt(myC.readLine());

                    System.out.println("We are going to encode: '" + enteredInput + "' using the key: " + enteredKey);
                    System.out.println("----------------------------------------");

                    CaesarCipher newCipher = new CaesarCipher(enteredInput, enteredKey);
                        String encryptedOutput = newCipher.encodeToKey(enteredInput, enteredKey);

                        System.out.println("Your encrypted message: " + encryptedOutput);

                        System.out.println("Would you also like to decode the message? \n 1. Yes \n 2. No? ");
                            int decyptOption = Integer.parseInt(myC.readLine());

                            if ( decyptOption == 1) {

//                                String decryptedMessage = encryptedOutput.decryptMessage(encryptedOutput);

//                                System.out.println("----------------------- \n Your decrypted message is: " + decryptedMessage);
                            }
                }
                else if ( choice == 2 ){
                    System.out.println("Thank you for using ENCODE_DECODE! Come back soon.");
                    repeat = false;
                }
                else {
                    System.out.println("Sorry. Your input is invalid! Try again");
                    System.out.println("---------------------------------------");
                }

         }

    }
}