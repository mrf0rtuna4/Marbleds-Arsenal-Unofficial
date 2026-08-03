package net.marblednull.marbledsarsenal;

import net.marblednull.marbledsarsenal.init.ModItems;
import net.marblednull.marbledsarsenal.init.ModTabs;
import net.marblednull.marbledsarsenal.util.MaArmorMaterials;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.event.server.ServerStartingEvent;

@Mod(MarbledsArsenal.MODID)
public class MarbledsArsenal
{
    public static final String MODID = "marbledsarsenal";

    public MarbledsArsenal(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        MaArmorMaterials.register(modEventBus);
        ModItems.register(modEventBus);
        ModTabs.register(modEventBus);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @EventBusSubscriber(modid = MODID, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}
