public class Main {
    public static void main(String[] args) {
        
        int num[] = new int[]{1,2,3};
        List<List<Integer>> finaleAns = permute(num,  new ArrayList<Integer>(), new ArrayList<List<Integer>>());
        System.out.println(finaleAns);
    }
    
    static List<List<Integer>> permute(int num[], List<Integer> set, List<List<Integer>> answers){
        
        if(num.length==0){
            answers.add(set);
        }
        
        for(int i=0; i<num.length; i++){
            int[] newNum = new int[num.length-1];
            int index=0;
            for(int j=0; j<num.length; j++){
                if(j==i){
                    continue;
                }else{
                    newNum[index]= num[j];
                    index++;
                }
            }
            set.add(num[i]);
            
            permute(newNum, set, answers);
            set.remove(set.size()-1);
        }
        return answers;
    }
}
