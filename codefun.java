public class codefun
{
    public void  run() {
        int i = 0;
        int a = 5;
        int k = 10;
        int b = 13;
        while (i < 15) {
            System.out.println("i is "+ i +" but is less than 15");
            i++;
        }
        while (k > 5) {
            System.out.println("k is "+ k +" but is greater than 5");
            k--;
        }
        while (a < 10 && b <= 20) {
                System.out.println("big ol "+ b + " but small ol "+ a +", cool");
                a++;
                b++;
        }
    }
    public static void main(String[] args)
    {
        codefun hw = new codefun();
        hw.run();
    }
    }


