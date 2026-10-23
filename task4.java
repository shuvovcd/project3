package task4;
class task4{
    public static void main(String[] args){
        for (int t = 1 ; t <= 9 ; t++){
            for (int o = 1 ; o<= 9 ; o++){
                int num = 10 * t + o ;
                int reversenum = 10 * o + t ;
                if (t == o / 2.0 && (reversenum - num) == 36){
                    System.out.println("the Number will be " + num);

                }
            }
        }
    }
}
