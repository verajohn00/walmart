package walmart.com.walmart.Api;

import retrofit2.Call;
import retrofit2.http.GET;
import walmart.com.walmart.Model.Producto;

public interface Cliente {
    @GET("api/rest/model/atg/commerce/catalog/ProductCatalogActor/getSkuSummaryDetails?storeId=0000009999&upc=00750129560012&skuId=00750129560012")
    Call<Producto> getData();

}