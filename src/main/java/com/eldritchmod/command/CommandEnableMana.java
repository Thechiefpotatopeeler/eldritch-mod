package com.eldritchmod.command;

import com.eldritchmod.handlers.ConfigHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandEnableMana extends CommandBase {

    @Override
    public String getName() {
        return "enablemana";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/enablemana Enable mana or not";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        ConfigHandler.enableMana ^= true;
    }
}
