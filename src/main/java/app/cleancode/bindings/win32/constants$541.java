// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$541 {

    static final FunctionDescriptor GetServiceKeyNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceKeyNameA$MH = RuntimeHelper.downcallHandle(
        "GetServiceKeyNameA",
        constants$541.GetServiceKeyNameA$FUNC
    );
    static final FunctionDescriptor GetServiceKeyNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceKeyNameW$MH = RuntimeHelper.downcallHandle(
        "GetServiceKeyNameW",
        constants$541.GetServiceKeyNameW$FUNC
    );
    static final FunctionDescriptor GetServiceDisplayNameA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceDisplayNameA$MH = RuntimeHelper.downcallHandle(
        "GetServiceDisplayNameA",
        constants$541.GetServiceDisplayNameA$FUNC
    );
    static final FunctionDescriptor GetServiceDisplayNameW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GetServiceDisplayNameW$MH = RuntimeHelper.downcallHandle(
        "GetServiceDisplayNameW",
        constants$541.GetServiceDisplayNameW$FUNC
    );
    static final FunctionDescriptor LockServiceDatabase$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle LockServiceDatabase$MH = RuntimeHelper.downcallHandle(
        "LockServiceDatabase",
        constants$541.LockServiceDatabase$FUNC
    );
    static final FunctionDescriptor NotifyBootConfigStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NotifyBootConfigStatus$MH = RuntimeHelper.downcallHandle(
        "NotifyBootConfigStatus",
        constants$541.NotifyBootConfigStatus$FUNC
    );
}


