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
    private List<String> someList;

    public LinkedListOptions() {
        this.someList = new LinkedList<>();
        /*this.someList.add("A");
        this.someList.add("B");
        this.someList.add("C");
        this.someList.add("D");
        this.bufferAddMassive.add("A");
        this.bufferAddMassive.add("B");
        this.bufferAddMassive.add("C");
        this.bufferAddMassive.add("D");*/
    }

    @Override
    public void add(String newListElement) {
        if (!newListElement.equals(null) || !(newListElement.length() == 0)) {
            this.someList.add(newListElement);
        }
    }

    @Override
    public void undo() {
        if (this.someList.size() != 0) {
            if (this.bufferAddMassive.size() == 5) {
                this.bufferAddMassive.removeFirst();
                this.bufferAddMassive.add(this.someList.getLast());
            } else {
                this.bufferAddMassive.add(this.someList.getLast());
            }
            this.someList.removeLast();
        }
    }

    @Override
    public void redo() {
        if (this.bufferAddMassive.size() != 0) {
            this.someList.add(this.bufferAddMassive.getLast());
            this.bufferAddMassive.removeLast();
        }
    }

    @Override
    public void print() {
        if (this.someList.size() != 0) {
            System.out.println("Текущий список: " + this.someList);
        } else {
            System.out.println("Текущий список пуст");
        }
    }
}
