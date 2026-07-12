package com.mbridge.msdk.dycreator.bus;

/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
final class Subscription {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Object f19392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final SubscriberMethod f19393b;

    Subscription(Object obj, SubscriberMethod subscriberMethod) {
        this.f19392a = obj;
        this.f19393b = subscriberMethod;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Subscription)) {
            return false;
        }
        Subscription subscription = (Subscription) obj;
        return this.f19392a == subscription.f19392a && this.f19393b.equals(subscription.f19393b);
    }

    public final int hashCode() {
        return this.f19392a.hashCode() + this.f19393b.f19389d.hashCode();
    }
}
