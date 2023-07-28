public class Triangle extends FigureAbstract {
    private Triangle(TriangleBuilder builder) {
        super(builder);
        this.name = Triangle.class.getCanonicalName();
    }

    public static class TriangleBuilder extends Builder {
        public TriangleBuilder(String color, int thickness, int angle) {
            super(color, thickness, angle);
        }

        @Override
        public Triangle build() {
            return new Triangle(this);
        }
    }
}
