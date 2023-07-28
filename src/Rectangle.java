public class Rectangle extends FigureAbstract {
    private Rectangle(RectangleBuilder builder) {
        super(builder);
        this.name = Rectangle.class.getCanonicalName();
    }

    public static class RectangleBuilder extends Builder {
        public RectangleBuilder(String color, int thickness, int angle) {
            super(color, thickness, angle);
        }

        @Override
        public Rectangle build() {
            return new Rectangle(this);
        }
    }
}
