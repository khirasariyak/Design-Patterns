package memento;

public class Editor {
  private final History history;
  private String content;

  public Editor() {
    history = new History(); // Initializing the history
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void save() {
    // Saving the current state into the List
    history.push(new EditorState(content));
  }

  public void undo() {
    // Fetching the last state from history
    var previousState = history.pop();

    // Setting the fields of previous state
    content = previousState.getContent();
  }
}
