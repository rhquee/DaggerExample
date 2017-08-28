package pl.kfrak.daggerexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;
import javax.inject.Named;

import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    @Inject
//            @Named("myfirstRetrofit")
    Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //zebrac aplikacje, scastowac ją na MyApllication
        ((MyApplication) getApplication()).getNetComponent().inject(this); //gdybysmy mieli wstrzyknąć presentera to zamiast "this"

    }
}
