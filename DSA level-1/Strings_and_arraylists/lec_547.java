// Program to practise StringBuilder class
public class lec_547 {

    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("hello");
        // System.out.println(sb);

        // char ch = sb.charAt(0); //get
        // System.out.println(ch);

        // sb.setCharAt(0, 'd'); //update
        // System.out.println(sb);

        // sb.insert(2, 'y'); //insert
        // System.out.println(sb);

        // sb.delete(2,3); // remove
        // System.out.println(sb);

        // sb.deleteCharAt(0); //delete
        // System.out.println(sb);

        // sb.append('o'); //append
        // System.out.println(sb);

        int n = 10000;
        long start = System.currentTimeMillis();
        // String s = "";
        // for (int i = 0; i < n; i++) {
        //     s += i;
        // }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i);
        }

        long end = System.currentTimeMillis();
        long duration = end - start;
        System.out.println(duration);
    }
}