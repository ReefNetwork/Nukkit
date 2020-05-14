package cn.nukkit.level.biome.impl.roofedforest;

import cn.nukkit.level.biome.type.GrassyBiome;
import cn.nukkit.level.generator.populator.impl.MushroomPopulator;
import cn.nukkit.level.generator.populator.impl.PopulatorFlower;

public class RoofedForestBiome extends GrassyBiome {

    public RoofedForestBiome() {
        super();

        PopulatorFlower flower = new PopulatorFlower();
        flower.setBaseAmount(2);
        this.addPopulator(flower);

        MushroomPopulator mushroom = new MushroomPopulator();
        mushroom.setBaseAmount(0);
        mushroom.setRandomAmount(1);
        this.addPopulator(mushroom);
    }

    @Override
    public String getName() {
        return "Roofed Forest";
    }

}
