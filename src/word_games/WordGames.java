package word_games;

/**
 * Name: Brandon Smith (put your name here)
 * Date: 10-10-24 (put date of last revision here)
 * Description: This is a collection of methods for a word game that
 * people can play
 */
public class WordGames
{
    private String word;

    public WordGames(String text) {
        word = text;
    }

    /**
     * Scrambles a word by switching the first and second half of the word.
     * @return the scrambled word
     */
    public String scramble()
    {
        // switch first half
        // and second half
        int mid = word.length() / 2;
        int length = word.length();
        String firstHalf = word.substring(0, mid);
        String secondHalf = word.substring(mid, length);
        String scrambled = secondHalf + firstHalf;
        return scrambled;

    }

    /**
     * Modifies a given string by inserting text at the specified index
     * @param insertIdx int index where the text will be inserted
     * @param insertText String text to be inserted
     * @return modified text
     */
    public String bananaSplit(int insertIdx, String insertText)
    {
        // Insert insertText at the position
        StringBuilder modifiedWord = new StringBuilder(word);
        modifiedWord.insert(insertIdx, insertText);
        return modifiedWord.toString();
        // insertIdx
    }

    /**
     * Modifies a given string by inserting text at the first occurrence of the
     * specified character
     * @param insertChar char character you want
     * @param insertText String
     * @return the modified text
     */
    public String bananaSplit(String insertChar, String insertText)
    {
        // Insert insertText after the first
        // occurence of the insertChar
        return "";

    }

    @Override
    public String toString()
    {
        // Games[word]
        return "[" + word + "]";

    }

}
