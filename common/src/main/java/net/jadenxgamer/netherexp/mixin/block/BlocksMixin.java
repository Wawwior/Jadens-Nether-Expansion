package net.jadenxgamer.netherexp.mixin.block;

import net.jadenxgamer.netherexp.registry.block.custom.BoneBlock;
import net.jadenxgamer.netherexp.registry.block.custom.WartBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.Slice;

@Mixin(Blocks.class)
public class BlocksMixin {

    @Redirect(
            method = "<clinit>",
            at = @At(value = "NEW", target = "net/minecraft/world/level/block/RotatedPillarBlock", ordinal = 0),
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=bone_block"))
    )
    private static RotatedPillarBlock netherexp$bone_block(BlockBehaviour.Properties properties) {
        return new BoneBlock(properties);
    }

    @Redirect(
            method = "<clinit>",
            at = @At(value = "NEW", target = "net/minecraft/world/level/block/Block", ordinal = 0),
            slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=nether_wart_block"))
    )
    private static Block netherexp$netherWartBlock(BlockBehaviour.Properties properties) {
        return new WartBlock(properties, 1);
    }

    @Redirect(
            method = "<clinit>",
            at = @At(value = "NEW", target = "net/minecraft/world/level/block/Block", ordinal = 0), slice = @Slice(from = @At(value = "CONSTANT", args = "stringValue=warped_wart_block"))
    )
    private static Block netherexp$warpedWartBlock(BlockBehaviour.Properties properties) {
        return new WartBlock(properties, 2);
    }
}
