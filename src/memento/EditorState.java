package memento;

public class EditorState {

  // You can use record keyword which is offered in Java 14

  private final String content;

  public EditorState(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
