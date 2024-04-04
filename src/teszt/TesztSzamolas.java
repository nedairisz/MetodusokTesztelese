package teszt;

import beugrok.Szamolas;

public class TesztSzamolas {
    public static void main(String[] args) {
        TesztSzamolas.tesztEsetek();
    }

    private static void tesztEsetek() {
        /* elvárt helyes működésre teszt esetek: */
        osszeadas2pozitivTeszt();
        osszeadas1neg1pozTeszt();
        osszeadas1poz1negTeszt();
        osszeadas2nullaTeszt();
        osszeadasTombAzonosakTeszt();
        osszeadasTombElteroElojelekTeszt();
        osszeadasTomb2szammalTeszt();
        negyzetgyokEgeszTesz();
        negyzetgyokValosTesz();
        negyzetgyok0Tesz();
        negyzetgyokValosHibaturesselTesz();
        
        /* ELVÁRT HIBÁS működésre teszt esetek: */
        negyzetgyokNegativTesz();
        osszeadasTombUresTeszt();
        osszeadasTombNullTeszt();
        
    }

    private static void osszeadas2pozitivTeszt() {
        String sz = "2 db pozitív";
        System.out.println(sz);
        int kapott = Szamolas.osszegzes(1, 2);
        int vart = 3;
        
        assert kapott == vart: "hibás: " + sz;
        
        /* assert nélkül: */
//        if(kapott == vart){
//            System.out.println("jó a teszt");
//        }else{
//            System.out.println("NEM jó a teszt");
//        }
    }
    
    private static void osszeadas1neg1pozTeszt() {
        System.out.println("1 db -, 1 db +");
        int kapott = Szamolas.osszegzes(-1, 2);
        int vart = 1;
        
        assert kapott == vart: "NEM jó a teszt";
    }
    
    private static void osszeadas1poz1negTeszt() {
        System.out.println("1 db +, 1 db -");
        int kapott = Szamolas.osszegzes(1, -2);
        int vart = -1;
        
        assert kapott == vart: "NEM jó a teszt";
    }

    private static void osszeadas2nullaTeszt() {
        System.out.println("2 db 0");
        int kapott = Szamolas.osszegzes(0, 0);
        int vart = 0;
        
        assert kapott == vart: "NEM jó a teszt";
    }

    private static void osszeadasTombAzonosakTeszt() {
        System.out.println("Tömb: azonos értékekkel");
        int kapott = Szamolas.osszegzes(new int[]{3,3,3});
        int vart = 9;
        
        assert kapott == vart: "NEM jó a teszt";
    }

    private static void osszeadasTombElteroElojelekTeszt() {
        System.out.println("Tömb: eltérő előjelekkel");
        int kapott = Szamolas.osszegzes(new int[]{-3,2,3,-4});
        int vart = -2;
        
        assert kapott == vart: "NEM jó a teszt";
    }

    private static void osszeadasTomb2szammalTeszt() {
        System.out.println("Tömb: 2 értékkel");
        int kapott = Szamolas.osszegzes(new int[]{3,-3});
        int vart = 0;
        
        assert kapott == vart: "NEM jó a teszt";
    }

    private static void negyzetgyokEgeszTesz() {
        System.out.println("nGyök: egész");
        double kapott = Szamolas.gyokvonas(25);
        double vart = 5;
        
        assert kapott == vart: "NEM jó a teszt";
    }
    

    private static void negyzetgyokValosTesz() {
        System.out.println("nGyök: valós");
        double kapott = Szamolas.gyokvonas(2);
        double vart = Math.sqrt(2);
        
        assert kapott == vart: "NEM jó a teszt";
    }

    private static void negyzetgyok0Tesz() {
        System.out.println("nGyök: 0");
        double kapott = Szamolas.gyokvonas(0);
        double vart = 0;
        
        assert kapott == vart: "NEM jó a teszt";
    }

    private static void negyzetgyokValosHibaturesselTesz() {
        System.out.println("nGyök: hibatűrés-> 0.005");
        double kapott = Szamolas.gyokvonas(2);
        double vart = Math.sqrt(2);
        /* 2 tizedes pontosságot állítok be: */
        vart = Math.sqrt(2)*100;
        vart = (int)vart;
        vart = vart/100;
        
        double epsilon = 0.005D;
        assert Math.abs(kapott - vart) < epsilon: "NEM jó a teszt";
    }

    private static void negyzetgyokNegativTesz() {
       System.out.println("nGyök: -");
        double kapott = Szamolas.gyokvonas(-5);
       
        /* nem jó: */
        double vart = Double.NaN;
        //kapott == Double.NaN;
        assert Double.isNaN(kapott): "NEM- jó a teszt";
 
        /* Helyes megoldás: */
        assert Double.isNaN(kapott): "Nem megfelelő a teszt";
    }
    
//    private static void negyzetgyokNegativTesz() {
//       System.out.println("nGyök: -");
//       double kapott = Math.sqrt(-25);
//       double vart= Double.NaN;
//       if (Double.isNaN(kapott)){
//           System.out.println("jó a teszt");
//       }else{
//           System.out.println("NEM jó a teszt");
//       }
//    }

    private static void osszeadasTombUresTeszt() {
    }

    private static void osszeadasTombNullTeszt() {
    }
    
}
