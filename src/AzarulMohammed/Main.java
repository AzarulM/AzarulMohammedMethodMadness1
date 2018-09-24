package AzarulMohammed;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("reverse of \'racecar\' is " + AMohammedLib.reverse("racecar"));
        System.out.println("reverse of \'Water\' is " + AMohammedLib.reverse("Water"));
        // Test for reverse words

        System.out.println(AMohammedLib.dateStr("07/18/2001"));
        // Shows different format of your birthday

        System.out.println(AMohammedLib.isFibonnaci(144));
        System.out.println(AMohammedLib.isFibonnaci(100));
        System.out.println(AMohammedLib.isFibonnaci(1));
        // Test for isFibonnaci

        System.out.println(AMohammedLib.sumUpTo(5));
        System.out.println(AMohammedLib.sumUpTo(10));
        // Tests out different numbers for sumUpTo

        System.out.println(AMohammedLib.cutOut("catatonic cat","cat" ));
        System.out.println(AMohammedLib.cutOut("Huge Human","Hu" ));
        // Tests out the cutOut method


    }
}