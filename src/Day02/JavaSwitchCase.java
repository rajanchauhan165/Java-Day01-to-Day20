package Day02;

public class JavaSwitchCase {
    static void jsc(String city){
        switch (city){
            case "Mumbai":
                System.out.println("Financial city");
                break;
            case "Kolkata":
                System.out.println("City of Joy");
                break;
            case "Banglore":
                System.out.println("Cyber city");
                break;
            case "Delhi":
                System.out.println("Capital of Country");
                break;
            default:
                System.out.println("May be other indian city");
        }
    }
    public static void main(String[] args) {
        jsc("Delhi");
    }
}
