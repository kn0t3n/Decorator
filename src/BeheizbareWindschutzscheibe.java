public class BeheizbareWindschutzscheibe extends Sonderausstattung {

    public BeheizbareWindschutzscheibe(Auto auto) {
        super(auto);
    }

    @Override
    public double getPreis() {
        return auto.getPreis() + 2000.00;
    }

    @Override
    public void druckeInfo() {
        auto.druckeInfo();
        System.out.print(", Beheizbare Windschutzscheibe");
    }
}
