public class Circle extends FigureAbstract {
    private Circle(CircleBuilder builder) {
        super(builder);
        this.name = Circle.class.getCanonicalName();
    }

    public static class CircleBuilder extends Builder {
        public CircleBuilder(String color, int thickness, int angle) {
            super(color, thickness, angle);
        }

        @Override
        public Circle build() {
            return new Circle(this);
        }
    }
}
