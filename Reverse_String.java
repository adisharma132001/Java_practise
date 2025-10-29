public class Reverse_String {
    public static void main(String[] args) {
        String s= "Aditya";
        System.out.println(reverse_String(s));
    }

    static String reverse_String(String a){
        String reverse ="";
        for(int i=a.length()-1;i>=0;i--){
            reverse = reverse + a.charAt(i);
        }
        return reverse;
    }
}
