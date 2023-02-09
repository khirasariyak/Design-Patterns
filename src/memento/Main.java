package memento;

public class Main {
  public static void main(String[] args) {
    var editor = new Editor();

    editor.setContent("a");
    editor.save();

    editor.setContent("ab");
    editor.save();

    editor.setContent("abc");
    editor.undo();

    System.out.println(editor.getContent());   // ab
  }
}