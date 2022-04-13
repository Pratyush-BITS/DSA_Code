package HelpOthers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MazeRunner {

    private static int MazePath (int sr,int sc,int er, int ec, char[][]maze, String path){

        int count =0;

        if( sr == er && sc == ec ){
            System.out.println(path);
            return 1;
        }

        if (sr + 1 <= er)
            if(maze[sr+1][sc] != 'B')
                count += MazePath(sr + 1, sc, er, ec, maze, path + "D");

        if (sc + 1 <= ec)
            if(maze[sr][sc+1] != 'B')
                count += MazePath(sr, sc + 1, er, ec, maze, path + "R");


        return count;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = bf.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        char[][] maze = new char[n][m];

        for (int i = 0; i < n; i++) {
            String[] blocks = bf.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                maze[i][j] = blocks[j].charAt(0);
            }
        }

        System.out.println(MazePath(0,0,n-1,m-1,maze,""));

    }

}

/**



*/