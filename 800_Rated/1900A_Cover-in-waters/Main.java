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
            String s = next();

            int empty_cell_count = 0;
            boolean have_3_consecutive_empty_cells = false;
            int temp_count = 0;
            
            for(int j=0; j<n; j++){
                if (s.charAt(j) == '.'){
                    empty_cell_count++;
                    temp_count++;
                }else{
                    temp_count = 0;
                }

                if(temp_count == 3){
                    have_3_consecutive_empty_cells = true;
                    break;
                }
            }
            if (have_3_consecutive_empty_cells){
                out.println(2);
            }
            else{
                out.println(empty_cell_count);
            }
            
        }
        // ------------------------------

        out.flush();
    }
}