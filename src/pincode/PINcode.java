package pincode;

public class PINcode {
    public static boolean validatePin(String pin) {
        if(pin.length() == 4 || pin.length() == 6)
            return pin.replaceAll("[0-9]", "").length() > 0 ? false : true;

        return false;
    }
}
