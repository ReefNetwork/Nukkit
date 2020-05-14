package cn.nukkit.level.biome.impl.taiga;

import cn.nukkit.level.biome.type.GrassyBiome;

/**
 * author: DaPorkchop_
 * Nukkit Project
 */
public class TaigaBiome extends GrassyBiome {
    public TaigaBiome() {
        super();

        this.setBaseHeight(0.2f);
        this.setHeightVariation(0.2f);
    }

    @Override
    public String getName() {
        return "Taiga";
    }
}
