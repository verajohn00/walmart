package walmart.com.walmart.Activities;

import android.os.AsyncTask;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import walmart.com.walmart.Api.ApiClient;
import walmart.com.walmart.Model.Producto;
import walmart.com.walmart.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ThreadCall call = new ThreadCall();
        call.execute();
    }


    class ThreadCall extends AsyncTask<Void,Void,Void>{

        ProgressBar bar = findViewById(R.id.bar);
        ConstraintLayout vista = findViewById(R.id.viewData);

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            bar.setVisibility(View.VISIBLE);
            vista.setVisibility(View.INVISIBLE);

        }

        @Override
        protected Void doInBackground(Void... voids) {

            ApiClient api = new ApiClient();
            Call<Producto> call = api.getProduct();

            call.enqueue(new Callback<Producto>() {
                @Override
                public void onResponse(Call<Producto> call, Response<Producto> response) {
                    switch (response.code()) {
                        case 200:

                            bar.setVisibility(View.INVISIBLE);
                            vista.setVisibility(View.VISIBLE);

                            Producto producto = response.body();

                            break;
                        case 401:

                            bar.setVisibility(View.INVISIBLE);
                            vista.setVisibility(View.VISIBLE);

                            break;
                        default:

                            bar.setVisibility(View.INVISIBLE);
                            vista.setVisibility(View.VISIBLE);

                            break;
                    }
                }

                @Override
                public void onFailure(Call<Producto> call, Throwable t) {

                    bar.setVisibility(View.INVISIBLE);
                    vista.setVisibility(View.VISIBLE);


                }
            });



            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);

            bar.setVisibility(View.INVISIBLE);
            vista.setVisibility(View.VISIBLE);



        }
    }

}


