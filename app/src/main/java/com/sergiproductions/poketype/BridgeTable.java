package com.sergiproductions.poketype;

import android.content.res.Resources;

import com.sergiproductions.poketype.Types.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;

/**
 * Created by Sergi on 15/08/2016.
 */
public class BridgeTable {
    List<Type> types = new ArrayList<Type>();
    List<String> names;
    List<Integer> colors;
    TableType resut;

    public BridgeTable(){
        types.add(new Acero());
        types.add(new Agua());
        types.add(new Bicho());
        types.add(new Dragon());
        types.add(new Electrico());
        types.add(new Fantasma());
        types.add(new Fuego());
        types.add(new Hada());
        types.add(new Hielo());
        types.add(new Lucha());
        types.add(new Normal());
        types.add(new Nothing());
        types.add(new Planta());
        types.add(new Psiquico());
        types.add(new Roca());
        types.add(new Siniestro());
        types.add(new Tierra());
        types.add(new Veneno());
        types.add(new Volador());
    }

    public List<String> getNames(){
        if(this.names==null){
            return names;
        }
        names = new ArrayList<String>();
        for (Type t: types){
            names.add(t.getName());
        }
        return names;
    }

    public List<Integer> getColors(){
        if(this.colors==null){
            return colors;
        }
        colors = new ArrayList<Integer>();
        for (Type t: types){
            colors.add(t.getColor());
        }
        return colors;
    }

    public TableType getTable(String s)throws Resources.NotFoundException{
        for (Type t: types) {
            if(s.equals(t.getName())) return t.getTable();
        }
        throw new Resources.NotFoundException();
    }
    public TableType getTable(String s1,String s2)throws Resources.NotFoundException{
        TableType a3 = new Nothing().getTable();
        TableType a1 = getTable(s1);
        TableType a2 = getTable(s2);
        List<TableTypeRow> table = a1.table;
        for (TableTypeRow t1 : table) {
            TableTypeRow t2 = a2.get(t1.getType());
            TableTypeRow t3 = a3.get(t1.getType());
            t3.setAtaque(t1.getAtaque()*t2.getAtaque()*t3.getAtaque());
            t3.setDefensa(t1.getDefensa()*t2.getDefensa()*t3.getDefensa());
        }
        return a3;
    }


}
