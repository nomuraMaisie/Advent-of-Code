import java.io.*;
import java.util.*;

public class day9 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("day9.txt"));
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
        int s=1;
        int y=0;

        
        while(s<=count)
        {
            if(meep.get(y).equals("."))
            {
                while((meep.get(meep.size()-s)).equals(".")){
                    s++;
                }
                meep.set(y, meep.get(meep.size()-s));
                meep.set(meep.size()-s, ".");
                s++;
            }
            y++;
        }
        //size 42 runs 12 count 14

        for(String a: meep){
            System.out.print(a);
        }
        System.out.println();
  
        int total = 0;
        for(int x=0; x<meep.size(); x++)
        {
            if(meep.get(x).equals("."))
                break;
            total += (x * (Integer.parseInt(meep.get(x))));
        }

        System.out.print(total);

    }

}