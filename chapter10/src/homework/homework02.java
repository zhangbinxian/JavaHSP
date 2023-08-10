package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework02 {
    public static void main(String[] args) {

        System.out.println(Frock.getNextNum());//100100
        System.out.println(Frock.getNextNum());//100200

        Frock frock = new Frock();              //100300
        Frock frock1 = new Frock();             //100400
        Frock frock2 = new Frock();             //100500

        System.out.println(frock.getSerialNumber());//100300
        System.out.println(frock1.getSerialNumber());//100400
        System.out.println(frock2.getSerialNumber());//100500

    }
}

class Frock {
    private static int currentNum = 100000;
    private  int serialNumber;

    public Frock() {
        serialNumber=getNextNum();
    }

    public static int getNextNum() {
        currentNum += 100;
        return currentNum;
    }

    public  int getSerialNumber() {
        return serialNumber;
    }
}
