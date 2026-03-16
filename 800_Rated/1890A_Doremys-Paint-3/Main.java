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
            int []arr_values = {-1, -1, -1};
            int count_value1 = 0;
            int count_value2 = 0;
            for(int j=0;j<n;j++){
                int temp = nextInt();
                if(arr_values[0] == temp || arr_values[0] == -1){
                    arr_values[0]=temp;
                    count_value1++;
                }
                else if(arr_values[1] == temp || arr_values[1] == -1){
                    arr_values[1]=temp;
                    count_value2++;
                }
                else{
                    arr_values[2]=temp;
                }
            }
            if( n == 2) out.println("YES");
            else if(arr_values[0] != -1 && arr_values[1] == -1 && arr_values[2] == -1){
                out.println("YES");
            }
            else if(arr_values[0] != -1 && arr_values[1] != -1 && arr_values[2] == -1){
                if( count_value1 == count_value2 || Math.abs(count_value2-count_value1) == 1){
                    out.println("YES");
                }else{
                    out.println("NO");
                }
            }
            else{
                out.println("NO");
            }
            
        }
        // ------------------------------

        out.flush();
    }
}