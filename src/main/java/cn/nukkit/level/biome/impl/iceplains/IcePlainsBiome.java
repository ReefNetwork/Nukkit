package cn.nukkit.level.biome.impl.iceplains;

import cn.nukkit.level.biome.type.SnowyBiome;

/**
 * author: MagicDroidX
 * Nukkit Project
 */
public class IcePlainsBiome extends SnowyBiome {

    public IcePlainsBiome() {
        super();

        this.setBaseHeight(0.125f);
        this.setHeightVariation(0.05f);
    }

    public String getName() {
        return "Ice Plains";
    }
}
