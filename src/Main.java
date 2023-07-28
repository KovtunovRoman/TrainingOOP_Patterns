public class Main {
    public static void main(String[] args) {
        FigureShop figureShop = new FigureShop(new FigureFactory());
        int argumentsNumber = Integer.parseInt(args[0]);
        FigureType[] figureTypes = FigureType.values();

        for (int i = 0; i < argumentsNumber; i++) {
            // рандомным числом задано значение от [0,5], чтобы вытянуть рандомную фигуру из перечисления
            int randomNumber = (int) (Math.random() * figureTypes.length);
            // создание рандомной фигуры и отображение ее параметров в консоли
            figureShop.makeFigure(figureTypes[randomNumber]).display();
        }
    }
}