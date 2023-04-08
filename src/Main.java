public class Main {
    public static void main(String[] args) {
        MagicBox<String> box1 = new MagicBox<>(3);
        MagicBox<Integer> box2 = new MagicBox<>(3);
        System.out.println("Проверим работу класса MagicBox на примере экземпляра с типом String");
        System.out.println("1) " + Boolean.TRUE.equals(box1.add("Kolya")));
        System.out.println("2) " + Boolean.TRUE.equals(box1.add("Petya")));
        System.out.println("3) " + Boolean.TRUE.equals(box1.add("Georg")));
        System.out.println("4) " + Boolean.FALSE.equals(box1.add("Martin")));
        System.out.println("Проверим работу класса MagicBox на примере экземпляра с типом Integer");
        System.out.println("1) " + Boolean.TRUE.equals(box2.add(1)));
        System.out.println("2) " + Boolean.TRUE.equals(box2.add(2)));
        System.out.println("3) " + Boolean.TRUE.equals(box2.add(3)));
        System.out.println("4) " + Boolean.FALSE.equals(box2.add(4)));
        System.out.println("Проверим работу метода pick() класса MagicBox на примере экземпляра с типом String");
        MagicBox<String> box3 = new MagicBox<>(4);
        System.out.println("1) " + Boolean.TRUE.equals(box3.add("Kolya")));
        try {
            String name = box3.pick();
        }
        catch (RuntimeException e){
            System.out.println(e);
        }
        System.out.println("2) " + Boolean.TRUE.equals(box3.add("Petya")));
        System.out.println("3) " + Boolean.TRUE.equals(box3.add("Sasha")));
        System.out.println("4) " + Boolean.TRUE.equals(box3.add("Robin")));
        System.out.println(box3.pick());
        System.out.println(box3.pick());
        System.out.println(box3.pick());
    }
}