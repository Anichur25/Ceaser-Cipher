public class WordPlay {

    public boolean isVowel(char ch)
    {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    String replaceVowels(String phrase,char ch)
    {
        String answer = "";

        for(int i = 0; i < phrase.length();i++)
        {
            if(isVowel(phrase.charAt(i)))
            {
                answer+=ch;
            }
            else
            {
                answer+=phrase.charAt(i);
            }
        }

        return answer;
    }

    public String emphasize(String phrase, char ch){
        String finalString = "";

        for(int i=0; i<phrase.length(); i++){
            if(phrase.charAt(i) == ch)
                if(i%2==0) finalString += '*';
                else finalString += '+';

            else
                finalString += phrase.charAt(i);
        }

        return finalString;
    }

    public void testWordPlay(){
        String ans = "";
        ans =  replaceVowels("Hello World",'*');
        System.out.println(ans);
        ans = emphasize("dna ctgaaactga", 'a');
        System.out.println(ans);
    }

    public static void main(String args[]){
        WordPlay obj =  new WordPlay();
        obj.testWordPlay();
    }
}

