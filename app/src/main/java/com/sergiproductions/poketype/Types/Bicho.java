package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Bicho extends AbstractType {
    public Bicho() {
        super("Bicho", Color.rgb(128,255,0));
    }

    @Override
    public float dVolador() {
        return 2;
    }

    @Override
    public float dRoca() {
        return 2;
    }

    @Override
    public float dFuego() {
        return 2;
    }

    @Override
    public float dLucha() {
        return (float)0.5;
    }

    @Override
    public float dTierra() {
        return (float)0.5;
    }

    @Override
    public float dPlanta() {
        return (float)0.5;
    }


    @Override
    public float aPlanta() {
        return 2;
    }

    @Override
    public float aPsiquico() {
        return 2;
    }

    @Override
    public float aSiniestro() {
        return 2;
    }

    @Override
    public float aLucha() {
        return (float)0.5;
    }

    @Override
    public float aVolador() {
        return (float)0.5;
    }

    @Override
    public float aVeneno() {
        return (float)0.5;
    }

    @Override
    public float aFantasma() {
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
    public float aHada() {
        return (float)0.5;
    }
}
