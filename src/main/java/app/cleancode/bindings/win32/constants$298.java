// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$298 {

    static final FunctionDescriptor SetPixel$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPixel$MH = RuntimeHelper.downcallHandle(
        "SetPixel",
        constants$298.SetPixel$FUNC
    );
    static final FunctionDescriptor SetPixelV$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPixelV$MH = RuntimeHelper.downcallHandle(
        "SetPixelV",
        constants$298.SetPixelV$FUNC
    );
    static final FunctionDescriptor SetPixelFormat$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetPixelFormat$MH = RuntimeHelper.downcallHandle(
        "SetPixelFormat",
        constants$298.SetPixelFormat$FUNC
    );
    static final FunctionDescriptor SetPolyFillMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetPolyFillMode$MH = RuntimeHelper.downcallHandle(
        "SetPolyFillMode",
        constants$298.SetPolyFillMode$FUNC
    );
    static final FunctionDescriptor StretchBlt$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle StretchBlt$MH = RuntimeHelper.downcallHandle(
        "StretchBlt",
        constants$298.StretchBlt$FUNC
    );
    static final FunctionDescriptor SetRectRgn$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetRectRgn$MH = RuntimeHelper.downcallHandle(
        "SetRectRgn",
        constants$298.SetRectRgn$FUNC
    );
}


