package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Acero extends AbstractType {
    public Acero() {
        super("Acero", Color.rgb(64,128,128));
    }

    @Override
    public float dLucha() {
        return 2;
    }

    @Override
    public float dTierra() {
        return 2;
    }

    @Override
    public float dFuego() {
        return 2;
    }

    @Override
    public float dVeneno() {
        return 0;
    }

    @Override
    public float dNormal() {
        return (float)0.5;
    }

    @Override
    public float dVolador() {
        return (float)0.5;
    }

    @Override
    public float dRoca() {
        return (float)0.5;
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
    public float dPlanta() {
        return (float)0.5;
    }

    @Override
    public float dPsiquico() {
        return (float)0.5;
    }

    @Override
    public float dHielo() {
        return (float)0.5;
    }

    @Override
    public float dDragon() {
        return (float)0.5;
    }

    @Override
    public float dHada() {
        return (float)0.5;
    }

//ata
    @Override
    public float aRoca() {
        return 2;
    }

    @Override
    public float aHielo() {
        return 2;
    }

    @Override
    public float aHada() {
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
    public float aElectrico() {
        return (float)0.5;
    }
}
