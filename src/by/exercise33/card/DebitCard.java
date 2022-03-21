package by.exercise33.card;

public class DebitCard  extends BankCard {

    private String idCard;
    private String codCvc2;
    private String pinCod;
    private String typeCard; // Classic

    public DebitCard(String cardOwner,String paySystem) {
        super(cardOwner,paySystem);
    }

    public DebitCard(String cardOwner,String paySystem,String idCard,
                     String codCvc2,String pinCod,String typeCard) {
        this(cardOwner,paySystem);
        setIdCard(idCard);
        setCodCvc2(codCvc2);
        setPinCod(pinCod);
        setTypeCard(typeCard);
    }

    public void setTypeCard(String typeCard) {
        this.typeCard = typeCard;
    }

    private void setIdCard(String idCard) {
        if(checkIdCard(idCard)) return;
        this.idCard = idCard;
    }

    private void setCodCvc2(String codCvc2) {
        if(checkCodCvc2(codCvc2)) return;
        this.codCvc2 = codCvc2;
    }

    private void setPinCod(String pinCod) {
        if(checkPinCod(pinCod)) return;
        this.pinCod = pinCod;
    }

    private boolean checkPinCod(String pinCod) {
        if(pinCod.length() != 4) return true;
        if(checkCard(pinCod)) return true;
        return false;
    }

    private boolean checkCodCvc2(String codCvc2) {
        if(!(codCvc2.length() == 3 || codCvc2.length() == 4)) return true;
        if(checkCard(codCvc2)) return true;
        return false;
    }

    private boolean checkIdCard(String idCard) {
        if(idCard.length() != 16) return true;
        if(checkCard(idCard)) return true;
        return false;
    }

    private boolean checkCard(String srtOfNumber) {
        return !srtOfNumber.matches("\\d+");
    }

    public String getIdCard() {
        String newIdCard = "";
        for (int i = 0; i < idCard.length(); i++) {
            if(i%4 == 0) newIdCard += " ";
            newIdCard += idCard.charAt(i);
        }
        return newIdCard;
    }

    public String getPinCod() {
        return pinCod;
    }

    public String getCodCvc2() {
        return codCvc2;
    }

    public String getTypeCard() {
        return typeCard;
    }
}
