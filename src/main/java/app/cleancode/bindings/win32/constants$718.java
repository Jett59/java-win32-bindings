// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$718 {

    static final FunctionDescriptor UnlockServiceDatabase$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle UnlockServiceDatabase$MH = RuntimeHelper.downcallHandle(
        "UnlockServiceDatabase",
        constants$718.UnlockServiceDatabase$FUNC
    );
    static final FunctionDescriptor NotifyServiceStatusChangeA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyServiceStatusChangeA$MH = RuntimeHelper.downcallHandle(
        "NotifyServiceStatusChangeA",
        constants$718.NotifyServiceStatusChangeA$FUNC
    );
    static final FunctionDescriptor NotifyServiceStatusChangeW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle NotifyServiceStatusChangeW$MH = RuntimeHelper.downcallHandle(
        "NotifyServiceStatusChangeW",
        constants$718.NotifyServiceStatusChangeW$FUNC
    );
    static final FunctionDescriptor ControlServiceExA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ControlServiceExA$MH = RuntimeHelper.downcallHandle(
        "ControlServiceExA",
        constants$718.ControlServiceExA$FUNC
    );
    static final FunctionDescriptor ControlServiceExW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ControlServiceExW$MH = RuntimeHelper.downcallHandle(
        "ControlServiceExW",
        constants$718.ControlServiceExW$FUNC
    );
    static final FunctionDescriptor QueryServiceDynamicInformation$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceDynamicInformation$MH = RuntimeHelper.downcallHandle(
        "QueryServiceDynamicInformation",
        constants$718.QueryServiceDynamicInformation$FUNC
    );
}


