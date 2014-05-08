package pkg1310653069_u3;

class Liste<T extends BenennbarAbs>{

    private int size;
    Object[] array;
    private int pointer = 0;

    public Liste(int size) {
        this.size = size;
        array = new Object[size];
    }

    void save(T element) {
        if(pointer >= size) {
            System.err.println("Stack voll");
        }
        else {
            array[pointer++] = element;
        }
    }

}

