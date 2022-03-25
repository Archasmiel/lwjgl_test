package engine.scene;

import engine.Window;

public class LevelScene extends Scene{

    public LevelScene() {
        System.out.println("Inside level scene");
        Window.get().r = 1;
        Window.get().g = 0;
        Window.get().b = 0;
    }

    @Override
    public void update(float dt) {

    }
}
