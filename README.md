
# XEmbed Eclipse Plugin

This plugin adds a new view named _XEmbedView_ for embedding an external window.

## Add the plugin to eclipse

Download [XEmbedPluginFeature.zip](feature/XEmbedPluginFeature.zip) or generate it (see below).
Go to menu Help -> Install New Software -> Add -> Archive and select the zip file location.

## Generate the zip file

1. Import XEmbedPlugin (and nested XEmbedFeature) project in eclipse

2. File --> Export --> Plug-in Development --> Deployable features

   Check XEmbedFeature (1.0.0)

   Select "Archive file" and choose the path of the output zip file

   Press "Finish"

## How the plugin works

When the `xembed_window_id` dynamic variable is read from a launch configuration,
it opens the XEmbedView view, creates a composite, and returns its window ID (hex value).

