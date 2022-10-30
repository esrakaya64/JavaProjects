
package ecommerce_;

public class Product {
    private String productName;
    private String productColor;
    private String productCategory;
    private int stockInformation;
    private Double productWeight;
    private String descriptionInformation;

    public Product(String productName, String productColor, String productCategory, int stockInformation,
            Double productWeight, String descriptionInformation) {
        this.productName = productName;
        this.productColor = productColor;
        this.productCategory = productCategory;
        this.stockInformation = stockInformation;
        this.productWeight = productWeight;
        this.descriptionInformation = descriptionInformation;
    }

    public String getProductName() {
        return this.productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductColor() {
        return this.productColor;
    }

    public void setProductColor(String productColor) {
        this.productColor = productColor;
    }

    public String getProductCategory() {
        return this.productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getStockInformation() {
        return this.stockInformation;
    }

    public void setStockInformation(int stockInformation) {
        this.stockInformation = stockInformation;
    }

    public Double getProductWeight() {
        return this.productWeight;
    }

    public void setProductWight(Double productWeight) {
        this.productWeight = productWeight;
    }

    public String getDescriptionInformation() {
        return this.descriptionInformation;
    }

    public void setDescriptionInformation(String descriptionInformation) {
        this.descriptionInformation = descriptionInformation;
    }

    public boolean decreaseStock(int productOrdered) {
        if (productOrdered < stockInformation) {
            this.stockInformation -= productOrdered;
            return true;
        } else {
            System.out.println("Stock is insufficient");
            return false;
        }
    }
}
