import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    private Character cs;
    private Character cf;

    ROT13(Character cs, Character cf) {
        this.cs = cs;
        this.cf = cf;
    }

    ROT13() {
        cs = 'a';
        cf = 'n';
    }




    public String crypt(String text) throws UnsupportedOperationException {

            StringBuilder result = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch >= 'a' && ch <= 'm') {
                    ch += 13;
                } else if (ch >= 'A' && ch <= 'M') {
                    ch += 13;
                } else if (ch >= 'n' && ch <= 'z') {
                    ch -= 13;
                } else if (ch >= 'N' && ch <= 'Z') {
                    ch -= 13;
                }
                result.append(ch);
            }
            return result.toString();
        }
    //int difference = cf - cs;
        /*char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] shiftedAlphabet = new char[alphabet.length];
        char shift = 13;
        for(int i=0; i< shiftedAlphabet.length; i++){
            shiftedAlphabet[i] = alphabet[(i+ alphabet.length + shift)%alphabet.length];
        }
        char[] charOfTxt = text.toCharArray();
        char[] resultArr = new char[charOfTxt.length];
        for(int i=0; i<charOfTxt.length; i++){
            if(charOfTxt[i] )
        }*/


    public String encrypt(String text) {

        return crypt(text);
    }

    public String decrypt(String text) {

        return crypt(text);
    }



    public static String rotate(String s, Character c) {


            int startIndex = 0;
            String result = "";
            char[] charS = s.toCharArray();
          
            for (int i=0; i<charS.length; i++){
                if (charS[i] == c){
                    startIndex = i;
                }
            }
            
            for (int i=startIndex; i<charS.length; i++){
                result += charS[i];
            }
            
            for (int i=0; i<startIndex; i++){
                result += charS[i];
            }
            return result;
        }

//        char[] charArr = s.toCharArray();
//        char[] resultArr = new char[charArr.length];
//
//        for(int i= 0; i< charArr.length; i++){
//            resultArr[i] = charArr[(i+ charArr.length+ 13)% charArr.length];
//        }
//
//
//        return resultArr.toString();

    }


