import java.util.*;

public class Assignment {

    String Act[] ={"A1","A2","A3","A4","A5"};
    int Starttime[] = {2,4,3,5,7};
    int Endtime[] = {3,6,4,7,8};
    int n = Act.length;
    int prevTime = Endtime[0];
        

    public static void main(String[] args) {
        Assignment assign = new Assignment();
        System.out.print(assign.Act[0]+" ");

        for(int i=1; i<assign.n; i++){
            if(assign.prevTime <= assign.Starttime[i]){
                System.out.print(assign.Act[i]+" ");
                assign.prevTime = assign.Endtime[i];
            }
        }

        

        
        
        
        
    }
}
