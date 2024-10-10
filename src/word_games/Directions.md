# Word Games

## Directions

Implement the class `WordGames`.

It should have one instance variable, a `String` called `word`. It holds the word that will be manipulated with the following methods.

The methods should be:

* A constructor that takes a word to set `word`.
* `public String scramble()`: Returns a string that scrambles the word by swapping the
first half of the word and the last half of the word. 
For example, "turtle" becomes "tletur". Hint: use the length of the word
* `public String bananaSplit(int insertIdx, String insertText)`: Returns a `String` that puts `insertText` in the word such that the first character of `insertText` is at index `insertIdx`. For example, if you want to put "BOO" at index 2 in the word "ghost", this method would return "ghBOOost". Note that the index of "B" is 2.
* `public String bananaSplit(String insertChar, String insertText)`: Returns a `String` that puts `insertText` in the word such that the first character of `insertText` is at the index of the first occurrence of `insertChar`. 
For example, if you want to put "BOO" in the word "ghost" and `insertChar` is 'o', this method would return "ghBOOost". Note that the index of "B" is the same as where the "o" was.
* `public String toString()`: Returns a string with square brackets around `word`. For example, if `word` is "fun", `toString` should return "[fun]".
