package com.sergiproductions.poketype.Types;

import android.graphics.Color;

import com.sergiproductions.poketype.Type;

/**
 * Created by Sergi on 14/08/2016.
 */
public abstract class AbstractType extends Type {

    protected AbstractType(String name, int color) {
        super(name, color);
    }

    @Override
    public void createTable() {
        setNormal();
        setLucha();
        setVolador();
        setVeneno();
        setTierra();
        setRoca();
        setBicho();
        setFantasma();
        setAcero();
        setFuego();
        setAgua();
        setPlanta();
        setElectrico();
        setPsiquico();
        setHielo();
        setDragon();
        setSiniestro();
        setHada();
    }



    public void setNormal(){
        table.add("Normal",aNormal(),dNormal());
    }
    public float aNormal(){return 1;}
    public float dNormal(){return 1;}

    public void setLucha(){
        table.add("Lucha",aLucha(),dLucha());
    }
    public float aLucha(){return 1;}
    public float dLucha(){return 1;}

    public void setVolador(){
        table.add("Volador",aVolador(),dVolador());
    }
    public float aVolador(){return 1;}
    public float dVolador(){return 1;}


    public void setVeneno(){
        table.add("Veneno",aVeneno(),dVeneno());
    }
    public float aVeneno(){return 1;}
    public float dVeneno(){return 1;}

    public void setTierra(){
        table.add("Tierra",aTierra(),dTierra());
    }
    public float aTierra(){return 1;}
    public float dTierra(){return 1;}

    public void setRoca(){
        table.add("Roca",aRoca(),dRoca());
    }
    public float aRoca(){return 1;}
    public float dRoca(){return 1;}

    public void setBicho(){
        table.add("Bicho",aBicho(),dBicho());
    }
    public float aBicho(){return 1;}
    public float dBicho(){return 1;}

    public void setFantasma(){
        table.add("Fantasma",aFantasma(),dFantasma());
    }
    public float aFantasma(){return 1;}
    public float dFantasma(){return 1;}

    public void setAcero(){
        table.add("Acero",aAcero(),dAcero());
    }
    public float aAcero(){return 1;}
    public float dAcero(){return 1;}

    public void setFuego(){
        table.add("Fuego",aFuego(),dFuego());
    }
    public float aFuego(){return 1;}
    public float dFuego(){return 1;}

    public void setAgua(){
        table.add("Agua",aAgua(),dAgua());
    }
    public float aAgua(){return 1;}
    public float dAgua(){return 1;}

    public void setPlanta(){
        table.add("Planta",aPlanta(),dPlanta());
    }
    public float aPlanta(){return 1;}
    public float dPlanta(){return 1;}

    public void setElectrico(){
        table.add("Electrico",aElectrico(),dElectrico());
    }
    public float aElectrico(){return 1;}
    public float dElectrico(){return 1;}

    public void setPsiquico(){
        table.add("Psiquico",aPsiquico(),dPsiquico());
    }
    public float aPsiquico(){return 1;}
    public float dPsiquico(){return 1;}

    public void setHielo(){
        table.add("Hielo",aHielo(),dHielo());
    }
    public float aHielo(){return 1;}
    public float dHielo(){return 1;}

    public void setDragon(){
        table.add("Dragon",aDragon(),dDragon());
    }
    public float aDragon(){return 1;}
    public float dDragon(){return 1;}

    public void setSiniestro(){
        table.add("Siniestro",aSiniestro(),dSiniestro());
    }
    public float aSiniestro(){return 1;}
    public float dSiniestro(){return 1;}

    public void setHada(){
        table.add("Hada",aHada(),dHada());
    }
    public float aHada(){return 1;}
    public float dHada(){return 1;}



}
