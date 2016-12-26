package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Roca extends AbstractType {
    public Roca() {
        super("Roca", Color.rgb(255,128,64));
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
    public float dAcero() {
        return 2;
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
    public float dNormal() {
        return (float)0.5;
    }

    @Override
    public float dVolador() {
        return (float)0.5;
    }

    @Override
    public float dVeneno() {
        return (float)0.5;
    }

    @Override
    public float dFuego() {
        return (float)0.5;
    }

    //Atac

    @Override
    public float aVolador() {
        return 2;
    }

    @Override
    public float aBicho() {
        return 2;
    }

    @Override
    public float aFuego() {
        return 2;
    }

    @Override
    public float aHielo() {
        return 2;
    }

    @Override
    public float aLucha() {
        return (float)0.5;
    }

    @Override
    public float aTierra() {
        return (float)0.5;
    }

    @Override
    public float aAcero() {
        return (float)0.5;
    }





}
