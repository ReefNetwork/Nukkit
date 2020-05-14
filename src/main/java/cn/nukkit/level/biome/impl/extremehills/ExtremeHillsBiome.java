package cn.nukkit.level.biome.impl.extremehills;

import cn.nukkit.level.biome.type.GrassyBiome;

/**
 * author: DaPorkchop_
 * Nukkit Project
 * <p>
 * make sure this is touching another extreme hills type or it'll look dumb
 *
 * steep mountains with flat areas between
 */
public class ExtremeHillsBiome extends GrassyBiome {

    public ExtremeHillsBiome() {
        super();

        this.setBaseHeight(1f);
        this.setHeightVariation(0.5f);
    }

    @Override
    public String getName() {
        return "Extreme Hills";
    }

    @Override
    public boolean doesOverhang() {
        return true;
    }
}
