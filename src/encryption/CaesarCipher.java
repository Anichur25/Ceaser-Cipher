package encryption;

public class CaesarCipher {
    private char[] lowercase, uppercase;

    public CaesarCipher() {
        lowercase = new char[26];
        uppercase = new char[26];
        int i=0;

        for(char ch = 'a', CH = 'A'; ch<='z'; ch++, CH++){
            lowercase[i] = ch;
            uppercase[i++] = CH;
        }
    }

    public int indexOf(char ch)
    {
        if(ch>='A' && ch<='Z')
            return ch - 'A';
        else
            return ch - 'a';
    }

    public String encrypt(String input, int key){
        String encrypted = "";

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);

            if(Character.isLetter(ch)){
                int index = indexOf(ch);
                index = (index + key) % 26;

                if(Character.isUpperCase(ch))
                    encrypted += uppercase[index];
                else
                    encrypted += lowercase[index];
            }

            else
                encrypted += ch;
        }

        return encrypted;
    }

}
