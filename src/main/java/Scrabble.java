public class Scrabble {
    // properties
    String word;

    public Scrabble(String word) {
        this.word = word.toUpperCase();
    }

    public int score() {
        int score = 0; // initialise score
        char[] wordArray = this.word.toCharArray(); // change word into array of each character
        for (Character letter:wordArray) {
            score += getValue(letter);
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
