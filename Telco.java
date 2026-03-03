public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dateAllowance;
    private boolean unliCallText;
    
    public Telco(String telcoName, double promoPrice, int dateAllowance, boolean unliCallText) {
        this.telcoName = telcoName;
        this.promoPrice = promoPrice;
        this.dateAllowance = dateAllowance;
        this.unliCallText = unliCallText;
    }

    @Override
    public String accept(UsagePromo promo, double money)
}