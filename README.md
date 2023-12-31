
# PokerOddsCalculator
Simple Poker Odds Calculator that can calculate the equity between two hands on the flop, turn, or even preflop from user input
 
 * @author David Eyal
 * @version 2.0 December 30 2023

 # GUI

Built with Swing GUI

Calculating Preflop Odds
 
![Screenshot 2023-12-30 212138](https://github.com/de2425c/PokerOddsCalculator/assets/154690407/5584b339-42e1-4d66-b410-44a4923a63a4)
 
Calculating Flop Odds

![Screenshot 2023-12-30 212203](https://github.com/de2425c/PokerOddsCalculator/assets/154690407/371ee3be-bd5f-4fc6-a45f-6514f38ded69)
 
Calculating Turn Odds

![Screenshot 2023-12-30 212226](https://github.com/de2425c/PokerOddsCalculator/assets/154690407/45c8dad9-32a7-41a4-ae32-4d1bb1affc39)

# Techniques used
 * Custom Card Object with Suit and Val fields
 * Java Map Data Structure For Storing the Deck of Cards and mapping inputs to Card objects
 * Jave Reader/BufferedReader/FileReader for creating the map and removing elements
 * Random Generator to randomly pull keys from a map
 * Adapted Combinatoric Algorithm for storing all combinations of possible 5 card hands made from 7 cards
 * Insertion Sort Algorithm for Sorting Cards by Rank
 * Classification Logic for hand classification and ranking based on extraneous cards.
# Runtimes 
 * PreFlop RunTime Average of 6.36s (1 million simulations)
 * Flop RunTime Average of 1.72s (250,000 simulations)
 * Turn RunTime Average of 0.32 (50,000 simulations)
# Contact
  de2425@columbia.edu

# Links
 * [Adapted Combinations Algorithm](https://stackoverflow.com/questions/29910312/algorithm-to-get-all-the-combinations-of-size-n-from-an-array-java)
 * [Future Idea](https://en.wikipedia.org/wiki/Effective_hand_strength_algorithm)


