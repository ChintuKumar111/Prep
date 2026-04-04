package String;

public class VowelsAndConsonants {
    static void main() {
        String vowelsAndConsonants ="This is the Education";
        int Vcount = 0;
        int Ccount = 0;

        for (int i = 0 ; i<=vowelsAndConsonants.length()-1;i++){

            char c =  vowelsAndConsonants.toLowerCase().trim().charAt(i);

            if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u'){
                Vcount++;
            }else {
                Ccount++;
            }
        }
        System.out.println("Total Number of : vowels " + Vcount);
        System.out.println("Total Number of Consonants "+ Ccount);



    }
}
