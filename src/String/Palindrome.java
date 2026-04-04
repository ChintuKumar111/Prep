package String;

public class Palindrome {
    static void main() {
        String pal = "sms";
        String reverse = "";

        for (int i = pal.length()-1;i>=0;i--){
            reverse = reverse+pal.charAt(i);
        }

        if(reverse.equals(pal)){
            System.out.println("its a palindrome");
        }else{
            System.out.println("not a palindrome");
        }

    }
}
