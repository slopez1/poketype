package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Hada  extends AbstractType {
    public Hada() {
        super("Hada", Color.rgb(255,128,255));
    }

    @Override
    public float dVeneno() {
        return 2;
    }

    @Override
    public float dAcero() {
        return 2;
    }

    @Override
    public float dLucha() {
        return (float)0.5;
    }

    @Override
    public float dBicho() {
        return (float)0.5;
    }

    @Override
    public float dSiniestro() {
        return (float)0.5;
    }

    @Override
    public float dDragon() {
        return 0;
    }


    //atac


    @Override
    public float aLucha() {
        return 2;
    }

    @Override
    public float aDragon() {
        return 2;
    }

    @Override
    public float aHielo() {
        return 2;
    }

    @Override
    public float aVeneno() {
        return (float)0.5;
    }

    @Override
    public float aAcero() {
        return (float)0.5;
    }

    @Override
    public float aFuego() {
        return (float)0.5;
    }
}
