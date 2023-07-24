package demo01.bx_cha.house.Service;

import demo01.bx_cha.house.domain.House;

public class HouseService {
    private House[] houses;

    // 记录当前有多少个房屋信息
    private int houseNums = 1;
    // 记录当前id自增的值
    private int idCounter = 1;

    public HouseService(int size) {
        houses = new House[size];

        houses[0] = new House(1, "zbx", "911", "武汉", 1000, "未出租");


    }
    // list方法，返回houses

    public House[] list() {

        return houses;
    }

    public boolean add(House newhouse) {

        if (houseNums == houses.length) {
            System.out.println("数组已满,无法添加");
            return false;
        }
        // newhouse添加到数组
        houses[houseNums++] = newhouse;
        // 需要id自增，然后添加到newhouse的id
        // idCounter++;
        newhouse.setId(++idCounter);

        return true;
    }

    public boolean del(int deiId) {
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (deiId == houses[i].getId()) {
                index = i;
            }
        }
        if (index == -1) {
            return false;
        } else {
            for (int i = 0; i < houseNums - 1; i++) {
                houses[i] = houses[i + 1];
            }
            houses[--houseNums] = null;
            // houseNums--;

            return true;
        }
    }
    public House findById(int findId){

        for (int i = 0; i < houseNums; i++) {
            if (findId == houses[i].getId()) {
               return houses[i];
            }
        }
        return null;
    }
}
