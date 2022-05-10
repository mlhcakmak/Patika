import java.util.Arrays;
public class tekrarEden {
    public static void main(String[] args) {
        int[] intList = {1,12,15,1,2,3,3,98,45,45,1,2,3,12};
        Arrays.sort(intList);
        int value = intList[0],index = 1,count = 1;
        for (int i = 1 ; i < intList.length ; i++){
            for (int j = index ; j <intList.length ; j++){
                if (value == intList[j]){
                    count +=1;
                    if (index  < intList.length)
                        index = j+1;
                }
            }
            System.out.println(value +" sayısı " +count+" kere tekrar edildi.");
            if (index == intList.length) {
                break;
            }
            value = intList[index];
            count=0;
        }

    }
}