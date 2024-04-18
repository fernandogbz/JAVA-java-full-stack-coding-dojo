public class BasicJava {
    //1
    public void print1To255(){
        for (int i = 1; i <= 255; i++) {
            System.out.println(i);
        }
    }

    //2
    public void printOdd255(){
        for (int i = 1; i <= 255; i++) {
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    //3
    public void printSum255(){
        int sum = 0;
        for (int i = 0; i <= 255; i++) {
            sum += i;
            System.out.println("Nuevo numero: " + i + " Suma: " + sum);
        }
    }

    //4
    public void forEach(int[] array){
        for (int i : array) {
            System.out.println(i);
        }
    }

    //5
    public void getMax(int[] array){
        int max = array[0];
        for(int i : array){
            if(i > max){
                max = i;
            }
        }
        System.out.println(max);
    }

    //6
    public void getAvg(int[] array){
        float sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum / array.length);
    }

    //7
    public int[] getOdd255(){
        int[] array = new int[128];
        for (int i = 0; i < 128; i++) {
            array[i] = i*2 + 1;
        }
        return array;
    }

    public int countGreater(int[] array, int value){
        int count = 0;
        for (int i : array) {
            if(i > value){
                count++;
            }
        }
        return count;
    }

    public void squareArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] *= array[i];
        }
    }

    public void negToZero(int[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i] < 0){
                array[i] = 0;
            }
        }
    }

    public void maxMinAvg(int[] array){
        int[] result = new int[3];
        result[0] = array[0];
        result[1] = array[0];
        result[2] = 0;
        for (int i : array) {   
            if (i > result[0]) {
                result[0] = i;
            }
            if(i < result[1]){
                result[1] = i;
            }
            result[3] /= array.length;
        }
    }

    public void swiftLeft(int[] array){
        for(int i = 0; i < array.length - 1; i++){
            array[i] = array[i+1];
        }
        array[array.length - 1] = 0;
    }
}

