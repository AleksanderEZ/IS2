package kata6;


import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import kata6.model.Block;
import kata6.view.BlockDisplay;

public class BlockPanel extends JPanel implements BlockDisplay{

    private static final int SIZE = 100;
    private Block block;

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(0, 0, 1000, 1000);
        
        g.setColor(Color.black);
        
        int max = Block.MAX*SIZE;
        for(int i = 0; i <= Block.MAX; i++){
            int currentLine = i * SIZE;
            g.drawLine(currentLine, 0, currentLine, max);
            g.drawLine(0, currentLine, max, currentLine);
        }
        
        if (block == null) return;
        g.setColor(Color.green);
        g.fillRect(block.getX() * SIZE, (Block.MAX - block.getY() - 1) * SIZE, SIZE, SIZE);
    }

    @Override
    public void show(Block block) {
        this.block = block;
        repaint();
    }

    @Override
    public Block block() {
        return this.block;
    }

    @Override
    public void updated() {
        repaint();
    }
}
