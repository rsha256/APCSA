public class Strings {
    // 1.This method will return an email address in the form
// first.last@ww-p.org
// getEmail("Mister", "Scarpitta") ====> Mister.Scarpitta@ww-p.org
    private static String getEmail(String first, String last) {
        return first + "." + last + "@ww-p.org";
    }

    // 2. This method will return initials with periods.
// getInitials("Mister", "Scarpitta") ====> M.S.
    private static String getInitials(String first, String last) {
        return first.charAt(0) + "." + last.charAt(0) + ".";
    }

    // 3. This method will parse the year from a birthdate
// in the form MMDDYYYY
// getYear("01021916) ====> 1916
    public static String getYear(String bday) {
        return bday.substring(3);
    }

    // 4. This method will return a lower case
// user name in the form of first 3 letters of first name and
// last 4 letters of last name.
// getUserName("Mister", "Scarpitta") ====> misitta
    public static String getUserName(String first, String last) {
        return first.substring(0, 3).toLowerCase() + last.substring(5).toLowerCase();
    }
    // 5. This method will parse the first name from a full name separated with
// a space
// getFirst("Mister Scarpitta") ====> Mister
    public static String getFirst(String fullName) {
        return
    }
    // 6. This method will parse the last name from a full name separated with a
// space
// getLast("Mister Scarpitta") ====> Scarpitta
    public static String getLast(String fullName) {
    }
    // 7. This will return a random 4 letter string of letters
// getRandomWord() ====> CDRT
    public static String getRandomWord() {
    }
    // 8. This will return a new word of every other letter
// everyOtherLetter("PIRATES") ====> PRTS
    public static String everyOtherLetter(String word) {
    }
    // 9. This will return a new word that is the reverse.
// reverse("PIRATES ") ====> SETARIP
    public static String reverse(String word) {
    }

    // 10. This will return true if the sum of the first digit and the last
// digit is divisible by 5.
// checkDigit("123456789") ====> TRUE
// checkDigit("12345543211") ====> FALSE
// checkDigit("87878787") ====> TRUE
    public static Boolean checkDigit(String creditCard) {
    }
    // 11. This will return a string where every other letter is capitalized
// everyOtherLetterCaps("misterscarpitta") ====> mIsTeRsCaRpItIa
    public static String everyOtherLetterCaps(String word) {
    }
    // 12. This will return a string where every i is replaced with an 8
// replacesIsWith8s("WilliamScarpitta") ====> W8ll8amScarp8tta
    public static String replaceIsWith8s(String word){
    }
    public static void main(String[] args) {
// TODO Auto-generated method stub
        System.out.println("1. Email: " + getEmail("Mister", "Scarpitta"));
        System.out.println("2. Initials: " + getInitials("Mister", "Scarpitta"));
        System.out.println("3. Year: " + getYear("01021916"));
        System.out.println("4. UserName: " + getUserName("Mister", "Scarpitta"));
        System.out.println("5. FirstName: " + getFirst("Mister Scarpitta"));
        System.out.println("6. LastName: " + getLast("Mister Scarpitta"));
        System.out.println("7. RandomWord: " + getRandomWord());
        System.out.println("8. EveryOtherLetter: " + everyOtherLetter("encyclopedias"));
        System.out.println("9A. Reverse: " + reverse("Philadelphia"));
        System.out.println("9B. Reverse: " + reverse("JAVA"));
        System.out.println("10A. CheckDigit: " + checkDigit("123456"));
        System.out.println("10B. CheckDigit: " + checkDigit("123456789"));
        System.out.println("11. EveryOtherCaps: "+ everyOtherLetterCaps("misterscarpitta"));
        System.out.println("12. Replaces Is with 8s: " + replaceIsWith8s("WilliamScarpitta"));
    }
}

/*
OUTPUT
        1. Email: Mister.Scarpitta@ww-p.org
        2. Initials: M.S.
        3. Year: 1916
        4. UserName: misitta
        5. FirstName: Mister
        6. LastName: Scarpitta
        7. RandomWord: MOCQ
        8. EveryOtherLetter: eccoeis
        9A. Reverse: aihpledalihP
        9B. Reverse: AVAJ
        10A. CheckDigit: false
        10B. CheckDigit: true
        11. EveryOtherCaps: mIsTeRsCaRpItIa
        12. Replaces I"s with 8"s: W8ll8amScarp8tta
        */
