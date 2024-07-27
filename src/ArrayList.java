public class ArrayList <T> {
    final static int WINDOW_LENGTH = 10;
    private Object[] array = new Object[WINDOW_LENGTH];
    private int size = 0;

    public void add(T element) {
        if(size == array.length) {
            Object[] arrayAux = new Object[array.length+WINDOW_LENGTH];
            for(int i = 0; i < array.length; i++) {
                arrayAux[i] = array[i];
            }
            array = arrayAux;
        }
        array[size] = element;
        size++;
    }

    public T get(int index){
        return (T) this.array[index];
    }

    public int size(){
        return size;
    }

    public boolean contains(T element) {
        for(int i = 0; i < this.size; i++) {
            if(array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public boolean delete(int index) {
        if(index >= size){
            return false;
        }
       Object[] arrayAux = new Object[array.length];
       int indexAux = 0;
       for(int i = 0; i < size - 1; i++) {
           if(i == index) {
               indexAux++;
           }
           arrayAux[i] = array[indexAux];
           indexAux++;
       }
       size--;
       this.array = arrayAux;
       return true;
    }
}
