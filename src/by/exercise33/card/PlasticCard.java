package by.exercise33.card;

import java.time.LocalDate;
import java.util.Arrays;

public class PlasticCard extends DebitCard {
    final static double HEIGHT = 53.98;
    final static double WIDTH = 85.6;
    private String[] cardHolder;
    private boolean isContact;
    private String validThru;

    public PlasticCard(String cardOwner, String paySystem, String idCard,
                       String codCvc2, String pinCod, String typeCard) {
        super(cardOwner, paySystem, idCard, codCvc2, pinCod, typeCard);
    }

    public PlasticCard(String cardOwner, String paySystem, String idCard,
                       String codCvc2, String pinCod, String typeCard,
                       String[] cardHolder,int validThru,boolean isContact) {
        this(cardOwner, paySystem, idCard, codCvc2, pinCod, typeCard);
        setCardHolder(cardHolder);
        setValidThru(validThru);
        setContact(isContact);
    }

    public void setCardHolder(String[] cardHolder) {
        if(checkCrdHolder(cardHolder)) return;
        this.cardHolder = cardHolder;
    }

    private boolean checkCrdHolder(String[] cardHolder) {
        if(cardHolder.length != 2) return true;
        return false;
    }

    public void setContact(boolean contact) {
        isContact = contact;
    }

    public void setValidThru(int years) {
        if(!(years > 0 && years < 6)) return;
        LocalDate localDate = LocalDate.now();
        localDate = localDate.plusYears(years);
        String date = localDate.toString();
        date = "" + date.charAt(5) + date.charAt(6) + "/" + date.charAt(2) + date.charAt(3);
        this.validThru = date;
    }

    public String[] getCardHolder() {
        return cardHolder;
    }

    public boolean isContact() {
        return isContact;
    }

    public String getValidThru() {
        return validThru;
    }

    @Override
    public String toString() {
        return  "cardOwner = " + getCardOwner() + "\n" +
                "typeCard = " + getTypeCard() + "\n" +
                "isContact = " + isContact() + "\n" +
                "idCard = " + getIdCard() + "\n" +
                "cardHolder = " + Arrays.toString(getCardHolder()) + "\n" +
                "validThru = " + getValidThru() + "\n" +
                "paySystem = " + getPaySystem() + "\n" +
                "codCvc2 = " + getCodCvc2() + "\n" +
                "pinCod = " + getPinCod() + "\n";
    }
}
