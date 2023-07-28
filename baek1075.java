import java.io.*;

public class baek1075{
    public static void main(String[] args) throws IOException{
        int n, f;
        String result;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(br.readLine());
        f = Integer.parseInt(br.readLine());
        br.close();
/*
        n = (n / 100) * 100;
        while (true){
            if(n++%f==0){
                break;
            }
        }
        a=(n-1)%100;

        result = a<10 ? "0"+String.valueOf(a) : String.valueOf(a);
*/

        n -= (n%100);
        
        result = n%f==0 ? "00" : (((n/f+1)*f)%100 < 10) ? "0"+Integer.toString(((n/f+1)*f)%100) : Integer.toString(((n/f+1)*f)%100);

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        



    }
}
