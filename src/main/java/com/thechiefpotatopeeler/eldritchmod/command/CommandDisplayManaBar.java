package com.thechiefpotatopeeler.eldritchmod.command;

import com.thechiefpotatopeeler.eldritchmod.handlers.ConfigHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.server.MinecraftServer;

public class CommandDisplayManaBar extends CommandBase {

    @Override
    public String getName() {
        return "displaymanabar";
    }

    @Override
    public String getUsage(ICommandSender sender) {
        return "/displaymanabar Toggles the display of the mana bar for the player";
    }

    @Override
    public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException {
        ConfigHandler.enableManaOverlay ^= true;
    }
}
