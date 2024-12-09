import java.io.*;
import java.util.*;

public class day9 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("day9test.txt"));
        in.useDelimiter("");
        int spot = 0;
        int id = 0;
        int count = 0;
        ArrayList<String> meep = new ArrayList<>();
        while(in.hasNextInt())
        {
            int nummy = in.nextInt();
            
            if(spot%2 == 0)
            {
                for(int x=0; x < nummy; x++)
                {
                    meep.add("" + id);
                }
                id++;
            }

            else{
                for(int y=0; y< nummy; y++)
                {
                    meep.add(".");
                    count ++;
                }
            }
            spot++;
        }

        in.close();

        for(int x=0; x<count; x++)
        {
            if(meep.get(x).equals("."))
            {
                meep.set(x, meep.get(meep.size()-x));
                meep.set(meep.size()-x, ".");
            }
        }

        for(String a: meep)
        {
            System.out.print(a);
        }
    }

}