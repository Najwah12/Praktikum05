import java.util.Scanner;
public class PemilihanHari15 {
    public static void main(String[] args) {
        
        String dayName, dayType;

        System.out.println("Input day name: ");
        dayName = sc.nextLine();

        switch (dayName.toLowerCase()) {
            case "monday":
            case "tuesday":
            case "wednesday":
            case "thursday":
            case "friday":
                dayType = "weekday";
                break;
            case "saturday":
            case "sunday":
                dayType = "weekend";
                break;
            default:
                dayType = "invalid day name";
        }

    }
}
