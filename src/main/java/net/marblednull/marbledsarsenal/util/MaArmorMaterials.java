package net.marblednull.marbledsarsenal.util;

import net.marblednull.marbledsarsenal.MarbledsArsenal;
import net.marblednull.mcore.init.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.Map;

public final class MaArmorMaterials {

    public static final DeferredRegister<ArmorMaterial> ARMOR_MATERIALS =
            DeferredRegister.create(Registries.ARMOR_MATERIAL, MarbledsArsenal.MODID);

    // Material for hats. Berets, etc
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> HAT =
            ARMOR_MATERIALS.register("hat", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 2,
                            ArmorItem.Type.LEGGINGS, 5,
                            ArmorItem.Type.CHESTPLATE, 6,
                            ArmorItem.Type.HELMET, 1
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_LEATHER,
                    () -> Ingredient.of(Items.LEATHER),
                    List.of(),
                    0.0F,
                    0.0F
            ));

    // Material for combat helmets
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> COMBAT_HELMET =
            ARMOR_MATERIALS.register("combat_helmet", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 2,
                            ArmorItem.Type.LEGGINGS, 5,
                            ArmorItem.Type.CHESTPLATE, 6,
                            ArmorItem.Type.HELMET, 2
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
                    List.of(),
                    0.0F,
                    0.0F
            ));

    // Material for light plate carriers
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> PLATE_CARRIER_LIGHT =
            ARMOR_MATERIALS.register("plate_carrier_light", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 2,
                            ArmorItem.Type.LEGGINGS, 5,
                            ArmorItem.Type.CHESTPLATE, 6,
                            ArmorItem.Type.HELMET, 2
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
                    List.of(),
                    0.5F,
                    0.0F
            ));

    // Material for heavy plate carriers
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> PLATE_CARRIER_HEAVY =
            ARMOR_MATERIALS.register("plate_carrier_heavy", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 2,
                            ArmorItem.Type.LEGGINGS, 5,
                            ArmorItem.Type.CHESTPLATE, 8,
                            ArmorItem.Type.HELMET, 2
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
                    List.of(),
                    1.5F,
                    0.1F
            ));

    // Material for gas masks
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GAS_MASK =
            ARMOR_MATERIALS.register("gas_mask", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 2,
                            ArmorItem.Type.LEGGINGS, 5,
                            ArmorItem.Type.CHESTPLATE, 6,
                            ArmorItem.Type.HELMET, 1
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
                    List.of(),
                    0.0F,
                    0.0F
            ));

    // Material for hazmat armors
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> HAZMAT =
            ARMOR_MATERIALS.register("hazmat", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 1,
                            ArmorItem.Type.LEGGINGS, 2,
                            ArmorItem.Type.CHESTPLATE, 3,
                            ArmorItem.Type.HELMET, 1
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_LEATHER,
                    () -> Ingredient.of(Items.LEATHER),
                    List.of(),
                    0.0F,
                    0.0F
            ));

    // Material for ghillies
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> GHILLIE =
            ARMOR_MATERIALS.register("ghillie", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 1,
                            ArmorItem.Type.LEGGINGS, 2,
                            ArmorItem.Type.CHESTPLATE, 3,
                            ArmorItem.Type.HELMET, 1
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_LEATHER,
                    () -> Ingredient.of(Items.LEATHER),
                    List.of(),
                    0.0F,
                    0.0F
            ));

    // Material for civil/clothing armors
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> CIVIL =
            ARMOR_MATERIALS.register("civil", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 1,
                            ArmorItem.Type.LEGGINGS, 2,
                            ArmorItem.Type.CHESTPLATE, 2,
                            ArmorItem.Type.HELMET, 1
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(Items.LEATHER),
                    List.of(),
                    2.0F,
                    0.1F
            ));

    // Material for tactical armors
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> TACTICAL =
            ARMOR_MATERIALS.register("tactical", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 3,
                            ArmorItem.Type.LEGGINGS, 5,
                            ArmorItem.Type.CHESTPLATE, 7,
                            ArmorItem.Type.HELMET, 3
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
                    List.of(),
                    2.0F,
                    0.1F
            ));

    // Material for military armors
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> MILITARY =
            ARMOR_MATERIALS.register("military", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 3,
                            ArmorItem.Type.LEGGINGS, 6,
                            ArmorItem.Type.CHESTPLATE, 8,
                            ArmorItem.Type.HELMET, 3
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_IRON,
                    () -> Ingredient.of(ModItems.STEEL_INGOT.get()),
                    List.of(),
                    2.0F,
                    0.1F
            ));

    // Material for Juggernaut armors
    public static final DeferredHolder<ArmorMaterial, ArmorMaterial> JUGGERNAUT =
            ARMOR_MATERIALS.register("juggernaut", () -> new ArmorMaterial(
                    Map.of(
                            ArmorItem.Type.BOOTS, 4,
                            ArmorItem.Type.LEGGINGS, 7,
                            ArmorItem.Type.CHESTPLATE, 9,
                            ArmorItem.Type.HELMET, 4
                    ),
                    15,
                    SoundEvents.ARMOR_EQUIP_NETHERITE,
                    () -> Ingredient.of(ModItems.TITANIUM_INGOT.get()),
                    List.of(),
                    3.0F,
                    0.2F
            ));

    public static void register(IEventBus eventBus) {
        ARMOR_MATERIALS.register(eventBus);
    }

    private MaArmorMaterials() {
    }
}