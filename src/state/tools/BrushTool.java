package state.tools;

import state.tools.Tool;

public class BrushTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("Brush Tool Selected!");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a Colored Line.");
    }
}
