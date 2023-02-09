public class Output {
    public static void main(String[] args){
        Stack mystck = new Stack();
        Stack mystack1 = new Stack();

        for (int i = 10; i < 20; i++) mystck.push(i);
        for (int i = 0; i < 10; i++) mystack1.push(i);

        for (int i = 0; i < 10; i++) System.out.println(mystck.pop());
        for (int i = 0; i < 10; i++) System.out.println(mystack1.pop());
    }
}
