// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$340 {

    static final FunctionDescriptor OpenWindowStationA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenWindowStationA$MH = RuntimeHelper.downcallHandle(
        "OpenWindowStationA",
        constants$340.OpenWindowStationA$FUNC
    );
    static final FunctionDescriptor OpenWindowStationW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenWindowStationW$MH = RuntimeHelper.downcallHandle(
        "OpenWindowStationW",
        constants$340.OpenWindowStationW$FUNC
    );
    static final FunctionDescriptor EnumWindowStationsA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumWindowStationsA$MH = RuntimeHelper.downcallHandle(
        "EnumWindowStationsA",
        constants$340.EnumWindowStationsA$FUNC
    );
    static final FunctionDescriptor EnumWindowStationsW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle EnumWindowStationsW$MH = RuntimeHelper.downcallHandle(
        "EnumWindowStationsW",
        constants$340.EnumWindowStationsW$FUNC
    );
    static final FunctionDescriptor CloseWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseWindowStation$MH = RuntimeHelper.downcallHandle(
        "CloseWindowStation",
        constants$340.CloseWindowStation$FUNC
    );
    static final FunctionDescriptor SetProcessWindowStation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetProcessWindowStation$MH = RuntimeHelper.downcallHandle(
        "SetProcessWindowStation",
        constants$340.SetProcessWindowStation$FUNC
    );
}


