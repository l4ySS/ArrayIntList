public class ArrayList {
    private static final int DEFAULT = 2;
    private int SIZE;
    private int current;
    private int[] array;

    public ArrayList(){
        SIZE = DEFAULT;
        current = 0;
        array = new int[DEFAULT];
    }

    private void resize(){
        SIZE *= 2;
        int[] NewArray = new int[SIZE];
        System.arraycopy(array, 0, NewArray, 0, SIZE / 2);
        array = NewArray;
    }

    private boolean check(int index){
        return (index < 0) || (index >= current);
    }

    public void add(int val){
        if(current == SIZE) resize();
        array[current] = val;
        current++;
    }

    public int get(int index){
        if(check(index)){
            return 0;
        }
        return array[index];
    }

    public boolean remove(int index){
        if(check(index)){
            return false;
        }
        if (current - 1 - index >= 0) System.arraycopy(array, index + 1, array, index, current - 1 - index);
        SIZE--;
        current--;
        return true;
    }

    public void print() {
        for(int i = 0; i < current; i++)
            System.out.print(array[i] + "\t");
    }

}
