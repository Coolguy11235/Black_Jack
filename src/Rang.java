// Rangordning av korten
public enum Rang {
    ESS(1, "Ess"), TVÅ(2, "2"),
    TRE(3, "3"), FYRA(4, "4"),
    FEM(5, "5"), SEX(6, "6"),
    SJU(7, "7"), ÅTTA(8, "8"),
    NIO(9, "9"), TIO(10, "10"),
    KNEKT(10, "Knekt"), DAM(10, "Dam"), KUNG(10, "Kung");

    // Privat fält
    private final int rangVärde;
    private final String rangString;

    // Konstruktorn
    private Rang(int rangVärde, String rangString) {
        this.rangVärde = rangVärde;
        this.rangString = rangString;
    }

    // Public metoder som matar ut texter
    public int getRang() {
        return rangVärde;
    }
    public String printRang() {
        return rangString;
    }
}

