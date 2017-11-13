package com.android.engineeringmode.manualtest;

import com.android.engineeringmode.manualtest.modeltest.ModelTestBaseAcivity;
import com.android.engineeringmode.manualtest.modeltest.ModelTestManager;
import com.oem.util.Feature;

public class ScreenComponentTest extends ModelTestBaseAcivity {
    protected ModelTestManager getTestManager() {
        return new ModelTestManager(this, "screen_component_list.xml");
    }

    protected int getMarkpostion() {
        return -1;
    }

    protected void deleteTestsForSpeacialDevice() {
        if (!Feature.isFingerPrintSupported(this)) {
            this.testManager.remove("com.oppo.fingerprints.fingerprintsensortest.FingerPrintQualityTest");
            this.testManager.remove("com.oppo.fingerprints.fingerprintsensortest.FingerPrintAutoTest");
        }
    }
}
