// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$516 {

    static final FunctionDescriptor DRIVERPROC$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle DRIVERPROC$MH = RuntimeHelper.downcallHandle(
        constants$516.DRIVERPROC$FUNC
    );
    static final FunctionDescriptor CloseDriver$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle CloseDriver$MH = RuntimeHelper.downcallHandle(
        "CloseDriver",
        constants$516.CloseDriver$FUNC
    );
    static final FunctionDescriptor OpenDriver$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle OpenDriver$MH = RuntimeHelper.downcallHandle(
        "OpenDriver",
        constants$516.OpenDriver$FUNC
    );
    static final FunctionDescriptor SendDriverMessage$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle SendDriverMessage$MH = RuntimeHelper.downcallHandle(
        "SendDriverMessage",
        constants$516.SendDriverMessage$FUNC
    );
    static final FunctionDescriptor DrvGetModuleHandle$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DrvGetModuleHandle$MH = RuntimeHelper.downcallHandle(
        "DrvGetModuleHandle",
        constants$516.DrvGetModuleHandle$FUNC
    );
}


