# EssentialClient

[![Discord](https://badgen.net/discord/online-members/7R9SfktZxH?icon=discord&label=Discord&list=what)](https://discord.gg/7R9SfktZxH)
[![GitHub downloads](https://img.shields.io/github/downloads/senseiwells/essentialclient/total?label=Github%20downloads&logo=github)](https://github.com/senseiwells/essentialclient/releases)

EssentialClient is a client side only mod originally forked from [Carpet Client for 1.15.2](https://github.com/gnembon/carpet-client) that implements new client side features.

This mod is currently supporting 1.16.5, 1.17.1, and 1.18

1.16.5 requires [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) v0.35.1+ and [Carpet Mod](https://www.curseforge.com/minecraft/mc-mods/carpet) v1.4.26+.

1.17.1 requires [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) v0.40.1+ and [Carpet Mod](https://www.curseforge.com/minecraft/mc-mods/carpet) v1.4.44+.

1.18.1 requires [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api) v0.44.0+ and [Carpet Mod](https://www.curseforge.com/minecraft/mc-mods/carpet) v1.4.56+.

To access the Essential Client menu you must join a world, then it will be accessible to you when you press
`ESC`, you can enable menu access from the title screen by enabling [essentialClientButton](#essentialclientbutton).

Feel free to contribute by adding as many features as you want!

## Here is a link to my YouTube video about the mod
[![Image](https://cdn.discordapp.com/attachments/559400132710236160/899739577995108372/EssentialClient480.jpg)](https://youtu.be/lmMkC102T24)

## Index of Client Rules
* [afkLogout](#afklogout)
* [announceAFK](#announceafk)
* [announceAFKMessage](#announceafkmessage)
* [autoWalk](#autowalk)
* [betterAccurateBlockPlacement](#betteraccurateblockplacement)
* [betterPingDisplay](#betterpingdisplay)
* [chunkDebugMinimapBackground](#chunkdebugminimapbackground)
* [clientScriptFileName](#clientscriptfilename)
* [commandAlternateDimension](#commandalternatedimension)
* [commandClientNick](#commandclientnick)
* [commandMusic](#commandmusic)
* [commandPlayerClient](#commandplayerclient)
* [commandPlayerList](#commandplayerlist)
* [commandRegion](#commandregion)
* [commandSuggestorIgnoresSpaces](#commandsuggestorignoresspaces)
* [commandTravel](#commandtravel)
* [commandUpdateClient](#commandupdateclient)
* [customClientCape](#customclientcape)
* [disableBobViewWhenHurt](#disablebobviewwhenhurt)
* [disableBossBar](#disablebossbar)
* [disableFovChangeInWater](#disablefovchangeinwater)
* [disableHotbarScrolling](#disablehotbarscrolling)
* [disableJoinLeaveMessages](#disablejoinleavemessages)
* [disableMapRendering](#disablemaprendering)
* [disableNarrator](#disablenarrator)
* [disableNightVisionFlash](#disablenightvisionflash)
* [disableOpMessages](#disableopmessages)
* [disableRecipeNotifications](#disablerecipenotifications)
* [disableTutorialNotifications](#disabletutorialnotifications)
* [displayRuleType](#displayruletype)
* [displayTimePlayed](#displaytimeplayed)
* [enableScriptOnJoin](#enablescriptonjoin)
* [essentialClientButton](#essentialclientbutton)
* [highlightLavaSources](#highlightlavasource)
* [increaseSpectatorScrollSensitivity](#increasespectatorscrollsensitivity)
* [increaseSpectatorScrollSpeed](#increasespectatorscrollspeed)
* [missingTools](#missingtools)
* [musicInterval](#musicinterval)
* [musicTypes](#musictypes)
* [overrideCreativeWalkSpeed](#overridecreativewalkspeed)
* [permanentChatHud](#permanentchathud)
* [quickLockRecipe](#quicklockrecipe)
* [removeWarnReceivedPassengers](#removewarnreceivedpassengers)
* [soulSpeedFovMultiplier](#soulspeedfovmultiplier)
* [stackableShulkerInPlayerInventories](#stackableshulkersinplayerinventories)
* [stackableShulkersWithItems](#stackableshulkerswithitems)
* [switchToTotem](#switchtototem)
* [toggleTab](#toggletab)
* [unlockAllRecipesOnJoin](#unlockallrecipesonjoin)
* [waterFovMultiplier](#waterfovmultiplier)

# Index of Other Features:

* [carpetClient](#carpetclient)
* [clientScripts](#clientscripts)
* [gameruleScreen](#gamerulescreen)
* [rebindF3](#rebindf3)

# Client Rules:

For commands any value inside [ ] are variables and should be replaced with real values when using the command

## afkLogout
This will disconnect you after you have been afk for a set number of ticks
* Type: `Integer`
* Default Value: `0`
* Extra Info: value must be `>=200` to be enabled

## announceAFK
This announces when you become afk after a set amount of time (ticks),
* Type: `Integer`
* Default Value: `0`
* Extra Info:
  * This is judges by weather your player position is constant
  * Prints the message determined by [announceAFKMessage](#announceafkmessage)

## announceAFKMessage
This is the message you announce after you are afk
* Type: `String`
* Default Value: `I am now AFK`
* Extra Info:
  * Requires [announceAFK](#announceafk)

## autoWalk
This will auto walk after you have held your key for set amount of ticks
* Type: `Integer`
* Default Value: `0`
* Extra Info:
  * Once auto walking press backwards or forward again to cancel

## betterAccurateBlockPlacement
This is the same as accurate block placement in tweakeroo, it allows you to place blocks in different orientations when holding a keybind. This does not need server side support, everything is handled on the client
* Type: `Boolean`
* Default Value: `false`
* Extra info
  * This may not work on servers with strong anticheat

## betterPingDisplay
This will show the ping in milliseconds in the tab list
* Type: `Boolean`
* Default Value: `false`

## chunkDebugMinimapBackground
This toggles whether a background will be rendered for the chunk debug minimap
* Type: `Boolean`
* Default Value: `true`

## clientScriptFilename
This allows you to choose the file you want to use for your script
* Type: `String`
* Default Value: `clientscript`

## commandAlternateDimension
This command will give you the coordinates of your position in the alternate dimension (nether or overworld), you can click on the coordinates to teleport there (must have permissions)
* Type: `Boolean`
* Default Value: `false`

## commandClientNick
This allows you to nickname other players using, this is only on the client, this can be any string (with spaces and special characters),
you can also use Mojang formatting, use `&` instead of `§`
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * `/clientnick set [playername] [replacementname]`, `/clientnick delete [playername]`, `/clientnick get [playername]`

## commandMusic
This command allows you to manipulate the current music
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Usage: `/music skip`, `/music play [musictype]`, `music volume [percent]`

## commandPlayerClient
This command allows you to save /player... commands and execute them
* Type `Boolean`
* Default Value: `false`
* Extra Info:
  * Requires `commandPlayer` (from carpet) on server/singeplayer to be `true`
  * Documentation on how to use: [here](https://github.com/senseiwells/EssentialClient/wiki/CommandPlayerClient)

## commandPlayerList
This command allows you to execute /player... commands in one command
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Requires [commandPlayerClient](#commandplayerclient)
  * Documentation on how to use: [here](https://github.com/senseiwells/EssentialClient/wiki/CommandPlayerList)

## commandRegion
This command allows you to determine the region you are in or the region at set coords
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Usage: `/region get`, `/region get [x] [y]`

## commandSuggestorIgnoresSpaces
This makes the command suggestor suggest the correct commands even if you type extra spaces
* Type: `Boolean`
* Default Value: `false`

## commandTravel
This command allows you to travel to a set location
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Usage: `/travel start [x] [y]`, `/travel stop`

## commandUpdateClient
This command will try and download the latest jar of EssentialClient, you will have to delete the old one manually and then restart your game
* Type: `N/A`
* Default Value: `true`
* Extra Info:
  * Usage: `/updateclient`

## customClientCape
This allows you to choose a Minecraft cape to apply to your player. This will only render for **your** client
* Type: `Cycle`
* Default Value: `None`

## disableBobViewWhenHurt
Disables the camera bobbing when you get hurt
* Type: `Boolean`
* Default Value: `false`

## disableBossBar
This disables boss bars from rendering
* Type: `Boolean`
* Default Value: `false`
*
## disableFovChangeInWater
This stops the FOV changing when you are submerged in water
* Type: `Boolean`
* Default Value: `false`

## disableHotbarScrolling
This will prevent you from scrolling in your hotbar
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Learn to use hotkeys :)

## disableJoinLeaveMessages
This will prevent join/leave messages from displaying
* Type: `Boolean`
* Default Value: `false`

## disableMapRendering
This stops all item frames with maps in them from rendering, good for preventing lag around huge maps.
* Type: `Boolean`
* Default Value: `false`

## disableNarrator
Disables cycling narrator when pressing CTRL + B
* Type: `Boolean`
* Default Value: `false`

## disableNightVisionFlash
Disables the flash that occurs when night vision is about to run out
* Type: `Boolean`
* Default Value: `false`

## disableOpMessages
This will prevent system messages from displaying
* Type: `Boolean`
* Default Value: `false`

## disableRecipeNotifications
Disables the recipe toast from showing
* Type: `Boolean`
* Default Value: `false`

## disableTutorialNotifications
Disables the tutorial toast from showing
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Useful for when switching versions when using vanilla launcher

## displayRuleType
This allows you to choose the order you want rules to be displayed
* Type: `Cycle`
* Default Value: `Alphabetical`
* Extra Info:
  * Current options: `Alphabetical` and `RuleType`

## displayTimePlayed
This will display how long you have had your current client open for in the corner of the pause menu
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Now you can see how much time you've ~~wasted~~ been productive

## enableScriptOnJoin
This will automatically run your clientscript when you join a world
* Type: `Boolean`
* Default Value `false`
* Extra Info:
  * This may impact performance while the world is loading

## essentialClientButton
This renders the Essential Client Button on the pause menu and the main menu
* Type: `Boolean`
* Default Value: `true`
* Extra Info:
  * This may conflict with other mods so you are able to disable this. You can also oppen the menu by setting a keybind.

## highlightLavaSource
Highlights lava sources, credit to [plusls](https://github.com/plusls) for the original code for this in [their mod](https://github.com/plusls/oh-my-minecraft-client)
* Type: `Boolean`
* Default Value: `false`

## increaseSpectatorScrollSensitivity
Increases the sensitivity at which you can scroll to go faster in spectator
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * Couples nicely with [increaseSpectatorScrollSpeed](#increasespectatorscrollspeed)

## increaseSpectatorScrollSpeed
Increases the limit at which you can scroll to go faster in spectator
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * You can now go faster than ever before!

## missingTools
Adds client functionality to missingTools from Carpet for the client
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * This is implemented to fix any desync issues with servers, doesn't work if server doesn't have this rule enabled

## musicInterval
The amount of ticks between each soundtrack that is played
* Type: `Integer`
* Default Value: `0`
* Extra Info:
  * 0 = (Vanilla Behaviour) random

## musicTypes
This allows you to select what music types play
* Type: `Cycle`
* Default Value: `Default`
* Extra Info:
  * Current Options: `Default`, `Overworld`, `Nether`, `Overworld + Nether`, `End`, `Creative`, `Menu`, `Credits`, and `Any`

## overrideCreativeWalkSpeed
This allows you to override the vanilla walk speed in creative mode
* Type: `Double`
* Default Value: `0.0`
* Extra Info:
  * Limited to creative mode, stop thinking of cheating

## permanentChatHud
This prevents chat from being cleared, this also prevents chat from being cleared when leaving worlds/servers
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * This means you can swap worlds and still have the same chat :)

## quickLockRecipe
When you middle click a recipe it searches it essentially locking it inplace, middle click empty space or another recipe to change it
* Type: `Boolean`
* Default Value: `false`

## removeWarnReceivedPassengers
"This removes the 'Received passengers for unknown entity' warning on the client
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * This warning just clogs up logs when arround Minecarts


## soulSpeedFovMultiplier

Determines the percentage of Fov scaling when walking on soil soul or soul sand
* Type: `Integer`
* Default Value: `0`

## stackableShulkersInPlayerInventories
This allows for shulkers to stack only in your inventory
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * This only works if the server has [EssentialAddons](https://github.com/Super-Santa/EssentialAddons) installed with `stackableShulkersInPlayerInventories` enabled

## stackableShulkersWithItems
This allows for shulkers with items to stack only in your inventory
* Type: `Boolean`
* Default Value: `false`
* Extra Info:
  * This requires [stackableShulkersInPlayerInventories](#stackableshulkersinplayerinventories)

## switchToTotem
This will switch to a totem (if you have one), under a set amount of health
* Type: `Integer`
* Default Value: `0`
* Extra Info:
  * Health is out of 20

## toggleTab
This will make tab a toggle instead of a press to activate
* Type: `Boolean`
* Default Value: `false`

## unlockAllRecipesOnJoin
Unlocks every recipe when joining a world.
* Type: `Boolean`
* Default Value: `false`

##  waterFovMultiplier

Determines the percentage of Fov scaling when fully submerged in water

* Type: `Integer`
* Default Value: `0`

# Other Features

## carpetClient
CarpetClient allows you to modify Carpet rules with a GUI. This only works if you have carpet installed on the server you are playing on.

## chunkDebug
ChunkDebug was originally for [CarpetClient 1.12](https://github.com/X-com/CarpetClient). This tool allows you to monitor chunk loading, you must have my [ChunkDebug](https://github.com/senseiwells/ChunkDebug) server side mod also installed on the server (or singleplayer) to be able to use this mod.

## clientScripts
This is a mini scripting language that allows you to make simple scripts directly in minecraft without any external programs.

Documentation and how to use can be found: [here](https://github.com/senseiwells/EssentialClient/wiki/ClientScript)

## gameruleScreen
This is a GUI that allows you to modify gamerules in singleplayer, it is accessible from the Essential Client menu

## rebindF3
This allows you to rebind the F3 key, the option for this is in controls under "EssentialClient"
