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
        for(int p=0; p<t; p++){
            char [][]target = new char [10][10];
            int total_point = 0;
            for(int i=0; i<10; i++){
                target[i] = next().toCharArray();
            }
            // Solution Logic goes here;
            for (int i = 0; i < 10; i++) {
                for(int j=0; j<10; j++){
                    if(target[i][j] == 'X' ){
                        if(i == 0 || i == 9 || j == 0 || j == 9) 
                            total_point += 1;
                        else if((i == 1 || i == 8 && j >= 1 && j <= 8)
                                ||
                                (i >= 1 && i <= 8 && j == 1 || j == 8)
                        ){
                            total_point += 2;
                        }
                        else if((i == 2 || i == 7 && j >= 2 && j <= 7)
                                ||
                                (i >= 2 && i <= 7 && j == 2 || j == 7)
                        ){
                            total_point += 3;
                        }
                        else if((i == 3 || i == 6 && j >= 3 && j <= 6)
                                ||
                                (i >= 3 && i <= 6 && j == 3 || j == 6)
                        ){
                            total_point += 4;
                        }
                        else if((i == 4 || i == 5 && j >= 4 && j <= 5)
                                ||
                                (i >= 4 && i <= 5 && j == 4 || j == 5)
                        ){
                            total_point += 5;
                        }
                    }
                }
                
            }
            out.println(total_point);
             
        }
        // ------------------------------

        out.flush();
    }
}