// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$552 {

    static final FunctionDescriptor SHInvokePrinterCommandW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHInvokePrinterCommandW$MH = RuntimeHelper.downcallHandle(
        "SHInvokePrinterCommandW",
        constants$552.SHInvokePrinterCommandW$FUNC
    );
    static final FunctionDescriptor SHLoadNonloadedIconOverlayIdentifiers$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle SHLoadNonloadedIconOverlayIdentifiers$MH = RuntimeHelper.downcallHandle(
        "SHLoadNonloadedIconOverlayIdentifiers",
        constants$552.SHLoadNonloadedIconOverlayIdentifiers$FUNC
    );
    static final FunctionDescriptor SHIsFileAvailableOffline$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHIsFileAvailableOffline$MH = RuntimeHelper.downcallHandle(
        "SHIsFileAvailableOffline",
        constants$552.SHIsFileAvailableOffline$FUNC
    );
    static final FunctionDescriptor SHSetLocalizedName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SHSetLocalizedName$MH = RuntimeHelper.downcallHandle(
        "SHSetLocalizedName",
        constants$552.SHSetLocalizedName$FUNC
    );
    static final FunctionDescriptor SHRemoveLocalizedName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHRemoveLocalizedName$MH = RuntimeHelper.downcallHandle(
        "SHRemoveLocalizedName",
        constants$552.SHRemoveLocalizedName$FUNC
    );
    static final FunctionDescriptor SHGetLocalizedName$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SHGetLocalizedName$MH = RuntimeHelper.downcallHandle(
        "SHGetLocalizedName",
        constants$552.SHGetLocalizedName$FUNC
    );
}


