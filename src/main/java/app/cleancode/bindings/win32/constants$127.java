// Generated by jextract

package app.cleancode.bindings.win32;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$127 {

    static final FunctionDescriptor ClearEventLogA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClearEventLogA$MH = RuntimeHelper.downcallHandle(
        "ClearEventLogA",
        constants$127.ClearEventLogA$FUNC
    );
    static final FunctionDescriptor ClearEventLogW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ClearEventLogW$MH = RuntimeHelper.downcallHandle(
        "ClearEventLogW",
        constants$127.ClearEventLogW$FUNC
    );
    static final FunctionDescriptor BackupEventLogA$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BackupEventLogA$MH = RuntimeHelper.downcallHandle(
        "BackupEventLogA",
        constants$127.BackupEventLogA$FUNC
    );
    static final FunctionDescriptor BackupEventLogW$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle BackupEventLogW$MH = RuntimeHelper.downcallHandle(
        "BackupEventLogW",
        constants$127.BackupEventLogW$FUNC
    );
    static final FunctionDescriptor CloseEventLog$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle CloseEventLog$MH = RuntimeHelper.downcallHandle(
        "CloseEventLog",
        constants$127.CloseEventLog$FUNC
    );
    static final FunctionDescriptor DeregisterEventSource$FUNC = FunctionDescriptor.of(Constants$root.C_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle DeregisterEventSource$MH = RuntimeHelper.downcallHandle(
        "DeregisterEventSource",
        constants$127.DeregisterEventSource$FUNC
    );
}


