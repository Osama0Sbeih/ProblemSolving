import java.io.*;
// https://codeforces.com/group/zu3FIvIAXh/contest/233723/problem/D

public class Candybags {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(new OutputStreamWriter(System.out));

        String line = reader.readLine();
        String split[] = line.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        if (((Math.max(x , y) - Math.min(x , y) )% 2 == 0) || (x == y))
            writer.println("Yes");
        else
            writer.println("No");
        writer.flush();
    }
}
