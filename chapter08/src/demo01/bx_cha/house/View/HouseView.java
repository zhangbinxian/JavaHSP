package demo01.bx_cha.house.View;

import demo01.bx_cha.house.Service.HouseService;
import demo01.bx_cha.house.Utils.Utils;
import demo01.bx_cha.house.domain.House;

public class HouseView {

    private boolean loop = true;
    private char key = ' ';

    private HouseService houseService = new HouseService(10);

    public void mainMenu() {
        do {
            System.out.println("=================房屋出租系统菜单================");
            System.out.println("\t\t\t\t1 新 增 房 源");
            System.out.println("\t\t\t\t2 查 找 房 屋");
            System.out.println("\t\t\t\t3 删 除 房 屋");
            System.out.println("\t\t\t\t4 修改房屋信息");
            System.out.println("\t\t\t\t5 房 屋 列 表");
            System.out.println("\t\t\t\t6 退 出 系 统");

            System.out.println("请输入你的选择(1-6):");
            key = Utils.readChar();


            switch (key) {
                case '1':
                    System.out.println("新增");
                    addHouse();
                    break;
                case '2':
                    System.out.println("查找");
                    findHouse();
                    break;
                case '3':
                    System.out.println("删除");
                    delHouse();
                    break;
                case '4':
                    System.out.println("修改");
                    updateHouse();
                    break;
                case '5':
                    System.out.println("房屋列表");
                    listHouse();
                    break;
                case '6':
                    quit();
                    break;
                default:
                    System.out.println("输入有误");
                    break;

            }
        } while (loop);

    }

    public void listHouse() {
        System.out.println("=================房屋列表================");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态(未出租/已出租)");

        House[] houses = houseService.list();


        for (int i = 0; i < houses.length; i++) {
            if (houses[i] != null) {
                System.out.println(houses[i]);
            }

        }
        System.out.println("=================房屋列表================");
    }

    public void addHouse() {
        System.out.println("=================添加房屋================");
        System.out.println("name");
        String name = Utils.readString(5);

        System.out.println("phone");
        String phone = Utils.readString(11);

        System.out.println("address");
        String address = Utils.readString(16);

        System.out.println("rent");
        int rent = Utils.readInt();

        System.out.println("state");
        String state = Utils.readString(3);

        House house = new House(0, name, phone, address, rent, state);

        if (houseService.add(house)) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }


        System.out.println("=================添加房屋================");
    }

    public void delHouse() {
        System.out.println("=================删除房屋================");
        System.out.println("请输入删除房屋的编号(-1退出)");
        int delId = Utils.readInt();
        if (delId == -1) {
            System.out.println("放弃删除");
            return;
        }
        // 此方法本身就有循环判断的逻辑，必须输入Y/N。
        char choice = Utils.readConfirmSelection();
        if (choice == 'Y') {
            // del
            if (houseService.del(delId)) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败，delId不存在");
            }
        } else {
            System.out.println("放弃删除");
        }
    }

    public void quit() {
        char c = Utils.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    public void findHouse() {
        System.out.println("=================查找房屋================");
        System.out.println("请输入需要查找的id");
        int findId = Utils.readInt();
        // 调用方法
        House house = houseService.findById(findId);

        if (house != null) {
            System.out.println(house);
        } else {
            System.out.println("未找到");
        }
    }

    public void updateHouse() {
        System.out.println("=================修改房屋================");
        System.out.println("请输入需要修改房屋的id");
        int updateId = Utils.readInt();

        if (updateId == -1) {
            System.out.println("放弃修改房屋信息");
            return;
        }
        // 根据updateId，查找对象
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("id不存在");
            return;
        }
        System.out.println("姓名(" + house.getName() + "):");
        String name = Utils.readString(5, "");

        if (!"".equals(name)) {
            house.setName(name);
        }

        System.out.println("电话(" + house.getPhone() + "):");
        String phone = Utils.readString(11,"");
        if (!"".equals(phone)) {
            house.setPhone(phone);
        }

        System.out.println("地址(" + house.getAddress() + "):");
        String address = Utils.readString(16,"");
        if (!"".equals(address)) {
            house.setAddress(address);
        }

        System.out.println("租金(" + house.getRent() + "):");
        int rent = Utils.readInt(-1);
        if (rent != -1) {
            house.setRent(rent);
        }

        System.out.println("state");
        String state = Utils.readString(3,"");
        if (!"".equals(state)) {
            house.setState(state);
        }
        System.out.println("修改成功");
    }
}
