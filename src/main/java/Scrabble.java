public class Scrabble {
    // properties
    String word;
    Character[] doubleLetters;
    Character[] tripleLetters;
    boolean doubleWord;
    boolean tripleWord;

    // standard constructor
    public Scrabble(String word) {
        if (word != null) {
        this.word = word.toUpperCase();}
    }

    // constructor for double/triple word or letters
    public Scrabble(String word, Character[] doubleLetters, Character[] tripleLetters, boolean doubleWord, boolean tripleWord) {
        if (word != null) {
            this.word = word.toUpperCase();
        }
        this.doubleLetters = doubleLetters;
        this.tripleLetters = tripleLetters;
        this.doubleWord = doubleWord;
        this.tripleWord = tripleWord;
    }

    public int score() {
        int score = 0; // initialise score
        if (word != null) {
        char[] wordArray = this.word.toCharArray(); // change word into array of each character
        for (Character letter:wordArray) {
            score += getValue(letter);
        }}
        if (this.doubleWord) {
            score = score * 2;
        }
        if (this.tripleWord) {
            score = score * 3;
        }
        return score; // return the total score of the word
    }

    int getValue(char letter) {
        switch (letter) {
            case 'G': case 'D': return 2;
            case 'B': case 'C': case 'M': case 'P': return 3;
            case 'F': case 'H': case 'V': case 'W': case 'Y': return 4;
            case 'K': return 5;
            case 'J': case 'X': return 8;
            case 'Q': case 'Z': return 10;
            default: return 1;
        }
    }
}
