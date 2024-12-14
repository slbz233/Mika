# Mika
* An advanced and modern anticheat solution for your Minecraft server

# Build Mika
* We use [Maven](http://maven.apache.org/download.cgi) 3 to handle the dependencies.
* * You can compile with this Maven goal: `mvn clean package`, for a build without any of the "non free" modules, which depened on not publicly downloadable resources, such as the CraftBukkit/Spigot server jar - the reflection based compatibility module is still contained. 
* To also (re-) build "non free" compatibility modules, use `-P nonfree_build` as well as activating the appropriate module to build via a profile such as `-P cbdev` - see the tables below for reference.
* For a build with full compatibility modules, You can compile with this goal: `mvn clean package -P nonfree_build -P all`.
* "Non free" jar file dependencies needed for the dedicated compat modules, which your local maven repository might be missing, can be installed manually.

