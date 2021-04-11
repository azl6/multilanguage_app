package interfaces_and_resourceBundle;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Operations c = new Operations();
        int choice = 0, aux;
        System.out.println("Choose your language:\n1 - Português\n2 - English\n");
        ResourceBundle rb = languageChoice(checkLanguage(choice));

        System.out.println(rb.getString("operation"));
        aux = checkOperation(choice, rb);
        System.out.println(rb.getString("number"));
        switch(aux){
            case 1:
                System.out.println(rb.getString("result")  + " " + c.calculaSoma());
            break;

            case 2:
                System.out.println(rb.getString("result")  + " "  + c.calculaSub());
                break;

            case 3:
                System.out.println(rb.getString("result")  + " "  + c.calculaSMult());
                break;

            case 4:
                System.out.println(rb.getString("result")  + " "  + c.calculaDiv());
                break;

        }
    }

    private static ResourceBundle languageChoice(int choice){
        ResourceBundle rb;
        switch(choice){
            case 1:
            rb = ResourceBundle.getBundle("messages",new Locale("pt","BR"));
            return rb;

            case 2:
            rb = ResourceBundle.getBundle("messages",new Locale("en","US"));
            return rb;

            default: return null;
        }
    }

    private static int checkLanguage(int input){
            while(input < 1 || input > 2){
                if(input != 0)
                    System.out.println("Insert a valid input.\n1 - Português\n2 - English\n");
                input = sc.nextInt();
            }
            return input;
    }

    private static int checkOperation(int input, ResourceBundle rb){
        while(input < 1 || input > 4){
            if(input != 0)
            System.out.println(rb.getString("error"));
            input = sc.nextInt();
        }
        return input;
    }
}

