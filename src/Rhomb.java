public class Rhomb extends FigureAbstract {
    private Rhomb(RhombBuilder builder) {
        super(builder);
        this.name = Rhomb.class.getCanonicalName();
    }

    public static class RhombBuilder extends Builder {
        public RhombBuilder(String color, int thickness, int angle) {
            super(color, thickness, angle);
        }

        @Override
        public Rhomb build() {
            return new Rhomb(this);
        }
    }
}
