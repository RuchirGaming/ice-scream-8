package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.external.InneractiveContentController.EventsListener;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes3.dex */
public interface InneractiveContentController<EventsListenerT extends EventsListener> {

    public interface EventsListener {
    }

    void destroy();

    InneractiveAdSpot getAdSpot();

    void setEventsListener(EventsListenerT eventslistenert);
}
