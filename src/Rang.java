// Rangordning av korten
public enum Rang {
    ESS(1), TVÅ(2), TRE(3),
    FYRA(4), FEM(5), SEX(6),
    SJU(7), ÅTTA(8), NIO(9),
    TIO(10), KNEKT(10), DAM(10), KUNG(10);

    // Privat fält
    private final int rangVärde;

    // Konstruktorn
    private Rang(int rangVärde) {
        this.rangVärde = rangVärde;
    }

    // Public metoder som matar ut texter
    public int getRang() {
        return rangVärde;
    }
}
