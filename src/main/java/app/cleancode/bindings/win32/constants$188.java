// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$188 {

    static final FunctionDescriptor SetHandleCount$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetHandleCount$MH = RuntimeHelper.downcallHandle(
        "SetHandleCount",
        constants$188.SetHandleCount$FUNC
    );
    static final FunctionDescriptor RequestDeviceWakeup$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle RequestDeviceWakeup$MH = RuntimeHelper.downcallHandle(
        "RequestDeviceWakeup",
        constants$188.RequestDeviceWakeup$FUNC
    );
    static final FunctionDescriptor CancelDeviceWakeupRequest$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CancelDeviceWakeupRequest$MH = RuntimeHelper.downcallHandle(
        "CancelDeviceWakeupRequest",
        constants$188.CancelDeviceWakeupRequest$FUNC
    );
    static final FunctionDescriptor GetDevicePowerState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetDevicePowerState$MH = RuntimeHelper.downcallHandle(
        "GetDevicePowerState",
        constants$188.GetDevicePowerState$FUNC
    );
    static final FunctionDescriptor SetMessageWaitingIndicator$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetMessageWaitingIndicator$MH = RuntimeHelper.downcallHandle(
        "SetMessageWaitingIndicator",
        constants$188.SetMessageWaitingIndicator$FUNC
    );
    static final FunctionDescriptor SetFileShortNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle SetFileShortNameA$MH = RuntimeHelper.downcallHandle(
        "SetFileShortNameA",
        constants$188.SetFileShortNameA$FUNC
    );
}


