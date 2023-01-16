public class Main {
    public static void main(String[] args) {
        EvidenceZakazniku evidence = new EvidenceZakazniku();
        evidence.pridatZakaznika(new Zakaznik("Karel Dvorak", 45));
        evidence.pridatZakaznika(new Zakaznik("Jan Novak", 30));
        evidence.odebratZakaznika(evidence.seznamZakazniku.get(evidence.seznamZakazniku.size() - 1));

    }
}