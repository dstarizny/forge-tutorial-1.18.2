package com.dstarizny.tutorialmod.util;

import com.dstarizny.tutorialmod.TutorialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

import javax.swing.text.html.HTML;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> DOWNSING_ROD_VALUABLES = tag("downsing_rod_valuables");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TutorialMod.MOD_ID,name) );
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge",name) );
        }

    }

    public  static  class  Items {
        public static final TagKey<Item> CITRINE_GEMS = forgeTag("gems/citrine");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TutorialMod.MOD_ID,name) );
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge",name) );
        }

    }

}
