package study.d12_22;

public class Id {
    public static void main(String[] args) {
        String id="362428200307240614";
        String year=id.substring(6,10);
        String month=id.substring(10,12);
        String day=id.substring(12,14);
        System.out.println(year+"年"+month+"月"+day+"日");
        char sex=id.charAt(16);

        if(sex%2==0){
            System.out.println("性别：女");
        }else{
            System.out.println("性别：男");
        }
    }
}
