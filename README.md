
# XEmbed Eclipse Plugin

This plugin adds a new view named _XEmbedView_ for embedding an external window.

## Install the plugin in eclipse

1.  Download [XEmbedPluginFeature.zip](feature/XEmbedPluginFeature.zip).
2.  Open Eclipse CDT.
3.  In the main **Help** menu, select the **Install New Software** entry. It
    opens the _Install_ window.
4.  Click on the **Add** button (top right of the window).
5.  In the dialog hit **Archive** button.
6.  Browse to the downloaded zip file, then hit **Open**. You should be back in
    the _Install_ window.
7.  Unselect the **Group items by category** checkbox.
8.  **XEmbedFeature** should be in the main list, select the box near its name.
9.  Hit **Next** button.
10. Then follows the instruction to install the XEmbededPlugin. You'll be asked
    to review the installation and to accept the plug-in license. The plug-in
    is not signed so you'll get a warning about that.

You will be asked to restart Eclipse so that the new plug-in is loaded.

## Modify or generate the plugin

This repository contains two eclipse projects.
You need eclipse Plug-in Development Environment (PDE) to import or open the
plugin project (also import nested project).

### Testing

To test the plug-in you can follow the following steps:
1. right-click on the plugin project
2. select **Run As** then **Eclipse Application**

### Generate the zip file

1. **File** --> **Export**
2. In the tree, browse for **Plug-in Development** then
   **Deployable features**.
3. Hit **Next** button.
4. In the list, check XEmbedFeature plug-in
5. Then select the destination **Archive file** and choose the path.
6. Press **Finish** button.

## How the plugin works

When the `xembed_window_id` dynamic variable is read from a launch configuration,
it opens the XEmbedView view, creates a composite, and returns its window ID (hex value).

