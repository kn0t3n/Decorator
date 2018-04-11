public class main {

    public static void main(String[] args) {


        Auto auto = new BeheizbareWindschutzscheibe(new Navigation(new BMW316()));
        auto.druckeInfo();
        System.out.println(" für " + auto.getPreis());

        Auto auto2 = new BeheizbareWindschutzscheibe(new BMW318());
        auto2.druckeInfo();
        System.out.println(" für " + auto2.getPreis());

        Auto auto3 = new BeheizbareWindschutzscheibe(new Navigation(new Navigation(new BeheizbareWindschutzscheibe(new BeheizbareWindschutzscheibe(new Navigation(new BMW316()))))));
        auto3.druckeInfo();
        System.out.println(" für " + auto3.getPreis());
    }

}
