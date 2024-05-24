package ravenweave.client.command.commands;

import ravenweave.client.clickgui.raven.Terminal;
import ravenweave.client.command.Command;
import ravenweave.client.module.modules.client.FakeHud;

public class CFake extends Command {

    public CFake() {
        super("fakehud", "fakehud add <Name>, fakehud remove <Name>", 3, 100, new String[] { "add/remove" },
                new String[] { "fh" });
    }

    @Override
    public void onCall(String[] args) {
        switch (args[0]) {
        case "add":
            for (int i = 1; i < args.length; i++) {
                FakeHud.addModule(args[i]);
                Terminal.print("added " + args[i] + "!");
            }
            break;
        case "remove":
            for (int i = 1; i < args.length; i++) {
                FakeHud.removeModule(args[i]);
                Terminal.print("removed " + args[i] + "!");
            }
            break;
        default:
            Terminal.print("incorrect arguments");
        }

    }
}