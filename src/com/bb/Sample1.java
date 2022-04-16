package com.bb;

/*
0 0 1 0
0 1 0 1
0 1 1 1
1 0 0 0

Groups of 1's  - 3
TO DO : Find the no of groups
 */
public class Sample1
{
    static int totalNoOfGroups = 0;

    public static void main(String[] args) {
        int[][] visited = new int[4][4];
        int[][] input = {{1, 0, 1, 0}, {0, 1, 0, 1}, {0, 1, 1, 1}, {1, 0, 0, 0}};
        for(int i=0; i < input.length; i++) {
            for(int j=0; j < input[i].length; j++) {
                if(visited[i][j]==1) {
                    j++; continue;
                }
                getGroup(input,true, 0 ,0);
            }
        }

        System.out.println("totalNoOfGroups" + totalNoOfGroups);
    }

    private static void getGroup(int[][] input, boolean incFlag, int i, int j) {

        if(i>= input.length || j>=input[i].length) {
            return;
        }
        if(1 == input[i][j]) {
            if(incFlag == true) {
                totalNoOfGroups++;
            }
            getGroup(input,false, i+1, j);
            getGroup(input,false, i, j+1);
        } else {
            if(false == incFlag) {
                return;
            } else {
                getGroup(input, true, i+1, j);
                getGroup(input, true, i, j+1);
            }
        }

    }
}
