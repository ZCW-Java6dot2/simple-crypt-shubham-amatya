public class Caesar extends ROT13 {


    public String crypt(String text, Integer shift) throws UnsupportedOperationException {

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else if (Character.isLowerCase(text.charAt(i))) {

                char ch = (char) (((int) text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            } else {
                result.append(text.charAt(i));


            }
        }
        return result.toString();
    }
}
