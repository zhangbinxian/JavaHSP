public class demo09_MiGong {
    public static void main(String[] args) {
        //迷宫使用二维数组表示
        //0表示通路,1表示障碍物
        int[][] map = {
                {1, 1, 1, 1, 1, 1, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 0, 0, 0, 0, 0, 1},
                {1, 1, 1, 1, 1, 1, 1}};

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        //测试
        demo09_T miGong = new demo09_T();
        boolean jg = miGong.findWay(map, 1, 1);

        System.out.println(jg);
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class demo09_T {
    //初始化位置1，1
    //到达6,5,既是找到了出口,出来了
    //map:表示迷宫. i,j:表示当前位置
    //0表示通路,1表示障碍物,2表示可以走,3表示走过,但不通

    //当map[6][5]=2 表示找到通路了,否则继续找
    //找路策略 下->右->上->左
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //可以走,假设为2，可以走通
                map[i][j] = 2;
                //使用策略，判断是否真的通
                if (findWay(map, i + 1, j)) {//下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    //假定不正确,所有方向都试过一次,不通,所以map[i][j]=3;return false;
                    map[i][j] = 3;
                    return false;
                }
            } else {
                //map[i][j]==1,2,3 1障碍物,2可以走(已经测试过了),3走过,死路
                return false;
            }
        }
    }
}