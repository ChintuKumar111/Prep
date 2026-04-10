package String;

public class ReverseString {
    static void main() {
        String name = "Levi Ackerman";
        String reverse = "";

        for(int i = name.length()-1;i>=0;i--){
            reverse = reverse+name.charAt(i);
        }

        System.out.print( "reversed : "+reverse);

    }
}
