import java.io.*;
import java.util.*;

public class Main {

    static BufferedReader br;
    static StringTokenizer st;
    static PrintWriter out;

    static String next() throws Exception {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return st.nextToken();
    }

    static int nextInt() throws Exception {
        return Integer.parseInt(next());
    }

    static long nextLong() throws Exception {
        return Long.parseLong(next());
    }

    public static void main(String[] args) throws Exception {

        // Local testing: use input.txt / output.txt
        if (System.getProperty("ONLINE_JUDGE") == null) {
            br = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter("output.txt");
        } else {
            br = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }

        // ------------------------------
        // Start coding here
        int t = nextInt();
        for(int i=0; i<t; i++){
            int n = nextInt();
            int k = nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            int temp = nextInt();
            boolean is_sorted = true;
            arr.add(temp);
            for(int j=1; j<n; j++){
                int val = nextInt();
                arr.add(val);
                if( is_sorted && temp>val) is_sorted = false;
                temp = val;
            }
            if(n == 1 || is_sorted){
                out.println("YES");
                continue;
            }
            if(k > 1){
                out.println("YES");
            }else{
                out.println("NO");
            }
        }
        // ------------------------------

        out.flush();
    }
}