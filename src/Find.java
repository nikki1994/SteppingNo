public class Find {
    int start=0;
    int end=0;
    public void logic(int start,int end){
        this.start=start;
        this.end=end;
        System.out.println("list of Stepping numbers: ");
        for (int i=start;i<=end;i++){
            int number = i;
            int dig1 = number/100;
            int dig2 = (number%100)/10;
            int dig3 = number%10;
            if((dig1-dig2==1||dig2-dig1==1)&&(dig2-dig3==1||dig3-dig2==1)){
                System.out.print(number+" ");
            }
        }
    }

}
