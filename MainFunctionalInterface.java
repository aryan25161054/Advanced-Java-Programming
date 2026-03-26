public class MainFunctionalInterface {
    public static void main(String[] args) {
     Calc1 a = (int num)->{
         if(num<18){
             return "Can't vote";
         }else {
             return "can vote";
         }
     };  String b = a.canVote(20);
        System.out.println(b);
        VoterList v1 = new VoterList();
        Calc1 v = v1::checkVoter;
        System.out.println(v.canVote(17))   ;
    }
}
    @FunctionalInterface
    interface Calc1 {
        String canVote(int n);


    }
 class VoterList {
    String checkVoter(int age){
        if(age > 18){
            return "Can't vote";
        }
        else {
            return "Can vote";
        }
    }
 }
