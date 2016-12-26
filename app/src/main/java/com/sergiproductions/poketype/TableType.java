package com.sergiproductions.poketype;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sergi on 14/08/2016.
 */
public class TableType implements Iterable<TableTypeRow> {

    public List<TableTypeRow> table;

    public TableType() {
        table = new ArrayList<TableTypeRow>();
    }

    public void add(String type, float ataque,float defensa) {
        TableTypeRow t1 = new TableTypeRow(type, ataque,defensa);
        table.add(t1);
    }

    public TableTypeRow get(String s) throws Resources.NotFoundException {
        for (TableTypeRow t : table)
            if (s.equals(t.getType())) return t;
        throw new Resources.NotFoundException();
    }

    @Override
    public Iterator<TableTypeRow> iterator() {
        return table.iterator();
    }


}
