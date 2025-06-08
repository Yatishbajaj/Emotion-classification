import java.util.*;
class firstclass{
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int multi = a*b;
        System.out.println(multi);
    }
}

class secondclass{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int multi = a*b;
        System.out.println(multi);
    }
}

class thirdclass{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        if (a>b){
            System.out.println("a is greater then b");
        }else{
            if(a==b){
                System.out.println("a is equal to b");
            }else{
                System.out.println("a is smaller then b");
            }
        }
    }
}

class fourthclass{
    public static void main(String[] args) {
        for(int i=0; i<20; i++){
            System.out.println("i+ ");
        }

    }
}

class fivthclass{
    public static void main(String[] args) {
        int i = 12;
        while(i<11){
            System.out.println(i);
            i = i+1;
        }
    }
}

class sisthclass{
    public static void main(String[] args) {
        int i = 1;
        do{
            System.out.println(i);
        }while(i<11);
    }
}