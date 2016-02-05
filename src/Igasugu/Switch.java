package Igasugu;
import java.util.Scanner;

/**
 * Created by Kairi on 30.01.2016.
 */
public class Switch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        switch (text) {

            case "start":
                System.out.println("Machine started");
                break;

        }
    }
}

