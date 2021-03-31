package Java;

public class StringFormat {
    public static void main(String[] args) {
        int countryPhoneCode= 38;
        int phoneNumber= 501234567;
// format it to +38(050)123-45-67
        System.out.printf("+%d%010d",countryPhoneCode,phoneNumber);
        // System.out.println(PhoneNumberUtil.formateToPhoneNumber(num,"(XXX)-XXX-XXXX",10));
        String num = String.format("%010d",phoneNumber);
        String num2 = String.format("+%d(%s)%s-%s-%s",countryPhoneCode,num.substring(0,3),num.substring(3,6),num.substring(6, 8), num.substring(8, 10));
        System.out.println(num2);

//regex
         num = String.format("%d%010d",countryPhoneCode,phoneNumber);
        String num1 = num.replaceFirst("(\\d{2})(\\d{3})(\\d{3})(\\d{2})(\\d{2})","+$1($2)$3-$4-$5");
        System.out.println(num1);

    }
}
