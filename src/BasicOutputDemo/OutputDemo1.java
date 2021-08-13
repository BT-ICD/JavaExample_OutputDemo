package BasicOutputDemo;

public class OutputDemo1 {
    public static void main(String[] args) {
//        outputlab1();
//        outputLabCharacterClassLab1();
//            outputLabCharacterClassLab2();
            outputLabCharacterClassLab3();
    }

    private static void outputLabCharacterClassLab1() {
        char ch ='D';
        boolean isUpperCase = Character.isUpperCase(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isDigit = Character.isDigit(ch);
        boolean isLowerCase = Character.isLowerCase(ch);
        boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
        System.out.println("isUpperCase: "+ isUpperCase);
        System.out.println("isLetter: "+ isLetter);
        System.out.println("isDigit: "+ isDigit);
        System.out.println("isLowerCase: "+ isLowerCase);
        System.out.println("isLetterOrDigit: "+ isLetterOrDigit);
    }
    private static void outputLabCharacterClassLab2() {

        char ch ='0';
        boolean isUpperCase = Character.isUpperCase(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isDigit = Character.isDigit(ch);
        boolean isLowerCase = Character.isLowerCase(ch);
        boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
        System.out.println("isUpperCase: "+ isUpperCase);
        System.out.println("isLetter: "+ isLetter);
        System.out.println("isDigit: "+ isDigit);
        System.out.println("isLowerCase: "+ isLowerCase);
        System.out.println("isLetterOrDigit: "+ isLetterOrDigit);
    }

    private static void outputLabCharacterClassLab3() {

        char ch ='-';
        boolean isUpperCase = Character.isUpperCase(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isDigit = Character.isDigit(ch);
        boolean isLowerCase = Character.isLowerCase(ch);
        boolean isLetterOrDigit = Character.isLetterOrDigit(ch);
        System.out.println("isUpperCase: "+ isUpperCase);
        System.out.println("isLetter: "+ isLetter);
        System.out.println("isDigit: "+ isDigit);
        System.out.println("isLowerCase: "+ isLowerCase);
        System.out.println("isLetterOrDigit: "+ isLetterOrDigit);
    }

    private static void outputlab1() {
        int x;
        x = 4 %5 + 6%5;
        System.out.println("x is :" + x);
    }
}
