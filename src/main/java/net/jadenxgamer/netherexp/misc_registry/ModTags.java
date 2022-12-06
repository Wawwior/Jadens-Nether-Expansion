package net.jadenxgamer.netherexp.misc_registry;

import net.jadenxgamer.netherexp.NetherExp;
import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static class Blocks {

        private static final TagKey<Block> ASH_CAN_SURVIVE_ON = createTag("ash_can_survive_on");
        private static final TagKey<Block> ASH_CANNOT_SURVIVE_ON = createTag("ash_cannot_survive_on");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(NetherExp.MOD_ID, name));
        }
    }
}
