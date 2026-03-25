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
            int[] arr = new int[n];
            for(int j = 0 ; j<n ; j++){
                arr[j] = nextInt();
            }
            HashSet<Integer> hSet = new HashSet<>();
            for(int j=0; j<n; j++){
                int currOr = 0;
                for(int k=j; k<n; k++){
                    currOr |= arr[k];
                    hSet.add(currOr);
                }
            }
            out.println(hSet.size());
            
        }
        // ------------------------------

        out.flush();
    }
    
    public List<List<Integer>> getSubArrays(int[] arr) {
        // code here
        List<List<Integer>> answer = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            List<Integer> subarray = new ArrayList<>();
            for(int j = i; j<arr.length; j++){
                subarray.add(arr[j]);
                answer.add(new ArrayList<>(subarray));
            }
        }
        
        return answer;
    }
}