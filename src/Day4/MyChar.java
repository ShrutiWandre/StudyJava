package Day4;

public class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public static void printLowerCaseAlphabets() {
        System.out.println("Lower Case Alphabets");
        for (char ch = 97; ch <= 122; ch++){
            System.out.print("\t" + ch);
        }
    }

    public static void printUpperCaseAlphabets() {
        System.out.println("\nUpper Case Alphabets");
        for (char ch = 65; ch <= 90; ch++){
            System.out.print("\t" + ch);
        }
    }

    public boolean isVowel() {

        if(ch == 'a' || ch == 'A')
            return true;

        if(ch == 'e' || ch == 'E')
            return true;

        if(ch == 'i' || ch == 'I')
            return true;

        if(ch == 'o' || ch == 'O')
            return true;

        if(ch == 'u' || ch == 'U')
            return true;

        return false;
    }

    public boolean isDigit() {

        if(ch >= 48 && ch<=57)
            return true;
        return false;
    }

    public boolean isAlphabet() {

        if(ch >= 97 && ch <= 122)
            return true;

        if(ch >= 65 && ch <= 90)
            return true;

        return false;
    }

    public boolean isConsonant() {

        if(isAlphabet() && !isVowel())
            return true;

        return false;
    }
}
