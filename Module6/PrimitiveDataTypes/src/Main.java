public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        container.addCount(3);
        System.out.println(container.getCount());

        for (char c = 'А'; c <= 'Я'; c++) {
            System.out.println((int) c + "-" + c);
        }
        for (char c = 'а'; c <= 'я'; c++) {
            System.out.println((int) c + "-" + c);
        }
        for (char c = 'Ё'; c <= 'ё'; c++) {
            System.out.println((int) c + "-" + c);
        }
    }
}
        //  С помощью цикла и преобразования чисел в символы найдены все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        //  Использовалось 3 цикла, т.к. заранее неизвестно, каков порядок знаков:
        //  Согласно заданию, известны 3 диапазона: диапазон заглавных, строчных букв и букв Ё и ё.
        //  После первого запуска можно сократить код до одного for - но это скорее исключение,
        //  т.к. непонятна логика такого цикла: почему мы должны перечислять коды от "А" до "ё".
