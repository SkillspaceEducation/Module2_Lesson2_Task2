/*
Напишите два цикла выполняющих миллион сложений строк вида “aaabbbccc”, один с помощью оператора сложения и String,
а другой с помощью StringBuilder и метода append. Сравните скорость их выполнения. Выведите сравнение на экран.
 */
public class Main {
    public static void main(String[] args) {
        String str1 = "";
        StringBuilder strBuiler = new StringBuilder(str1);
        final long startTime1 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            strBuiler.append("aaabbbccc");
        }
        final long elapsedTimeMillis1 = System.currentTimeMillis() - startTime1;
        System.out.println("Время выполнения программы при использовании класса StringBuilder равно \n" +
                elapsedTimeMillis1 + " мс");
        final long startTime2 = System.currentTimeMillis();
        String str2 = "";
        for (int i = 0; i < 100000; i++) {
            str2 += "aaabbbccc";
        }
        final long elapsedTimeMillis2 = System.currentTimeMillis() - startTime2;
        System.out.println("Время выполнения программы при использовании операции сложения строк \n" +
                elapsedTimeMillis2 / 1000 + " с");
        int count = 1000000;
        String str3 = "aaabbbccc";
        final long startTime3 = System.currentTimeMillis();
        str3.repeat(count);
        final long elapsedTimeMillis3 = System.currentTimeMillis() - startTime3;
        System.out.println("Время выполнения программы при использовании метода repeat() равно \n" +
                elapsedTimeMillis3 + " мс");

    }
}