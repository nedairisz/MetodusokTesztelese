package teszt;

import beugrok.Szamolas;

public class StaticBemutatasa {
    public static void main(String[] args) {
        /* static metódusokat 
        ajánlott az osztály nevével 
        minősíteni
        nem ajánlott: tesztEsetek();
        ajánlott:
        */
        StaticBemutatasa.tesztEsetek();
        
        Szamolas.main(args);
        Szamolas.publicSzintu();
        Szamolas.gyokvonas(0);
    }

    /* static csak static-ot lát, 
    ezek -egyelőre- nem elérhetőek
    */
//    private void m1() {;}
//    void m2() {;}
    
    static void m3() {
    
    }
    
    private static void tesztEsetek() {
        
    }
}
