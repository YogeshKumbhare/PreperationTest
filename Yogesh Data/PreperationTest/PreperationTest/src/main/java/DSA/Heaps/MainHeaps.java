package DSA.Heaps;

public class MainHeaps {
    public static void main(String[] args) throws Exception {
        Heaps<Integer> heap = new Heaps<>();

        heap.insert(34);
        heap.insert(45);
        heap.insert(22);
        heap.insert(89);
        heap.insert(76);

        String str = "adjd";

        byte[] bytes = str.getBytes();
        StringBuilder binary = new StringBuilder();

        for (byte b : bytes) {
            int val = b;
            for (int i = 0; i < 8; i++) {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
        }
        System.out.println(binary.toString());
         //heap.remove();
        System.out.println(heap.remove());

    }
}
