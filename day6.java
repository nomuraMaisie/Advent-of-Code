import java.io.*;
import java.util.*;

public class day6 {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(new File("day6.txt"));
        String[][] northp = new String[130][130];

        int x = 0;
        int y = 0;
        for(int r=0; r<130; r++)
        {
            for(int c=0; c<130; c++)
            {
                northp[r][c] = scan.next();
                if(northp[r][c].equals("^"))
                {
                    x= r;
                    y= c;
                }
            }
            scan.nextLine();
        }
        scan.close();

        int ans = 0;


        while(x+1 > 130 || x-1 < 0 || y+1 > 130 || y-1 < 0)
        {
            String elf = northp[x][y];            
            northp[x][y]
            if(elf.equals("^"))
            {
                x--;
            }

            if(elf.equals("v"))
            {
                x++;
            }

            if(elf.equals("<"))
            {
                y--;
            }

            if(elf.equals(">"))
            {
                y++;
            }

            
        }
        


    }

    public void moveRight(int r, int c)
    {
        northp[r][c] = "X";
        northp[r][c+1] = ">";
    }

    public void moveLeft(int r, int c)
    {
        northp[r][c] = "X";
        northp[r][c-1] = "<";
    }

    public void moveUp(int r, int c)
    {
        northp[r][c] = "X";
        northp[r+1][c] = "^";
    }

    public void moveDown(int r, int c)
    {
        northp[r][c] = "X";
        northp[r-1][c] = "v";
    }


}