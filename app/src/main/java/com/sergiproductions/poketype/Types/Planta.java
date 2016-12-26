package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Planta extends AbstractType {
    public Planta() {
        super("Planta", Color.rgb(0,255,0));
    }

    @Override
    public float dVolador() {
        return 2;
    }

    @Override
    public float dVeneno() {
        return 2;
    }

    @Override
    public float dBicho() {
        return 2;
    }

    @Override
    public float dFuego() {
        return 2;
    }

    @Override
    public float dHielo() {
        return 2;
    }

    @Override
    public float dTierra() { return (float)0.5;
    }

    @Override
    public float dAgua() {
        return (float)0.5;
    }

    @Override
    public float dPlanta() {
        return (float)0.5;
    }

    @Override
    public float dElectrico() {
        return (float)0.5;
    }
    //atac

    @Override
    public float aTierra() {
        return 2;
    }

    @Override
    public float aRoca() {
        return 2;
    }

    @Override
    public float aAgua() {
        return 2;
    }

    @Override
    public float aVolador() {
        return (float)0.5;
    }

    @Override
    public float aBicho() {
        return (float)0.5;
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

    @Override
    public float aDragon() {
        return (float)0.5;
    }

    @Override
    public float aPlanta() {
        return (float)0.5;
    }
}
