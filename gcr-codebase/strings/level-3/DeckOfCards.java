import java.util.*;
public class DeckOfCards{

    // Method to Initialize the deck of cards with suits and ranks and return the deck
    public String[] initializeDeck(String[] suits,String[] ranks){
        int numOfCards=suits.length*ranks.length;
        String[] deck=new String[numOfCards];
        int index=0;

        // Create deck using suits and ranks
        for(int i=0;i<suits.length;i++){
            for(int j=0;j<ranks.length;j++){
                deck[index]=ranks[j]+" of "+suits[i];
                index++;
            }
        }
        return deck;
    }

    // Method to Shuffle the deck of cards and return the shuffled deck
    public String[] shuffleDeck(String[] deck){
        int n=deck.length;

        // Shuffle cards using random swapping
        for(int i=0;i<n;i++){
            int randomCardNumber=i+(int)(Math.random()*(n-i));
            String temp=deck[i];
            deck[i]=deck[randomCardNumber];
            deck[randomCardNumber]=temp;
        }
        return deck;
    }

    // Method to distribute the deck of n cards to x number of players and return the players
    public String[][] distributeCards(String[] deck,int players,int cards){
        if(players*cards>deck.length){
            return null;
        }

        String[][] playerCards=new String[players][cards];
        int index=0;

        // Distribute cards to players
        for(int i=0;i<players;i++){
            for(int j=0;j<cards;j++){
                playerCards[i][j]=deck[index];
                index++;
            }
        }
        return playerCards;
    }

    // Method to Print the players and their cards
    public void printPlayers(String[][] players){
        for(int i=0;i<players.length;i++){
            System.out.println("Player "+(i+1)+":");
            for(int j=0;j<players[i].length;j++){
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    // Main method takes number of players and number of cards per player and displays the result 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        DeckOfCards obj=new DeckOfCards();

        String[] suits={"Hearts","Diamonds","Clubs","Spades"};
        String[] ranks={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};

        String[] deck=obj.initializeDeck(suits,ranks);
        deck=obj.shuffleDeck(deck);

        // Taking player and card input
        System.out.print("Enter number of players: ");
        int players=input.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cards=input.nextInt();

        String[][] result=obj.distributeCards(deck,players,cards);

        // Displaying result
        if(result!=null){
            obj.printPlayers(result);
        }else{
            System.out.println("Cards cannot be distributed");
        }

	    input.close();
    }
}
