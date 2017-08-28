package pl.kfrak.daggerexample;

import android.app.Application;

/**
 * Created by RENT on 2017-08-28.
 */

public class MyApplication extends Application {

    private NetComponent netComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        //budujemy; DaggerNetComponent - klasa która dagger dla nas wygenerowal
        netComponent = DaggerNetComponent.builder()
                //to ze w komponencie wskazalismy dwa moduly (modules = {NetModule.class, AppModule.class}
                //to dagger wygenerowal nam ponizsze
                .appModule(new AppModule(this)) //stworzylismy modul //deprecated, bo "hej, dodałeś tu moduł, ale jeszcze z niego nie korzystasz
                //czy na pewno wszytsko ok?"
                .netModule(new NetModule())
                .build();
        //kod generowany przez daggera2 jest bardzo czytelny dla programistow (np w porowananiu do 1)
    }

    public NetComponent getNetComponent(){
        return netComponent;
    }



}
