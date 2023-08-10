package homework;

/**
 * @author bx_cha
 * @version 1.0
 */
public class homework08 {
    public static void main(String[] args) {

        Color blue = Color.BLUE;

        switch (blue) {
            case RED:
                Color.RED.show();
                break;
            case BLUE:
                Color.BLUE.show();
                break;
            case BLACK:
                Color.BLACK.show();
                break;
            case GREEN:
                Color.GREEN.show();
                break;
            case YELLOW:
                Color.YELLOW.show();
                break;
            default:
                System.out.println("没有这个颜色");
        }


    }
}

interface Iinterface {
    public void show();
}

enum Color implements Iinterface {
    RED(255, 0, 0),
    BLUE(0, 0, 255),
    BLACK(0, 0, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0);

    private int redValue;
    private int greenValue;
    private int blueValue;

    private Color(int redValue, int greenValue, int blueValue) {
        this.redValue = redValue;
        this.greenValue = greenValue;
        this.blueValue = blueValue;
    }

    @Override
    public void show() {
        System.out.println("redValue " + redValue + ",blueValue " + blueValue + ",greenValue " + greenValue);
    }
}
