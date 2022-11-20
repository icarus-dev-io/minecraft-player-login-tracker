package org.icarus.minecraft.plugin.utils;

import com.destroystokyo.paper.ClientOption;
import com.destroystokyo.paper.Title;
import com.destroystokyo.paper.block.TargetBlockInfo;
import com.destroystokyo.paper.entity.TargetEntityInfo;
import com.destroystokyo.paper.profile.PlayerProfile;
import io.papermc.paper.entity.LookAnchor;
import io.papermc.paper.entity.RelativeTeleportFlag;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.TextComponent;
import net.md_5.bungee.api.chat.BaseComponent;
import org.bukkit.*;
import org.bukkit.advancement.Advancement;
import org.bukkit.advancement.AdvancementProgress;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.BlockState;
import org.bukkit.block.PistonMoveReaction;
import org.bukkit.block.Sign;
import org.bukkit.block.data.BlockData;
import org.bukkit.conversations.Conversation;
import org.bukkit.conversations.ConversationAbandonedEvent;
import org.bukkit.entity.*;
import org.bukkit.entity.Player;
import org.bukkit.entity.memory.MemoryKey;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerResourcePackStatusEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.inventory.EntityEquipment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.inventory.Merchant;
import org.bukkit.inventory.PlayerInventory;
import org.bukkit.map.MapView;
import org.bukkit.metadata.MetadataValue;
import org.bukkit.permissions.Permission;
import org.bukkit.permissions.PermissionAttachment;
import org.bukkit.permissions.PermissionAttachmentInfo;
import org.bukkit.persistence.PersistentDataContainer;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.util.BoundingBox;
import org.bukkit.util.Consumer;
import org.bukkit.util.RayTraceResult;
import org.bukkit.util.Vector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class PlayerForTest implements Player {

    public boolean isSendMessageHasBeenCalled = false;
    public String message;

    private final int id;
    private final String name;

    public PlayerForTest(final int id, final String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public void sendMessage(@NotNull Component message) {
        this.isSendMessageHasBeenCalled = true;
        this.message = ((TextComponent) message).content();
    }

    public String getMessageSend() {
        return this.message;
    }

    @Override
    public @NotNull Component displayName() {
        return null;
    }

    @Override
    public void displayName(@Nullable final Component displayName) {

    }

    @Override
    public boolean isOnline() {
        return false;
    }

    @Override
    public double getEyeHeight() {
        return 0;
    }

    @Override
    public double getEyeHeight(final boolean ignorePose) {
        return 0;
    }

    @Override
    public @NotNull Location getEyeLocation() {
        return null;
    }

    @Override
    public @NotNull List<Block> getLineOfSight(@Nullable final Set<Material> transparent, final int maxDistance) {
        return null;
    }

    @Override
    public @NotNull Block getTargetBlock(@Nullable final Set<Material> transparent, final int maxDistance) {
        return null;
    }

    @Override
    public @Nullable Block getTargetBlock(final int maxDistance, final TargetBlockInfo.@NotNull FluidMode fluidMode) {
        return null;
    }

    @Override
    public @Nullable BlockFace getTargetBlockFace(final int maxDistance, final TargetBlockInfo.@NotNull FluidMode fluidMode) {
        return null;
    }

    @Override
    public @Nullable TargetBlockInfo getTargetBlockInfo(final int maxDistance, final TargetBlockInfo.@NotNull FluidMode fluidMode) {
        return null;
    }

    @Override
    public @Nullable Entity getTargetEntity(final int maxDistance, final boolean ignoreBlocks) {
        return null;
    }

    @Override
    public @Nullable TargetEntityInfo getTargetEntityInfo(final int maxDistance, final boolean ignoreBlocks) {
        return null;
    }

    @Override
    public @NotNull List<Block> getLastTwoTargetBlocks(@Nullable final Set<Material> transparent, final int maxDistance) {
        return null;
    }

    @Override
    public @Nullable Block getTargetBlockExact(final int maxDistance) {
        return null;
    }

    @Override
    public @Nullable Block getTargetBlockExact(final int maxDistance, @NotNull final FluidCollisionMode fluidCollisionMode) {
        return null;
    }

    @Override
    public @Nullable RayTraceResult rayTraceBlocks(final double maxDistance) {
        return null;
    }

    @Override
    public @Nullable RayTraceResult rayTraceBlocks(final double maxDistance, @NotNull final FluidCollisionMode fluidCollisionMode) {
        return null;
    }

    @Override
    public int getRemainingAir() {
        return 0;
    }

    @Override
    public void setRemainingAir(final int ticks) {

    }

    @Override
    public int getMaximumAir() {
        return 0;
    }

    @Override
    public void setMaximumAir(final int ticks) {

    }

    @Override
    public int getArrowCooldown() {
        return 0;
    }

    @Override
    public void setArrowCooldown(final int ticks) {

    }

    @Override
    public int getArrowsInBody() {
        return 0;
    }

    @Override
    public void setArrowsInBody(final int count) {

    }

    @Override
    public int getBeeStingerCooldown() {
        return 0;
    }

    @Override
    public void setBeeStingerCooldown(final int ticks) {

    }

    @Override
    public int getBeeStingersInBody() {
        return 0;
    }

    @Override
    public void setBeeStingersInBody(final int count) {

    }

    @Override
    public int getMaximumNoDamageTicks() {
        return 0;
    }

    @Override
    public void setMaximumNoDamageTicks(final int ticks) {

    }

    @Override
    public double getLastDamage() {
        return 0;
    }

    @Override
    public void setLastDamage(final double damage) {

    }

    @Override
    public int getNoDamageTicks() {
        return 0;
    }

    @Override
    public void setNoDamageTicks(final int ticks) {

    }

    @Override
    public @Nullable Player getKiller() {
        return null;
    }

    @Override
    public void setKiller(@Nullable final Player killer) {

    }

    @Override
    public boolean addPotionEffect(@NotNull final PotionEffect effect) {
        return false;
    }

    @Override
    public boolean addPotionEffect(@NotNull final PotionEffect effect, final boolean force) {
        return false;
    }

    @Override
    public boolean addPotionEffects(@NotNull final Collection<PotionEffect> effects) {
        return false;
    }

    @Override
    public boolean hasPotionEffect(@NotNull final PotionEffectType type) {
        return false;
    }

    @Override
    public @Nullable PotionEffect getPotionEffect(@NotNull final PotionEffectType type) {
        return null;
    }

    @Override
    public void removePotionEffect(@NotNull final PotionEffectType type) {

    }

    @Override
    public @NotNull Collection<PotionEffect> getActivePotionEffects() {
        return null;
    }

    @Override
    public boolean hasLineOfSight(@NotNull final Entity other) {
        return false;
    }

    @Override
    public boolean hasLineOfSight(@NotNull final Location location) {
        return false;
    }

    @Override
    public boolean getRemoveWhenFarAway() {
        return false;
    }

    @Override
    public void setRemoveWhenFarAway(final boolean remove) {

    }

    @Override
    public @NotNull EntityEquipment getEquipment() {
        return null;
    }

    @Override
    public void setCanPickupItems(final boolean pickup) {

    }

    @Override
    public boolean getCanPickupItems() {
        return false;
    }

    @Override
    public boolean isLeashed() {
        return false;
    }

    @Override
    public @NotNull Entity getLeashHolder() throws IllegalStateException {
        return null;
    }

    @Override
    public boolean setLeashHolder(@Nullable final Entity holder) {
        return false;
    }

    @Override
    public boolean isGliding() {
        return false;
    }

    @Override
    public void setGliding(final boolean gliding) {

    }

    @Override
    public boolean isSwimming() {
        return false;
    }

    @Override
    public void setSwimming(final boolean swimming) {

    }

    @Override
    public boolean isRiptiding() {
        return false;
    }

    @Override
    public boolean isSleeping() {
        return false;
    }

    @Override
    public boolean isClimbing() {
        return false;
    }

    @Override
    public void setAI(final boolean ai) {

    }

    @Override
    public boolean hasAI() {
        return false;
    }

    @Override
    public void attack(@NotNull final Entity target) {

    }

    @Override
    public void swingMainHand() {

    }

    @Override
    public void swingOffHand() {

    }

    @Override
    public void setCollidable(final boolean collidable) {

    }

    @Override
    public boolean isCollidable() {
        return false;
    }

    @Override
    public @NotNull Set<UUID> getCollidableExemptions() {
        return null;
    }

    @Override
    public <T> @Nullable T getMemory(@NotNull final MemoryKey<T> memoryKey) {
        return null;
    }

    @Override
    public <T> void setMemory(@NotNull final MemoryKey<T> memoryKey, @Nullable final T memoryValue) {

    }

    @Override
    public @Nullable Sound getHurtSound() {
        return null;
    }

    @Override
    public @Nullable Sound getDeathSound() {
        return null;
    }

    @Override
    public @NotNull Sound getFallDamageSound(final int fallHeight) {
        return null;
    }

    @Override
    public @NotNull Sound getFallDamageSoundSmall() {
        return null;
    }

    @Override
    public @NotNull Sound getFallDamageSoundBig() {
        return null;
    }

    @Override
    public @NotNull Sound getDrinkingSound(@NotNull final ItemStack itemStack) {
        return null;
    }

    @Override
    public @NotNull Sound getEatingSound(@NotNull final ItemStack itemStack) {
        return null;
    }

    @Override
    public boolean canBreatheUnderwater() {
        return false;
    }

    @Override
    public @NotNull EntityCategory getCategory() {
        return null;
    }

    @Override
    public void setInvisible(final boolean invisible) {

    }

    @Override
    public boolean isInvisible() {
        return false;
    }

    @Override
    public int getArrowsStuck() {
        return 0;
    }

    @Override
    public void setArrowsStuck(final int arrows) {

    }

    @Override
    public int getShieldBlockingDelay() {
        return 0;
    }

    @Override
    public void setShieldBlockingDelay(final int delay) {

    }

    @Override
    public @NotNull ItemStack getActiveItem() {
        return null;
    }

    @Override
    public void clearActiveItem() {

    }

    @Override
    public int getItemUseRemainingTime() {
        return 0;
    }

    @Override
    public int getHandRaisedTime() {
        return 0;
    }

    @Override
    public @NotNull String getName() {
        return this.name;
    }

    @Override
    public @NotNull PlayerInventory getInventory() {
        return null;
    }

    @Override
    public @NotNull Inventory getEnderChest() {
        return null;
    }

    @Override
    public @NotNull MainHand getMainHand() {
        return null;
    }

    @Override
    public boolean setWindowProperty(final InventoryView.@NotNull Property prop, final int value) {
        return false;
    }

    @Override
    public @NotNull InventoryView getOpenInventory() {
        return null;
    }

    @Override
    public @Nullable InventoryView openInventory(@NotNull final Inventory inventory) {
        return null;
    }

    @Override
    public @Nullable InventoryView openWorkbench(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openEnchanting(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public void openInventory(@NotNull final InventoryView inventory) {

    }

    @Override
    public @Nullable InventoryView openMerchant(@NotNull final Villager trader, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openMerchant(@NotNull final Merchant merchant, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openAnvil(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openCartographyTable(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openGrindstone(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openLoom(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openSmithingTable(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public @Nullable InventoryView openStonecutter(@Nullable final Location location, final boolean force) {
        return null;
    }

    @Override
    public void closeInventory() {

    }

    @Override
    public void closeInventory(final InventoryCloseEvent.@NotNull Reason reason) {

    }

    @Override
    public @NotNull ItemStack getItemInHand() {
        return null;
    }

    @Override
    public void setItemInHand(@Nullable final ItemStack item) {

    }

    @Override
    public @NotNull ItemStack getItemOnCursor() {
        return null;
    }

    @Override
    public void setItemOnCursor(@Nullable final ItemStack item) {

    }

    @Override
    public boolean hasCooldown(@NotNull final Material material) {
        return false;
    }

    @Override
    public int getCooldown(@NotNull final Material material) {
        return 0;
    }

    @Override
    public void setCooldown(@NotNull final Material material, final int ticks) {

    }

    @Override
    public boolean isDeeplySleeping() {
        return false;
    }

    @Override
    public int getSleepTicks() {
        return 0;
    }

    @Override
    public @Nullable Location getPotentialBedLocation() {
        return null;
    }

    @Override
    public @Nullable FishHook getFishHook() {
        return null;
    }

    @Override
    public boolean sleep(@NotNull final Location location, final boolean force) {
        return false;
    }

    @Override
    public void wakeup(final boolean setSpawnLocation) {

    }

    @Override
    public @NotNull Location getBedLocation() {
        return null;
    }

    @Override
    public @NotNull GameMode getGameMode() {
        return null;
    }

    @Override
    public void setGameMode(@NotNull final GameMode mode) {

    }

    @Override
    public boolean isBlocking() {
        return false;
    }

    @Override
    public boolean isHandRaised() {
        return false;
    }

    @Override
    public @NotNull EquipmentSlot getHandRaised() {
        return null;
    }

    @Override
    public boolean isJumping() {
        return false;
    }

    @Override
    public void setJumping(final boolean jumping) {

    }

    @Override
    public void playPickupItemAnimation(@NotNull final Item item, final int quantity) {

    }

    @Override
    public float getHurtDirection() {
        return 0;
    }

    @Override
    public void setHurtDirection(final float hurtDirection) {

    }

    @Override
    public void knockback(final double strength, final double directionX, final double directionZ) {

    }

    @Override
    public @Nullable ItemStack getItemInUse() {
        return null;
    }

    @Override
    public int getExpToLevel() {
        return 0;
    }

    @Override
    public @Nullable Entity releaseLeftShoulderEntity() {
        return null;
    }

    @Override
    public @Nullable Entity releaseRightShoulderEntity() {
        return null;
    }

    @Override
    public float getAttackCooldown() {
        return 0;
    }

    @Override
    public boolean discoverRecipe(@NotNull final NamespacedKey recipe) {
        return false;
    }

    @Override
    public int discoverRecipes(@NotNull final Collection<NamespacedKey> recipes) {
        return 0;
    }

    @Override
    public boolean undiscoverRecipe(@NotNull final NamespacedKey recipe) {
        return false;
    }

    @Override
    public int undiscoverRecipes(@NotNull final Collection<NamespacedKey> recipes) {
        return 0;
    }

    @Override
    public boolean hasDiscoveredRecipe(@NotNull final NamespacedKey recipe) {
        return false;
    }

    @Override
    public @NotNull Set<NamespacedKey> getDiscoveredRecipes() {
        return null;
    }

    @Override
    public @Nullable Entity getShoulderEntityLeft() {
        return null;
    }

    @Override
    public void setShoulderEntityLeft(@Nullable final Entity entity) {

    }

    @Override
    public @Nullable Entity getShoulderEntityRight() {
        return null;
    }

    @Override
    public void setShoulderEntityRight(@Nullable final Entity entity) {

    }

    @Override
    public @NotNull String getDisplayName() {
        return null;
    }

    @Override
    public void setDisplayName(@Nullable final String name) {

    }

    @Override
    public void playerListName(@Nullable final Component name) {

    }

    @Override
    public @NotNull Component playerListName() {
        return null;
    }

    @Override
    public @Nullable Component playerListHeader() {
        return null;
    }

    @Override
    public @Nullable Component playerListFooter() {
        return null;
    }

    @Override
    public @NotNull String getPlayerListName() {
        return null;
    }

    @Override
    public void setPlayerListName(@Nullable final String name) {

    }

    @Override
    public @Nullable String getPlayerListHeader() {
        return null;
    }

    @Override
    public @Nullable String getPlayerListFooter() {
        return null;
    }

    @Override
    public void setPlayerListHeader(@Nullable final String header) {

    }

    @Override
    public void setPlayerListFooter(@Nullable final String footer) {

    }

    @Override
    public void setPlayerListHeaderFooter(@Nullable final String header, @Nullable final String footer) {

    }

    @Override
    public void setCompassTarget(@NotNull final Location loc) {

    }

    @Override
    public @NotNull Location getCompassTarget() {
        return null;
    }

    @Override
    public @Nullable InetSocketAddress getAddress() {
        return null;
    }

    @Override
    public int getProtocolVersion() {
        return 0;
    }

    @Override
    public @Nullable InetSocketAddress getVirtualHost() {
        return null;
    }

    @Override
    public boolean isConversing() {
        return false;
    }

    @Override
    public void acceptConversationInput(@NotNull final String input) {

    }

    @Override
    public boolean beginConversation(@NotNull final Conversation conversation) {
        return false;
    }

    @Override
    public void abandonConversation(@NotNull final Conversation conversation) {

    }

    @Override
    public void abandonConversation(@NotNull final Conversation conversation, @NotNull final ConversationAbandonedEvent details) {

    }

    @Override
    public void sendRawMessage(@NotNull final String message) {

    }

    @Override
    public void sendRawMessage(@Nullable final UUID sender, @NotNull final String message) {

    }

    @Override
    public void kickPlayer(@Nullable final String message) {

    }

    @Override
    public void kick() {

    }

    @Override
    public void kick(@Nullable final Component message) {

    }

    @Override
    public void kick(@Nullable final Component message, final PlayerKickEvent.@NotNull Cause cause) {

    }

    @Override
    public void chat(@NotNull final String msg) {

    }

    @Override
    public boolean performCommand(@NotNull final String command) {
        return false;
    }

    @Override
    public @NotNull Location getLocation() {
        return null;
    }

    @Override
    public @Nullable Location getLocation(@Nullable final Location loc) {
        return null;
    }

    @Override
    public void setVelocity(@NotNull final Vector velocity) {

    }

    @Override
    public @NotNull Vector getVelocity() {
        return null;
    }

    @Override
    public double getHeight() {
        return 0;
    }

    @Override
    public double getWidth() {
        return 0;
    }

    @Override
    public @NotNull BoundingBox getBoundingBox() {
        return null;
    }

    @Override
    public boolean isOnGround() {
        return false;
    }

    @Override
    public boolean isInWater() {
        return false;
    }

    @Override
    public @NotNull World getWorld() {
        return null;
    }

    @Override
    public boolean isSneaking() {
        return false;
    }

    @Override
    public void setSneaking(final boolean sneak) {

    }

    @Override
    public boolean isSprinting() {
        return false;
    }

    @Override
    public void setSprinting(final boolean sprinting) {

    }

    @Override
    public void saveData() {

    }

    @Override
    public void loadData() {

    }

    @Override
    public void setSleepingIgnored(final boolean isSleeping) {

    }

    @Override
    public boolean isSleepingIgnored() {
        return false;
    }

    @Override
    public @Nullable Location getBedSpawnLocation() {
        return null;
    }

    @Override
    public long getLastLogin() {
        return 0;
    }

    @Override
    public long getLastSeen() {
        return 0;
    }

    @Override
    public void incrementStatistic(@NotNull final Statistic statistic) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull final Statistic statistic) throws IllegalArgumentException {

    }

    @Override
    public void incrementStatistic(@NotNull final Statistic statistic, final int amount) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull final Statistic statistic, final int amount) throws IllegalArgumentException {

    }

    @Override
    public void setStatistic(@NotNull final Statistic statistic, final int newValue) throws IllegalArgumentException {

    }

    @Override
    public int getStatistic(@NotNull final Statistic statistic) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public void incrementStatistic(@NotNull final Statistic statistic, @NotNull final Material material) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull final Statistic statistic, @NotNull final Material material) throws IllegalArgumentException {

    }

    @Override
    public int getStatistic(@NotNull final Statistic statistic, @NotNull final Material material) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public void incrementStatistic(@NotNull final Statistic statistic, @NotNull final Material material, final int amount) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull final Statistic statistic, @NotNull final Material material, final int amount) throws IllegalArgumentException {

    }

    @Override
    public void setStatistic(@NotNull final Statistic statistic, @NotNull final Material material, final int newValue) throws IllegalArgumentException {

    }

    @Override
    public void incrementStatistic(@NotNull final Statistic statistic, @NotNull final EntityType entityType) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull final Statistic statistic, @NotNull final EntityType entityType) throws IllegalArgumentException {

    }

    @Override
    public int getStatistic(@NotNull final Statistic statistic, @NotNull final EntityType entityType) throws IllegalArgumentException {
        return 0;
    }

    @Override
    public void incrementStatistic(@NotNull final Statistic statistic, @NotNull final EntityType entityType, final int amount) throws IllegalArgumentException {

    }

    @Override
    public void decrementStatistic(@NotNull final Statistic statistic, @NotNull final EntityType entityType, final int amount) {

    }

    @Override
    public void setStatistic(@NotNull final Statistic statistic, @NotNull final EntityType entityType, final int newValue) {

    }

    @Override
    public void setBedSpawnLocation(@Nullable final Location location) {

    }

    @Override
    public void setBedSpawnLocation(@Nullable final Location location, final boolean force) {

    }

    @Override
    public void playNote(@NotNull final Location loc, final byte instrument, final byte note) {

    }

    @Override
    public void playNote(@NotNull final Location loc, @NotNull final Instrument instrument, @NotNull final Note note) {

    }

    @Override
    public void playSound(@NotNull final Location location, @NotNull final Sound sound, final float volume, final float pitch) {

    }

    @Override
    public void playSound(@NotNull final Location location, @NotNull final String sound, final float volume, final float pitch) {

    }

    @Override
    public void playSound(@NotNull final Location location, @NotNull final Sound sound, @NotNull final SoundCategory category, final float volume, final float pitch) {

    }

    @Override
    public void playSound(@NotNull final Location location, @NotNull final String sound, @NotNull final SoundCategory category, final float volume, final float pitch) {

    }

    @Override
    public void playSound(@NotNull final Entity entity, @NotNull final Sound sound, final float volume, final float pitch) {

    }

    @Override
    public void playSound(@NotNull final Entity entity, @NotNull final Sound sound, @NotNull final SoundCategory category, final float volume, final float pitch) {

    }

    @Override
    public void stopSound(@NotNull final Sound sound) {

    }

    @Override
    public void stopSound(@NotNull final String sound) {

    }

    @Override
    public void stopSound(@NotNull final Sound sound, @Nullable final SoundCategory category) {

    }

    @Override
    public void stopSound(@NotNull final String sound, @Nullable final SoundCategory category) {

    }

    @Override
    public void stopSound(@NotNull final SoundCategory category) {

    }

    @Override
    public void stopAllSounds() {

    }

    @Override
    public void playEffect(@NotNull final Location loc, @NotNull final Effect effect, final int data) {

    }

    @Override
    public <T> void playEffect(@NotNull final Location loc, @NotNull final Effect effect, @Nullable final T data) {

    }

    @Override
    public boolean breakBlock(@NotNull final Block block) {
        return false;
    }

    @Override
    public void sendBlockChange(@NotNull final Location loc, @NotNull final Material material, final byte data) {

    }

    @Override
    public void sendBlockChange(@NotNull final Location loc, @NotNull final BlockData block) {

    }

    @Override
    public void sendBlockChanges(@NotNull final Collection<BlockState> blocks, final boolean suppressLightUpdates) {

    }

    @Override
    public void sendBlockDamage(@NotNull final Location loc, final float progress) {

    }

    @Override
    public void sendBlockDamage(@NotNull final Location loc, final float progress, final int destroyerIdentity) {

    }

    @Override
    public void sendMultiBlockChange(@NotNull final Map<Location, BlockData> blockChanges, final boolean suppressLightUpdates) {

    }

    @Override
    public void sendEquipmentChange(@NotNull final LivingEntity entity, @NotNull final EquipmentSlot slot, @NotNull final ItemStack item) {

    }

    @Override
    public void sendSignChange(@NotNull final Location loc, @Nullable final List<Component> lines, @NotNull final DyeColor dyeColor, final boolean hasGlowingText) throws IllegalArgumentException {

    }

    @Override
    public void sendSignChange(@NotNull final Location loc, @Nullable final String[] lines) throws IllegalArgumentException {

    }

    @Override
    public void sendSignChange(@NotNull final Location loc, @Nullable final String[] lines, @NotNull final DyeColor dyeColor) throws IllegalArgumentException {

    }

    @Override
    public void sendSignChange(@NotNull final Location loc, @Nullable final String[] lines, @NotNull final DyeColor dyeColor, final boolean hasGlowingText) throws IllegalArgumentException {

    }

    @Override
    public void sendMap(@NotNull final MapView map) {

    }

    @Override
    public void sendActionBar(@NotNull final String message) {

    }

    @Override
    public void sendActionBar(final char alternateChar, @NotNull final String message) {

    }

    @Override
    public void sendActionBar(@NotNull final BaseComponent... message) {

    }

    @Override
    public void setPlayerListHeaderFooter(@Nullable final BaseComponent[] header, @Nullable final BaseComponent[] footer) {

    }

    @Override
    public void setPlayerListHeaderFooter(@Nullable final BaseComponent header, @Nullable final BaseComponent footer) {

    }

    @Override
    public void setTitleTimes(final int fadeInTicks, final int stayTicks, final int fadeOutTicks) {

    }

    @Override
    public void setSubtitle(final BaseComponent[] subtitle) {

    }

    @Override
    public void setSubtitle(final BaseComponent subtitle) {

    }

    @Override
    public void showTitle(@Nullable final BaseComponent[] title) {

    }

    @Override
    public void showTitle(@Nullable final BaseComponent title) {

    }

    @Override
    public void showTitle(@Nullable final BaseComponent[] title, @Nullable final BaseComponent[] subtitle, final int fadeInTicks, final int stayTicks, final int fadeOutTicks) {

    }

    @Override
    public void showTitle(@Nullable final BaseComponent title, @Nullable final BaseComponent subtitle, final int fadeInTicks, final int stayTicks, final int fadeOutTicks) {

    }

    @Override
    public void sendTitle(@NotNull final Title title) {

    }

    @Override
    public void updateTitle(@NotNull final Title title) {

    }

    @Override
    public void hideTitle() {

    }

    @Override
    public void updateInventory() {

    }

    @Override
    public @Nullable GameMode getPreviousGameMode() {
        return null;
    }

    @Override
    public void setPlayerTime(final long time, final boolean relative) {

    }

    @Override
    public long getPlayerTime() {
        return 0;
    }

    @Override
    public long getPlayerTimeOffset() {
        return 0;
    }

    @Override
    public boolean isPlayerTimeRelative() {
        return false;
    }

    @Override
    public void resetPlayerTime() {

    }

    @Override
    public void setPlayerWeather(@NotNull final WeatherType type) {

    }

    @Override
    public @Nullable WeatherType getPlayerWeather() {
        return null;
    }

    @Override
    public void resetPlayerWeather() {

    }

    @Override
    public void giveExp(final int amount, final boolean applyMending) {

    }

    @Override
    public int applyMending(final int amount) {
        return 0;
    }

    @Override
    public void giveExpLevels(final int amount) {

    }

    @Override
    public float getExp() {
        return 0;
    }

    @Override
    public void setExp(final float exp) {

    }

    @Override
    public int getLevel() {
        return 0;
    }

    @Override
    public void setLevel(final int level) {

    }

    @Override
    public int getTotalExperience() {
        return 0;
    }

    @Override
    public void setTotalExperience(final int exp) {

    }

    @Override
    public void sendExperienceChange(final float progress) {

    }

    @Override
    public void sendExperienceChange(final float progress, final int level) {

    }

    @Override
    public boolean getAllowFlight() {
        return false;
    }

    @Override
    public void setAllowFlight(final boolean flight) {

    }

    @Override
    public void hidePlayer(@NotNull final Player player) {

    }

    @Override
    public void hidePlayer(@NotNull final Plugin plugin, @NotNull final Player player) {

    }

    @Override
    public void showPlayer(@NotNull final Player player) {

    }

    @Override
    public void showPlayer(@NotNull final Plugin plugin, @NotNull final Player player) {

    }

    @Override
    public boolean canSee(@NotNull final Player player) {
        return false;
    }

    @Override
    public void hideEntity(@NotNull final Plugin plugin, @NotNull final Entity entity) {

    }

    @Override
    public void showEntity(@NotNull final Plugin plugin, @NotNull final Entity entity) {

    }

    @Override
    public boolean canSee(@NotNull final Entity entity) {
        return false;
    }

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public void setFlying(final boolean value) {

    }

    @Override
    public void setFlySpeed(final float value) throws IllegalArgumentException {

    }

    @Override
    public void setWalkSpeed(final float value) throws IllegalArgumentException {

    }

    @Override
    public float getFlySpeed() {
        return 0;
    }

    @Override
    public float getWalkSpeed() {
        return 0;
    }

    @Override
    public void setTexturePack(@NotNull final String url) {

    }

    @Override
    public void setResourcePack(@NotNull final String url) {

    }

    @Override
    public void setResourcePack(@NotNull final String url, @Nullable final byte[] hash) {

    }

    @Override
    public void setResourcePack(@NotNull final String url, @Nullable final byte[] hash, @Nullable final String prompt) {

    }

    @Override
    public void setResourcePack(@NotNull final String url, @Nullable final byte[] hash, final boolean force) {

    }

    @Override
    public void setResourcePack(@NotNull final String url, @Nullable final byte[] hash, @Nullable final String prompt, final boolean force) {

    }

    @Override
    public void setResourcePack(@NotNull final String url, final byte @Nullable [] hash, @Nullable final Component prompt, final boolean force) {

    }

    @Override
    public @NotNull Scoreboard getScoreboard() {
        return null;
    }

    @Override
    public void setScoreboard(@NotNull final Scoreboard scoreboard) throws IllegalArgumentException, IllegalStateException {

    }

    @Override
    public @Nullable WorldBorder getWorldBorder() {
        return null;
    }

    @Override
    public void setWorldBorder(@Nullable final WorldBorder border) {

    }

    @Override
    public boolean isHealthScaled() {
        return false;
    }

    @Override
    public void setHealthScaled(final boolean scale) {

    }

    @Override
    public void setHealthScale(final double scale) throws IllegalArgumentException {

    }

    @Override
    public double getHealthScale() {
        return 0;
    }

    @Override
    public void sendHealthUpdate(final double health, final int foodLevel, final float saturationLevel) {

    }

    @Override
    public void sendHealthUpdate() {

    }

    @Override
    public @Nullable Entity getSpectatorTarget() {
        return null;
    }

    @Override
    public void setSpectatorTarget(@Nullable final Entity entity) {

    }

    @Override
    public void sendTitle(@Nullable final String title, @Nullable final String subtitle) {

    }

    @Override
    public void sendTitle(@Nullable final String title, @Nullable final String subtitle, final int fadeIn, final int stay, final int fadeOut) {

    }

    @Override
    public void resetTitle() {

    }

    @Override
    public void spawnParticle(@NotNull final Particle particle, @NotNull final Location location, final int count) {

    }

    @Override
    public void spawnParticle(@NotNull final Particle particle, final double x, final double y, final double z, final int count) {

    }

    @Override
    public <T> void spawnParticle(@NotNull final Particle particle, @NotNull final Location location, final int count, @Nullable final T data) {

    }

    @Override
    public <T> void spawnParticle(@NotNull final Particle particle, final double x, final double y, final double z, final int count, @Nullable final T data) {

    }

    @Override
    public void spawnParticle(@NotNull final Particle particle, @NotNull final Location location, final int count, final double offsetX, final double offsetY, final double offsetZ) {

    }

    @Override
    public void spawnParticle(@NotNull final Particle particle, final double x, final double y, final double z, final int count, final double offsetX, final double offsetY, final double offsetZ) {

    }

    @Override
    public <T> void spawnParticle(@NotNull final Particle particle, @NotNull final Location location, final int count, final double offsetX, final double offsetY, final double offsetZ, @Nullable final T data) {

    }

    @Override
    public <T> void spawnParticle(@NotNull final Particle particle, final double x, final double y, final double z, final int count, final double offsetX, final double offsetY, final double offsetZ, @Nullable final T data) {

    }

    @Override
    public void spawnParticle(@NotNull final Particle particle, @NotNull final Location location, final int count, final double offsetX, final double offsetY, final double offsetZ, final double extra) {

    }

    @Override
    public void spawnParticle(@NotNull final Particle particle, final double x, final double y, final double z, final int count, final double offsetX, final double offsetY, final double offsetZ, final double extra) {

    }

    @Override
    public <T> void spawnParticle(@NotNull final Particle particle, @NotNull final Location location, final int count, final double offsetX, final double offsetY, final double offsetZ, final double extra, @Nullable final T data) {

    }

    @Override
    public <T> void spawnParticle(@NotNull final Particle particle, final double x, final double y, final double z, final int count, final double offsetX, final double offsetY, final double offsetZ, final double extra, @Nullable final T data) {

    }

    @Override
    public @NotNull AdvancementProgress getAdvancementProgress(@NotNull final Advancement advancement) {
        return null;
    }

    @Override
    public int getClientViewDistance() {
        return 0;
    }

    @Override
    public @NotNull Locale locale() {
        return null;
    }

    @Override
    public int getPing() {
        return 0;
    }

    @Override
    public @NotNull String getLocale() {
        return null;
    }

    @Override
    public boolean getAffectsSpawning() {
        return false;
    }

    @Override
    public void setAffectsSpawning(final boolean affects) {

    }

    @Override
    public int getViewDistance() {
        return 0;
    }

    @Override
    public void setViewDistance(final int viewDistance) {

    }

    @Override
    public int getSimulationDistance() {
        return 0;
    }

    @Override
    public void setSimulationDistance(final int simulationDistance) {

    }

    @Override
    public int getNoTickViewDistance() {
        return 0;
    }

    @Override
    public void setNoTickViewDistance(final int viewDistance) {

    }

    @Override
    public int getSendViewDistance() {
        return 0;
    }

    @Override
    public void setSendViewDistance(final int viewDistance) {

    }

    @Override
    public void updateCommands() {

    }

    @Override
    public void openBook(@NotNull final ItemStack book) {

    }

    @Override
    public void openSign(@NotNull final Sign sign) {

    }

    @Override
    public boolean dropItem(final boolean dropAll) {
        return false;
    }

    @Override
    public float getExhaustion() {
        return 0;
    }

    @Override
    public void setExhaustion(final float value) {

    }

    @Override
    public float getSaturation() {
        return 0;
    }

    @Override
    public void setSaturation(final float value) {

    }

    @Override
    public int getFoodLevel() {
        return 0;
    }

    @Override
    public void setFoodLevel(final int value) {

    }

    @Override
    public int getSaturatedRegenRate() {
        return 0;
    }

    @Override
    public void setSaturatedRegenRate(final int ticks) {

    }

    @Override
    public int getUnsaturatedRegenRate() {
        return 0;
    }

    @Override
    public void setUnsaturatedRegenRate(final int ticks) {

    }

    @Override
    public int getStarvationRate() {
        return 0;
    }

    @Override
    public void setStarvationRate(final int ticks) {

    }

    @Override
    public @Nullable Location getLastDeathLocation() {
        return null;
    }

    @Override
    public void setLastDeathLocation(@Nullable final Location location) {

    }

    @Override
    public @Nullable Firework fireworkBoost(@NotNull final ItemStack fireworkItemStack) {
        return null;
    }

    @Override
    public void showDemoScreen() {

    }

    @Override
    public boolean isAllowingServerListings() {
        return false;
    }

    @Override
    public void setResourcePack(@NotNull final String url, @NotNull final String hash) {

    }

    @Override
    public void setResourcePack(@NotNull final String url, @NotNull final String hash, final boolean required) {

    }

    @Override
    public void setResourcePack(@NotNull final String url, @NotNull final String hash, final boolean required, @Nullable final Component resourcePackPrompt) {

    }

    @Override
    public PlayerResourcePackStatusEvent.@Nullable Status getResourcePackStatus() {
        return null;
    }

    @Override
    public @Nullable String getResourcePackHash() {
        return null;
    }

    @Override
    public boolean hasResourcePack() {
        return false;
    }

    @Override
    public @NotNull PlayerProfile getPlayerProfile() {
        return null;
    }

    @Override
    public boolean isBanned() {
        return false;
    }

    @Override
    public boolean isWhitelisted() {
        return false;
    }

    @Override
    public void setWhitelisted(final boolean value) {

    }

    @Override
    public @Nullable Player getPlayer() {
        return null;
    }

    @Override
    public long getFirstPlayed() {
        return 0;
    }

    @Override
    public long getLastPlayed() {
        return 0;
    }

    @Override
    public boolean hasPlayedBefore() {
        return false;
    }

    @Override
    public void setPlayerProfile(@NotNull final PlayerProfile profile) {

    }

    @Override
    public float getCooldownPeriod() {
        return 0;
    }

    @Override
    public float getCooledAttackStrength(final float adjustTicks) {
        return 0;
    }

    @Override
    public void resetCooldown() {

    }

    @Override
    public <T> @NotNull T getClientOption(@NotNull final ClientOption<T> option) {
        return null;
    }

    @Override
    public @Nullable Firework boostElytra(@NotNull final ItemStack firework) {
        return null;
    }

    @Override
    public void sendOpLevel(final byte level) {

    }

    @Override
    public void addAdditionalChatCompletions(@NotNull final Collection<String> completions) {

    }

    @Override
    public void removeAdditionalChatCompletions(@NotNull final Collection<String> completions) {

    }

    @Override
    public @Nullable String getClientBrandName() {
        return null;
    }

    @Override
    public void setRotation(final float yaw, final float pitch) {

    }

    @Override
    public boolean teleport(@NotNull final Location location, final PlayerTeleportEvent.@NotNull TeleportCause cause, final boolean ignorePassengers, final boolean dismount) {
        return false;
    }

    @Override
    public boolean teleport(@NotNull final Location location) {
        return false;
    }

    @Override
    public boolean teleport(@NotNull final Location location, final PlayerTeleportEvent.@NotNull TeleportCause cause) {
        return false;
    }

    @Override
    public boolean teleport(@NotNull final Entity destination) {
        return false;
    }

    @Override
    public boolean teleport(@NotNull final Entity destination, final PlayerTeleportEvent.@NotNull TeleportCause cause) {
        return false;
    }

    @Override
    public @NotNull List<Entity> getNearbyEntities(final double x, final double y, final double z) {
        return null;
    }

    @Override
    public int getEntityId() {
        return this.id;
    }

    @Override
    public int getFireTicks() {
        return 0;
    }

    @Override
    public int getMaxFireTicks() {
        return 0;
    }

    @Override
    public void setFireTicks(final int ticks) {

    }

    @Override
    public void setVisualFire(final boolean fire) {

    }

    @Override
    public boolean isVisualFire() {
        return false;
    }

    @Override
    public int getFreezeTicks() {
        return 0;
    }

    @Override
    public int getMaxFreezeTicks() {
        return 0;
    }

    @Override
    public void setFreezeTicks(final int ticks) {

    }

    @Override
    public boolean isFrozen() {
        return false;
    }

    @Override
    public boolean isFreezeTickingLocked() {
        return false;
    }

    @Override
    public void lockFreezeTicks(final boolean locked) {

    }

    @Override
    public void remove() {

    }

    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void sendMessage(@NotNull final String message) {

    }

    @Override
    public void sendMessage(@NotNull final String... messages) {

    }

    @Override
    public void sendMessage(@Nullable final UUID sender, @NotNull final String message) {

    }

    @Override
    public void sendMessage(@Nullable final UUID sender, @NotNull final String... messages) {

    }

    @Override
    public @NotNull Server getServer() {
        return null;
    }

    @Override
    public boolean isPersistent() {
        return false;
    }

    @Override
    public void setPersistent(final boolean persistent) {

    }

    @Override
    public @Nullable Entity getPassenger() {
        return null;
    }

    @Override
    public boolean setPassenger(@NotNull final Entity passenger) {
        return false;
    }

    @Override
    public @NotNull List<Entity> getPassengers() {
        return null;
    }

    @Override
    public boolean addPassenger(@NotNull final Entity passenger) {
        return false;
    }

    @Override
    public boolean removePassenger(@NotNull final Entity passenger) {
        return false;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean eject() {
        return false;
    }

    @Override
    public float getFallDistance() {
        return 0;
    }

    @Override
    public void setFallDistance(final float distance) {

    }

    @Override
    public void setLastDamageCause(@Nullable final EntityDamageEvent event) {

    }

    @Override
    public @Nullable EntityDamageEvent getLastDamageCause() {
        return null;
    }

    @Override
    public @NotNull UUID getUniqueId() {
        return null;
    }

    @Override
    public int getTicksLived() {
        return 0;
    }

    @Override
    public void setTicksLived(final int value) {

    }

    @Override
    public void playEffect(@NotNull final EntityEffect type) {

    }

    @Override
    public @NotNull EntityType getType() {
        return null;
    }

    @Override
    public @NotNull Sound getSwimSound() {
        return null;
    }

    @Override
    public @NotNull Sound getSwimSplashSound() {
        return null;
    }

    @Override
    public @NotNull Sound getSwimHighSpeedSplashSound() {
        return null;
    }

    @Override
    public boolean isInsideVehicle() {
        return false;
    }

    @Override
    public boolean leaveVehicle() {
        return false;
    }

    @Override
    public @Nullable Entity getVehicle() {
        return null;
    }

    @Override
    public void setCustomNameVisible(final boolean flag) {

    }

    @Override
    public boolean isCustomNameVisible() {
        return false;
    }

    @Override
    public void setGlowing(final boolean flag) {

    }

    @Override
    public boolean isGlowing() {
        return false;
    }

    @Override
    public void setInvulnerable(final boolean flag) {

    }

    @Override
    public boolean isInvulnerable() {
        return false;
    }

    @Override
    public boolean isSilent() {
        return false;
    }

    @Override
    public void setSilent(final boolean flag) {

    }

    @Override
    public boolean hasGravity() {
        return false;
    }

    @Override
    public void setGravity(final boolean gravity) {

    }

    @Override
    public int getPortalCooldown() {
        return 0;
    }

    @Override
    public void setPortalCooldown(final int cooldown) {

    }

    @Override
    public @NotNull Set<String> getScoreboardTags() {
        return null;
    }

    @Override
    public boolean addScoreboardTag(@NotNull final String tag) {
        return false;
    }

    @Override
    public boolean removeScoreboardTag(@NotNull final String tag) {
        return false;
    }

    @Override
    public @NotNull PistonMoveReaction getPistonMoveReaction() {
        return null;
    }

    @Override
    public @NotNull BlockFace getFacing() {
        return null;
    }

    @Override
    public @NotNull Pose getPose() {
        return null;
    }

    @Override
    public @NotNull SpawnCategory getSpawnCategory() {
        return null;
    }

    @Override
    public boolean teleport(@NotNull final Location location, final PlayerTeleportEvent.@NotNull TeleportCause cause, final boolean ignorePassengers, final boolean dismount, @NotNull final RelativeTeleportFlag @NotNull ... teleportFlags) {
        return false;
    }

    @Override
    public void lookAt(final double x, final double y, final double z, @NotNull final LookAnchor playerAnchor) {

    }

    @Override
    public void lookAt(@NotNull final Entity entity, @NotNull final LookAnchor playerAnchor, @NotNull final LookAnchor entityAnchor) {

    }

    @Override
    public void showElderGuardian(final boolean silent) {

    }

    @Override
    public @NotNull Spigot spigot() {
        return null;
    }

    @Override
    public @NotNull Component name() {
        return null;
    }

    @Override
    public @NotNull Component teamDisplayName() {
        return null;
    }

    @Override
    public @Nullable Location getOrigin() {
        return null;
    }

    @Override
    public boolean fromMobSpawner() {
        return false;
    }

    @Override
    public CreatureSpawnEvent.@NotNull SpawnReason getEntitySpawnReason() {
        return null;
    }

    @Override
    public boolean isUnderWater() {
        return false;
    }

    @Override
    public boolean isInRain() {
        return false;
    }

    @Override
    public boolean isInBubbleColumn() {
        return false;
    }

    @Override
    public boolean isInWaterOrRain() {
        return false;
    }

    @Override
    public boolean isInWaterOrBubbleColumn() {
        return false;
    }

    @Override
    public boolean isInWaterOrRainOrBubbleColumn() {
        return false;
    }

    @Override
    public boolean isInLava() {
        return false;
    }

    @Override
    public boolean isTicking() {
        return false;
    }

    @Override
    public @NotNull Set<Player> getTrackedPlayers() {
        return null;
    }

    @Override
    public boolean spawnAt(@NotNull final Location location, final CreatureSpawnEvent.@NotNull SpawnReason reason) {
        return false;
    }

    @Override
    public boolean isInPowderedSnow() {
        return false;
    }

    @Override
    public boolean collidesAt(@NotNull final Location location) {
        return false;
    }

    @Override
    public boolean wouldCollideUsing(@NotNull final BoundingBox boundingBox) {
        return false;
    }

    @Override
    public @NotNull Map<String, Object> serialize() {
        return null;
    }

    @Override
    public @Nullable AttributeInstance getAttribute(@NotNull final Attribute attribute) {
        return null;
    }

    @Override
    public void registerAttribute(@NotNull final Attribute attribute) {

    }

    @Override
    public void damage(final double amount) {

    }

    @Override
    public void damage(final double amount, @Nullable final Entity source) {

    }

    @Override
    public double getHealth() {
        return 0;
    }

    @Override
    public void setHealth(final double health) {

    }

    @Override
    public double getAbsorptionAmount() {
        return 0;
    }

    @Override
    public void setAbsorptionAmount(final double amount) {

    }

    @Override
    public double getMaxHealth() {
        return 0;
    }

    @Override
    public void setMaxHealth(final double health) {

    }

    @Override
    public void resetMaxHealth() {

    }

    @Override
    public @Nullable Component customName() {
        return null;
    }

    @Override
    public void customName(@Nullable final Component customName) {

    }

    @Override
    public @Nullable String getCustomName() {
        return null;
    }

    @Override
    public void setCustomName(@Nullable final String name) {

    }

    @Override
    public void setMetadata(@NotNull final String metadataKey, @NotNull final MetadataValue newMetadataValue) {

    }

    @Override
    public @NotNull List<MetadataValue> getMetadata(@NotNull final String metadataKey) {
        return null;
    }

    @Override
    public boolean hasMetadata(@NotNull final String metadataKey) {
        return false;
    }

    @Override
    public void removeMetadata(@NotNull final String metadataKey, @NotNull final Plugin owningPlugin) {

    }

    @Override
    public boolean isPermissionSet(@NotNull final String name) {
        return false;
    }

    @Override
    public boolean isPermissionSet(@NotNull final Permission perm) {
        return false;
    }

    @Override
    public boolean hasPermission(@NotNull final String name) {
        return false;
    }

    @Override
    public boolean hasPermission(@NotNull final Permission perm) {
        return false;
    }

    @Override
    public @NotNull PermissionAttachment addAttachment(@NotNull final Plugin plugin, @NotNull final String name, final boolean value) {
        return null;
    }

    @Override
    public @NotNull PermissionAttachment addAttachment(@NotNull final Plugin plugin) {
        return null;
    }

    @Override
    public @Nullable PermissionAttachment addAttachment(@NotNull final Plugin plugin, @NotNull final String name, final boolean value, final int ticks) {
        return null;
    }

    @Override
    public @Nullable PermissionAttachment addAttachment(@NotNull final Plugin plugin, final int ticks) {
        return null;
    }

    @Override
    public void removeAttachment(@NotNull final PermissionAttachment attachment) {

    }

    @Override
    public void recalculatePermissions() {

    }

    @Override
    public @NotNull Set<PermissionAttachmentInfo> getEffectivePermissions() {
        return null;
    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public void setOp(final boolean value) {

    }

    @Override
    public @NotNull PersistentDataContainer getPersistentDataContainer() {
        return null;
    }

    @Override
    public void sendPluginMessage(@NotNull final Plugin source, @NotNull final String channel, @NotNull final byte[] message) {

    }

    @Override
    public @NotNull Set<String> getListeningPluginChannels() {
        return null;
    }

    @Override
    public <T extends Projectile> @NotNull T launchProjectile(@NotNull final Class<? extends T> projectile) {
        return null;
    }

    @Override
    public <T extends Projectile> @NotNull T launchProjectile(@NotNull final Class<? extends T> projectile, @Nullable final Vector velocity) {
        return null;
    }

    @Override
    public <T extends Projectile> @NotNull T launchProjectile(@NotNull final Class<? extends T> projectile, @Nullable final Vector velocity, @Nullable final Consumer<T> function) {
        return null;
    }
}
