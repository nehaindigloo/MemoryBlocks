package com.glo;
import java.io.*;
import java.util.*;

public class TestClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);

        // Read input
        int N = Integer.parseInt(br.readLine().trim());
        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());

     
        int out_ = Memory(N, A, B, C);

        
        System.out.println(out_);

        wr.close();
        br.close();
    }

    static int Memory(int N, int A, int B, int C) {
     
        int result = 0;

        while (N > 0) {
            if (N >= A) {
                N -= A;
            } else if (N >= B) {
                N -= B;
            } else {
                N -= C;
            }
            result++;
        }

        return result;
    }
}
