package tasks.lesson3;

import java.util.ArrayList;
import java.util.Collection;

public class RemoveDuplicatesList extends ArrayList<Integer> {
    public RemoveDuplicatesList(Collection<? extends Integer> c) {
        // этот метод не меняй, добавил это чтобы было проще тесты писать
        // это проброшеный конструктор родителя, обсудим это позже
        super(c);
    }

    public void removeDuplicates() {
        /* как можешь заметить этот класс наследует ArrayList<Integer>
        нужно реализовать в этом классе метод который удалает из листа повторяющиеся элементы
        нампример ты можешь идть по списку из начала в конец и удалять элементы, если они уже встречались
        помни что в этом случае длинна списка будет меняться, тоесть ты не можешь эффективно использовать цикл for
        методы которые ты можешь использовать это this.get , this.remove, this.size
        (this. можно не писать, но возможно на первый раз тебе так будет понятнеее)
        */
    }
}
