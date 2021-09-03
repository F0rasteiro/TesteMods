package teste.procedures;

import teste.EnderoreMod;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.Blocks;

import java.util.Map;

public class MudaDeCoqueiroAdicionadaProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				EnderoreMod.LOGGER.warn("Failed to load dependency x for procedure MudaDeCoqueiroAdicionada!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				EnderoreMod.LOGGER.warn("Failed to load dependency y for procedure MudaDeCoqueiroAdicionada!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				EnderoreMod.LOGGER.warn("Failed to load dependency z for procedure MudaDeCoqueiroAdicionada!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				EnderoreMod.LOGGER.warn("Failed to load dependency world for procedure MudaDeCoqueiroAdicionada!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((!((world.getBlockState(new BlockPos((int) x, (int) (y - 1), (int) z))).getBlock() == Blocks.GRASS_BLOCK))) {
			if (world instanceof World)
				((World) world).notifyNeighborsOfStateChange(new BlockPos((int) x, (int) y, (int) z),
						((World) world).getBlockState(new BlockPos((int) x, (int) y, (int) z)).getBlock());
		}
	}
}
