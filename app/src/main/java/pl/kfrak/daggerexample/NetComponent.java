package pl.kfrak.daggerexample;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {NetModule.class, AppModule.class})
public interface NetComponent {
    void inject (MainActivity mainActivity); //wstrzykujemy do maina
//    void inject (MainPresenter presenter); //wstrzykujemy do maina
//    void inject (MainService service); //wstrzykujemy do maina


}
