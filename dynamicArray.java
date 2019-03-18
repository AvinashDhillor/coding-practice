/**
 * dynamicArray
 */
public class dynamicArray {

    private int size;
    private int[] array;
    private int pointer;

    dynamicArray() {
        size = 16;
        array = new int[size];
        pointer = 0;
    }

    dynamicArray(int size) {
        this.size = size;
        array = new int[size];
        pointer = 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return array.length;
    }

    public boolean is_empty() {
        return size == 0;
    }

    public int at(int i) {
        return array[i];
    }

    private void increaseSize() {
        if (pointer + 1 == size) {
            int[] tmp = new int[size * 2];
            for (int i = 0; i < array.length; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }
    }

    public int push(int item) {
        increaseSize();
        return array[pointer++] = item;
    }

    public int pop() {
        return array[pointer--];
    }

    public void insert(int index, int item) {
        increaseSize();
        for (int i = index; i <= pointer + 1; i++) {
            array[i + 1] = array[i];
        }
        array[index] = item;
        pointer += 1;
    }

    public int delete(int index) {
        int tmp = array[index];
        for (int i = index; i < pointer - 1; i++) {
            array[i] = array[i + 1];
        }
        return tmp;
    }

    public void remove(int item) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == item) {
                int val = delete(i);
            }
        }
    }

    public int find(int item) {
        for (int i = 0; i <= array.length; i++) {
            if (array[i] == item) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

    }
}