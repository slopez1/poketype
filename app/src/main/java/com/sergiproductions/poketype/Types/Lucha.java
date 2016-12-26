package com.sergiproductions.poketype.Types;

import android.graphics.Color;

/**
 * Created by Sergi on 14/08/2016.
 */
public class Lucha extends AbstractType{

    public Lucha(){
        super("Lucha", Color.rgb(252,159,133));
    }
    //Def
    public float dVolador(){
        return 2;
    }
    public float dPsiquico(){
        return 2;
    }
    public float dHada(){
        return 2;
    }
    public float dRoca(){
        return (float)0.5;
    }
    public float dSiniestro(){
        return (float)0.5;
    }
    public float dBicho(){
        return (float)0.5;
    }

    //Atac

    public float aNormal(){
        return 2;
    }
    public float aRoca(){
        return 2;
    }
    public float aAcero(){
        return 2;
    }
    public float aHielo(){
        return 2;
    }
    public float aSiniestro(){
        return 2;
    }


    public float aVolador(){
        return (float)0.5;
    }
    public float aVeneno(){
        return (float)0.5;
    }
    public float aBicho(){
        return (float)0.5;
    }
    public float aPsiquico(){
        return (float)0.5;
    }
    public float aHada() {
        return (float)0.5;
    }
    public float aFanstasma(){
        return 0;
    }




}
