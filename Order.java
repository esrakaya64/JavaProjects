
package ecommerce_;


public class Order {
    private User orderingUser;
    private Product orderingProduct;
    private CreditCard orderingCreditCard;
    private int orderNum;

    public Order(User orderingUser, Product orderingProduct, CreditCard orderingCreditCard, int orderNum) {
        this.orderingUser = orderingUser;
        this.orderingProduct = orderingProduct;
        this.orderingCreditCard = orderingCreditCard;
        this.orderNum = orderNum;
    }
    public void setOrderingUser(User orderingUser){
        this.orderingUser = orderingUser;
    }
    public User getOrderingUser(){
        return this.orderingUser;
    }
    public void setOrderingProduct(Product orderingProduct){
        this.orderingProduct = orderingProduct;
    }
    public Product orderingProduct(){
        return this.orderingProduct;
    }
    public void setOrderingCreditCard(CreditCard orderingCreditCard){
        this.orderingCreditCard = orderingCreditCard;
    }
    public CreditCard orderingCreditCard(){
        return this.orderingCreditCard;
    }
    public void setOrderNum(int orderNum){
        this.orderNum = orderNum;
    }
    public int getOrderNum(){
        return this.orderNum;
    }

    public void ordering() {
        if (orderingProduct.decreaseStock(orderNum)) {
            orderingUser.productOrdering(orderNum);
        }
    }
}
