import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine());
        int[] S = new int[L];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < L; i++) {
            S[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(S); 


        int n = Integer.parseInt(br.readLine());


        int start = 0; 
        int end = 1001; 

        for (int s : S) {
            if (s < n) {
                start = s; 
            } else if (s > n) {
                end = s; 
                break;
            } else {
                // s == n
                System.out.println(0);
                return;
            }
        }

        int count = 0;
        

        for (int i = start + 1; i <= n; i++) {
            for (int j = n; j < end; j++) {
                if (i == j) continue; // A < B 조건 만족
                count++;
            }
        }

        System.out.println(count);
    }
}