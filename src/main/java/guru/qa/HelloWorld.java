package guru.qa;

public class HelloWorld {

    public static void main(String[] args) {

        // Переполнения при вычислениях
        int exampleOverflowInteger = Integer.MIN_VALUE - 1;
        System.out.println("[" + Integer.MIN_VALUE + ";" + Integer.MAX_VALUE + "]");
        System.out.println("exampleOverflowInteger = " + exampleOverflowInteger);

        byte exampleOverFlowByte = Byte.MAX_VALUE;
        exampleOverFlowByte += 2;
        System.out.println("[" + Byte.MIN_VALUE + ";" + Byte.MAX_VALUE + "]");
        System.out.println("exampleOverFlowByte = " + exampleOverFlowByte);

        // Вычисления комбинаций типов данных (int и double)
        int intValue = 10;
        double doubleValue = 10;
        System.out.println("Combs integer and double:");
        System.out.println(intValue+doubleValue);
        System.out.println(intValue-doubleValue);
        System.out.println(intValue*doubleValue);
        System.out.println(intValue/doubleValue);
        System.out.println(intValue%doubleValue);

        // Работа с инкрементами
        int incr = 10;
        int incr2 = 10;
        int incr3 = 10;
        int incr4 = 10;
        System.out.println(incr++);
        System.out.println(++incr2);
        System.out.println(incr3--);
        System.out.println(--incr4);
        if (incr >= incr2 && incr4 <= incr3){
            System.out.println("Все верно!");
        }
    }

}
