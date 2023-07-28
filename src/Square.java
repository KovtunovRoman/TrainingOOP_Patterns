public class Square extends FigureAbstract {
    private Square(SquareBuilder builder) {
        super(builder);
        this.name = Square.class.getCanonicalName();
    }

    public static class SquareBuilder extends Builder {
        public SquareBuilder(String color, int thickness, int angle) {
            super(color, thickness, angle);
        }

        @Override
        public Square build() {
            return new Square(this);
        }
    }
}
