package net.kaupenjoe.mccourse.datagen;

import net.kaupenjoe.mccourse.MCCourseMod;
import net.kaupenjoe.mccourse.block.ModBlocks;
import net.kaupenjoe.mccourse.item.ModItems;
import net.kaupenjoe.mccourse.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> completableFuture,
                               CompletableFuture<TagLookup<Block>> lookupCompletableFuture, @Nullable ExistingFileHelper existingFileHelper) {
        super(packOutput, completableFuture, lookupCompletableFuture, MCCourseMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(ModTags.Items.TRANSFORMABLE_ITEMS)
                .add(ModItems.AZURITE.get())
                .add(ModItems.RAW_AZURITE.get())
                .add(Items.COAL)
                .add(Items.STICK)
                .add(Items.COMPASS);

        this.tag(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.BALSA_LOG.get().asItem())
                .add(ModBlocks.BALSA_WOOD.get().asItem())
                .add(ModBlocks.STRIPPED_BALSA_LOG.get().asItem())
                .add(ModBlocks.STRIPPED_BALSA_WOOD.get().asItem());

        this.tag(ItemTags.PLANKS)
                .add(ModBlocks.BALSA_PLANKS.get().asItem());

    }
}
