// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$346 {

    static final FunctionDescriptor GetRegisteredRawInputDevices$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetRegisteredRawInputDevices$MH = RuntimeHelper.downcallHandle(
        "GetRegisteredRawInputDevices",
        constants$346.GetRegisteredRawInputDevices$FUNC
    );
    static final FunctionDescriptor GetRawInputDeviceList$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle GetRawInputDeviceList$MH = RuntimeHelper.downcallHandle(
        "GetRawInputDeviceList",
        constants$346.GetRawInputDeviceList$FUNC
    );
    static final FunctionDescriptor DefRawInputProc$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle DefRawInputProc$MH = RuntimeHelper.downcallHandle(
        "DefRawInputProc",
        constants$346.DefRawInputProc$FUNC
    );
    static final FunctionDescriptor GetPointerDevices$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerDevices$MH = RuntimeHelper.downcallHandle(
        "GetPointerDevices",
        constants$346.GetPointerDevices$FUNC
    );
    static final FunctionDescriptor GetPointerDevice$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerDevice$MH = RuntimeHelper.downcallHandle(
        "GetPointerDevice",
        constants$346.GetPointerDevice$FUNC
    );
    static final FunctionDescriptor GetPointerDeviceProperties$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetPointerDeviceProperties$MH = RuntimeHelper.downcallHandle(
        "GetPointerDeviceProperties",
        constants$346.GetPointerDeviceProperties$FUNC
    );
}

