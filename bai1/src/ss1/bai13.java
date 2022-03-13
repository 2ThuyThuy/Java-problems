package ss1;



public class bai13 {
    // Tạo một mảng n chiều

    private Object[] array; // internal representation of the N-dimensional array
    private int[] dimensions; // dimensions of the array
    private int[] multipliers; // used to calculate the index in the internal array

    bai13(int... dimensions) {
        int arraySize = 1;

        multipliers = new int[dimensions.length];
        for (int idx = dimensions.length - 1; idx >= 0; idx--) {
            multipliers[idx] = arraySize;
            arraySize *= dimensions[idx];
        }
        array = new Object[arraySize];
        this.dimensions = dimensions;
    }
    public Object get(int... indices) {
        assert indices.length == dimensions.length;
        int internalIndex = 0;

        for (int idx = 0; idx < indices.length; idx++) {
            internalIndex += indices[idx] * multipliers[idx];
        }
        return array[internalIndex];
    }


}
