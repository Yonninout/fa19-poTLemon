
package potlemon.core.view;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.GL20;

public class FightView extends ApplicationAdapter{

    SpriteBatch sb;
    Texture img;
    
    @Override
    public void create(){
        sb = new SpriteBatch();
        img = new Texture("../Pictures/Fight/pokemon-combat-first.jpg");
    }
    
    @Override
    public void render(){
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sb.begin();
        sb.draw(img, 0, 0);
        sb.end();
    }
}
