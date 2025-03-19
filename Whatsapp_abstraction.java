package practice;
import java.util.Scanner;

abstract class software {
    String phone_number;
    String otp;

    void user_input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Phone Number:");
        phone_number = s.nextLine();
        System.out.println("Enter the OTP:");
        otp = s.nextLine();
        s.close();
    }

    void user_login() {
        System.out.println("Welcome to WhatsApp");
        System.out.println("---------------------");
        System.out.println("Please Login Here!!!");
    }

    abstract void app_open();
}

class WhatsApp extends software{  // Fixed inheritance
    @Override
    void app_open() {
        if (phone_number.equals("8310147613") && otp.equals("1234")) {
            System.out.println("Successfully Logged in, WhatsApp is OPEN....");
        } else {
            System.out.println("Invalid Phone Number or OTP");
        }
    }
}

public class Whatsapp_abstraction {
    public static void main(String[] args) {
        WhatsApp w = new WhatsApp();
        w.user_login();
        w.user_input();
        w.app_open();
    }
}
