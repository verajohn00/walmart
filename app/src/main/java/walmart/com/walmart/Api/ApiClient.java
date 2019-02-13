package walmart.com.walmart.Api;

import android.util.Log;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import walmart.com.walmart.Model.Producto;

public class ApiClient {

    String url = "https://super.walmart.com.mx/";

    public Producto getProduct(){

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        Cliente restClient = retrofit.create(Cliente.class);
        Call<Producto> call = restClient.getData();

        call.enqueue(new Callback<Producto>() {
            @Override
            public void onResponse(Call<Producto> call, Response<Producto> response) {
                switch (response.code()) {
                    case 200:
                        Producto data = response.body();

                        //view.notifyDataSetChanged(data.getResults());
                        break;
                    case 401:

                        break;
                    default:

                        break;
                }
            }

            @Override
            public void onFailure(Call<Producto> call, Throwable t) {
                Log.e("fail","");
            }
        });

        return null;

    }

}
