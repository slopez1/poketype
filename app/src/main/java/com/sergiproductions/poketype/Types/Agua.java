package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Agua extends AbstractType {
    public Agua() {
        super("Agua", Color.rgb(0,255,255));
    }

    @Override
    public float dPlanta() {
        return 2;
    }

    @Override
    public float dElectrico() {
        return 2;
    }

    @Override
    public float dAcero() {
        return (float)0.5;
    }

    @Override
    public float dFuego() {
        return (float)0.5;
    }

    @Override
    public float dAgua() {
        return (float)0.5;
    }

    @Override
    public float dHielo() {
        return (float)0.5;
    }


    @Override
    public float aTierra() {
        return 2;
    }

    @Override
    public float aRoca() {
        return 2;
    }

    @Override
    public float aFuego() {
        return 2;
    }

    @Override
    public float aAgua() {
        return (float)0.5;
    }

    @Override
    public float aPlanta() {
        return (float)0.5;
    }

    @Override
    public float aDragon() {
        return (float)0.5;
    }
}
