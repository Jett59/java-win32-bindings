// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$714 {

    static final FunctionDescriptor NotifyBootConfigStatus$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle NotifyBootConfigStatus$MH = RuntimeHelper.downcallHandle(
        "NotifyBootConfigStatus",
        constants$714.NotifyBootConfigStatus$FUNC
    );
    static final FunctionDescriptor OpenSCManagerA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenSCManagerA$MH = RuntimeHelper.downcallHandle(
        "OpenSCManagerA",
        constants$714.OpenSCManagerA$FUNC
    );
    static final FunctionDescriptor OpenSCManagerW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenSCManagerW$MH = RuntimeHelper.downcallHandle(
        "OpenSCManagerW",
        constants$714.OpenSCManagerW$FUNC
    );
    static final FunctionDescriptor OpenServiceA$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenServiceA$MH = RuntimeHelper.downcallHandle(
        "OpenServiceA",
        constants$714.OpenServiceA$FUNC
    );
    static final FunctionDescriptor OpenServiceW$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT
    );
    static final MethodHandle OpenServiceW$MH = RuntimeHelper.downcallHandle(
        "OpenServiceW",
        constants$714.OpenServiceW$FUNC
    );
    static final FunctionDescriptor QueryServiceConfigA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle QueryServiceConfigA$MH = RuntimeHelper.downcallHandle(
        "QueryServiceConfigA",
        constants$714.QueryServiceConfigA$FUNC
    );
}


