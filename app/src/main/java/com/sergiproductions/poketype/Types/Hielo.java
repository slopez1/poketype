package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Hielo extends AbstractType {
    public Hielo() {
        super("Hielo", Color.rgb(128,255,255));
    }

    @Override
    public float dLucha() {
        return 2;
    }

    @Override
    public float dRoca() {
        return 2;
    }

    @Override
    public float dAcero() {
        return 2;
    }

    @Override
    public float dFuego() {
        return 2;
    }

    @Override
    public float dHielo() {
        return (float)0.5;
    }

    //atac


    @Override
    public float aVolador() {
        return 2;
    }

    @Override
    public float aTierra() {
        return 2;
    }

    @Override
    public float aPlanta() {
        return 2;
    }

    @Override
    public float aDragon() {
        return 2;
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
    public float aAgua() {
        return (float)0.5;
    }

    @Override
    public float aHielo() {
        return (float)0.5;
    }
}
