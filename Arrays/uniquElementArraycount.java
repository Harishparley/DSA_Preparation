
public class uniquElementArraycount {
    public static void main(String[] args) {
        int []arr = {1,1,2,2,2,3,4,4,5,5,};//isme hum kya kr rhe har element ko ek bar count krna he

        int i = 0;
        for(int j=1; j<arr.length; j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.println(i+1); //and then kitne count he vo btana he jese array me 5 element he
                                 //  bhale vo twice aaye ho hm to unhe ek bar count krenge 
    }
}
