
package ecommerce_;


public class CreditCard {
    private int creditCardNumber;
    private String creditCardUser;
    private int securityCode;
    private String expirationDate;

    public CreditCard(int creditCardNumber, String creditCardUser, int securityCode, String expirationDate) {
        this.creditCardNumber = creditCardNumber;
        this.creditCardUser = creditCardUser;
        this.securityCode = securityCode;
        this.expirationDate = expirationDate;
    }

    public int getCreditCardNumber() {
        return this.creditCardNumber;
    }

    public void setCreditCardNumber(int creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    public String getCreditCardUser() {
        return this.creditCardUser;
    }

    public void setCreditCardUser(String creditCardUser) {
        this.creditCardUser = creditCardUser;
    }

    public int getSecurityCode() {
        return this.securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }
}
