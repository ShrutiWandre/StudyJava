package Day4;

public class MyCharRunner {

    public static void main(String[] args){
        MyChar myChar = new MyChar('p');
        System.out.println("Is character Vowel? --> " + myChar.isVowel()); // check for vowel
        System.out.println("Is character Consonant? --> " + myChar.isConsonant());  // check for consonant
        System.out.println("Is character Digit? --> " + myChar.isDigit()); // check for digit
        System.out.println("Is character Alphabet? --> " + myChar.isAlphabet());  // check for Alphabet
        MyChar.printLowerCaseAlphabets();    // print lower case alphabets
        MyChar.printUpperCaseAlphabets();    // print upper case alphabets
    }
}
