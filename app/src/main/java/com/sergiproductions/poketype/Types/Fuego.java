package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Fuego extends AbstractType {
    public Fuego() {
        super("Fuego", Color.rgb(255,0,0));
    }

    @Override
    public float dTierra() {
        return 2;
    }

    @Override
    public float dRoca() {
        return 2;
    }

    @Override
    public float dAgua() {
        return 2;
    }

    @Override
    public float dBicho() {
        return (float)0.5;
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
    public float dPlanta() {
        return (float)0.5;
    }

    @Override
    public float dHielo() {
        return (float)0.5;
    }

    @Override
    public float dHada() {
        return (float)0.5;
    }

    //atac


    @Override
    public float aBicho() {
        return 2;
    }

    @Override
    public float aAcero() {
        return 2;
    }

    @Override
    public float aPlanta() {
        return 2;
    }

    @Override
    public float aHielo() {
        return 2;
    }

    @Override
    public float aDragon() {
        return (float)0.5;
    }

    @Override
    public float aAgua() {
        return (float)0.5;
    }

    @Override
    public float aFuego() {
        return (float)0.5;
    }

    @Override
    public float aRoca() {
        return (float)0.5;
    }
}
