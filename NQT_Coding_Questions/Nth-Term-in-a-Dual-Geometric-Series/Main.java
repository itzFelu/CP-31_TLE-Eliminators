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
        int n = 0, a =1, r=0, answer=0;

        for(int i=0; i<t; i++){
            n = nextInt();
            if(n%2 != 0){
                n = (n+1)/2;
                r = 2;
            }
            else{
                n = n/2;
                r = 3;
            }
            answer = a * (int)Math.pow(r, n-1);

            out.println(answer);
            
            
        }
        // ------------------------------

        out.flush();
    }
}