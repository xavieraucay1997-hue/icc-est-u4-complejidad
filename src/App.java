public class App {
    public static void main(String[] args) throws Exception {
        int[] array = new int[]{1,2,3,4,5,6,}; 
        System.out.println(array[0]);
        System.out.println(array);
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
