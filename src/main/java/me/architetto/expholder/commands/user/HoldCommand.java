package me.architetto.expholder.commands.user;

import me.architetto.expholder.commands.CommandName;
import me.architetto.expholder.commands.SubCommand;
import me.architetto.expholder.service.ExpHolderService;
import org.bukkit.entity.Player;

import java.util.List;

public class HoldCommand extends SubCommand {
    @Override
    public String getName() {
        return CommandName.HOLD_COMMAND;
    }

    @Override
    public String getDescription() {
        return "null";
    }

    @Override
    public String getSyntax() {
        return "null";
    }

    @Override
    public String getPermission() {
        return "expholder.hold";
    }

    @Override
    public int getArgsRequired() {
        return 0;
    }

    @Override
    public void perform(Player sender, String[] args) {

        ExpHolderService.getInstance().depositExp(sender);

    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {
        return null;
    }
}
