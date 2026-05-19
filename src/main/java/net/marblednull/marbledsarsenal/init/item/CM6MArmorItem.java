package net.marblednull.marbledsarsenal.init.item;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.neoforged.neoforge.registries.DeferredHolder;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;

public class CM6MArmorItem extends ArmorItem implements GeoItem {

    private final AnimatableInstanceCache cache =
            new SingletonAnimatableInstanceCache(this);

    public CM6MArmorItem(
            DeferredHolder<ArmorMaterial, ArmorMaterial> material,
            Type type,
            Properties properties
    ) {
        super(material, type, properties);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}