package walmart.com.walmart.Activities;

import android.os.AsyncTask;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

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
        Producto p;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();

            bar.setVisibility(View.VISIBLE);
            vista.setVisibility(View.INVISIBLE);

        }

        @Override
        protected Void doInBackground(Void... voids) {

            ApiClient api = new ApiClient();
            p = api.getProduct();



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


