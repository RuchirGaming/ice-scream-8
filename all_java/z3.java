package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: EventPayload.kt */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes5.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<Integer> f15354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15356c;

    public z3(List<Integer> eventIDs, String payload, boolean z) {
        Intrinsics.checkNotNullParameter(eventIDs, "eventIDs");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f15354a = eventIDs;
        this.f15355b = payload;
        this.f15356c = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return Intrinsics.areEqual(this.f15354a, z3Var.f15354a) && Intrinsics.areEqual(this.f15355b, z3Var.f15355b) && this.f15356c == z3Var.f15356c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    public int hashCode() {
        int iHashCode = ((this.f15354a.hashCode() * 31) + this.f15355b.hashCode()) * 31;
        boolean z = this.f15356c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    public String toString() {
        return "EventPayload(eventIDs=" + this.f15354a + ", payload=" + this.f15355b + ", shouldFlushOnFailure=" + this.f15356c + ')';
    }
}
