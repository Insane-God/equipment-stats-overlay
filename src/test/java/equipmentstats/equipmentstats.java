package equipmentstats;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class equipmentstats
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(equipmentstatsPlugin.class);
		RuneLite.main(args);
	}
}