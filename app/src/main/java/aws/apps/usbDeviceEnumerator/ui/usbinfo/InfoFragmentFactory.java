package aws.apps.usbDeviceEnumerator.ui.usbinfo;

import android.support.v4.app.Fragment;

import aws.apps.usbDeviceEnumerator.usb.sysbususb.SysBusUsbDevice;

public final class InfoFragmentFactory {

    public static Fragment getFragment(String usbKey) {
        return AndroidUsbInfoFragment.create(usbKey);
    }

    public static Fragment getFragment(SysBusUsbDevice usbDevice) {
        return LinuxUsbInfoFragment.create(usbDevice);
    }
}
