package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Tierra extends AbstractType {
    public Tierra() {
        super("Tierra", Color.rgb(255,255,128));
    }

    @Override
    public float dAgua() {
        return 2;
    }

    @Override
    public float dPlanta() {
        return 2;
    }

    @Override
    public float dHielo() {
        return 2;
    }

    @Override
    public float dElectrico() {
        return 0;
    }

    @Override
    public float dVeneno() {
        return (float)0.5;
    }

    @Override
    public float dRoca() {
        return (float)0.5;
    }


    //atac

    @Override
    public float aVeneno() {
        return 2;
    }

    @Override
    public float aRoca() {
        return 2;
    }

    @Override
    public float aAcero() {
        return 2;
    }

    @Override
    public float aFuego() {
        return 2;
    }

    @Override
    public float aElectrico() {
        return 2;
    }

    @Override
    public float aVolador() {
        return 0;
    }

    @Override
    public float aBicho() {
        return (float)0.5;
    }

    @Override
    public float aPlanta() {
        return (float)0.5;
    }
}
