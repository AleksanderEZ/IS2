package kata6.view;

import kata6.model.Block;

public interface BlockDisplay extends Block.Observer{
    void show(Block block);
    Block block();
}
