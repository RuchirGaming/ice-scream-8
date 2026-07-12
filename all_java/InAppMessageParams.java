package com.android.billingclient.api;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
/* JADX INFO: loaded from: /workspaces/ice-scream-8/./apk_dex_files/classes.dex */
public final class InAppMessageParams {
    private final ArrayList<Integer> mInAppMessageCategories;

    /* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
    public static final class Builder {
        private final Set<Integer> mInAppMessageCategories = new HashSet();

        public Builder addAllInAppMessageCategoriesToShow() {
            this.mInAppMessageCategories.add(2);
            return this;
        }

        public Builder addInAppMessageCategoryToShow(int i2) {
            this.mInAppMessageCategories.add(Integer.valueOf(i2));
            return this;
        }

        public InAppMessageParams build() {
            return new InAppMessageParams(this.mInAppMessageCategories);
        }
    }

    /* JADX INFO: compiled from: com.android.billingclient:billing@@5.2.1 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InAppMessageCategoryId {
        public static final int TRANSACTIONAL = 2;
        public static final int UNKNOWN_IN_APP_MESSAGE_CATEGORY_ID = 0;
    }

    private InAppMessageParams(Set<Integer> set) {
        this.mInAppMessageCategories = new ArrayList<>(Collections.unmodifiableList(new ArrayList(set)));
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    ArrayList<Integer> getInAppMessageCategoriesToShow() {
        return this.mInAppMessageCategories;
    }
}
