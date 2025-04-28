package net.esteban.lechugamod.block.custom;

import net.esteban.lechugamod.item.ModItems;
import net.minecraft.block.BlockState;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.intprovider.IntProvider;
import net.minecraft.world.World;

public class LettuceBlock extends ExperienceDroppingBlock {

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {

        ItemStack lettuceStack = new ItemStack(ModItems.LETTUCE,1);

        if (!world.isClient){
            player.getInventory().insertStack(lettuceStack);
        }
        world.playSound(player,pos,SoundEvents.BLOCK_AMETHYST_CLUSTER_FALL, SoundCategory.BLOCKS,1f,2f);


        return ActionResult.SUCCESS;
    }

    public LettuceBlock(IntProvider experienceDropped, Settings settings) {
        super(experienceDropped, settings);
    }
}
