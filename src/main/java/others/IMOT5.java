package others;

import java.util.Arrays;
import java.util.Random;

public class IMOT5 {

    public static void main(String[] args) {

        //2024×2023的方阵

        // 1 坏人 0 不是

        //坏人数量 2022
        //int mount = BadMan(grid);

        //System.out.println(mount);


        int Count = 1;
        while (true) {
            int[][] grid = Grid();
            Random footStart = new Random();
            int j = footStart.nextInt(2023);
            //足迹
            //如果第一行为1
            if (grid[0][j] == 1) {
                Count++;
                continue;
            }
            grid[0][j] = 2;
            for (int i = 1; i < 2024; i++) {
                for (int k = 0; k < 2023; k++) {

                }
            }

        }



    }

    // 2024*2023
    public static int[][] Grid() {
        int[][] grid = new int[2024][2023];

        //System.out.println(Arrays.toString(grid));

        Random r = new Random();
        int count = 0;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < 2024; i++) {
            for (int j = 0; j < 2023; j++) {
                //定义格子
                //恰有2022个坏人
                //第一行和最后一行恰有一个坏人
                if (i == 0) {
                    if (count1 < 1) {
                        grid[i][j] = r.nextInt(2);
                        if (grid[i][j] == 1) {
                            count1++;
                        }
                    }
                }
                if (i == 2023) {
                    if (count2 < 1) {
                        grid[i][j] = r.nextInt(2);
                        if (grid[i][j] == 1) {
                            count2++;
                        }
                    }
                }
                if (count < 2020 && i != 0 && i != 2023) {
                    // 0 1
                    grid[i][j] = r.nextInt(2);
                    if (grid[i][j] == 1) {
                        count++;
                    }
                }
            }
        }
        return grid;
    }

    public static int BadMan(int[][] grid) {
        int mount = 0;
        for (int i = 0; i < 2024; i++) {
            for (int j = 0; j < 2023; j++) {
                if (grid[i][j] == 1){
                    mount++;
                }
            }
        }
        return mount;
    }
}
