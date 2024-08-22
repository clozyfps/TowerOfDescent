package net.mcreator.layersofdescent.network;

import net.minecraftforge.network.PacketDistributor;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.common.util.LazyOptional;
import net.minecraftforge.common.util.FakePlayer;
import net.minecraftforge.common.capabilities.RegisterCapabilitiesEvent;
import net.minecraftforge.common.capabilities.ICapabilitySerializable;
import net.minecraftforge.common.capabilities.CapabilityToken;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.common.capabilities.Capability;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.nbt.Tag;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.Direction;
import net.minecraft.client.Minecraft;

import net.mcreator.layersofdescent.LayersofdescentMod;

import java.util.function.Supplier;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class LayersofdescentModVariables {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		LayersofdescentMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	@SubscribeEvent
	public static void init(RegisterCapabilitiesEvent event) {
		event.register(PlayerVariables.class);
	}

	@Mod.EventBusSubscriber
	public static class EventBusVariableHandlers {
		@SubscribeEvent
		public static void onPlayerLoggedInSyncPlayerVariables(PlayerEvent.PlayerLoggedInEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerRespawnedSyncPlayerVariables(PlayerEvent.PlayerRespawnEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void onPlayerChangedDimensionSyncPlayerVariables(PlayerEvent.PlayerChangedDimensionEvent event) {
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}

		@SubscribeEvent
		public static void clonePlayer(PlayerEvent.Clone event) {
			event.getOriginal().revive();
			PlayerVariables original = ((PlayerVariables) event.getOriginal().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			PlayerVariables clone = ((PlayerVariables) event.getEntity().getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
			clone.WithinHell = original.WithinHell;
			clone.ScreenText = original.ScreenText;
			clone.ScreenTextTimer = original.ScreenTextTimer;
			clone.ScreenTextStage = original.ScreenTextStage;
			clone.ScreenTextPauseTime = original.ScreenTextPauseTime;
			clone.SelectedColorCode = original.SelectedColorCode;
			clone.PlayerClass = original.PlayerClass;
			clone.LayerOn = original.LayerOn;
			clone.SelectedClassScreen = original.SelectedClassScreen;
			clone.SelectedSinScreen = original.SelectedSinScreen;
			clone.Dexterity = original.Dexterity;
			clone.DexterityModifier = original.DexterityModifier;
			clone.AgilityModifier = original.AgilityModifier;
			clone.Agility = original.Agility;
			clone.DefenseModifier = original.DefenseModifier;
			clone.Magic = original.Magic;
			clone.Sin = original.Sin;
			clone.MagicModifier = original.MagicModifier;
			clone.StrengthModifier = original.StrengthModifier;
			clone.Strength = original.Strength;
			clone.Defense = original.Defense;
			if (!event.isWasDeath()) {
			}
			if (!event.getEntity().level().isClientSide()) {
				for (Entity entityiterator : new ArrayList<>(event.getEntity().level().players())) {
					((PlayerVariables) entityiterator.getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables())).syncPlayerVariables(entityiterator);
				}
			}
		}
	}

	public static final Capability<PlayerVariables> PLAYER_VARIABLES_CAPABILITY = CapabilityManager.get(new CapabilityToken<PlayerVariables>() {
	});

	@Mod.EventBusSubscriber
	private static class PlayerVariablesProvider implements ICapabilitySerializable<Tag> {
		@SubscribeEvent
		public static void onAttachCapabilities(AttachCapabilitiesEvent<Entity> event) {
			if (event.getObject() instanceof Player && !(event.getObject() instanceof FakePlayer))
				event.addCapability(new ResourceLocation("layersofdescent", "player_variables"), new PlayerVariablesProvider());
		}

		private final PlayerVariables playerVariables = new PlayerVariables();
		private final LazyOptional<PlayerVariables> instance = LazyOptional.of(() -> playerVariables);

		@Override
		public <T> LazyOptional<T> getCapability(Capability<T> cap, Direction side) {
			return cap == PLAYER_VARIABLES_CAPABILITY ? instance.cast() : LazyOptional.empty();
		}

		@Override
		public Tag serializeNBT() {
			return playerVariables.writeNBT();
		}

		@Override
		public void deserializeNBT(Tag nbt) {
			playerVariables.readNBT(nbt);
		}
	}

	public static class PlayerVariables {
		public boolean WithinHell = false;
		public String ScreenText = "\"\"";
		public double ScreenTextTimer = 0;
		public double ScreenTextStage = 1.0;
		public boolean ScreenTextPauseTime = false;
		public String SelectedColorCode = "";
		public String PlayerClass = "";
		public String LayerOn = "";
		public String SelectedClassScreen = "Nether Weaver";
		public String SelectedSinScreen = "";
		public double Dexterity = 0;
		public double DexterityModifier = 0;
		public double AgilityModifier = 0;
		public double Agility = 0;
		public double DefenseModifier = 0;
		public double Magic = 0;
		public String Sin = "";
		public double MagicModifier = 0;
		public double StrengthModifier = 0;
		public double Strength = 0;
		public double Defense = 0;

		public void syncPlayerVariables(Entity entity) {
			if (entity instanceof ServerPlayer serverPlayer)
				LayersofdescentMod.PACKET_HANDLER.send(PacketDistributor.DIMENSION.with(entity.level()::dimension), new PlayerVariablesSyncMessage(this, entity.getId()));
		}

		public Tag writeNBT() {
			CompoundTag nbt = new CompoundTag();
			nbt.putBoolean("WithinHell", WithinHell);
			nbt.putString("ScreenText", ScreenText);
			nbt.putDouble("ScreenTextTimer", ScreenTextTimer);
			nbt.putDouble("ScreenTextStage", ScreenTextStage);
			nbt.putBoolean("ScreenTextPauseTime", ScreenTextPauseTime);
			nbt.putString("SelectedColorCode", SelectedColorCode);
			nbt.putString("PlayerClass", PlayerClass);
			nbt.putString("LayerOn", LayerOn);
			nbt.putString("SelectedClassScreen", SelectedClassScreen);
			nbt.putString("SelectedSinScreen", SelectedSinScreen);
			nbt.putDouble("Dexterity", Dexterity);
			nbt.putDouble("DexterityModifier", DexterityModifier);
			nbt.putDouble("AgilityModifier", AgilityModifier);
			nbt.putDouble("Agility", Agility);
			nbt.putDouble("DefenseModifier", DefenseModifier);
			nbt.putDouble("Magic", Magic);
			nbt.putString("Sin", Sin);
			nbt.putDouble("MagicModifier", MagicModifier);
			nbt.putDouble("StrengthModifier", StrengthModifier);
			nbt.putDouble("Strength", Strength);
			nbt.putDouble("Defense", Defense);
			return nbt;
		}

		public void readNBT(Tag Tag) {
			CompoundTag nbt = (CompoundTag) Tag;
			WithinHell = nbt.getBoolean("WithinHell");
			ScreenText = nbt.getString("ScreenText");
			ScreenTextTimer = nbt.getDouble("ScreenTextTimer");
			ScreenTextStage = nbt.getDouble("ScreenTextStage");
			ScreenTextPauseTime = nbt.getBoolean("ScreenTextPauseTime");
			SelectedColorCode = nbt.getString("SelectedColorCode");
			PlayerClass = nbt.getString("PlayerClass");
			LayerOn = nbt.getString("LayerOn");
			SelectedClassScreen = nbt.getString("SelectedClassScreen");
			SelectedSinScreen = nbt.getString("SelectedSinScreen");
			Dexterity = nbt.getDouble("Dexterity");
			DexterityModifier = nbt.getDouble("DexterityModifier");
			AgilityModifier = nbt.getDouble("AgilityModifier");
			Agility = nbt.getDouble("Agility");
			DefenseModifier = nbt.getDouble("DefenseModifier");
			Magic = nbt.getDouble("Magic");
			Sin = nbt.getString("Sin");
			MagicModifier = nbt.getDouble("MagicModifier");
			StrengthModifier = nbt.getDouble("StrengthModifier");
			Strength = nbt.getDouble("Strength");
			Defense = nbt.getDouble("Defense");
		}
	}

	@SubscribeEvent
	public static void registerMessage(FMLCommonSetupEvent event) {
		LayersofdescentMod.addNetworkMessage(PlayerVariablesSyncMessage.class, PlayerVariablesSyncMessage::buffer, PlayerVariablesSyncMessage::new, PlayerVariablesSyncMessage::handler);
	}

	public static class PlayerVariablesSyncMessage {
		private final int target;
		private final PlayerVariables data;

		public PlayerVariablesSyncMessage(FriendlyByteBuf buffer) {
			this.data = new PlayerVariables();
			this.data.readNBT(buffer.readNbt());
			this.target = buffer.readInt();
		}

		public PlayerVariablesSyncMessage(PlayerVariables data, int entityid) {
			this.data = data;
			this.target = entityid;
		}

		public static void buffer(PlayerVariablesSyncMessage message, FriendlyByteBuf buffer) {
			buffer.writeNbt((CompoundTag) message.data.writeNBT());
			buffer.writeInt(message.target);
		}

		public static void handler(PlayerVariablesSyncMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
			NetworkEvent.Context context = contextSupplier.get();
			context.enqueueWork(() -> {
				if (!context.getDirection().getReceptionSide().isServer()) {
					PlayerVariables variables = ((PlayerVariables) Minecraft.getInstance().player.level().getEntity(message.target).getCapability(PLAYER_VARIABLES_CAPABILITY, null).orElse(new PlayerVariables()));
					variables.WithinHell = message.data.WithinHell;
					variables.ScreenText = message.data.ScreenText;
					variables.ScreenTextTimer = message.data.ScreenTextTimer;
					variables.ScreenTextStage = message.data.ScreenTextStage;
					variables.ScreenTextPauseTime = message.data.ScreenTextPauseTime;
					variables.SelectedColorCode = message.data.SelectedColorCode;
					variables.PlayerClass = message.data.PlayerClass;
					variables.LayerOn = message.data.LayerOn;
					variables.SelectedClassScreen = message.data.SelectedClassScreen;
					variables.SelectedSinScreen = message.data.SelectedSinScreen;
					variables.Dexterity = message.data.Dexterity;
					variables.DexterityModifier = message.data.DexterityModifier;
					variables.AgilityModifier = message.data.AgilityModifier;
					variables.Agility = message.data.Agility;
					variables.DefenseModifier = message.data.DefenseModifier;
					variables.Magic = message.data.Magic;
					variables.Sin = message.data.Sin;
					variables.MagicModifier = message.data.MagicModifier;
					variables.StrengthModifier = message.data.StrengthModifier;
					variables.Strength = message.data.Strength;
					variables.Defense = message.data.Defense;
				}
			});
			context.setPacketHandled(true);
		}
	}
}
