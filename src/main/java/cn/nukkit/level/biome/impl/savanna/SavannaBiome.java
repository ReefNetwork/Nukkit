package cn.nukkit.level.biome.impl.savanna;

import cn.nukkit.level.biome.type.GrassyBiome;

/**
 * @author DaPorkchop_
 */
public class SavannaBiome extends GrassyBiome {

    public SavannaBiome() {
        super();

        this.setBaseHeight(0.125f);
        this.setHeightVariation(0.05f);
    }

    @Override
    public String getName() {
        return "Savanna";
    }

    @Override
    public boolean canRain() {
        return false;
    }
}
