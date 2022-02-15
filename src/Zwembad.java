public class Zwembad {

    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad(double le, double br, double di) {
        lengte = le;
        breedte = br;
        diepte = di;
    }

    public Zwembad(){}


    public void setLengte(double le) {
        lengte = le;
    }

    public void setBreedte(double br) {
        breedte = br;
    }

    public void setDiepte(double di) {
        diepte = di;
    }

    public double getLengte() {
        return lengte;
    }

    public double getBreedte() {
        return breedte;
    }

    public double getDiepte() {
        return diepte;
    }

    public double inhoud() {
        return (lengte * breedte * diepte);

    }

    public String toString() {
        String s = "Dit zwembad is " + breedte + " meter breed, " + lengte + " meter lang, en " + diepte + " meter diep.";
        return s;
    }



}
