package kadai;

public class Review02 {

    public static void main(String[] args) {
        for(int i= 1; i < 101; i++) {
            //3で割り切れるかつ5で割り切れる
            if((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            }
            //数が3で割り切れる
            else if(i % 3 == 0) {
                System.out.println("Fizz");
            }
            //数が5で割り切れる
            else if(i % 5 == 0) {
                System.out.println("Buzz");
            }
            //そのほかの場合
            else {
                System.out.println(i);
            }
        }

    }

}
