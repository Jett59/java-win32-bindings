// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$299 {

    static final FunctionDescriptor StretchDIBits$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle StretchDIBits$MH = RuntimeHelper.downcallHandle(
        "StretchDIBits",
        constants$299.StretchDIBits$FUNC
    );
    static final FunctionDescriptor SetROP2$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetROP2$MH = RuntimeHelper.downcallHandle(
        "SetROP2",
        constants$299.SetROP2$FUNC
    );
    static final FunctionDescriptor SetStretchBltMode$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetStretchBltMode$MH = RuntimeHelper.downcallHandle(
        "SetStretchBltMode",
        constants$299.SetStretchBltMode$FUNC
    );
    static final FunctionDescriptor SetSystemPaletteUse$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetSystemPaletteUse$MH = RuntimeHelper.downcallHandle(
        "SetSystemPaletteUse",
        constants$299.SetSystemPaletteUse$FUNC
    );
    static final FunctionDescriptor SetTextCharacterExtra$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTextCharacterExtra$MH = RuntimeHelper.downcallHandle(
        "SetTextCharacterExtra",
        constants$299.SetTextCharacterExtra$FUNC
    );
    static final FunctionDescriptor SetTextColor$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetTextColor$MH = RuntimeHelper.downcallHandle(
        "SetTextColor",
        constants$299.SetTextColor$FUNC
    );
}


