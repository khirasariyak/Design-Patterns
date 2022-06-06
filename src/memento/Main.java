package memento;

public class Main {
    public static void main(String[] args) {
        var editor = new Editor();
        var history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("ab");
        history.push(editor.createState());

        editor.setContent("abc");
        editor.restore(history.pop());

        System.out.println(editor.getContent());   // ab
    }
}