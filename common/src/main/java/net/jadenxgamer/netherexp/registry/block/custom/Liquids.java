package net.jadenxgamer.netherexp.registry.block.custom;

import net.minecraft.util.StringRepresentable;
import org.jetbrains.annotations.NotNull;

public enum Liquids implements StringRepresentable {
    AIR("air"),
    WATER("water"),
    LAVA("lava"),
    ECTOPLASM("ectoplasm");

    private final String name;

    Liquids(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public @NotNull String getSerializedName() {
        return this.name;
    }
}