import java.util.LinkedList;
import java.util.List;

interface SimpleOperationForList {
    public void add(String s);

    public void undo();

    public void redo();

    public void print();
}

public class LinkedListOptions implements SimpleOperationForList {
    private List<String> bufferAddMassive = new LinkedList<>();
    private List<String> strings;

    public LinkedListOptions() {
        strings = new LinkedList<>();
    }

    @Override
    public void add(String newListElement) {
        if (!newListElement.equals(null) || !(newListElement.length() == 0)) {
            strings.add(newListElement);
        }
    }

    @Override
    public void undo() {
        if (strings.size() != 0) {
            if (bufferAddMassive.size() == 5) {
                bufferAddMassive.removeFirst();
                bufferAddMassive.add(strings.getLast());
            } else {
                bufferAddMassive.add(strings.getLast());
            }
            strings.removeLast();
        }
    }

    @Override
    public void redo() {
        if (bufferAddMassive.size() != 0) {
            strings.add(bufferAddMassive.getLast());
            bufferAddMassive.removeLast();
        }
    }

    @Override
    public void print() {
        if (strings.size() != 0) {
            System.out.println("Текущий список: " + strings);
        } else {
            System.out.println("Текущий список пуст");
        }
    }
}
