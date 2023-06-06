package org.embeddedt.modernfix.platform;

import com.google.common.collect.Multimap;
import com.mojang.brigadier.CommandDispatcher;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.client.searchtree.SearchRegistry;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.item.ItemStack;
import org.objectweb.asm.tree.ClassNode;

import java.nio.file.Path;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ModernFixPlatformHooks {
    @ExpectPlatform
    public static boolean isClient() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean isDedicatedServer() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static String getVersionString() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean modPresent(String modId) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean isDevEnv() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void injectPlatformSpecificHacks() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void applyASMTransformers(String mixinClassName, ClassNode targetClass) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static MinecraftServer getCurrentServer() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static boolean isLoadingNormally() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Path getGameDirectory() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void sendPacket(ServerPlayer player, Object packet) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void onServerCommandRegister(Consumer<CommandDispatcher<CommandSourceStack>> handler) {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static Multimap<String, String> getCustomModOptions() {
        throw new AssertionError();
    }

    @ExpectPlatform
    public static void registerCreativeSearchTrees(SearchRegistry registry, SearchRegistry.TreeBuilderSupplier<ItemStack> nameSupplier, SearchRegistry.TreeBuilderSupplier<ItemStack> tagSupplier, BiConsumer<SearchRegistry.Key<ItemStack>, List<ItemStack>> populator) {
        throw new AssertionError();
    }
}
