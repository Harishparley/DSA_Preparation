class lc69{

    public static void main(String[] args) {
        int x=2147395599;
       System.out.println(mySqrt(x)); 
    }
    public static int mySqrt(int x) {
        int start =0;
        int end = x;
        while(start<=end){
            int mid = start +(end-start)/2;
            long square = (long)mid*mid; // type cast agr int rkhte to vo itni bdi value ko store krta isliye long use kiya he 
            if(square == x){
                return mid;
            }
            if(square>x){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end;
    }
}