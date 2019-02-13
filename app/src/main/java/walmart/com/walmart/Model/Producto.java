package walmart.com.walmart.Model;

import com.google.gson.annotations.SerializedName;

public class Producto {

    @SerializedName("skuDisplayNameText")
    String skuDisplayNameText;
    @SerializedName("department")
    String department;
    @SerializedName("skuId")
    String skuId;
    @SerializedName("basePrice")
    String basePrice;

    public Producto(String skuDisplayNameText, String department, String skuId, String basePrice) {
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

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(String basePrice) {
        this.basePrice = basePrice;
    }
}
