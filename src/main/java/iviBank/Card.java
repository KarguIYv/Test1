package iviBank;

public class Card {
    private final String CARD_NUMBER;
    public String pincCode;

    public Card(String cartNumber, String pincCode) {
        this.CARD_NUMBER = cartNumber;
        this.pincCode = pincCode;
    }

    public String getCARD_NUMBER() {
        return CARD_NUMBER;
    }
    public String getPincCode() {
        return pincCode;
    }

    public void setPincCode(String pincCode) {
        this.pincCode = pincCode;
    }
    private String generateNumbers( int amount){
        String number = "";
        for (int i =0; i<amount; i++ ){
            number += rnd(0,9);
        }
        return number;
    }

    private int rnd(int min, int max) {
        max -= min;

        return (int) (Math.random() * ++max) + min;
    }
}
