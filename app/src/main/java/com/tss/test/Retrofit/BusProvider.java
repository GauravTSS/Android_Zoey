package com.tss.test.Retrofit;

import com.squareup.otto.Bus;

/**
 * Created by user on 12/5/2016.
 */
public class BusProvider {
    private static final Bus BUS = new Bus();

    public static Bus getInstance(){
        return BUS;
    }

    public BusProvider(){}
}
