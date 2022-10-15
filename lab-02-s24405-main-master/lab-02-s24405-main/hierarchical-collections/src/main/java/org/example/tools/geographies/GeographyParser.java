package org.example.tools.geographies;

import org.example.model.Geography;
import org.example.tools.abstractions.IParse;

public class GeographyParser implements IParse<Geography> {
    @Override
    public Geography parse(String line) {

        String tekst = line;

        String[] parts = tekst.split(";");
        Geography geographyobject = new Geography();


        geographyobject.setId(Integer.parseInt(parts[0]));
        geographyobject.setType(parts[1]);
        geographyobject.setName(parts[2]);
        geographyobject.getCode(parts[3]);
// parents id

        try{
            geographyobject.setParentId(Integer.valueOf(parts[4].trim()));
        } catch (NumberFormatException e){
            geographyobject.setParentId(null);
        }
        return geographyobject;
    }
}
