package week3.CardCompany;

public class Card {
    private static int cardNum = 10001;

    private int userCardNum;

    public Card() {
        userCardNum = cardNum;
        cardNum++;
    }

    public int getCardNumber() {
        return userCardNum;
    }
}
