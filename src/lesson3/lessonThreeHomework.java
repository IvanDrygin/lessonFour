package lesson3;

public class lessonThreeHomework {
    public static void main(String[] args) {
        replacement();
        filling();
        multiplication();
        cube();

    }

    public static void replacement() {
        int[] arr = {1, 0, 1, 1, 0, 0, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println(arr[i]);
        }
        System.out.println("Второе задание");
    }

    public static void filling() {
        int[] fill = new int[100];
        for (int j = 0; j < fill.length; j++) {
            fill[j] = j + 1;
            System.out.println(fill[j]);
        }
        System.out.println("Третье задание");
    }

    public static void multiplication() {
        int[] multi = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < multi.length; i++) {
            if (multi[i] < 6) {
                multi[i] = multi[i] * 2;
            }
            System.out.println(multi[i]);
        }
        System.out.println("Четвертое задание");
    }

    public static void cube() {
        System.out.println();
        int[][] cube = new int[10][10];

        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                cube[i][j] = 0;
                if (i == j) {
                    cube[i][j] = 1;
                }
                if (j == cube.length -1 -i) {
                    cube[i][j] = 1;
                }
                System.out.print(cube[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] refund (int len, int value ) {
        int [] ref = new int [len];
        for (int i = 0; i < ref.length; i++) {
            ref[i] = value;
        }
        return ref;

    }

}
