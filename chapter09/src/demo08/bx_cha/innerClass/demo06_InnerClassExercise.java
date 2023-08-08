package demo08.bx_cha.innerClass;

public class demo06_InnerClassExercise {
    public static void main(String[] args) {

        CellPhone cellPhone = new CellPhone();
        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("懒猪起床");
            }
        });

        cellPhone.alarmclock(new Bell() {
            @Override
            public void ring() {
                System.out.println("上课去");
            }
        });

    }

}

interface Bell {
    void ring();
}

class CellPhone {
    public void alarmclock(Bell bell ) {
        bell.ring();
    }
}
