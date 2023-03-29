public class StrIn {
    void display(double a){
        System.out.println("Double");
    }
    void display(String b){
        System.out.println("string");
    }
    public static void main(String[] args) {
    StrIn si = new StrIn();
    si.display("gawesh");
    si.display(78.98);
    }
}
