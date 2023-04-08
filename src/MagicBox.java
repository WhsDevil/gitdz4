import java.util.Random;

public class MagicBox<T> {
    T[] items;

    public MagicBox(int size){
        this.items = (T[]) new Object[size];
    }

    public boolean add(T item){
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public T pick() throws RuntimeException{
        for (int i = 0; i < items.length; i++) {
            if (items[i] == null){
                throw new RuntimeException("Коробка заполнена не полностью, осталось еще " + (items.length - i) + " позиции");
            }
        }
        Random random = new Random();
        return items[random.nextInt(items.length)];
    }
}
