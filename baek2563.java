import java.io.*;

public class baek2563 {
    public static void main(String[] args) throws IOException{
        int count = 0;
        String[] n = new String[100];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());

        for(int i = 0; i<x; i++){
            String[] token = br.readLine().split(" ");
            int a = Integer.parseInt(token[0]);
            int b = Integer.parseInt(token[1]);
            for(int k = a; k<a+10; k++){
                for(int l = b; l<b+10; b++){
                    n[k].toCharArray()[l] = 'o';
                }
            }
        }
        br.close();

        for(int i = 0; i<100; i++){
            for(int j = 0; j<100; j++){
                if(n[i].toCharArray()[j] == 'o'){
                    count++;
                }
            }
        }
        bw.write(count);
        bw.flush();
        bw.close();

    }
}
