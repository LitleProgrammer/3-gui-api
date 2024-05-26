package de.littleprogrammer.guiapi.commands;

import de.littleprogrammer.guiapi.guis.PagedGui;
import de.littleprogrammer.guiapi.guis.SimpleGui;
import de.littleprogrammer.guiapi.components.Button;
import de.littleprogrammer.guiapi.components.Text;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class SpawnCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        /*Button button = new Button("\uE001", "\uE002", 1)
                .setSize(2)
                .onClick(event -> {
                    event.getPlayer().sendMessage("You clicked a button1");
                })
                .onHover(event -> {
                    event.getPlayer().sendMessage("You hovered over a button");
                })
                .onUnHover(event -> {
                    event.getPlayer().sendMessage("You unhovered a button");
                });

        Button button2 = new Button("\uE001", "\uE002", 2).onClick(event -> {
            event.getPlayer().sendMessage("You clicked a button2");
        });

        Button button3 = new Button("\uE001", "\uE002", 3).onClick(event -> {
            event.getPlayer().sendMessage("You clicked a button3");
        });

        Text text = new Text("Here you can put\n some text. This is just for\n testing purposes.\n As you can see, \nit's working quite nicely and \nlook at this cool hovering effect.", 0)
                .setSize(1.4f);

        SimpleGui gui = new SimpleGui("Some title")
                .addContent(text)
                .addButton(button)
                .addButton(button2)
                .addButton(button3);
        gui.open((Player) commandSender);*/

        List<String> stringList = new ArrayList<>();
        stringList.add("String 1");
        stringList.add("String 2");
        stringList.add("String 3");
        stringList.add("String 4");
        stringList.add("String 5");
        stringList.add("String 6");
        stringList.add("String 7");
        stringList.add("String 8");
        stringList.add("String 9");
        stringList.add("String 10");
        stringList.add("String 11");
        stringList.add("String 12");

        PagedGui pagedGui = new PagedGui("Title", 0);
        pagedGui.addContent(stringList);
        pagedGui.open((Player) commandSender);

        return false;
    }
}
