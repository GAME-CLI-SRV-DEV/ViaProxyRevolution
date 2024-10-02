package org.duckdns.anarchyconnect.viaproxy;

import net.raphimc.minecraftauth.MinecraftAuth;
import net.raphimc.minecraftauth.step.StepMsaDeviceCode;
import net.raphimc.minecraftauth.session.JavaSession;
import net.raphimc.minecraftauth.session.BedrockSession;

public class main extends ViaProxyPlugin {

String kickMessage = "Please enter the auth code at aka.ms/remoteconnect.";

  
      public void setCancelled(final boolean cancelled) {
    @EventHandler
    public void onPreconnect(PreconnectEvent event) {
        // Logic to display kickscreen
        String kickMessage = "Please enter the auth code at aka.ms/remoteconnect: JE: ";
        if (event instanceof EventCancellable) {
            EventCancellable cancellableEvent = (EventCancellable) event;
            cancellableEvent.setCancelMessage(kickMessage + msaDeviceCode.getUserCode() + );
            cancellableEvent.setCancelled(true);
        }
    }
  
  }

  
