

package ecommerce_;


public class User {
    private String name;
    private String surname;
    private String dateOfBirth;
    private String eMail;
    private String password;
    private String homeAddress;
    private String workAddress;
    private int productOrdered;
    private String favouriteProudct;
    private CreditCard creditCard;

    public User(String name, String surname, String dateOfBirth, String eMail, String password, String homeAddress,
            String workAddress,
            int productOrdered, String favouriteProduct, CreditCard creditCard) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.eMail = eMail;
        this.password = password;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.productOrdered = productOrdered;
        this.favouriteProudct = favouriteProduct;
        this.creditCard = creditCard;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreditCard getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return this.dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getEMail() {
        return this.eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHomeAddress() {
        return this.homeAddress;
    }

    public void setHomeAdress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public String getWorkAdress() {
        return this.workAddress;
    }

    public void setWorkAdress(String workAddress) {
        this.workAddress = workAddress;
    }

    public int getProductOrdered() {
        return this.productOrdered;
    }

    public void setProductOrdered(int productOrdered) {
        this.productOrdered = productOrdered;
    }

    public String getFavouriteProduct() {
        return this.favouriteProudct;
    }

    public void setFavouriteProduct(String favouriteProduct) {
        this.favouriteProudct = favouriteProduct;
    }

    public void productOrdering(int orderNum) {
        this.productOrdered += orderNum;
    }
     public void Purchasing() {
        this.productOrdered++;
    }

    public void Favorites() {
        System.out.println(this.favouriteProudct);
    }

}
