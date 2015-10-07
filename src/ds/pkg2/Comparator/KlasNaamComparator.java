/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.pkg2.Comparator;

import ds.pkg2.Klas;
import java.util.Comparator;
import java.util.logging.Logger;

/**
 *
 * @author Ömer Zülaloğlu [IS204] 500712124 & Stefan Lobato [IS204] 500707274
 */
public class KlasNaamComparator implements Comparator<Klas>{

    @Override
    public int compare(Klas o1, Klas o2) {
        String klasNaam1 = o1.getNaam();
        String klasNaam2 = o2.getNaam();
        
        return klasNaam1.compareTo(klasNaam2);
    }
    private static final Logger LOG = Logger.getLogger(KlasNaamComparator.class.getName());
    
}
