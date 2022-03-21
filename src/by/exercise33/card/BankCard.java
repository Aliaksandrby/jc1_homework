package by.exercise33.card;

public class BankCard {

    private String cardOwner;
    private String paySystem;

    public BankCard(String cardOwner,String paySystem) {
        setCardOwner(cardOwner);
        setPaySystem(paySystem);
    }

    public void setCardOwner(String cardOwner) {
        this.cardOwner = cardOwner;
    }

    public void setPaySystem(String paySystem) {
        this.paySystem = paySystem;
    }

    public String getCardOwner() {
        return cardOwner;
    }

    public String getPaySystem() {
        return paySystem;
    }
}
