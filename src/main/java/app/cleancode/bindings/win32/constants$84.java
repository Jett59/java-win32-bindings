// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$84 {

    static final FunctionDescriptor GetProcessDEPPolicy$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetProcessDEPPolicy$MH = RuntimeHelper.downcallHandle(
        "GetProcessDEPPolicy",
        constants$84.GetProcessDEPPolicy$FUNC
    );
    static final FunctionDescriptor RequestWakeupLatency$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle RequestWakeupLatency$MH = RuntimeHelper.downcallHandle(
        "RequestWakeupLatency",
        constants$84.RequestWakeupLatency$FUNC
    );
    static final FunctionDescriptor IsSystemResumeAutomatic$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT);
    static final MethodHandle IsSystemResumeAutomatic$MH = RuntimeHelper.downcallHandle(
        "IsSystemResumeAutomatic",
        constants$84.IsSystemResumeAutomatic$FUNC
    );
    static final FunctionDescriptor GetThreadSelectorEntry$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetThreadSelectorEntry$MH = RuntimeHelper.downcallHandle(
        "GetThreadSelectorEntry",
        constants$84.GetThreadSelectorEntry$FUNC
    );
    static final FunctionDescriptor SetThreadExecutionState$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle SetThreadExecutionState$MH = RuntimeHelper.downcallHandle(
        "SetThreadExecutionState",
        constants$84.SetThreadExecutionState$FUNC
    );
    static final FunctionDescriptor PowerCreateRequest$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PowerCreateRequest$MH = RuntimeHelper.downcallHandle(
        "PowerCreateRequest",
        constants$84.PowerCreateRequest$FUNC
    );
}


