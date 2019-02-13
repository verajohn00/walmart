package walmart.com.walmart.Model;

public class Producto {

    String skuDisplayNameText;
    String department;
    long skuId;
    double basePrice;

    public Producto(String skuDisplayNameText, String department, long skuId, double basePrice) {
        this.skuDisplayNameText = skuDisplayNameText;
        this.department = department;
        this.skuId = skuId;
        this.basePrice = basePrice;
    }

    public String getSkuDisplayNameText() {
        return skuDisplayNameText;
    }

    public void setSkuDisplayNameText(String skuDisplayNameText) {
        this.skuDisplayNameText = skuDisplayNameText;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getSkuId() {
        return skuId;
    }

    public void setSkuId(long skuId) {
        this.skuId = skuId;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }
}
