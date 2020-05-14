package cn.nukkit.level.biome.impl.mesa;

/**
 * @author DaPorkchop_
 */
public class MesaPlateauFBiome extends MesaPlateauBiome {
    public MesaPlateauFBiome() {
        super();
    }

    @Override
    public int getCoverBlock() {
        return GRASS;
    }

    @Override
    public String getName() {
        return "Mesa Plateau F";
    }
}
