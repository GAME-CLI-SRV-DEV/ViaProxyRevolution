# ViaProxyRevolution
Makes Java Users connect to ViaProxy Server Without Using OpenAuthMod.
Used On Spigot/Sponge.

# How to
The ViaProxy must be configured.

1. type /viaproxy conf [hostname]. this becomes a part of viaproxy.hostname. this is a target viaproxy address.
2. type /viaproxy auth java [account]. this is a part of the java account selection. returns a url.
3. type /viaproxy address port version. this will transfer you to address_port_version.viaproxy.hostname without openauthmod.

on a ViaProxy Side, install the authenticationhandler plugin to make sure it uses the whole thing of viaproxy otherwise it will not work.

it uses the kickscreen for the Authentication so you have to do full login everytime. 
if the player is on other server, they can now use /auth then use transfer.



> [!Warning]
> ViaProxyRevolution-AuthenticationHandler is a temporary solution so it would be discontinued if ViaProxy adds web authentication or same thing.
