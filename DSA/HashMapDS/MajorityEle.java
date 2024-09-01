import java.util.*;
public class MajorityEle{
    public static void majorityElement(int nums[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        //Step1:
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){ //True
                map.put(nums[i],map.get(nums[i])+1);
            }else{ //False
                map.put(nums[i],1);
            }
        }
        //Step3:
        for(int key:map.keySet()){
            if(map.get(key)>n/3){
                System.out.println(key);
            }
        }
    }
    public static void main(String args[]){
//        int nums[]={1,2,3,4,5,1,3,1,5,1} ; //1
        int nums[]={1,2};
        majorityElement(nums);
    }
}