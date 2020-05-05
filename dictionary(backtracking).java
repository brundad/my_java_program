import java.util.*;

class Main{
    public static String[] arr={"mobile","it","vac","itvac", "man","mango", "icecream","and", "go","i","love","ice","cream"};
    public static ArrayList<String> dic=new ArrayList<>();

    public static boolean solve(String str,ArrayList<String> list,int index){
        
        if(str.length()==index){
            list.forEach(i->System.out.print(i+" "));
            System.out.println();
            return false;
        }
        
        String s="";
        for(int i=index;i<str.length();i++){
            s+=str.charAt(i);
            if(dic.contains(s)){
                list.add(s);
                // System.out.println(list);
                if(solve(str,list,i+1)){
                    return true;
                }
                list.remove(list.size()-1);
            }
        }
        
        return false;
        
    }
 
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        scan.nextLine();
        dic.addAll(Arrays.asList(arr));
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            String str=scan.nextLine();
            solve(str,list,0);
        }
        
    }
}
