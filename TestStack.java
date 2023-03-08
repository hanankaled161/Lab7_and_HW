public class TestStack {
    public static void main(String[] args) {


        LinkedStack <Integer>s=new LinkedStack<>();
        s.push(4);
        s.push(9);
        System.out.println(s.size());
        s.removeAll();
        System.out.println(s.size());
    }
}
