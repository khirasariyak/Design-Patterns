package state.tools;

import state.tools.Tool;

public class SelectionTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Selection Tool Selected!");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw Dashed Rectangle.");
    }
}
