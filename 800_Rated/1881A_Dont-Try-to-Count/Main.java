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


    public static boolean checkSubstring(String x, int n, String s, int m){
        if(m == n){
            if (x.equals(s)) return true;
            else return false;
        }

        if(m>n) return false;

        for(int i=0; i<n && n-i >= m; i++){
            // System.out.println(x.substring(i, i+m));
            if(x.substring(i, i+m).equals(s)){
                return true;
            }
        }
        
        return false;
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
        // out.println("hello");
        for(int i=0; i<t; i++){
            int n = nextInt();
            int m = nextInt();
            String x = next();
            String s = next();
            
            String x1 = x+x;
            String x2 = x1+x1;
            String x3 = x2+x2;
            String x4 = x3+x3;
            String x5 = x4+x4;
           
            if (checkSubstring(x,n, s,m)) {
                out.println(0);
            }
            else if (checkSubstring(x1,2*n, s,m)) {
                out.println(1);
            }
            else if (checkSubstring(x2,4*n, s,m)) {
                out.println(2);
            }
            else if (checkSubstring(x3,8*n, s,m)) {
                out.println(3);
            }
            else if (checkSubstring(x4,16*n, s,m)) {
                out.println(4);
            }
            else if (checkSubstring(x5,32*n, s,m)) {
                out.println(5);
            }else{
                out.println(-1);
            }

        }
        // ------------------------------

        out.flush();
    }
}