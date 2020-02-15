package com.example.daggerex5;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelModule {

    @Provides
    Rims provideRims(){
        return new Rims();
    }

    @Provides
    Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    Wheel provideWheels(Rims rims, Tires tires){
        return new Wheel(rims, tires);
    }
}
