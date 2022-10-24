import com.app.ArrayList;

public class main {
    public static void main(String[] args){
        ArrayList A = new ArrayList();
        A.add(5);
        A.add(5);
        A.add(6);
        A.add(8);
        System.out.print(A.get(0) + "\n");
        A.print();
        System.out.print("\n");
        A.remove(4);
        A.print();
    }
}
