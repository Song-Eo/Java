import java.io.*;

public class baek1100 {
    public static void main(String[] args) throws IOException{
        int count=0;
        boolean white = true;
        String[] chess = new String[8];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for(int i =0; i<chess.length; i++){
            chess[i] = br.readLine();
            for(int j=0; j<chess[i].length(); j++){
                if(chess[i].charAt(j) == 'F' && white){
                    count++;
                }   
                white = !white;
            }
            white = !white;
        }
        br.close();
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
