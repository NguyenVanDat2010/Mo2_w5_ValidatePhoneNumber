public class Main {

    private static final String[] validPhoneNumbers = {"(84)-(0978489648)","(84)-(0222222223)"};
    private static final String[] invalidPhoneNumbers = {"(a8)-(22222222)","(b5)-(365245224)"};

    public static void main(String[] args) {
        ValidatePhoneNumber phoneNumber = new ValidatePhoneNumber();
        for (String phoneNumberStr : validPhoneNumbers) {
            System.out.println("Phone number is " + phoneNumberStr + " is valid: " + phoneNumber.validate(phoneNumberStr));
        }

        for (String phoneNumberStr : invalidPhoneNumbers) {
            System.out.println("Phone number is " + phoneNumberStr + " is valid: " + phoneNumber.validate(phoneNumberStr));
        }
    }
}
