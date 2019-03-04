# GDK [Gunivers Developpment Kit] Launcher
A tool that provides resource to minecraft-oriented software, and aims to centralize them in order to make their use easy-peasy.
If you're tired to search software matching your needs in the depths of the web for ages, the GDK Launcher is perfect!

## Plugin Integration:
It's actually very easy :D

### Step 1
Just add a file 'plugin.txt' at the root of your project.

Example File:

	───────────────────────────────────────────
	name=Example Plugin Name
	author=Example Author
	version=alpha 0.0
	main=package.MainClass

	Example comment that you may write as you
	want and won't be parsed. Isn't it awesome?

	description=
	What a wonderful example!
	Such a description shouldn't be missed!
	───────────────────────────────────────────

Caution: remember to always put the description field at the end of the file, else the following fields won't be parsed :/

### Step 2
- Run the GDK Launcher
- Click on File>Load Plugins... or type Ctrl+L
- Select your jar file(s)
- Click on "Open"

Done!
Thank you for integrating your project :)