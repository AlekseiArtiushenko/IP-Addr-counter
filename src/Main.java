public class Main {
    public static void main(String[] args) {
//
//        long startTime = System.currentTimeMillis();
        GetElement getElement = new GetElement();
        System.out.println("Кол-во уникальных адресов: " + getElement.getUniqueDataCount());
//        long endTime = System.currentTimeMillis();
//        long timeElapsed = endTime - startTime;
//        System.out.println("Время выполнения программы: " + timeElapsed);
//        long usedBytes = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
//        System.out.println(usedBytes);
    }
}