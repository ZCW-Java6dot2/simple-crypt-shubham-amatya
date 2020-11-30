import java.io.*;


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
        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        13 - 65) % 26 + 65);
                result.append(ch);
            } else if (Character.isLowerCase(text.charAt(i))) {

                char ch = (char) (((int) text.charAt(i) +
                        13 - 97) % 26 + 97);
                result.append(ch);
            } else {
                result.append(text.charAt(i));


            }
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

        public void encryptFile(File file){
        ROT13 cipher = new ROT13();
        cipher.encryptFile(new File ("sonnnet18.txt"));
       // cipher.decrypt(new File("sonnet18.enc"))
        ;


        try{
            BufferedReader reader = new BufferedReader(new FileReader(file));
            Writer out;
            BufferedWriter writer = new BufferedWriter(new FileWriter("sonnet18.enc"));
            String line;
            while((line = reader.readLine()) != null){
                    writer.write(encrypt(line) + "\n");
                }
            writer.close();
            writer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
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


