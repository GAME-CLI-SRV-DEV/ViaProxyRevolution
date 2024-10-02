# ViaProxyRevolution
Makes Java edition Users connect to ViaProxy Server.
Used On Spigot/Sponge/Nukkit.

# How to
The ViaProxy must be configured.

1. type /viaproxy conf [hostname]. this becomes a part of viaproxy.hostname. this is a target viaproxy address.
2. type /viaproxy address port version. this will transfer you to address_port_version.viaproxy.hostname without openauthmod.

on a ViaProxy Side, install the authenticationhandler plugin to make sure it uses the whole thing of viaproxy otherwise it will not work.

it uses the kickscreen for the Authentication so you have to do full login everytime. 

also, the viaproxy backend address server(address_port_version) must be on 1.7 to run this on viaproxy!

> [!Warning]
> ViaProxyRevolution-AuthenticationHandler is a temporary solution so it would be discontinued if ViaProxy adds web authentication or same thing. (eventhough that is gonna happen because of there is no users using that because ViaProxy Is Easier to use.)

# Process
### Transfer to ViaProxy
Uses TransferProxy API.
### AuthHandler
uses ViaProxy as a compileonly, this trick causes this plugin use viaproxy and gains access to minecraftauth.


# FAQ
Are You Going to support VIAaaS Soon?
sorry, VIAaaS is Not Yet Supporting the PluginAPI yet.
