package beugrok;

public class Szamolas {

    public static void main(String[] args) {
        nehanySzamOsszegenekGyoke();
    }

    private static void nehanySzamOsszegenekGyoke() {
        haromSzamGyokeKonzolon();
        otSzamGyokeKonzolon();
    }

    private static void haromSzamGyokeKonzolon() {
        /* 1.a: 3 szám gyökének megjelenítése: */
        int osszeg = osszegzes(2, osszegzes(3,4));
        double gyok = gyokvonas(osszeg);
        String kimenet = "%d gyöke: %.4f\n".formatted(osszeg, gyok);
        
        /* a kiíró logika KÓDDUPLIKÁLÁSA: */
        //System.out.println(kimenet);
        konzolraIr(kimenet);
    }
    
    private static void otSzamGyokeKonzolon() {
        /* 1.b: 5 szám gyökének megjelenítése: */
        /* több sorban: */
        //int[] szamok = {3,5,12,2,3};
        //osszeg = osszegzes(szamok);
        /* egy sorban: */
        int osszeg = osszegzes(new int[]{3,5,12,2,3});
        double gyok = gyokvonas(osszeg);
        String kimenet = "%d gyöke: %.4f\n".formatted(osszeg, gyok);
        
        /* a kiíró logika KÓDDUPLIKÁLÁSA: */
        //System.out.println(kimenet);
        konzolraIr(kimenet);
    }
    
    /* TESZTELÉSHEZ:
    amelyiket tesztelni akarom, az legyen public
    */
    
    /* az osszegzes(...) túlterhelése: 
     - azonos név
     - eltérő paraméterezés
    */
    public static int osszegzes(int[] tomb) {
        int osszeg = 0;
        for (int i = 0; i < tomb.length; i++) {
            osszeg += tomb[i];
        }
        return osszeg;
    }
    
    public static int osszegzes(int a, int b) {
        /* kódduplikálás: */
        //return a+b;
        
        /* több sorban: */
        //int[] tomb = {a, b};
        //return osszegzes(tomb);
        
        /* egy sorban: */
        return osszegzes(new int[]{a, b});
    }
    
    public static double gyokvonas(int osszeg) {
        return Math.sqrt(osszeg);
    }

     /* nincs sortörés, a KEVESEBB AZ TÖBB elv miatt:
    ha kiírtuk, már nem lehet leszedni, 
    ahol kell, ott az uzenet átadásánál belerakunk szóközt
    */
    private static void konzolraIr(String uzenet) {
        System.out.print(uzenet);
    }
    
    /* ha nincs láthatóság:
    csomag szinten bárkli láthatja
    private: csak az osztályban
    public: másik osztályban is
    */
    static void csomagSzintu(){;}
    public static void publicSzintu(){;}
    
}
